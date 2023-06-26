package com.dpk.leetcode.upto200.lc152;

public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for(int i=1;i<nums.length;i++) {
            // Swap the maxSoFar and minSoFar if the item is negative
            if(nums[i]<0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(maxSoFar*nums[i], nums[i]);
            minSoFar = Math.min(minSoFar*nums[i], nums[i]);

            result = Math.max(maxSoFar, result);
        }

        return result;
    }

    private void testCase1() {
        int[] arr = {-2,3,-4};
        int expectedResult = 24;
        int actualResult = maxProduct(arr);
        System.out.println("Test passed = " + (expectedResult == actualResult));
    }

    public static void main(String[] args) {
        MaximumProductSubarray mps = new MaximumProductSubarray();
        mps.testCase1();
    }
}
