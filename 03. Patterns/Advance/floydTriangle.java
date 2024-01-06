
// Floyd's triangle
// 1
// 2 3
// 4 5 6
// 7 8 9 10
import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // input from the user
            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            // Extra variable for print the pattern
            int k = 1;
            
            // logic
            for(int i = 1; i <= num; i++) {
                for(int j = 1; j <=i; j++) {
                    System.out.print(k + " ");
                    k++;
                }
                System.out.println();
            }
        }
    }
}
