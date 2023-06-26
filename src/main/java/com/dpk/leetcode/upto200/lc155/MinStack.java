package com.dpk.leetcode.upto200.lc155;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinStack {
    List<Integer> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
    }

    public void pop() {
        if(!stack.isEmpty()) {
            stack.remove(stack.size() -1);
        }
    }

    public int top() {
        return stack.get(stack.size() -1);
    }

    public int getMin() {
        return stack.stream().min(Comparator.naturalOrder()).get();
    }
}
