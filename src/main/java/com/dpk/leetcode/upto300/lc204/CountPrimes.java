package com.dpk.leetcode.upto300.lc204;

public class CountPrimes {

    public int countPrimes(int n) {
        int count = 0;
        for(int i = 2; i<=n; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int number) {
        if(number <=1) {
            return false;
        }

        return isPrime(number, 2);
    }

    private static boolean isPrime(int number, int divisor) {
        if(number == divisor) {
            return true;
        } else if(number % divisor == 0) {
            return false;
        }

        return isPrime(number, divisor+1);
    }

}
