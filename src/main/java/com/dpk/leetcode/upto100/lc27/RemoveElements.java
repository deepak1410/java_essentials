package com.dpk.leetcode.upto100.lc27;

public class RemoveElements {

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }

    public static void main(String[] args) {

    }
}
