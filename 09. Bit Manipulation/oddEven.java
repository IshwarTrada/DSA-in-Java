// Even or Odd number using bitwise operators

import java.util.*;

public class oddEven {
    public static void oddOrEven(int n) {
        if ((n & 1) == 1) {
            System.out.println(n + " is odd.");
        } else {
            System.out.println(n + " is even.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        oddOrEven(n);
    }
}
