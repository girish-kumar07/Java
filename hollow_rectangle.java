/*
program to print Hollow Rectangle.

* * * * * 
*       *
*       *
* * * * * 

*/
import java.util.*;

public class hollow_rectangle {
    
    public static void hollow_Rectangle(int rows , int columns){

        for (int i =  1; i <=rows; i++){

            for (int j = 1; j<=columns; j++){
                // This condition in IF print hte stars at desired position i.e; at Boundary lines.
                if(i==1 || i==rows || j==1 || j==columns){
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
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        hollow_Rectangle(rows,columns);
    }
}
