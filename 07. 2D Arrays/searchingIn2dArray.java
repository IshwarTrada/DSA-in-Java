import java.util.*;

public class searchingIn2dArray {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(key + " found at index (" + i + "," + j + ")");
                }
            }
        }
        System.out.println(key + " not found.");
        return false;
    }

    public static void createAndPrint(int matrix[][]) {
        // Input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        createAndPrint(matrix);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search element : ");
        int key = sc.nextInt();
        boolean isFound = search(matrix, key);
    }
}