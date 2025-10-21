import java.util.*;

public class lowercaseCount {

    public static void  main(String[] agrs){
        System.out.print("Enter the String without Space: ");
        String str = new Scanner(System.in).next();
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Count of LOWERCASE vowel = " + count);
    }
}