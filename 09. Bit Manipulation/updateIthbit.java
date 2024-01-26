// Operations
// Update ith bit value

import java.util.*;

public class updateIthbit {
    // Set bit
    public static int setBitValue(int n, int i) {
        return (n | (1 << i));
    }

    // clear bit value to 0
    public static int clearBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    // Update the ith bit value
    public static int updateBitValue(int n, int i, int newBit) {
        // Method -1
        // if(newBit == 0){
        //     return clearBit(n, i);
        // }
        // else{
        //     return setBitValue(n,i);
        // }

        // Method -2
        n = clearBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter bit position to set the value of that bit : ");
        int i = sc.nextInt();
        System.out.print("Enter new bit value (0/1) : ");
        int newBit = sc.nextInt();
        System.out.println(updateBitValue(n, i,newBit));
    }
}
