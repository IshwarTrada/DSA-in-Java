// Activity Selection (unsorted end time) - O(nlogn)
// Output :
//          Maximum activity: 2
//          A1 A2

import java.util.*;

public class p2 {
    public static void main(String[] args) {
        int start[] = { 12, 10, 20 };
        int end[] = { 25, 20, 30 };

        // Sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Sort our 2d array according to endtime which is at index 2 in our array
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        int maxActivity = 1;
        ans.add(activities[0][0]);

        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // activity select
                maxActivity++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum activity: " + maxActivity);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}