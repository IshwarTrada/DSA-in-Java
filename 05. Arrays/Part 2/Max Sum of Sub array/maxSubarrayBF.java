// Topic 1 : Maximum sum from subarray usinng 
// Brute force method //Time Complexity : O(n^3)

// Input : { 1, -2, 6, -1, 3 }
// Output
// 1               Sum : 1
// 1 -2            Sum : -1
// 1 -2 6          Sum : 5
// 1 -2 6 -1       Sum : 4
// 1 -2 6 -1 3     Sum : 7

// -2              Sum : -2
// -2 6            Sum : 4
// -2 6 -1         Sum : 3
// -2 6 -1 3       Sum : 6

// 6               Sum : 6
// 6 -1            Sum : 5
// 6 -1 3          Sum : 8

// -1              Sum : -1
// -1 3            Sum : 2

// 3               Sum : 3

// Max Sum : 8

public class maxSubarrayBF {
    public static void maxSumOfSubArray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    currSum += numbers[k];
                }
                System.out.println("\t\tSum : " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSumOfSubArray(numbers);
    }
}