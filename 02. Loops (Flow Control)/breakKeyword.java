// Keep entering numbers till users enters a multiple of 10
import java.util.Scanner;

public class breakKeyword {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nKeep entering numbers till users enters a multiple of 10");

            do {
                System.out.print("Enter a number : ");
                int num = sc.nextInt();
                if (num % 10 == 0) {
                    break;
                }
                System.out.println(num);
            } while (true);
        }
    }
}
