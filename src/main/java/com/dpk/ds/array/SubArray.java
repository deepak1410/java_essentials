package com.dpk.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArray {

    public static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        int start = 0;
        int end = 1;
        int profit = 0;

        ArrayList<ArrayList<Integer>> stockList = new ArrayList<>();

        while(end < n-1) {
            int diff = A[end] - A[start];
            if(diff > profit) {
                profit = diff;
                if(A[end] > A[end+1] || end+1 == n-1) {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(start);
                    list.add(end);
                    stockList.add(list);

                    start = end;
                    end++;
                    profit = 0;
                } else {
                    end++;
                }
            } else {
                profit = 0;
                start++;
                end++;
            }
        }

        return stockList;

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> result = new ArrayList<>(2);

        boolean found = false;
        for(int i=0; i<n && !found; i++) {
            for(int j = i+1; j < n; j++) {
                int sum = getSum(arr, i, j);
                if(sum == s) {
                    result.add(i+1);
                    result.add(j);
                    found = true;
                    break;
                }
            }
        }

        if(result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    static int getSum(int[] arr, int start, int end) {
        int sum = 0;
        for(int i = start; i<end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int maxLen(int arr[], int n)
    {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0,max=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                int length=i-map.get(sum);
                max=Math.max(max,length);
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
    }

    static void testSubArray(int[] arr, int n, int s) {
        ArrayList<Integer> subArray = subarraySum(arr, n, s);

        for(Integer item : subArray) {
            System.out.println(item);
        }

    }

    public static void main(String[] args) {
       // int[] arr = new int[] { 1, 2, 3, 7, 5};
       // testSubArray(arr, 5, 120);

        int[] stocks = new int[] {100, 180, 260, 310, 40, 535, 695};

       // ArrayList<ArrayList<Integer>> list = stockBuySell(stocks, 7);

        int n = 8;
        int[] a = {15,-2,2,-8,1,7,10,23};

        maxLen(a, n);
    }
}
