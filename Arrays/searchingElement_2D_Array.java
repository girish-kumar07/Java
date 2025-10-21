import java.util.*;

public class searchingElement_2D_Array{

    public static boolean search(int Array_2D[][], int element){
        for(int i=0; i<Array_2D.length; i++){
            for(int j=0; j<Array_2D[0].length; j++){
                if(Array_2D[i][j] == element){
                    System.out.println("Element is at: " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element NOT Found--");
        return false;
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
        Scanner gk = new Scanner(System.in);
        System.out.print("Searching for the Element: ");
        int element = gk.nextInt();
        search(Array_2D, element);
    }
}