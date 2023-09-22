package com.dpk.leetcode.upto300.lc205;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> characterMap = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            // Check for value
            if(characterMap.containsKey(s.charAt(i)) && characterMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }

            // Check for key
            if(characterMap.containsValue(t.charAt(i))) {
                Character key = getKey(characterMap, t.charAt(i));
                if(key != null && !key.equals(s.charAt(i))) {
                    return false;
                }
            }

            characterMap.put(s.charAt(i), t.charAt(i));
        }

        return true;
    }

    private Character getKey(Map<Character, Character> characterMap, Character val) {
        for (Map.Entry<Character, Character> entry : characterMap.entrySet()) {
            if(val.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void testCase1() {
        String s = "egg", t = "add";
        boolean result = isIsomorphic(s, t);
        boolean expectedResult = true;
        System.out.println("Result =" + (expectedResult == result));
    }

    public void testCase2() {
        String s = "foo", t = "bar";
        boolean result = isIsomorphic(s, t);
        boolean expectedResult = false;
        System.out.println("Result =" + (expectedResult == result));
    }

    public void testCase3() {
        String s = "badc", t = "baba";
        boolean result = isIsomorphic(s, t);
        boolean expectedResult = false;
        System.out.println("Result =" + (expectedResult == result));
    }

    public static void main(String[] args) {
        IsomorphicString isomorphicString = new IsomorphicString();
        isomorphicString.testCase1();
        isomorphicString.testCase2();
        isomorphicString.testCase3();
    }
}
