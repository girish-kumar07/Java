import java.util.*;

public class pairsInArray {

    public static void pairInArray(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            int startNum = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" + startNum + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        pairInArray(numbers);
    }
}