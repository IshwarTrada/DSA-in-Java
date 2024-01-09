// Write a method named isEven that accepts an int argument.
// The method should return true if the argument is even, or false otherwise.
// Also write a program to test your method

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Even odd number check");
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (isEven(n)) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        return false;
    }

}
