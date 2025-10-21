import java.util.*;

public class creating_2D_Array{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element of Matrix: ");
        // Initialsing Array name and size--
        int Array_2D[][] = new int[3][3];
        //Loop for taking input from user
        for(int i=0; i<Array_2D.length; i++){           // Array_2D.length => Number of Rows 
            for(int j=0; j<Array_2D[0].length; j++){    // Array_2D[0].length => Number of Column 
                Array_2D[i][j] = sc.nextInt();
            }
        }

        // Loop for printing the 2D_Array 
        for(int i=0; i<Array_2D.length; i++){
            for(int j=0; j<Array_2D[0].length; j++){
                System.out.print(Array_2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}