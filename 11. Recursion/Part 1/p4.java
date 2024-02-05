// Problem 4 : Print sum of first n natural numbers using recursion

public class p4 {
    public static int sumOfNumbers(int n) {
        if (n <= 0) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n + sumOfNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int fact = sumOfNumbers(n);
        if (fact == -1) {
            System.out.println("Negative numbers are not considered as natural numbers");
        } else {
            System.out.println("Sum of " + n + " natural number is " + sumOfNumbers(n));
        }
    }
}
