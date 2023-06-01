package com.dpk.algorithms.recursion;

public class GreatestCommonDivisor {

    public static int findGreatestCommonDivisor(int num1, int num2) {
        if(num1 == num2) {
            return num1;
        }

        if(num1 > num2) {
            return findGreatestCommonDivisor(num1 - num2, num2);
        } else {
            return findGreatestCommonDivisor(num1, num2 - num1);
        }
    }

    public static void main(String[] args) {
        int num1 = 18, num2 = 36;
        System.out.println("Greatest divisor between " + num1 + " and " + num2 + " is: " + findGreatestCommonDivisor(num1, num2));

        num1 = 36; num2 = 54;
        System.out.println("Greatest divisor between " + num1 + " and " + num2 + " is: " + findGreatestCommonDivisor(num1, num2));

        num1 = 2; num2 = 7;
        System.out.println("Greatest divisor between " + num1 + " and " + num2 + " is: " + findGreatestCommonDivisor(num1, num2));
    }
}
