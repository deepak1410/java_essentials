package com.dpk.string;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringProblem {
    private static final Logger log = LogManager.getLogger(StringProblem.class);

    public void countDuplicate(String text) {
        System.out.println("counting duplicates in - " + text);

        // Solution-1
        System.out.println("***** Solution-1 *****");
        Map<Character, Integer> charcount = new HashMap<>();
        for(char c : text.toCharArray()) {
            if(charcount.putIfAbsent(c, 1) != null) {
                charcount.put(c, charcount.get(c) +1);
            }
        }
        for(Map.Entry<Character, Integer> entry : charcount.entrySet()) {
            System.out.println(entry.getKey() + " count = " + entry.getValue());
        }

        // Solution-2
        System.out.println("***** Solution-2 *****");
        Map<Object, Long> characterCount = text.chars()
                .mapToObj( c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        for(Map.Entry<Object, Long> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey() + " count = " + entry.getValue());
        }

    }


}
