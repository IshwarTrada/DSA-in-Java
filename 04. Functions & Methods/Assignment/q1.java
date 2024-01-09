// Average of 3 numbers
import java.util.*;

public class q1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Average of 3 numbers");
            System.out.print("Enter first number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number : ");
            int num2 = sc.nextInt();
            System.out.print("Enter third number : ");
            int num3 = sc.nextInt();
            average3Num(num1, num2, num3);
        }
    }

    public static void average3Num(int a, int b, int c) {
        System.out.println("Average of 3 numbers : " + (float) (a + b + c) / 3);
    }
}