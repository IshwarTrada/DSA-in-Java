import java.util.Scanner;

/* whileLoop */
public class whileLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nSum of first N natural numbers");
            System.out.print("Enter a range of number :");
            int n = sc.nextInt();
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("Sum of first " + n + "natural numbers are " + sum);
        }
    }
}