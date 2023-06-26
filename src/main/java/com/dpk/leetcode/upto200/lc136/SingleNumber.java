package com.dpk.leetcode.upto200.lc136;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for(Integer item : list) {
            if(list.indexOf(item) == list.lastIndexOf(item)) {
                return item;
            }
        }

        return Integer.MAX_VALUE;
    }

    // Solution using xor
    public int solution2(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4, 1,2};
        SingleNumber sn = new SingleNumber();
        int result = sn.solution2(nums);
        System.out.println(result);
    }
}
