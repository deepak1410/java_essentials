package com.dpk.ds.search;

public class BinarySearch {

    private static int[] arr = {2, 5, 7, 8, 10, 13, 18};

    public static int iterativeBinarySearch(int val, int[] array) {
        if(array == null || array.length == 0) {
            return -1;
        }

        int start = 0;
        int end = array.length;

        while(start < end) {
            int midpoint = (start + end) / 2;
            if(array[midpoint] == val) {
                return midpoint;
            } else if(array[midpoint] < val) {
                start = midpoint +1;
            } else {
                end = midpoint;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int val, int[] array) {
        return recursiveBinarySearch(array, 0, array.length, val);
    }

    public static int recursiveBinarySearch(int[] arr, int start, int end, int val) {
        if(start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if( arr[mid] == val) {
            return mid;
        } else if(arr[mid] < val) {
            return recursiveBinarySearch(arr, mid +1, end, val);
        } else {
            return recursiveBinarySearch(arr, 0, mid, val);
        }
    }


    public static void testIterativeBinarySearch() {
        System.out.println("Searching using Iterative binary search");
        System.out.println("Match found for " + 3 +  " at position " + iterativeBinarySearch(3, arr));
        System.out.println("Match found for " + 13 + " at position " + iterativeBinarySearch(13, arr));
        System.out.println("Match found for " + 8 + " at position " + iterativeBinarySearch(8, arr));
        System.out.println("Match found for " + 6 + " at position " + iterativeBinarySearch(6, arr));
    }

    public static void testRecursiveBinarySearch() {
        System.out.println("Searching using recursive binary search");
        System.out.println("Match found for " + 3 +  " at position " + recursiveBinarySearch(3, arr));
        System.out.println("Match found for " + 13 + " at position " + recursiveBinarySearch(13, arr));
        System.out.println("Match found for " + 8 + " at position " + recursiveBinarySearch(8, arr));
        System.out.println("Match found for " + 6 + " at position " + recursiveBinarySearch(6, arr));
    }

    public static void main(String[] args) {
        testIterativeBinarySearch();
        testRecursiveBinarySearch();
    }
}
