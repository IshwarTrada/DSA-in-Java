// Problem 10 : Print x^n (Optimize Solution)
// Time Complexity : O(log n)

public class p10 {
    public static int optimizePower(int x, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizePower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(optimizePower(2, 5));
    }
}
