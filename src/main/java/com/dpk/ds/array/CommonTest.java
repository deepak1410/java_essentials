package com.dpk.ds.array;

import java.util.Arrays;

public class CommonTest {

    public static int[] findSum(int[] arr, int n)
    {
        int[] result = new int[2];
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
            if(arr[left] + arr[right] == n) {
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            } else if(arr[left] + arr[right] < n) {
                left ++;
            } else {
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        findSum(new int[]{9, 4, 7, 2, 6}, 17);
    }
}
