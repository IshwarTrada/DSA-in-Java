
// Pair sum - 1 (2 pointer approach) - O(n)
// Find if any pair in sorted ArrayList has a target sum
import java.util.ArrayList;

public class p10 {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            // Case 1:
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            // Case 2:
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            // Case 3:
            else {
                rp--;
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
