package com.dpk.leetcode.upto300.lc215;

import java.util.Arrays;
import java.util.Comparator;

public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        return Arrays.stream(nums)
                .boxed().sorted(Comparator.reverseOrder())
                .skip(k-1).limit(1).findFirst().get();
    }

    private void testCase1() {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int expectedResult = 4;
        int actualResult = findKthLargest(nums, k);
        System.out.println("Test passed = " + (expectedResult == actualResult));
    }

    public static void main(String[] args) {
        KthLargestElement kthLargestElement = new KthLargestElement();
        kthLargestElement.testCase1();
    }
}
