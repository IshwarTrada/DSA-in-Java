
// Pair sum - 2 (2 pointer approach) - O(n)
// Find if any pair in sorted and rotated ArrayList has a target sum
import java.util.ArrayList;

public class p11 {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        // breaking point
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            // Case 1:
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            // Case 2:
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }
            // Case 3:
            else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 11, 15, 6, 8, 9, 10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println("Pair sum - 2");
        System.out.println(pairSum2(list, target));
    }
}
