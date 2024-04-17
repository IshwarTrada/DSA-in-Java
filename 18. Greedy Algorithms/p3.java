// Fractional Knapsack

import java.util.*;;

public class p3 {
    public static void main(String[] args) {

        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50; // Knapsack(bag) Capacity

        double ratio[][] = new double[val.length][2];
        // 0th column : idx
        // 1st column : ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;
        // but we want descending order
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) { // include full item
                finalVal += val[idx];
                capacity -= weight[idx];
            } else { // include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Maximum profit you earn is : " + finalVal);
    }
}