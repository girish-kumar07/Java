// Program to print Maximum sum of the Sub Arrays.
// Time complexity of this program is O(n).
// More optimised solution.
// In this Program we use Kadanes Algorithm.
public class subArraySum_3 {
    public static void maxSubArraySum(int numbers[]){
        int currentSum2 = 0;
        int maxSum2 = Integer.MIN_VALUE;

        for (int i = 0; i< numbers.length; i++){
            currentSum2 = currentSum2 + numbers[i];
            if(currentSum2 < 0){
                currentSum2 = 0;
            }
            maxSum2 = Math.max(currentSum2, maxSum2);
        }
        System.out.println("Max sum of Sub Arrays is = " + maxSum2);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubArraySum(numbers);
    }
}
