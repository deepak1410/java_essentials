package com.dpk.problems;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private static List<Integer> fibonacciList = new ArrayList<>();

    public static List<Integer> generateFibonacci(int n) {
        int a = 1;
        int b = 2;

        fibonacciList.add(a);
        fibonacciList.add(b);

        for (int i=0; i< n-2; i++) {
            int c = a + b;
            a = b;
            b = c;
            fibonacciList.add(b);
        }

        return fibonacciList;
    }

    public static void main(String[] args) {
        generateFibonacci(8);

        for (Integer number : fibonacciList) {
            System.out.println(number);
        }
    }
}
