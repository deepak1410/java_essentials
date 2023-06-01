package com.dpk.algorithms.recursion;

public class DecimalToBinary {

    public static int decimalToBinary(int n) {
        return decimalToBinary(n, "");
    }

    private static int decimalToBinary(int n, String remainder) {
        if(n < 1) {
            return Integer.valueOf(n + remainder);
        } else {
            return decimalToBinary(n /2, (n % 2) + remainder);
        }
    }

    public static void main(String[] args) {
        System.out.println("Binary of 3 = " + decimalToBinary(3));
        System.out.println("Binary of 10 = " + decimalToBinary(10));
        System.out.println("Binary of 5 = " + decimalToBinary(5));
        System.out.println("Binary of 1 = " + decimalToBinary(1));
        System.out.println("Binary of 27 = " + decimalToBinary(27));
    }
}
