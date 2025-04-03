package GreedyAlgorithm.CoinChangeProblem;

import java.util.*;

public class CoinChangeProblem {
    static void CoinChangeProblem(int[] coins, int N) {
        Arrays.sort(coins);             // O(NLogn)
        int index = coins.length-1;     // O(1)
        while(true) {                   // O(N)
            int coinValue = coins[index];       // O(1)
            index--;                            // O(1)
            int maxAmount = (N/coinValue) * coinValue;  // O(1)
            if (maxAmount > 0) {                        // O(1)
                System.out.println("Coin value: "+ coinValue + " taken count: " + (N/coinValue));               // O(1)
                N = N - maxAmount;
            }
            if (N == 0) break;  // O(1)
        }

        // Time Complexity : O(NLogn)
        // Space Complexity : O(1)

    }
}
