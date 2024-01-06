
// Inverted half-pyramid with numbers
// 12345
// 1234
// 123
// 12
// 1
import java.util.Scanner;

public class invertedHalf {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input from the user
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            // Logic
            for (int i = num; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
