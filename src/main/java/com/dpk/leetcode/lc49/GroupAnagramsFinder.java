package com.dpk.leetcode.lc49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsFinder {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String orderedString = String.valueOf(chars);

            if(map.containsKey(orderedString)) {
                map.get(orderedString).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(orderedString, list);
            }
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            anagrams.add(entry.getValue());
        }

        return anagrams;
    }

    private String getOrderedString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public void testCase1() {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>>  anagrams = groupAnagrams(strs);
    }

    public static void main(String[] args) {
        GroupAnagramsFinder groupAnagramsFinder = new GroupAnagramsFinder();
        groupAnagramsFinder.testCase1();
    }
}
