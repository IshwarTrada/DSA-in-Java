// Grid ways :
// Find number of ways to reach from (0,0) to (N-1, M-1) in N x M Grid
// Allowed moves : right or down
// Time Complexity : O(2^(N+M))

public class p7 {
    public static int gridWays(int i, int j, int n, int m) { // i,j current position value
        // base case
        if (i == n - 1 && j == m - 1) { // condition for last cell
            return 1;
        } else if (i == n || j == m) { // boundry cross condition
            return 0;
        }

        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 4, m = 5;
        System.out.println("Grid ways for " + n + " x " + m + " is :" + gridWays(0, 0, n, m));
    }
}