// Program to print Maximum sum of the Sub Arrays.
// Time complexity of this program is O(n^2).
// More optimised solution.
public class subArraySum_2 {

    public static void printsumArray(int numbers[]){
        int currentSum1 = 0;
        int maxSum1 = 0;
        int prefixsum[] = new int[numbers.length];

        prefixsum[0] = numbers[0];

        for(int i = 1; i<prefixsum.length;i++){
            prefixsum[i] = prefixsum[i-1] + numbers[i];
        }

        for(int i =0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;

                currentSum1 = start == 0 ? prefixsum[end] : prefixsum[end] - prefixsum[start-1];

                if (maxSum1 < currentSum1){
                    maxSum1 = currentSum1;
                }
            }
        }
        System.out.println("Maximum sum of the Sub Array is = " + maxSum1);
    }

    public static void main(String[] args) {
        int numbers[] = {2,5,7,-9,3,-1};
        printsumArray(numbers);
    }

}