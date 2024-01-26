// Operations
// Clear bits of given range

import java.util.Scanner;

public class clearBitsinRange {
    public static int clearBitInRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter range from : ");
        int i = sc.nextInt();
        System.out.print("Enter range to : ");
        int j = sc.nextInt();
        System.out.println(clearBitInRange(n, i, j));
    }
}
