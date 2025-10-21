import java.util.*;

public class hcf{
        public static int gcd(int x, int y){
        while(x!=0){
            int z = x;
            x = y % x;
            y = z;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("HCF of " + a + " and " + b + " : " + gcd(a,b));
    }
}