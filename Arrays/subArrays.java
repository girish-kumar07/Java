import java.util.*;

public class subArrays {
    
    public static void printSubArray(int numbers[]){
        int ts =0; //ts = total subArrays.
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                for(int k = start; k<= end; k++){
                    System.out.print(numbers[k] + " ");
                }
                ts ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of Sub Arrays = " + ts);  //formula for counting total numbers of array = n(n+1)/2;
    }

    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        printSubArray(numbers);
    }
}