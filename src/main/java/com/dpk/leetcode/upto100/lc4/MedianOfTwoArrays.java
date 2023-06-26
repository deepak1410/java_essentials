package com.dpk.leetcode.upto100.lc4;

import java.util.Arrays;

public class MedianOfTwoArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        Arrays.sort(mergedArray);

        if(mergedArray.length % 2 ==0) {
            int mid1 = mergedArray.length /2;
            int mid2 = mergedArray.length /2 + 1;

            return (mergedArray[mid1] + mergedArray[mid2]) / 2.0;
        } else {
            int mid = mergedArray.length /2;
            return mergedArray[mid];
        }
    }

    public static void main(String[] args) {
        MedianOfTwoArrays medianOfTwoArrays = new MedianOfTwoArrays();
        int[] nums1 = {2, 4, 5 };
        int[] nums2 = {3, 6};

        double expectedMedian = 4.0;

        double median = medianOfTwoArrays.findMedianSortedArrays(nums1, nums2);
        boolean result = expectedMedian == median;

        System.out.println("Result =" + result);
    }
}
