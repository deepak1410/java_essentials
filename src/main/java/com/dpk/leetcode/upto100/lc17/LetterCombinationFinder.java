package com.dpk.leetcode.upto100.lc17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationFinder {

    private static Map<Character, String> letterMap = new HashMap<>();
    private String digits;

    static {
        letterMap.put('2', "abc");
        letterMap.put('3', "def");
        letterMap.put('4', "ghi");
        letterMap.put('5', "jkl");
        letterMap.put('6', "mno");
        letterMap.put('7', "pqrs");
        letterMap.put('8', "tuv");
        letterMap.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if(digits == null || digits.trim().length() == 0) {
            return result;
        }

        this.digits = digits;
        StringBuilder temp = new StringBuilder();
        backtrack(result, temp, 0);
        return result;
    }

    public void backtrack(List<String> result, StringBuilder temp, int index) {
        if(index == digits.length()) {
            result.add(temp.toString());
            return;
        }

        Character digit = digits.charAt(index);
        String str = letterMap.get(digit);

        // Recursive backtracking
        for(int i=0; i< str.length(); i++) {
            temp.append(str.charAt(i));
            backtrack(result, temp, index+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }

    private void testCase1() {
        LetterCombinationFinder finder = new LetterCombinationFinder();
        List<String> letters = finder.letterCombinations("23");
        System.out.println("Test passes =" + (letters.size() == 9));
    }

    private void testCase2() {
        LetterCombinationFinder finder = new LetterCombinationFinder();
        List<String> letters = finder.letterCombinations("345");
        System.out.println("Test passes =" + (letters.size() == 27));
    }

    public static void main(String[] args) {
        LetterCombinationFinder finder = new LetterCombinationFinder();
      //  finder.testCase1();
        finder.testCase2();
    }
}
