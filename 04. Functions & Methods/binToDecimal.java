// Convert from binary to decimal

import java.util.Scanner;

public class binToDecimal {
    // binary to decimal
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decimal = 0;
        while (binNum > 0) {
            int last_digit = binNum % 10;
            decimal = decimal + (last_digit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myNum + " is " + decimal);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Binary to decimal conversion");
            System.out.print("Enter Binary number : ");
            int binNum = sc.nextInt();
            binToDec(binNum);
        }
    }
}
