// Compute the sum of the digits in an integer.
import java.util.*;

public class q5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Compute the sum of the digits in an integer.");
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            computeSum(n);
        }
    }

    public static void computeSum(int n) {
        int myNum = n;
        int sum = 0;
        while (myNum > 0) {
            int rem = myNum % 10;
            sum += rem;
            myNum = myNum / 10;
        }
        System.out.println("Sum of the digits in " + n + " is " + sum);
    }
}
