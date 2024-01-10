
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
            for (int i = 1; i <= num; i++) {
                // print spaces
                for (int j = 1; j <= (num - i); j++) {
                    System.out.print(" ");
                }
                // print *
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Lower part
            for (int i = num; i >= 1; i--) {
                // print spaces
                for (int j = 1; j <= (num - i); j++) {
                    System.out.print(" ");
                }
                // print *
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
