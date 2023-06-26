package com.dpk.leetcode.upto100.lc46;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PermutationsFinder {


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> temp = new LinkedHashSet<>();
        backtrack(result, temp, nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, Set<Integer> temp, int[] nums) {
        if(temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int num : nums) {
            if (temp.contains(num)) {
                continue;
            }

            temp.add(num);
            backtrack(result, temp, nums);
            temp.remove(num);
        }
    }

    public static void main(String[] args) {

    }
}
