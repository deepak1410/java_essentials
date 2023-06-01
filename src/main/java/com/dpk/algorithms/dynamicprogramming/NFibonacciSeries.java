package com.dpk.algorithms.dynamicprogramming;

import java.util.Arrays;

/**
 * Using Memoization
 */
public class NFibonacciSeries {

    public static int fibonacci(int n, int[] lookupTable) {
        if(n <= 1) {
            lookupTable[n] = n;
        } else {
            lookupTable[n] = fibonacci(n-1, lookupTable) + fibonacci(n-2, lookupTable);
        }

        return lookupTable[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int[] lookupTable = new int[n +1];
        Arrays.fill(lookupTable, -1);

        int nthFibonacci = fibonacci(n, lookupTable);
        System.out.println(nthFibonacci);
    }
}
