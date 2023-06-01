package com.dpk.algorithms.dynamicprogramming;

public class NthFibonacciTabulation {

    public static int fibonacci(int n) {
        int[] lookupTable = new int[n+1];
        lookupTable[0] = 0;
        lookupTable[1] = 1;

        for(int i=2; i<=n; i++) {
            lookupTable[i] = lookupTable[i-1] + lookupTable[i-2];
        }

        return lookupTable[n];
    }

    public static int fibonacciTabulationRecursion(int n) {
        int last = 1;
        int secondLast = 0;
        int current = 0;

        for(int i=2; i<=n; i++) {
            current = last + secondLast;
            secondLast = last;
            last = current;
        }

        return current;
    }

    public static void main(String[] args) {
        int n = 6;
        int nthFibonacci = fibonacci(n);
        System.out.println("nth fibonacci using tabulation= " + nthFibonacci);

        int nthFib = fibonacciTabulationRecursion(n);
        System.out.println("nth fibonacci using tabulation recursion= " + nthFib);
    }
}
