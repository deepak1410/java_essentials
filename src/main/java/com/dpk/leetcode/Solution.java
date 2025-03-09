package com.dpk.leetcode;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Solution {

    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxArea = 0;

        while(i<j) {
            int area = Math.min(height[i], height[j]) * (j-i);
            maxArea = Math.max(maxArea, area);
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

    }
}
