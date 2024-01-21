// Bubble Sort in descending order
// Time Complexity : O(n^2)

public class bubbleSorting {
    public static void bubbleSort(int nums[]) {
        for (int turns = 0; turns < nums.length - 1; turns++) {
            boolean swap = false;
            for (int i = 0; i < nums.length - 1 - turns; i++) {
                if (nums[i] < nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };
        bubbleSort(nums);
        printArr(nums);
    }
}