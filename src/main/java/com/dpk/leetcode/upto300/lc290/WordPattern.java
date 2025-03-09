package com.dpk.leetcode.upto300.lc290;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s");
        if(pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> wordMap = new HashMap<>();
        for(int i=0; i<pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = wordMap.get(ch);
            String newWord = words[i];
            if(word == null) {
                if(wordMap.containsValue(newWord)) {
                    return false;
                }
                wordMap.put(ch, newWord);
            } else if(!word.equals(newWord)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern solution = new WordPattern();
        String s = "aa aa aa aa", pattern = "aaa";
        boolean seq =  solution.wordPattern(pattern, s);
        System.out.println(seq);
    }
}
