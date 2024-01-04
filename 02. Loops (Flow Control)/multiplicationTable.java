
// print the multiplication table of a given number
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nProgram : Multiplication table of a given number\n");
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
            }
        }
    }
}
