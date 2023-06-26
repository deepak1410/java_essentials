package com.dpk.leetcode.upto100.lc80;

public class RemoveDuplicateFromSortedArray2 {

    public int removeDuplicates(int[] nums) {
        int index = 2;
        for(int i=2; i <nums.length; i++) {
            if(nums[i] != nums[index-2]) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }

    public void testCase1() {
        int[] arr = {1,1,1,2,2,3};
        int result = removeDuplicates(arr);
        System.out.println(result);
    }

    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray2 obj = new RemoveDuplicateFromSortedArray2();
        obj.testCase1();
    }
}
