// import java.time.Year;
import java.util.*;
public class leapyear {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int Year = sc.nextInt();

        boolean a = (Year % 4 == 0);
        boolean b = (Year % 100 != 0);
        boolean c = (Year % 100 == 0) && (Year % 400 == 0);

        if (a && (b || c)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
