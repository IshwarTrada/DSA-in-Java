// Swap two numbers without using any third variable.

public class q2 {
    public static void main(String[] args) {
        int a = 60;
        int b = 50;
        System.out.println("Before swap a : " + a + " and b : " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap a : " + a + " and b : " + b);
    }
}