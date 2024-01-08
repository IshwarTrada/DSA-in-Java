// Factorial of the number

import java.util.Scanner;

public class factorial {
    public static int factorialOfNum(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Factorial of the number");
            System.out.print("Enter a number :");
            int a = sc.nextInt();
            int factorial = factorialOfNum(a);
            System.out.println("Factorial of " + a + " is " + factorial);
        }
    }
}
