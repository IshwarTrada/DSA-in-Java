import java.util.Scanner;

public class characterPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            char ch = 'A';
            for (int i = 0; i < num; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
    }
}
