// Palindrome number or not
// Ex. 121 is palindrome because revere of 121 is 121.
// Ex. 321 is not palindrome because revere of 321 is 123.

import java.util.*;

public class q3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Number is Palindrome or not");
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (isPalindrome(num)) {
                System.out.println(num + " is palindrome.");
            } else {
                System.out.println(num + " is not palindrome.");
            }
        }
    }

    public static boolean isPalindrome(int num) {
        int myNum = num;
        int reverse = 0;
        while (myNum != 0) {
            int last_digit = myNum % 10;
            reverse = reverse * 10 + last_digit;
            myNum = myNum / 10;
        }
        if (num == reverse) {
            return true;
        }
        return false;
    }

}