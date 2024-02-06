// Problem 1 : Tiling Problem using recursion

public class TilingProblem {
    public static int tilingProblem(int n){ // 2 x n(floor size)
        // Base case
        if (n==0 || n==1) {
            return 1;
        }


        // Vertical choice
        int fnm1 = tilingProblem(n-1);
        
        // Horizontal choice
        int fnm2 = tilingProblem(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}