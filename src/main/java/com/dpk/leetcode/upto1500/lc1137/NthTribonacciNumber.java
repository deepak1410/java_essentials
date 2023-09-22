package com.dpk.leetcode.upto1500.lc1137;

public class NthTribonacciNumber {

    public int tribonacci(int n) {
        if(n < 2) {
            return n;
        }

        if(n ==2) {
            return 1;
        }

        int[] items = new int[n+1];
        items[0] = 0;
        items[1] = 1;
        items[2] = 1;

        for(int i=3; i<= n; i++) {
             items[i] = items[i-1] + items[i-2] + items[i-3];
        }

        return items[n];
    }

    public static void main(String[] args) {

    }
}
