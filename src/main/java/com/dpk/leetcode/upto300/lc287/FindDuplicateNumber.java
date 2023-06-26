package com.dpk.leetcode.upto300.lc287;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateNumber {

    public int findDuplicate(int[] nums) {
        Map<Integer, Long> countMap = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return countMap.entrySet().stream().filter(entry -> entry.getValue() > 1).findFirst().get().getKey();
    }
}
