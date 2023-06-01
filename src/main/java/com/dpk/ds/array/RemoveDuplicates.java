package com.dpk.ds.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i< arr.length; i++) {
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
            }
        }

        int[] uniqueItems = set.stream().mapToInt(e -> e.intValue()).toArray();
        return uniqueItems;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 2, 4, 5};
        int[] uniqueItems = removeDuplicates(arr);

        for(int i =0; i< uniqueItems.length; i++) {
            System.out.print(uniqueItems[i] + ",");
        }
    }
}
