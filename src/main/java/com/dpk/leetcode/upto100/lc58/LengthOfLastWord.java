package com.dpk.leetcode.upto100.lc58;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s");
        return words.length > 0 ? (words[words.length -1]).length() : 0;
    }
}
