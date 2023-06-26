package com.dpk.leetcode.upto400.lc371;

public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        while (b != 0) {
            // Get sum without carry using xor
            int sum = a ^ b;

            // Get carry using bitwise and operator and left shift
            int carry = (a & b) << 1;

            a = sum;
            b = carry;
        }
        return a;
    }
}
