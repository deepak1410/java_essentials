package com.dpk.leetcode.upto200.lc118;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0) {
            return triangle;
        }

        List<Integer> item = new ArrayList<>();
        item.add(1);
        triangle.add(item);

        for(int i=1; i < numRows; i++) {
            List<Integer> newList = new ArrayList<>();
            newList.add(0, 1);

            List<Integer> triangleItem = triangle.get(i-1);
            for(int j=1; j<i; j++) {
                newList.add(j, triangleItem.get(j) + triangleItem.get(j-1));
            }

            newList.add(i, 1);
            triangle.add(newList);

        }

        return triangle;
    }
}
