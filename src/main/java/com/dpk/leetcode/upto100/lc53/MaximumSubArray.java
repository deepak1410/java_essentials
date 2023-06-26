package com.dpk.leetcode.upto100.lc53;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i =0; i< nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            sum = Math.max(0, sum);
        }

        return max;
    }


    public static void main(String[] args) {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int maxSubArraySum = maximumSubArray.maxSubArray(new int[]{3, 2, 5, 10});
        System.out.println("Validate sum " +  (20 == maxSubArraySum));
    }
}
