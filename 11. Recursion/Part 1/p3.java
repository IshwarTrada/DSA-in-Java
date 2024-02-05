// Problem 3 : Find factorial of N

public class p3 {
    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);
        if (fact == -1) {
            System.out.println("Factorial not found for negative numbers");
        } else {
            System.out.println("Factorial of " + n + " is " + factorial(n));
        }
    }
}
