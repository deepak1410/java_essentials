package com.dpk.java8;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StreamAPIProblems1Test {

    private static StreamAPIProblems1 obj;

    @BeforeAll
    static void setUp() {
        obj = new StreamAPIProblems1();
    }

    @Test
    void separateOddAndEven() {
        List<Integer> integerList = List.of(3, 2, 8, 5, 6, 11);
        Map<String, List<Integer>> mapOfItems = obj.splitListByOddAndEven(integerList);

        List<Integer> odds = mapOfItems.get("odd");
        List<Integer> evens = mapOfItems.get("even");

        assertTrue(odds.containsAll(List.of(11, 3, 5)));
        assertTrue(evens.containsAll(List.of(8, 2, 6)));
    }

    @Test
    void separateOddAndEvenUsingPartition() {
        List<Integer> integerList = List.of(3, 2, 8, 5, 6, 11);
        Map<Boolean, List<Integer>> mapOfItems = obj.partitionListByOddAndEven(integerList);

        List<Integer> odds = mapOfItems.get(false);
        List<Integer> evens = mapOfItems.get(true);

        assertTrue(odds.containsAll(List.of(11, 3, 5)));
        assertTrue(evens.containsAll(List.of(8, 2, 6)));
    }

    @Test
    void findFrequencyOfCharactersInString() {
        Map<Character, Long> mapOfItems = obj.findFrequenciesOfChars("test");
        assertEquals(2, mapOfItems.get('t'));
        assertEquals(1, mapOfItems.get('e'));
    }

    @Test
    void canSortListInReverseOrder() {
        List<Integer> integerList = List.of(3, 2, 8, 5, 6, 11);
        List<Integer> sortedList = obj.sortListInReverseOrder(integerList);
        assertEquals(List.of(11, 8, 6, 5, 3, 2), sortedList);
    }

    @Test
    void canMergeUnsortedArrays() {
        int[] mergedArr = obj.mergeArrays(new int[]{3, 9, 2}, new int[]{5, 2, 8});
        int[] expectedResult = new int[]{2, 2, 3, 5, 8, 9};
        assertArrayEquals(expectedResult, mergedArr);
    }

    @Test
    void canMergeUnsortedArraysWithoutDuplicates() {
        int[] mergedArr = obj.mergeArraysWithoutDuplicates(new int[]{3, 9, 2}, new int[]{5, 2, 8});
        int[] expectedResult = new int[]{2, 3, 5, 8, 9};
        assertArrayEquals(expectedResult, mergedArr);
    }

    @Test
    void canGetMaxNItems() {
        List<Integer> integerList = List.of(3, 2, 8, 5, 6, 11);
        List<Integer> listMaxNItems = obj.findNMaxItems(integerList, 3);
        assertEquals(List.of(11, 8, 6), listMaxNItems);
    }

    @Test
    void canGetSortedListOfStringByLength() {
        List<String> list = List.of("api", "hello", "world", "test");
        List<String> expectedResult = List.of("api", "test", "hello", "world");

        List<String> result = obj.sortListByLength(list);
        assertEquals(expectedResult, result);
    }

    @Test
    void canGetAverage() {
        double result = obj.findAverage(List.of(5, 3, 8, 4, 10));
        assertEquals(6, result);
    }

    @Test
    void canReverseArray() {
        int[] arr = {4, 2, 5, 9, 8};
        int[] expectedResult = {8, 9, 5, 2, 4};
        int[] result = obj.reverseArray(arr);
        assertArrayEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({"madam, true", "test, false"})
    void isPalindrome(String str, boolean isPalindrome) {
        boolean result = obj.isPalindrome(str);
        assertEquals(isPalindrome, result);
    }

}