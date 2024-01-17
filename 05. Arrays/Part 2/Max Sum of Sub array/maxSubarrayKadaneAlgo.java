// Topic 1 : Maximum sum from subarray usinng 
// Kadane's Algorithm //Time Complexity : O(n)

// +ve      + +ve      => +ve
// +ve(Big) + -ve      => +ve
// +ve      + -ve(Big) => -ve (Take 0 if sum becomes negative)

// CurrSum = 0 , MaxSum = -infinity
// Array   : -2, -3, 4, -1, -2, 1, 5, -3
// CurrSum :  0,  0, 4,  3,  1, 2, 7,  4
// MaxSum  :  0,  0, 4,  4,  4, 4, 7,  7

public class maxSubarrayKadaneAlgo {
    public static void maxSumOfSubArray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        boolean allNegative = true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                allNegative = false;
                break;
            }
        }

        if (allNegative == false) { // Either any one or more numbers in array are positive
            for (int i = 0; i < numbers.length; i++) {
                currSum += numbers[i];
                if (currSum < 0) {
                    currSum = 0;
                }
                maxSum = Math.max(maxSum, currSum);
                // if (maxSum < currSum) {
                //     maxSum = currSum;
                // }
            }
        } else { // All numbers in array are negative
            for (int i = 0; i < numbers.length; i++) {
                if (maxSum < numbers[i]) {
                    maxSum = numbers[i];
                }
            }
        }
        System.out.println("Max sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxSumOfSubArray(numbers);
        int negativeNumbers[] = { -2, -3, -4, -1};
        maxSumOfSubArray(negativeNumbers);
    }
}