package com.dpk.leetcode.upto100.lc41;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FindMissingPositiveNumber {

    public int firstMissingPositive(int[] nums) {

        Set<Integer> set = Arrays.stream(nums).boxed().filter(item -> item >0).collect(Collectors.toSet());

        for(int i=1; i<= set.size(); i++) {
            if(!set.contains(i)) {
                return i;
            }
        }

        return set.size() + 1;
    }

    private void testCase1() {
        int[] inputs = {2147483647};
        int result = firstMissingPositive(inputs);
        System.out.println("Test passed =" + (result == 1) + ", Result=" + result);
    }

    public static void main(String[] args) {
        FindMissingPositiveNumber findMissingPositiveNumber = new FindMissingPositiveNumber();
        findMissingPositiveNumber.testCase1();
    }
}
