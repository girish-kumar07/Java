// Program to print Maximum sum of the Sub Arrays.
// Time complexity of this program is O(n^3).
public class subArraySum {
    
    public static void printSumArray(int numbers[]){
        int currentSum = 0;
        int maxSum = 0;

        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                currentSum = 0;
                for(int k = start; k<= end; k ++){
                    currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if (maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,5,6,7,8,9,10};
        printSumArray(numbers);
    }

}