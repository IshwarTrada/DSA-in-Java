
// Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
import java.util.Scanner;

public class sum_Of_Even_And_Odd_Integers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nWrite a program that reads a set of integers,and then prints the sum of the even and odd integers.\n");

            // Enter numbers of element you want in set
            int number;
            int choice;
            int evenSum = 0;
            int oddSum = 0;
            do {
                System.out.print("Enter the number ");
                number = sc.nextInt();
                if (number % 2 == 0) {
                    evenSum += number;
                } else {
                    oddSum += number;
                }
                System.out.print("Do you want to continue? Press 1 for yes or 0 for no : ");
                choice = sc.nextInt();
            } while (choice == 1);

            System.out.println("\nSum of even numbers: " + evenSum);
            System.out.println("Sum of odd numbers: " + oddSum);
        }
    }
}