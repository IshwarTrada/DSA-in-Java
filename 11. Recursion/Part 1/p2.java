// Problem 2 : Print number from 1 to n using Recursion

public class p2 {
    // Approach 1
    // public static void printInc(int n, int number) {
    //      if (number == n) {
    //          System.out.print(n);
    //          return;
    //      }
    //      System.out.print(number + " ");
    //      printInc(n, number + 1);
    // }
    // Approach 2
    public static void printInc(int n) {
        if (n==1) {
            System.out.print("1 ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10; 
        // For approach 1
        // int number = 1;
        // printInc(n, number);
        // For approach 2
        printInc(n);
    }
}
