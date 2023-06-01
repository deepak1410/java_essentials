package com.dpk.algorithms.greedy;

import java.util.Arrays;

public class MaxNumber {

    public static int findLargestNumber(int number_of_digits, int sum_of_digits ) {
        int[] arr = getDigitsArray();
        Arrays.sort(arr);

        int currentSum = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=arr.length -1; i>=0; i--) {
            while (currentSum <= sum_of_digits && (sum_of_digits >= currentSum + arr[i]) && sb.toString().length() < number_of_digits) {
                currentSum += arr[i];
                sb.append(arr[i]);
            }
        }

        return Integer.parseInt(sb.toString());
    }

    private static int[] getDigitsArray() {
        int[] arr = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = 9-i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int number = findLargestNumber(3, 20);
        System.out.println(number);
    }
}
