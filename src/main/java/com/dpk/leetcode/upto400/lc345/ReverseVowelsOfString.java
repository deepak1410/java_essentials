package com.dpk.leetcode.upto400.lc345;

import java.util.Stack;

public class ReverseVowelsOfString {

    public String reverseVowels(String s) {
        Stack<Character> vowelsStack = new Stack<>();

        // Add to stack
        for(Character ch: s.toCharArray()) {
            if(isVowel(ch)) {
                vowelsStack.push(ch);
            }
        }

        // Replace
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)) {
                sb.append(vowelsStack.pop());
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    private boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        ReverseVowelsOfString sv = new ReverseVowelsOfString();
        String input = "hello";
        String output = sv.reverseVowels(input);
        System.out.println(output.equalsIgnoreCase("holle"));
    }
}
