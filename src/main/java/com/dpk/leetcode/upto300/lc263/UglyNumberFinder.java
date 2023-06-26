package com.dpk.leetcode.upto300.lc263;

public class UglyNumberFinder {

    public boolean isUgly(int n) {

        int num = removeFactor(n, 2);
        num = removeFactor(num, 3);
        num = removeFactor(num, 5);

        return  Math.abs(num) == 1;
    }

    private int removeFactor(int n, int d) {
        if(n % d != 0 || n < d) {
            return n;
        } else {
            return removeFactor(n / d, d);
        }
    }


}
