package com.dpk.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwoCharacters {

    public static int alternate(String s) {

        // Special case handling
        if(s == null || s.length() <2) {
            return 0;
        }

        // Find unique characters
        List<Character> uniqueChars = new ArrayList<>(s.chars().mapToObj(c -> (char)c).collect(Collectors.toSet()));
        List<Character> pair;
        int largest = 0;

        // Loop and find any 2 characters
        for(int i=0; i < uniqueChars.size() -1; i++) {
            for(int j=1; j < uniqueChars.size(); j++) {
                pair = List.of(uniqueChars.get(i), uniqueChars.get(j));

                String subStr = getSubstring(s, pair);
                if(hasAlternate(subStr)) {
                    largest = subStr.length() > largest ? subStr.length() : largest;
                }
            }
        }

        return largest;
    }

    private static String getSubstring(String s, List<Character> pair) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            Character ch = s.charAt(i);
            if(pair.contains(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static boolean hasAlternate(String s) {
        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }

    public static void testAlternate(String s) {
        System.out.println("Max length for alternate characters in " + s + "=" + alternate(s));
    }


    public static void main(String[] args) {
        String s = "abaxyzbabd";
        testAlternate(s);
    }
}
