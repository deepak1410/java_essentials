package com.dpk.leetcode.upto200.lc128;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int longestCount=0;
        int currentLongest=0;

        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] +1 == nums[i+1]) {
                currentLongest++;
            } else if(nums[i] != nums[i+1]) {
                longestCount = Math.max(longestCount, currentLongest);
                currentLongest = 0;
            }

            longestCount = Math.max(longestCount, currentLongest);
        }

        return longestCount +1;
    }

    private void testCase1() {
        int[] nums = {100,4,200,1,3,2};
        int result = longestConsecutive(nums);
        int expectedResult = 4;
        System.out.println("Test result=" + (expectedResult == result));
    }

    private void testCase2() {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int result = longestConsecutive(nums);
        int expectedResult = 9;
        System.out.println("Test result=" + (expectedResult == result));
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        longestConsecutiveSequence.testCase1();
        longestConsecutiveSequence.testCase2();
    }
}
