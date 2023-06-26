package com.dpk.leetcode.upto200.lc198;

public class HouseRobber {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length +1];
        dp[0] = 0;
        dp[1] = nums[0];

        for(int i=1; i<nums.length; i++) {
            dp[i+1] = Math.max(dp[i], dp[i-1] + nums[i]);
        }
        return dp[nums.length];
    }

    private void testCase1() {
        int[] nums = {2,7,9,3,1};
        int expectedResult = 4;
        int actualResult = rob(nums);
        System.out.println("Test passed = " + (expectedResult == actualResult));
    }

    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        houseRobber.testCase1();
    }
}
