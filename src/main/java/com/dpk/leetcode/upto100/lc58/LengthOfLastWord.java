package com.dpk.leetcode.upto100.lc58;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s");
        return words.length > 0 ? (words[words.length -1]).length() : 0;
    }

    // This solution beats 100% on Leetcode
    public int lengthOfLastWord_UsingSubString(String s) {
        s = s.trim();
        return s.substring(s.lastIndexOf(" ") +1).length();
    }
}
