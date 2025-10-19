//Program to check whether two Strings are Anagrams or Not..
/*What are anagrams?
If two strings contain the same characters but in a different order, they can be said to be
anagrams. Consider race and care. In this case, race's characters can be formed into a study,
or care's characters can be formed into race. Below is a java program to check if two strings
are anagrams or not. */
import java.util.*;

public class anagramsString {

    public static void anagrams(String str, String str1){
        // Converting strings in the Lowercase so that we don't need to check it seperately
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        if(str.length() == str1.length()){

            // Converting string into Char Array
            char[] strCharArray = str.toCharArray();
            char[] str1CharArray = str1.toCharArray();

            // Sort the Char Array
            Arrays.sort(strCharArray);
            Arrays.sort(str1CharArray);

            //if both arrays are same or identical then the strings are anagrams
            boolean result = Arrays.equals(strCharArray, str1CharArray);
            if(result){
                System.out.print(str + "  and  " + str1 + "  are Anagrams of each other");
            }
            else{
                System.out.print(str + "  and  " + str1 + "  are NOT  Anagrams of each other");
            }
        }
        else{
            System.out.print(str + "  and  " + str1 + "  are NOT  Anagrams of each other");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter the first String:  ");
        String str = new Scanner(System.in).next();
        System.out.print("Enter the second String:  ");
        String str1 = new Scanner(System.in).next();

        anagrams(str, str1);
    }
}