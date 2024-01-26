// Operations
// Get ith bit value

import java.util.*;

public class getIthbit {
    public static void getBitValue(int n, int i) {
        if ((n & (1 << i)) == 0) {
            System.out.println("0 bit on " + i + " position in number " + n);
        } else {
            System.out.println("1 bit on " + i + " position in number " + n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter bit position to know the value of that bit : ");
        int i = sc.nextInt();
        getBitValue(n, i);
    }
}
