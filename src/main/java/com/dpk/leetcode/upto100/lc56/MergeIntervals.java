package com.dpk.leetcode.upto100.lc56;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        // Sort items based on 1st index
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        LinkedList<int[]> mergedList = new LinkedList<>();
        for (int[] interval : intervals) {
            if (mergedList.isEmpty() || mergedList.getLast()[1] < interval[0]) {
                mergedList.add(interval);
            } else {
                mergedList.getLast()[1] = Math.max(mergedList.getLast()[1], interval[1]);
            }
        }

        int[][] result = new int[mergedList.size()][2];
        int i = 0;
        for(int[] list : mergedList) {
            result[i++] = list;
        }

        return result;
    }
}
