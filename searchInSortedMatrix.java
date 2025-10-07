// Program to find element in the Sorted Matrix.
import java.util.*;

public class searchInSortedMatrix {
    
    //Function that find the desired element in the Matrix
    public static boolean staircaseSearch(int matrix[][], int key){

        // Searching will start from Top Right element of the matrix and goes in the stair form.
        int row = 0 , col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){

            if(matrix[row][col] == key){
                System.out.print("Key found at (" + row + "," + col + ")");
                return true;
            }

            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.print("Key NOT found");
        return false;
    }

    //Function to sort 2D Matrix column wise
    public static void sortMatrixColumnWise(int[][] matrix) {
        int n = matrix.length;          // number of rows
        int m = matrix[0].length;       // number of columns

        for (int j = 0; j < m; j++) {   // for each column
            int[] col = new int[n];

            // extract the column
            for (int i = 0; i < n; i++) {
                col[i] = matrix[i][j];
            }

            // sort the column
            Arrays.sort(col);

            // put sorted values back into the matrix
            for (int i = 0; i < n; i++) {
                matrix[i][j] = col[i];
            }
        }
    }

    public static void main(String[] agrs){
        
        System.out.print("Enter KEY that to be search in the sorted Matrix:- ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        System.out.print("Enter the number of Rows of Matrix:- ");
        int n = sc.nextInt();
        
        System.out.print("Enter the number of Columns of Matrix:- ");
        int m = sc.nextInt();

        //Taking input Element of the Matrix
        int matrix[][] = new int[n][m];
        System.out.println("Enter the Element of the Matrix:- ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //Loop to sort the Matrix Row Wise
        for(int i=0; i<matrix.length; i++){
            Arrays.sort(matrix[i]);
        }


        //Calling Function to sort the Matrix Column Wise
        sortMatrixColumnWise(matrix);


        //Loop to print Sorted Matrix
        System.out.println("Matrix in Sorted Format:-");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        staircaseSearch(matrix,key);
    }
}