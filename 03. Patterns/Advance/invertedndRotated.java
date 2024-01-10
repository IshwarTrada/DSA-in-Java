// Inverted and Rotated half pyramid
//    *
//   **
//  ***
// ****
import java.util.Scanner;

public class invertedndRotated {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // input from user
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            // Logic
            for(int i=1; i<=num; i++) {
                for(int j=1; j<=num-i; j++) {
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
