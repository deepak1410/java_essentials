package com.dpk.leetcode.upto1500.lc1071;

public class GreatestCommonDivisor {

    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        return b ==0 ? a : gcd(b, a % b);
    }

    private void testCase1() {
        String result =  gcdOfStrings("ABCABC", "ABC");
        String expectedResult = "ABC";
        System.out.println("Result =" + result.equals(expectedResult));
    }

    private void testCase2() {
        String result =  gcdOfStrings("Leet", "Code");
        String expectedResult = "";
        System.out.println("Result =" + result.equals(expectedResult));
    }

    public static void main(String[] args) {
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();

        gcd.testCase1();
        gcd.testCase2();
    }
}
