package com.dpk.algorithms.recursion;

public class SortArray {

    public void sortArrayRecursive(int[] arr, int n) {
        if(n <= 1) {
            return;
        }

        for(int i=0; i< n-1; i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        sortArrayRecursive(arr, n-1);
    }
}
