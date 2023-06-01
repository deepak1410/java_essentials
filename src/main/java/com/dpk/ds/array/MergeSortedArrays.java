package com.dpk.ds.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());

        list1.addAll(list2);
        return list1.stream().sorted().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5};
        int[] arr2 = {3, 6, 8};
        int [] sorted = mergeArrays(arr1, arr2);
    }
}
