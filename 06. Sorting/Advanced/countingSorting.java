// Counting Sorting
// Time Complexity : O(n + range(or)maxNo.)

public class countingSorting {
    public static void countingSort(int nums[]) {
        int largest = Integer.MIN_VALUE;
        // Find the largest number from original array for count array size
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        // Create count sort
        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // Sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingSort(nums);
        printArr(nums);
    }
}