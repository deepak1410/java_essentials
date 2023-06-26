package com.dpk.leetcode.upto300.lc202;

import java.util.HashSet;
import java.util.Set;

public class HappyNumberFinder {

    public boolean isHappy(int n) {
        boolean isHappyNumber = false;
        long number = n;
        Set<Long> visited = new HashSet<>();

        while(!visited.contains(number)) {
            long transformedNumber = transform(number);
            if(transformedNumber == 1L) {
                isHappyNumber = true;
                break;
            }
            visited.add(number);
            number = transformedNumber;
        }

        return isHappyNumber;
    }

    private long transform(long num) {
        long sum = 0;
        while(num > 0) {
            long digit = num % 10;
            sum += digit * digit;
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumberFinder happyNumberFinder = new HappyNumberFinder();

        int testNum1 = 19;
        System.out.println(testNum1 + " is a happy number=" + happyNumberFinder.isHappy(testNum1));
    }
}
