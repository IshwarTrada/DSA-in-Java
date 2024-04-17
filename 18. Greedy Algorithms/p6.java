// Indian Coins : [1,2,5,10,20,50,100,500,2000]
// Input : 1059
// Output : 500, 500, 50, 5, 2, 2

import java.util.*;

public class p6 {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        // descending order
        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 1059;
        ArrayList<Integer> coinsList = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    coinsList.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Total (min) coins used : " + countOfCoins);

        System.out.println("You have to give notes/coins of : ");
        for (int i = 0; i < coinsList.size(); i++) {
            System.out.print(coinsList.get(i) + ", ");
        }
    }
}
