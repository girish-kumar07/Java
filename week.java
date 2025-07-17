import java.util.*;
public class week {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of week day: ");
        int day_number = sc.nextInt();
        switch (day_number) {
            case 1:System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thrursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
        
            default:System.out.println("Please Enter the valid Input.");
                break;
        }
    }
}
