// Maximum length chain of pairs

import java.util.*;

public class p5 {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int lastPairEnd = pairs[0][1]; // last selected pair end // chain end

        for(int i=1; i<pairs.length; i++) {
            if (pairs[i][0] > lastPairEnd) {
                chainLen++;
                lastPairEnd = pairs[i][1];
            }
        }
        System.out.println("Max length of chain: " + chainLen);
    }
}
