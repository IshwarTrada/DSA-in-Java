// Problem 8 : WAF to find the last ocuurenece of an element in an array

public class p8 {
    public static int lastOccurence(int arr[], int key, int i) {
        // Base Case
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 6, 5, 5, 10, 2, 5, 5 };
        System.out.println(lastOccurence(arr, 5, 0));
    }
}
