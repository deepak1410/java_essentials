package com.dpk.leetcode.upto100.lc34;

import java.util.Arrays;

public class FirstAndLastIndexFinder {

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int start = findTargetIndex(nums, target, true);
        int end = findTargetIndex(nums, target, false);
        result[0] = start;
        result[1] = end;
        return result;
    }

    public int findTargetIndex(int[] arr, int target, boolean findStartIndex) {
        int start = 0;
        int end = arr.length -1;
        int result = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid -1;
            } else if(target > arr[mid]) {
                start = mid +1;
            } else {
                result = mid;
                if(findStartIndex) {
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }
        }

        return result;
    }

    private void testCase1() {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = {3,4};
        int[] range = searchRange(nums, target);
        System.out.println("*****Test Case-1*****");
        System.out.println("Expected =");
        Arrays.stream(result).boxed().forEach(System.out::println);

        System.out.println("Actual =");
        Arrays.stream(range).boxed().forEach(System.out::println);
    }

    private void testCase2() {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int[] result = {-1,-1};
        int[] range = searchRange(nums, target);
        System.out.println("*****Test Case-2*****");
        System.out.println("Expected =");
        Arrays.stream(result).boxed().forEach(System.out::println);

        System.out.println("Actual =");
        Arrays.stream(range).boxed().forEach(System.out::println);
    }

    public static void main(String[] args) {
        FirstAndLastIndexFinder obj = new FirstAndLastIndexFinder();
        obj.testCase1();
        obj.testCase2();
    }
}
