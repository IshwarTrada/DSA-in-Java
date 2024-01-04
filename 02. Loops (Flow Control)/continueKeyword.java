// Display all numbers entered by user except multiples of 10
import java.util.Scanner;

public class continueKeyword {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nDisplay all numbers entered by user except multiples of 10");

            do {
                System.out.print("Enter a number : ");
                int num = sc.nextInt();
                if (num % 10 == 0) {
                    continue;
                }
                System.out.println(num);
            } while (true);
        }
    }
}
