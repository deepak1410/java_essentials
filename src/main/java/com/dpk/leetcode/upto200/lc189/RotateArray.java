package com.dpk.leetcode.upto200.lc189;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // Adjust k when it's greater than array length
        if(k >= n) {
            k = k % n;
        }

        int[] result = new int[n];
        int j=0;

        // Items after kth position
        for(int i=n-k; i<n; i++) {
            result[j++] = nums[i];
        }

        // Items before kth position
        for(int i=0; i<n-k; i++) {
            result[j++] = nums[i];
        }

        // Copy the result to original array
        System.arraycopy(result, 0, nums,0, result.length);
    }

    public void testCase1() {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }

    public void testCase2() {
        int[] nums = {1,2};
        rotate(nums, 3);
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
       // rotateArray.testCase1();
        rotateArray.testCase2();
    }
}
