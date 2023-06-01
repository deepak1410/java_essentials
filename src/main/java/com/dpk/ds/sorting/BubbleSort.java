package com.dpk.ds.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {

    public static void doBubbleSort(int[] arr) {
        for(int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void doBubbleSort(List<Integer> arr) {
        for(int i = arr.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr.get(j) > arr.get(j+1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
    }

    public static void sortArray(int[] arr) {
        System.out.println("\nBefore sorting");
        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        BubbleSort.doBubbleSort(arr);
        System.out.println("\nAfter sorting");
        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void sortList(List<Integer> arr) {
        System.out.println("\nBefore sorting");
        arr.forEach(item -> System.out.print(item + ", "));

        BubbleSort.doBubbleSort(arr);
        System.out.println("\nAfter sorting");
        arr.forEach(item -> System.out.print(item + ", "));
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 8, 1, 3};
        int[] arr1 = new int[20];
        System.out.println(arr1);
        BubbleSort.sortArray(arr);

        List<Integer> alist = Arrays.asList(4, 2, 9, 1, 3, 6);
        Integer[] a = (Integer[]) alist.toArray();

        Arrays.stream(a).collect(Collectors.toList());

        BubbleSort.sortList(alist);
    }
}
