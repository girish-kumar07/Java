//Program to find the Sum of the Diagonal Element of any Square Matrix.
import java.util.*;

public class diagonalSum{

    //Function for calculating Diagonal element Sum
    public static int DiagonalSum(int matrix[][]){

        int sum = 0; //Variable which contains sum of Diagonal element .

        //Normal approach for solving this, but this has High Time complexity.
        
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j]; 
        //         }
        //     }
        // }

        //This is the optimised approach to solve this problem
        for(int i=0; i<matrix.length; i++){
            sum = sum + matrix[i][i];
            
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println("To calculate the Sum of Diagonal element of any Matrix, Number of Rows should be equal to number of Columns.");

        //Taking input number of Rows
        System.out.print("Enter the number of Rows:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Taking input number of Columns
        System.out.print("Enter the number of Columns:- ");
        int m = sc.nextInt();

        if(n == m){
        //Taking input Element of the Matrix
        int matrix[][] = new int[n][m];
        System.out.println("Enter the Element of the Matrix:- ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Sum of Diagonal elements: " + DiagonalSum(matrix));
        }
        else{
            System.out.print("Rows and Column are NOT Equal, Please enter valid values");
        }
    }
}