// // Palindromic Pattern
// //     1
// //    212
// //   32123
// //  4321234
// // 543212345

import java.util.Scanner;

public class palindromic {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input from the user
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {
                // Print spaces
                for (int j = num; j > i; j--) {
                    System.out.print(" ");
                }

                // Print decreasing numbers
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }

                // Print increasing numbers
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }

                System.out.println();
            }
        }
    }
}