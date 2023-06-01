package com.dpk.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigZagArray {

    public static void zigZag(int a[], int n){
        // Code your solution here.

        boolean asc = true;

        for(int i = 0; i < n -1; i++) {
            if(asc && (a[i] > a[i+1]) ) {
                swap(a, i);
            } else if(!asc && (a[i] < a[i+1])) {
                swap(a, i);
            }

            asc = !asc;
        }

    }

    private static void swap(int[] a, int index) {
        int temp = a[index];
        a[index] = a[index + 1];
        a[index +1] = temp;
    }

    public static void testZigZagArray(int[] a) {
        zigZag(a, a.length);
        for (int i=0; i< a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 9, 4, 8, 3};
        testZigZagArray(a);
    }
}
