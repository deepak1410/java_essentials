package com.dpk.leetcode.upto100.lc1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //return solution1(nums, target);
        return solution2(nums, target);
    }

    // First Solution : Brute force
    private int[] solution1(int[] nums, int target) {
        for (int i =0; i< nums.length-1; i++) {
            for(int j=i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // 2nd Solution : Using one pass map
    private int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++) {
            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
