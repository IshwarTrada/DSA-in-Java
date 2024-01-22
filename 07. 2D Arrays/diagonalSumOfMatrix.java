// Sum of diagonal element of n x n matrix and overlapping element consider only one time in sum

public class diagonalSumOfMatrix {

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        // Optimize method (Time Complexity : O(n))
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal sum
            sum += matrix[i][i];
            // secondary diagonal sum and overlapping element not consider second time
            if (i != matrix.length - 1 - i) {
                                // i+j=n-1 (secondary diagonal sum condition)
                                // j=n-1-i
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        // Time Complexity : O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // // primary diagonal sum
        // if (i == j) {
        // sum += matrix[i][j];
        // }
        // // Secondary diagonal sum
        // else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println("Diagonal Sum of Matrix is " + diagonalSum(matrix));
    }
}
