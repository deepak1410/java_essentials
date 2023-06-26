package com.dpk.leetcode.upto100.lc78;

import java.util.ArrayList;
import java.util.List;

public class SubsetsFinder {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(result, temp, nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        result.add(new ArrayList<>(temp));
        for(int i=start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(result, temp, nums, i+1);
            temp.remove(temp.size() -1);
        }
    }

}
