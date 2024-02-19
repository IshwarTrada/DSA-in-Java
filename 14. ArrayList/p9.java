
// Pair sum - 1 (Brute force) - O(n^2)
// Find if any pair in sorted ArrayList has a target sum
import java.util.ArrayList;

public class p9 {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println("Pair sum - 1");
        System.out.println(pairSum1(list, target));
    }
}
