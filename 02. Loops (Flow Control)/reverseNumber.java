// Print Revrse of number program
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nPrint Revrse of number program");

            int reverse = 0,num;
            System.out.print("Enter a number :");
            num = sc.nextInt();
            System.out.print("Reverse number of " + num + " is ");
            while (num > 0) {
                int last_digit = num % 10;
                reverse = (reverse*10) + last_digit;
                num = num / 10;
            }
            System.out.println(reverse);
        }
    }
}
