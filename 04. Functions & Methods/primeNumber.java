// Prime Number

import java.util.Scanner;

public class primeNumber {
    // // only for >=2
    // public static boolean isPrime(int n){
    // // corner case
    // if (n==2) {
    // return true;
    // }
    // // general case
    // for(int i = 2; i < n; i++){
    // if(n%i == 0){
    // return false;
    // }
    // }
    // return true;
    // }

    // Optimized version
    // only for >=2
    public static boolean isPrime(int n) {
        // corner case
        if (n == 2) {
            return true;
        }
        // general case
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Number is Prime or not");
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            System.out.println(isPrime(n));
        }
    }
}