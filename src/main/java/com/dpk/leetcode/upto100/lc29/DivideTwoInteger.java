package com.dpk.leetcode.upto100.lc29;

public class DivideTwoInteger {

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int quotient = 0;
        boolean negative = (dividend < 0) != (divisor < 0);
        long longDividend = Math.abs((long) dividend);
        long longDivisor = Math.abs((long) divisor);
        while (longDividend >= longDivisor) {
            int shift = 0;
            while (longDividend >= (longDivisor << shift)) {
                shift++;
            }
            shift--;
            longDividend -= longDivisor << shift;
            quotient += 1 << shift;
        }
        return negative ? -quotient : quotient;
    }

    private void testCase1() {
        int dividend = 10, divisor = 3;
        int expectedQuotient = 3;
        int actualQuotient = divide(dividend, divisor);
        System.out.println("Result=" + (expectedQuotient == actualQuotient) + ", actualQuotient=" + actualQuotient);
    }

    private void testCase2() {
        int dividend = 7, divisor = -3;
        int expectedQuotient = -2;
        int actualQuotient = divide(dividend, divisor);
        System.out.println("Result=" + (expectedQuotient == actualQuotient) + ", actualQuotient=" + actualQuotient);
    }

    private void testCase3() {
        int dividend = 2, divisor = 2;
        int expectedQuotient = 1;
        int actualQuotient = divide(dividend, divisor);
        System.out.println("Result=" + (expectedQuotient == actualQuotient) + ", actualQuotient=" + actualQuotient);
    }

    private void testCase4() {
        int dividend = 0, divisor = 1;
        int expectedQuotient = 0;
        int actualQuotient = divide(dividend, divisor);
        System.out.println("Result=" + (expectedQuotient == actualQuotient) + ", actualQuotient=" + actualQuotient);
    }

    public static void main(String[] args) {
        DivideTwoInteger obj = new DivideTwoInteger();
        obj.testCase1();
        obj.testCase2();
        obj.testCase3();
        obj.testCase4();
    }
}
