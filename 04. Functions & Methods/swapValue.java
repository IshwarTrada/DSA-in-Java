// Java always call by value
// Swap values

public class swapValue {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        swap(a, b);
    }
}