// multiplication using function
public class product {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int mul = multiply(a, b);
        System.out.println("Multiplication of " + a + " and " + b + " is " + mul);
    }
}