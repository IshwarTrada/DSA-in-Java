// Check if a number is power of 2 or not.

public class powerOf2orNot {
    public static boolean isPowerOf2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOf2(16));
    }
}
