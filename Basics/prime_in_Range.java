import java.util.*;

public class prime_in_Range{

    public static boolean isPrime(int n){
        // This finction is only valid for the numbers greater than or equal to 2.
        if(n==2){
            return true;
        }

        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeInrange(int n){
        for(int i = 2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of range: ");
        int num = sc.nextInt();
        primeInrange(num);
    }
}