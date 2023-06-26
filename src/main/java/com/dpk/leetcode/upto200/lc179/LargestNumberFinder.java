package com.dpk.leetcode.upto200.lc179;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LargestNumberFinder {

    public String largestNumber(int[] nums) {
       // Sort the items
       String sorted = Arrays.stream(nums)
               .boxed()
               .map(Object::toString)
               .sorted((a, b) -> (b + a).compareTo(a+b))
               .collect(Collectors.joining());

       // Remove leading zeros
        return new BigInteger(sorted).toString();
    }


    public static void main(String[] args) {
        LargestNumberFinder finder = new LargestNumberFinder();
        int[] arr = new int[]{3,30,34,5,9};
        int[] arr1 = new int[]{0, 0};
        System.out.println(finder.largestNumber(arr));
        System.out.println(finder.largestNumber(arr1));
    }
}
