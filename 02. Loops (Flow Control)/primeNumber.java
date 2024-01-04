
// Prime number or not
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nProgram : Prime number or not ??");

            boolean isPrime = true;
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");

            }
        }
    }
}
