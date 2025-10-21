// Program to check the entered number is Palindrome or Not.
import java.util.*;

public class palindromeNumber {
    // This the Function which check the number is Palindrome or Not.
    public static void isPalindrome(int number){
        int myNum = number;
        int palinNum = 0; // This variable will store the Palindrome number.

        while (number > 0) {
            int lastDigit = number % 10;
            palinNum = (palinNum * 10) + lastDigit;
            number /= 10;
        }
        if (myNum == palinNum){
            System.out.println("Entered number " + myNum + " is  Palindrome");
        }
        else{
            System.out.println("Entered number " + myNum + " is  NOT  Palindrome");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter your number: ");
        int n = sc.nextInt();
        isPalindrome(n);
    }
}
