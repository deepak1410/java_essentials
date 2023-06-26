package com.dpk.leetcode.upto200.lc139;

import java.util.List;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() +1];
        dp[0] = true;
        for(int i=1; i <= s.length(); i++) {
            for(int j=0; j<i; j++) {
                if(dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }

        }

        return dp[s.length()];
    }

    public void testCase1() {
        String  s = "applepenapple";
        List<String> wordDict = List.of("apple","pen");
        boolean isWordBreak = wordBreak(s, wordDict);
        System.out.println("Test passed =" + (isWordBreak));
    }

    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        wordBreak.testCase1();
    }
}
