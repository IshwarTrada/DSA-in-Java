// Write a program to Find Transpose of a Matrix. 
// Input Matrix (2x3):
// a11    a12    a13
// a21    a22    a23
// Output Matrix (3x2):
// a11    a21
// a12    a22
// a13    a23

public class q3 {
    public static void transposeMatrix(int nums[][]) {
        int transposeRow = nums[0].length;
        int transposeCol = nums.length;
        int transposeMatrix[][] = new int[transposeRow][transposeCol];

        for (int i = 0; i < transposeRow; i++) {
            for (int j = 0; j < transposeCol; j++) {
                transposeMatrix[i][j] = nums[j][i];
            }
        }
        printMatrix(transposeMatrix);
    }

    public static void printMatrix(int matrix[][]) {
        System.out.println("Your matrix is :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3, }, { 4, 5, 6 } };
        printMatrix(nums);
        transposeMatrix(nums);
    }
}
