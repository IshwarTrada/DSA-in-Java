
// Math class methods
import java.util.*;

public class q4 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        minMethod();
        maxMethod();
        sqrtMethod();
        powMethod();
        absMethod();
    }

    // Math.min() method :
    public static void minMethod() {
        System.out.println("\nMath.min() method");
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        System.out.println(Math.min(num1, num2) + " is smaller.\n");
    }

    // Math.max() method :
    public static void maxMethod() {
        System.out.println("Math.max() method");
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        System.out.println(Math.max(num1, num2) + " is greater.\n");
    }

    // Math.sqrt() method :
    public static void sqrtMethod() {
        System.out.println("Math.sqrt() method");
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Square root of " + n + " is " + Math.sqrt(n) + "\n");
    }

    // Math.pow() method :
    public static void powMethod() {
        System.out.println("Math.pow() method");
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter exponent : ");
        int exponent = sc.nextInt();
        System.out.println(base + " to the power of " + exponent + " is " + Math.pow(base, exponent) + "\n");
    }

    // Math.abs() method :
    public static void absMethod() {
        System.out.println("Math.abs() method");
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Absolute value of " + n + " is " + Math.abs(n) + "\n");
    }
}
