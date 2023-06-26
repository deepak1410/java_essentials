package com.dpk.leetcode.upto100.lc66;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PlusOneGenerator {

    public int[] plusOne(int[] digits) {

        String str = Arrays.stream(digits).boxed().map(String::valueOf).collect(Collectors.joining());
        BigInteger bigInteger = new BigInteger(str);
        BigInteger sum = bigInteger.add(new BigInteger("1"));
        String[] numbers = String.valueOf(sum).split("");

        return Arrays.stream(numbers).mapToInt(Integer::valueOf).toArray();
    }
}
