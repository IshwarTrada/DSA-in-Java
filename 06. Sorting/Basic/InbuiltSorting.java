// Java has Inbuilt sort method
// Time Complexity : O(n log(n) )

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSorting {
    public static void printArr(Integer nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer nums[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(nums);
        printArr(nums);
        Integer nums1[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(nums1, 0, 3);
        printArr(nums1);

        // For descending sorting
        Integer nums2[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(nums2, Collections.reverseOrder());
        printArr(nums2);
        Integer nums3[] = { 1, 4, 5, 3, 2 };
        Arrays.sort(nums3, 0,3, Collections.reverseOrder());
        printArr(nums3);
    }

}
