// Search in rotated sorted array
// Question: Sorted, rotated array with distinct numbers(in ascending).
//          It is rotated at pivot point.
//          Find the index of given element
// Input : {4,5,6,7,0,1,2} and target element = 0
// Output : 4

public class SearchInRotatedSortedArray {
    public static int search(int arr[], int tar, int si,int ei){
        // Base case
        if (si>ei) {
            return -1;
        }


        int mid = si + (ei-si)/2;
        
        // CASE Found
        if (arr[mid]==tar) {
            return mid;
        }

        // CASE 1 : mid on L1
        if (arr[si]<=arr[mid]) {
            if (arr[si]<=tar && tar<=arr[mid]) {
                // Case a : left
                return search(arr, tar, si, mid-1);
            }
            else{
                // Case b : right
                return search(arr, tar, mid+1, ei);
            }
        }
        // CASE 2 : mid on L2
        else{
            if (arr[mid]<=tar && tar<=arr[ei]) {
                // Case c : right
                return search(arr, tar, mid+1, ei);
            }else{
                // Case d : left
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // output -> 4

        int tarIndex = search(arr, target, 0, arr.length-1);
        System.out.println(tarIndex);
    }
}
