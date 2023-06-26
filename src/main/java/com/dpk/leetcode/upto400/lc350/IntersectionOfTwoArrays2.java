package com.dpk.leetcode.upto400.lc350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> uniqueItems = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        List<Integer> intersectionList = new ArrayList<>();

        uniqueItems.stream().forEach(item -> {
            long count1 = Arrays.stream(nums1).filter(each -> each == item).count();
            long count2 = Arrays.stream(nums2).filter(each -> each == item).count();
            long min = Math.min(count1, count2);

            for(int i=0; i<min; i++) {
                intersectionList.add(item);
            }
        });

        return intersectionList.stream().mapToInt(Integer::intValue).toArray();
    }
}
