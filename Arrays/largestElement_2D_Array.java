import java.util.*;

public class largestElement_2D_Array{

    public static int searchLargest(int Array_2D[][]){
        int element = Integer.MIN_VALUE;
        for(int i=0; i<Array_2D.length; i++){
            // int element = Integer.MIN_VALUE;
            for(int j=0; j<Array_2D[0].length; j++){
                if(Array_2D[i][j] > element){
                    element = Array_2D[i][j];
                }
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int Array_2D[][] = new int [3][3];
        System.out.print("Enter the elements of Matrix: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<Array_2D.length; i++){
            for(int j=0; j<Array_2D[0].length; j++){
                Array_2D[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<Array_2D.length; i++){
            for(int j=0; j<Array_2D[0].length; j++){
                System.out.print(Array_2D[i][j] + " ");
            }
            System.out.println();
        }
        // Scanner gk = new Scanner(System.in);
        // System.out.print("Searching for the Element: ");
        // int element = gk.nextInt();
        System.out.println("Largest element is: " + searchLargest(Array_2D));
    }
}