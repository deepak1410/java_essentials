package com.dpk.leetcode.upto100.lc26;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int addIndex = 1;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i+1]) {

                nums[addIndex] = nums[i+1];
                addIndex++;
            }
        }

        return addIndex;
    }

    public void testcase1() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int count = removeDuplicates(nums);
        System.out.println("count=" + count);
    }

    public void testcase2() {
        int[] nums = {1, 1, 2};
        int count = removeDuplicates(nums);
        System.out.println("count=" + count);
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        obj.testcase1();
        obj.testcase2();
    }
}
