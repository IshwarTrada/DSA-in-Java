// Topic 5 : Binary Search

public class binarySearching {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] > key) { //left
                end = mid - 1;
            } else { //right
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 15, 16, 17, 18 };
        int key = 12;
        System.out.println(key + " is found at index " + binarySearch(numbers, key));
    }
}
