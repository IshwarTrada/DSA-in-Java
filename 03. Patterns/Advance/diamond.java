
// Diamond pattern
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *
import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input from the user
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            // Upper part
            for (int i = 0; i < num; i++) {
                // print spaces
                for (int j = num - 1; j > i; j--) {
                    System.out.print(" ");
                }
                // print *
                for (int j = 0; j < (2 * i) + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Lower part
            for (int i = 0; i < num; i++) {
                // print spaces
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                // print *
                for (int j = (2 * num) - i - 1; j > i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
