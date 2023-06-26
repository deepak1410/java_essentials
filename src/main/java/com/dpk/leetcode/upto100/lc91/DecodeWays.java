package com.dpk.leetcode.upto100.lc91;

public class DecodeWays {

    public int numDecodings(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;

        for(int i=2; i<=n; i++) {
            String first = s.substring(i-1, i);
            String second = s.substring(i-2, i);

            int firstNum = Integer.parseInt(first);
            int secondNum = Integer.parseInt(second);

            if(firstNum >=1 && firstNum <= 9) {
                dp[i] += dp[i-1];
            }

            if(secondNum >=10 && secondNum <= 26) {
                dp[i] += dp[i-2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        DecodeWays decodeWays = new DecodeWays();
        String s = "226";
        String s1 = "12";

        int ways = decodeWays.numDecodings(s);
        int ways1 = decodeWays.numDecodings(s1);
        System.out.println(ways);
        System.out.println(ways1);
    }
}
