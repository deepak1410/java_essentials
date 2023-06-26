package com.dpk.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * List of problems found at https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/
 */
public class StreamAPIProblems1 {

    /**
     * Split list by ODD and EVEN integers using group by.
     */
    public Map<String, List<Integer>> splitListByOddAndEven(List<Integer> listOfIntegers) {
        return listOfIntegers.stream()
                .collect(Collectors.groupingBy(item -> (item % 2 == 0 ? "even" : "odd")));
    }

    /**
     * Split list by ODD and EVEN integers using partition by.
     */
    public Map<Boolean, List<Integer>> partitionListByOddAndEven(List<Integer> listOfIntegers) {
        return listOfIntegers.stream()
                .collect(Collectors.partitioningBy(item -> (item % 2 == 0)));
    }

    /**
     * Find frequencies of each character in a String
     */
    public Map<Character, Long> findFrequenciesOfChars(String str) {
        return str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    /**
     * Find frequencies of each item in an array
     */
    public Map<Integer, Long> findFrequenciesOfItems(List<Integer> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    /**
     * Sort a list in reverse order
     */
    public List<Integer> sortListInReverseOrder(List<Integer> list) {
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    /**
     * Merge 2 unsorted arrays into a single sorted array
     */
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
    }

    /**
     * Merge 2 unsorted arrays into a single sorted array without duplicates
     */
    public int[] mergeArraysWithoutDuplicates(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().toArray();
    }

    /**
     * Find n max items from a list
     */
    public List<Integer> findNMaxItems(List<Integer> list, int n) {
        return list.stream().sorted(Comparator.reverseOrder()).limit(n).collect(Collectors.toList());
    }

    /**
     * Sort List of String in increasing order of their length
     */
    public List<String> sortListByLength(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    /**
     * Average of all elements of a list
     */
    public double findAverage(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }

    /**
     * Reverse an array of integers
     */
    public int[] reverseArray(int[] arr) {
        return IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
    }

    /**
     * Check if String is palindrome
     */
    public boolean isPalindrome(String str) {
        return IntStream.range(0, str.length()/2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length()-i -1));
    }

    /**
     * Remove duplicates from a list
     */
    public List<Integer> removeDuplicates(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    /**
     * Join a list of String with delimiter, prefix, and suffix
     */
    public String joinString(List<String> listOfString, String delimiter, String prefix, String suffix) {
        return listOfString.stream().collect(Collectors.joining(delimiter, prefix, suffix));
    }



}
