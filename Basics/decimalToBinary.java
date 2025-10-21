// Converting a Decimal number in to Binary number.
import java.util.*;

public class decimalToBinary{
    // This Function will convert our Decimal number in to Binary number.
    public static void decToBin(int number){
        int myNum = number;
        int binNum = 0;
        int power = 0;

        while(number>0){
            int reminder = number % 2;
            binNum = binNum + (reminder * (int)Math.pow(10,power));
            power++ ;
            number /= 2;
        }
        System.out.println("Decimal to Binary of " + myNum + " is  " + binNum);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number: ");
        int num = sc.nextInt();

        decToBin(num);
    }
}