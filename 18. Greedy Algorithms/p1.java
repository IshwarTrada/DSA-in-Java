// Activity Selection (End time basis sorted activities) - O(n)
// Output :
//          Maximum activity: 4
//          A0 A1 A3 A4

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        int maxActivity = 1;
        ans.add(0);

        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // activity select
                maxActivity++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Maximum activity: " + maxActivity);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}