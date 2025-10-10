// Program to convert our Binary number to the Decimal number.
import java.util.*;

public class binaryToDecimal{
    // This Function will convert Binary number in to Decimal number.
    public static void binToDec(int binNum){
        int myNum = binNum;
        int power = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,power));
            power ++;
            binNum /= 10;
        }
        System.out.println("Binary to Decimal of " + myNum + " is " + decNum);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary number: ");
        int number = sc.nextInt();
        binToDec(number);
    }
}