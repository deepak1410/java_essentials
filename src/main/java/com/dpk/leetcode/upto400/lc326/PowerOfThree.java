package com.dpk.leetcode.upto400.lc326;

public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        if(n==0) {
            return false;
        }

        while (n%3==0) {
            n /= 3;
        }

        return n ==1;
    }

    private void testCase1() {
        int number = 19682;
        boolean result = isPowerOfThree(number);
        System.out.println("Result = " + result);
    }

    public static void main(String[] args) {
        PowerOfThree powerOfThree = new PowerOfThree();
        powerOfThree.testCase1();
    }
}
