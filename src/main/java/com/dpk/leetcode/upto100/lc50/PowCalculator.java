package com.dpk.leetcode.upto100.lc50;

public class PowCalculator {

    public double myPow(double x, int n) {
        if(n == 0) {
            return 1;
        }

        if(n % 2 == 1) {
            return x * myPow(x, n-1);
        }

        if(n % 2 == 0) {
            return myPow(x * x, n/2);
        }

        return  1 / myPow(x, -n);
    }

    public static void main(String[] args) {
        PowCalculator powCalculator = new PowCalculator();
        double x = 2.00000;
        int n = -2;
        double pow = powCalculator.myPow(x, n);
        System.out.println(pow);
    }
}
