package com.dpk.leetcode.upto200.lc162;

import java.util.TreeMap;

public class PeakElementFinder {

    public int findPeakElement(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                map.put(nums[i], i);
            }
        }
        return map.isEmpty() ? nums.length -1 : map.lastEntry().getValue();
    }

}
