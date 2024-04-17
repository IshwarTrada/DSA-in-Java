// Minimum Sum Absolute Difference Pairs

import java.util.*;

public class p4 {
    public static void main(String[] args) {
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minAbsDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minAbsDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum Sum Absolute Difference Pairs : " + minAbsDiff); // 6
    }
}