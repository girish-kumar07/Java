//Program to print Spiral Matrix

import java.util.*;

public class spiralMatrix {

    //Function to print Spiral Matrix
    public static void spiral_Matrix(int matrix[][]){
        int sR = 0;  //starting Row
        int sC = 0;  //starting Column
        int eR = matrix.length - 1;  //ending Row
        int eC = matrix[0].length - 1;  //ending Column

        while(sR <= eR && sC <= eC){
            // printing top of the matrix
            for(int j=sC; j<=eC; j++){
                System.out.print(matrix[sR][j] + " ");
            }

            //printing right of the matrix
            for(int i=sR+1; i<=eR; i++){
                //conditon for printing of spiral Matrix when Rows are ODD
                if(sR==eR){
                    break;
                }
                System.out.print(matrix[i][eC] + " ");
            }

            //printing bottom of the matrix
            for(int j=eC-1; j>=sC; j--){
                System.out.print(matrix[eR][j] + " ");
            }

            //printing left of the matrix
            for(int i=eR-1; i>=sR+1; i--){
                //conditon for printing of spiral Matrix when Columns are ODD
                if(sC==eC){
                    break;
                }
                System.out.print(matrix[i][sC] + " ");
            }

        sR++;
        sC++;
        eR--;
        eC--;
        }
        System.err.println();
    }

    public static void main(String[] args){
        //Taking input number of Rows
        System.out.print("Enter the number of Rows:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Taking input number of Columns
        System.out.print("Enter the number of Columns:- ");
        int m = sc.nextInt();

        //Taking input Element of the Matrix
        int matrix[][] = new int[n][m];
        System.out.println("Enter the Element of the Matrix:- ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        spiral_Matrix(matrix);
    }
}