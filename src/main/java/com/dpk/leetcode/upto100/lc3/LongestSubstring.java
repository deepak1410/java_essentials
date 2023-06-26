package com.dpk.leetcode.upto100.lc3;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem statement https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstring {

    public int getMaxSubstringLength(String s) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;

        for(int i =0; i < s.length(); i++) {

            Character ch = s.charAt(i);
            if(map.containsKey(ch)) {
                start = Math.max(map.get(ch), start);
            }

            maxLength = Math.max(i - start + 1, maxLength);
            map.put(ch, i +1);
        }

        return maxLength;
    }


    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();

        String test1 = "bbbbb";
        String test2 = "abcabcbb";
        String test3 = "au";

        System.out.println("Longest substring for '" + test1 + "' =" + ls.getMaxSubstringLength(test1));
        System.out.println("Longest substring for '" + test2 + "' =" + ls.getMaxSubstringLength(test2));
        System.out.println("Longest substring for '" + test3 + "' =" + ls.getMaxSubstringLength(test3));
    }
}
