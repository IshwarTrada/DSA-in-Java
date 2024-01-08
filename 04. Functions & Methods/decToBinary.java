
// Convert decimal to binary
import java.util.*;

public class decToBinary {
    public static void decToBin(int decimal) {
        int muNum = decimal;
        int pow = 0;
        int bin = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            decimal = decimal / 2;
        }
        System.out.println("Binary of " + muNum + " is " + bin);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Decimal to binary conversion");
            System.out.print("Enter Decimal number : ");
            int decimal = sc.nextInt();
            decToBin(decimal);
        }
    }
}
