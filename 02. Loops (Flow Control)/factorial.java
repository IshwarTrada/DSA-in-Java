
// Factorial of the given number
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nFactorial of given number\n");

            int fact = 1;
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + num + " is " + fact);
        }
    }
}
