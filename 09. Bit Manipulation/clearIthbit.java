// Operations
// Clear ith bit value

import java.util.*;

public class clearIthbit {
    public static int clearBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter bit position to set the value of that bit : ");
        int i = sc.nextInt();
        System.out.println(clearBit(n, i));
    }
}
