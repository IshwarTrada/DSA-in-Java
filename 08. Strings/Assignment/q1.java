
// Count how many times lowercase vowels occurred in a String entered by the user
import java.util.*;

public class q1 {
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.print("Enter a word : ");
        String str = new Scanner(System.in).next();
        System.out.println("Count of vowel is : " + countVowels(str));
    }
}
