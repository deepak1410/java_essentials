package com.dpk.leetcode.upto200.lc169;

import java.util.Arrays;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        return usingBoyerMooresVotingAlgorithm(nums);
       // return usingSorting(nums);
    }

    private int usingBoyerMooresVotingAlgorithm(int[] nums) {
        int majorityItem = 0;
        int count = 0;
        for (int num : nums) {
            if(count == 0) {
                majorityItem = num;
            }
            count += (majorityItem == num) ? 1 : -1;
        }
        return majorityItem;
    }

    private int usingSorting(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    private void testcase1() {
        int[] arr = {2,2,1,1,1,2,2};
        int result = majorityElement(arr);
        int expectedResult = 2;
        System.out.println("Test passed = " + (result == expectedResult));
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        majorityElement.testcase1();
    }
}
