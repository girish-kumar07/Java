// Reversing the the Entered number.
import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        long num = sc.nextLong();

        long n = 0;

        while (num > 0) {
            long lastdigit = num % 10 ;
            n = n * 10 + lastdigit;
            num /= 10;
        }
        System.out.println("Reverse of entered number is = " + n);
    }
}
