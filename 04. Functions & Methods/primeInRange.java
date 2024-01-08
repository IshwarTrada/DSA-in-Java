
// Print all primes in a Range
import java.util.*;

public class primeInRange {
    // number is prime or not
    public static boolean isPrime(int n) {
        // corner case
        if (n == 2) {
            return true;
        }
        // general case
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Range of primenumber
    public static void primesInRange(int range) {
        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Print prime numbers in a Range ");
            System.out.print("Enter a range : ");
            int range = sc.nextInt();
            primesInRange(range);
        }
    }
}
