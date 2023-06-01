package com.dpk.string;

import java.util.List;
import java.util.stream.Collectors;

public class Pangram {

    public static String isPangram(String text) {
        List<Integer> items = text.toLowerCase().chars().mapToObj(c -> c).collect(Collectors.toList());

        for(int i= 97; i<=122; i++) {
            if(!items.contains(i)) {
                return "not pangram";
            }
        }

        return "pangram";
    }

    public static void main(String[] args) {
        String text = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(isPangram(text) );
    }
}
