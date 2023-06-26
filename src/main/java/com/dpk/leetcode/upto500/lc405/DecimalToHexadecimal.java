package com.dpk.leetcode.upto500.lc405;

import java.util.Map;
import java.util.Stack;

public class DecimalToHexadecimal {
    private static Map<Integer, String> map = Map.of(
            10, "a",
            11, "b",
            12, "c",
            13, "d",
            14, "e",
            15, "f"
    );


    public String toHex(int num) {
        // This solution doesn't support negative number hence using the inbuilt method as workaround
        if(num < 0) {
            return Integer.toHexString(num);
        }

        Stack<Integer> stack = new Stack<>();

        while (num >= 16) {
            int remainder = num % 16;
            stack.push(remainder);
            num /= 16;
        }
        stack.push(num);

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            Integer item = stack.pop();
            if(map.containsKey(item)) {
                sb.append(map.get(item));
            } else {
                sb.append(item);
            }
        }

        return sb.toString();
    }
}
