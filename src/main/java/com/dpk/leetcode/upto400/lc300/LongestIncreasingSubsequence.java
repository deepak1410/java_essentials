package com.dpk.leetcode.upto400.lc300;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;

        for(int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if(i < 0) {
                i = Math.abs(i) - 1;
            }

            dp[i] = num;
            if(i == len) {
                len++;
            }
        }

        return len;
    }

    private void testCase1() {
        int[] nums = {0,1,0,3,2,3};
        int expectedResult = 4;
        int actualResult = lengthOfLIS(nums);
        System.out.println("Test passed = " + (expectedResult == actualResult) + ", Result=" + actualResult);
    }

    private void testCase2() {
        int[] nums = {10,9,2,5,3,7,101,18};
        int expectedResult = 4;
        int actualResult = lengthOfLIS(nums);
        System.out.println("Test passed = " + (expectedResult == actualResult) + ", Result=" + actualResult);
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        lis.testCase1();
        lis.testCase2();
    }
}
