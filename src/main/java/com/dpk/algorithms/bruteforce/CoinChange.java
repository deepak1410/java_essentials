package com.dpk.algorithms.bruteforce;

/**
 * Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents), and pennies (1 cent),
 * write code to calculate the number of ways to represent n cents.
 */
public class CoinChange {

    public static int countChange(int denoms[], int amount) {
        return countChange(denoms, amount, denoms.length);
    }

    public static int countChange(int denoms[], int amount, int count) {
        // When n is 0, this implies that there is one way
        if(count == 0) {
            return 1;
        }

        // When count or denoms length is negative, this returns zero
        if(amount < 0 || denoms.length == 0) {
            return 0;
        }

        return countChange(denoms, amount, count - 1) + countChange(denoms, amount - denoms[count -1], count);
    }

    public static void main(String[] args) {
        int[] denoms = {25, 10, 5, 1};
        System.out.println(countChange(denoms, 10, 4));
    }
}
