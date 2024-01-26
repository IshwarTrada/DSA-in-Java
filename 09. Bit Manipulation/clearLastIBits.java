import java.util.*;

public class clearLastIBits {
    public static int lastIBits(int n, int i) {
        return n & ((-1) << i); // (~0) = (-1), SO use any of it
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter bit position from you want to claer the bits : ");
        int i = sc.nextInt();
        System.out.println(lastIBits(n, i));
    }
}
