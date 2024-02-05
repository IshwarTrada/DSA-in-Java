// Problem 6 : Check if a given array is sorted or not using recursion

public class p6 {
    public static boolean isSorted(int arr[], int i) {
        // element at the ened of array as well as it's base case
        if (i == arr.length - 1) {
            return true;
        }
        // check element at current index and at the next index
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(isSorted(arr, 0));
    }
}
