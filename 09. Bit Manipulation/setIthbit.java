// Operations
// Set ith bit value

import java.util.*;

public class setIthbit {
    public static int setBitValue(int n, int i) {
        return (n | (1 << i));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter bit position to set the value of that bit : ");
        int i = sc.nextInt();
        System.out.println(setBitValue(n, i));
    }
}
