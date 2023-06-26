package com.dpk.leetcode.upto100.lc7;

public class ReverseInteger {

    public static int reverse(int x) {
        int num = x;
        int reverse = 0;

        while (Math.abs(num) > 0) {
            int remainder = num % 10;

            // Handle Integer max and min range
            if (reverse > 0 && reverse > (Integer.MAX_VALUE - remainder) / 10) {
                return 0;
            }
            if (reverse < 0 && reverse < (Integer.MIN_VALUE - remainder) / 10) {
                return 0;
            }

            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        int num1 = -5;
        int num2 = 20;
        int num3 = 0;
        int num4 = 4000;
        int num5 = 4567;
        int num6 = 1534236469;

        System.out.println("Reverse of " + num1 + " =" + reverse(num1));
        System.out.println("Reverse of " + num2 + " =" + reverse(num2));
        System.out.println("Reverse of " + num3 + " =" + reverse(num3));
        System.out.println("Reverse of " + num4 + " =" + reverse(num4));
        System.out.println("Reverse of " + num5 + " =" + reverse(num5));
        System.out.println("Reverse of " + num6 + " =" + reverse(num6));
    }
}
