// Hollow recctangle
// *****
// *   *
// *   *
// *****

import java.util.Scanner;

public class hollowRect {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Length and Breadth input
            System.out.print("Enter rectangle length : ");
            int length = sc.nextInt();
            System.out.print("Enter rectangle breadth : ");
            int breadth = sc.nextInt();

            // Logic
            for (int i = 1; i <= breadth; i++) {
                for (int j = 1; j <= length; j++) {
                    if (i == 1 || i == breadth || j == 1 || j == length) {

                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}