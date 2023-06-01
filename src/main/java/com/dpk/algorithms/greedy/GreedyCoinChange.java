package com.dpk.algorithms.greedy;

import java.util.Arrays;

/**
 * Find the min number of coins required to get an amount.
 */
public class GreedyCoinChange {

    public static int findMinCount(int amount, int[] coins) {

        // Sort the coins array
        Arrays.sort(coins);

        int count = 0;
        int remainingAmount = amount;

        for(int i = coins.length -1; i >= 0; i--) {
            while (remainingAmount >= coins[i]) {
                remainingAmount -= coins[i];
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25};
        int amount = 87;

        int minCoins = findMinCount(amount, coins);
        System.out.println("Min coins = " + minCoins);
    }
}
