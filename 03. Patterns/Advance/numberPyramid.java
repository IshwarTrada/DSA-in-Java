
// Number pyramid
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input from the user
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            // logic
            for (int i = 1; i <= num; i++) {
                for (int j = num; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
