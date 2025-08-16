/*
Program to print pattern like this Hollow Rhombus.
        * * * * * 
      *       *
    *       * 
  *       *
* * * * *
Here the number of lines is entered by the user.
 */
import java.util.*;


public class hollow_Rhombus_pattern{
    
    public static void hollow_Rhombus(int n){
        int i, j;
        //outer loop:- this loop count the line
        for ( i = 1; i <= n; i++){

            //spaces:- This loop will print the spaces before the stars.
            for ( j = 1; j <= (n-i); j++){
                System.out.print("  ");
            }

            // stars:- This loop will print the stars, and this loop code is similar to hollow rwctangle code.
            for ( j = 1; j <= n; j++){
                if(i==1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the Rhombus: ");
        int n = sc.nextInt();
        hollow_Rhombus(n);
    }
}