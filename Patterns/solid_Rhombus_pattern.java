/*
Program to print pattern like this Solid Rhombus.
    *****
   *****
  *****
 *****
*****
Here the number of lines is entered by the user and lines entered is for upper half of the pattern.
 */
import java.util.*;


public class solid_Rhombus_pattern {
    public static void solid_Rhombus(int n){
        int i, j;
        //outer loop:- this loop count the line
        for ( i = 1; i <= n; i++){

            //spaces:- This loop will print the spaces before the stars.
            for ( j = 1; j <= (n-i); j++){
                System.out.print("  ");
            }

            // stars:- This loop will print the stars.
            for ( j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        } 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter of row number: ");
        int n = sc.nextInt();
        solid_Rhombus(n);
    }
}
