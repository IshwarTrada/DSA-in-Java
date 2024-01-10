// Hollow Rhombous
//    ****
//   *  *
//  *  *
// ****

import java.util.Scanner;

public class hollowRhombous {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input from the user
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // logic
            for (int i = num; i >= 1; i--) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= num; j++) {
                    if(i==1 || j==1 || i==num || j==num){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}