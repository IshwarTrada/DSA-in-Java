
// 0-1 triangle
// 1
// 01
// 101
// 0101
// 10101
import java.util.Scanner;

public class triangle01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input from the user
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // Extra variable for print the pattern
            // int k;
            // logic
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    // // for odd line
                    // if (i % 2 == 1) {
                    // // for odd position in line
                    // if (j % 2 == 1) {
                    // k = 1;
                    // System.out.print(k);
                    // }
                    // // for even position in line
                    // else {
                    // k = 0;
                    // System.out.print(k);
                    // }
                    // }
                    // // for even lines
                    // else {
                    // // for odd position in line
                    // if (j % 2 == 1) {
                    // k = 0;
                    // System.out.print(k);
                    // }
                    // // for even position in line
                    // else {
                    // k = 1;
                    // System.out.print(k);
                    // }
                    // }

                    // Optimal Solution
                    if ((i + j) % 2 == 0) {// even
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }
    }
}
