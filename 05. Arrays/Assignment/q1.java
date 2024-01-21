// Input : int array
// return false if value appear at least twice
// return true if all values are distinct
// Time Complexity : O(n^2)

public class q1 {
    public static boolean isDistinct(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // int num[] = { 1, 2, 3, 1 };
        int num[] = { 1, 2, 3, 4 };
        // int num[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(isDistinct(num));
    }
}