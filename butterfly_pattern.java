/*
Program to print the parttern like this Butterfly.
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
Here the number of lines is entered by the user and lines entered is for upper half of the pattern.
 */
import java.util.*;


public class butterfly_pattern{
    
    public static void butterfly(int n){
        int i, j;
        //upper half part loop
        for ( i = 1; i <= n; i++){

            //stars 
            for (j = 1; j <= i; j++){
                System.out.print("* ");
            }

            //spaces
            for ( j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }

            // stars
            for ( j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        } 

        // lower half part loop
        for ( i= n; i>= 1; i--){

            //stars
            for (j = 1; j <= i; j++){
                System.out.print("* ");
            }

            //spaces
            for ( j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }

            //stars
            for ( j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper half row number: ");
        int n = sc.nextInt();
        butterfly(n);
    }
}