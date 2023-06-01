package com.dpk.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UglyFinder {

    private List<Integer> primeFactors = Arrays.asList(2,3,5);

    public boolean isUgly(int n) {
        if(n <= 0) {
            return false;
        }
        if(n ==1) {
            return true;
        }
        Set<Integer> divisors = getDivisors(n, new HashSet<>());


        return new HashSet<>(primeFactors).containsAll(divisors);
    }

    private Set<Integer> getDivisors(int n, Set<Integer> divisors) {

        if(isPrime(n)) {
            divisors.add(n);
            return divisors;
        }

        for (int i=2; i<=n/2; i++) {
            if(n % i ==0) {
                if(isPrime(i)) {
                    if(!primeFactors.contains(i)) {
                        divisors.add(i);
                    }

                } else {
                    getDivisors(i, divisors);
                }
            }
        }

        return divisors;
    }

    public boolean isPrime(int n) {
        if(n <=3) {
            return true;
        }

        for(int i=2; i<= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        UglyFinder uglyFinder = new UglyFinder();
        boolean ugly = uglyFinder.isUgly(1641249143);
        System.out.println(ugly);
    }
}
