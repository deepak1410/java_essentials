package com.dpk.leetcode.upto400.lc387;

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        int index = -1;
        for(char ch : s.toCharArray()) {
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                return s.indexOf(ch);
            }
        }

        return index;
    }
}
