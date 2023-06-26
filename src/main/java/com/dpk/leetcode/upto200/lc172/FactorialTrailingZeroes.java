package com.dpk.leetcode.upto200.lc172;

public class FactorialTrailingZeroes {


    public int trailingZeroes(int n) {
        int count = 0;

        // Count all the multipliers of 5
        for(int i=5; i<n; i*=5) {
            count += n/i;
        }
        return count;
    }

    private void testCase1() {
        int n = 26;
        int expectedResult = 2;
        int actualResult = trailingZeroes(n);
        System.out.println("Test passes = " + (expectedResult == actualResult));
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes ftz = new FactorialTrailingZeroes();
        ftz.testCase1();
    }
}
