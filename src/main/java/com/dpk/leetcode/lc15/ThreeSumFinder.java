package com.dpk.leetcode.lc15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumFinder {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> results = new HashSet<>();

        for(int i =0; i < nums.length -2; i++) {
            int p1 = i+1;
            int p2 = nums.length-1;

            while(p1 < p2) {
                int sum = nums[i] + nums[p1] + nums[p2];
                if(sum == 0) {
                    results.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                    p1++;
                } else if (sum < 0) {
                    p1++;
                } else {
                    p2--;
                }
            }

        }

        return new ArrayList<>(results);
    }

    private void testcase1() {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> sum = threeSum(nums);
        // Debug to verify the result
    }

    public static void main(String[] args) {
        ThreeSumFinder finder = new ThreeSumFinder();
        finder.testcase1();
    }
}
