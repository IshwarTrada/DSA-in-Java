// Topic 2 : Maximum sum from subarray usinng 
// Prefix Sum method //Time Complexity : O(n^2)

// Original Array : { 1, -2, 6, -1, 3 }
// Prefix Array   : { 1, -1, 5, 4, 7 } It came from original array sum


public class maxSubarrayPrefixSum {
    public static void maxSumOfSubArray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSumOfSubArray(numbers);
    }
}