package com.dpk.leetcode.upto200.lc167;

public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        int i=0, j=numbers.length-1;
        while (i<j) {
            int sum = numbers[i] + numbers[j];
            if(sum < target) {
                i++;
                continue;
            } else if(sum > target) {
                j--;
                continue;
            }

            return new int[]{i+1, j+1};
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] items = twoSum2.twoSum(new int[]{2,7,11,15}, 9);
    }
}
