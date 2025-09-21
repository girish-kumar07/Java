//Program for Creating 1D Array by taking input from user and checking is there any Duplicate element in the Array or Not.
import java.util.*;

// Function to check whether the Entered array contains any Duplicate value or Not.
public class arrayDuplicate {
    public static boolean isDuplicate(int nums[]){
        Arrays.sort(nums);  //Sorting Array in ascending order
        //Loop to check duplicate element
        for(int i = 1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        
        System.out.print("Enter the Dimension of Array:- ");
        Scanner sc = new Scanner(System.in);
        int dimension_of_Array = sc.nextInt();
        //Creating Array
        int nums1[] = new int[dimension_of_Array];
        //Taking input element of the array
        System.out.print("Enter the element of the Array: ");
        for(int i=0; i<dimension_of_Array;  i++){
            nums1[i] = sc.nextInt();
        }
        System.out.print("You enterd Array:-  ");
        //Printing the Entered Array
        for(int i=0; i<dimension_of_Array; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        System.out.println("Duplicate is present in the Array  " + isDuplicate(nums1));
    }
}