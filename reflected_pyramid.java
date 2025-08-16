/*
          * 
        * * 
      * * * 
    * * * * 
  * * * * * 
* * * * * * 
Program to print this type of Pattern.
 */

import java.util.*;
public class reflected_pyramid {
    
    public static void pyramid(int rows, int columns){
        // This loop control line number.
        for (int i = 1; i<=rows; i++){
            // This loop print the space in the line.
            for (int j = 1; j <= rows-i; j++){
                System.out.print("  ");
            }
            // This loop print the star in the line.
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        pyramid(rows,columns);
    }
}