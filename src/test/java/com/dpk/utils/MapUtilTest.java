package com.dpk.utils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class MapUtilTest {

    private static Map<String, Integer> persons;

    @BeforeAll
    static void setUp() {
        persons = Map.of("john", 20, "alice", 30, "bob", 25, "tom", 28);
    }

    @Test
    void countWordFreq() {
        Map<String, Long> result = MapUtil.countWordFreq("hello world hello java world");
        assertEquals(3, result.size());
        assertEquals(2, result.get("world"));
    }


    @Test
    void mergeMaps() {
        Map<String, Integer> map1 = new HashMap<>(Map.of("Alice", 25, "Bob", 30));
        Map<String, Integer> map2 = new HashMap<>(Map.of("Charlie", 20, "Bob", 35));

        Map<String, Integer> mergedMap = MapUtil.mergeMaps(map1, map2);
        assertEquals(3, mergedMap.size());
        assertEquals(65, mergedMap.get("Bob"));
    }

    @Test
    void testSortedMapByKeys() {
        Map<String, Integer> map = Map.of("Charlie", 20, "Alice", 25, "Bob", 30);

        Map<String, Integer> sortedMap = MapUtil.sortMapByKeys(map);
        String concatenated = String.join("", sortedMap.keySet());
        assertEquals("AliceBobCharlie", concatenated);
    }

    @Test
    void testSortedMapByValues() {
        Map<String, Integer> map = Map.of("Alice", 25, "Charlie", 20, "Bob", 30);

        Map<String, Integer> sortedMap = MapUtil.sortMapByValues(map);
        String concatenated = sortedMap.values().stream().map(String::valueOf).collect(Collectors.joining());
        assertEquals("202530", concatenated);
    }

    @Test
    void testFilterMapByValue() {
        Map<String, Integer> map = Map.of("Charlie", 20, "Alice", 25, "Bob", 30);

        Map<String, Integer> result = MapUtil.filterMapByValue(map);
        assertEquals(1, result.size());
        String key = result.entrySet().stream().findFirst().get().getKey();
        int val = result.entrySet().stream().findFirst().get().getValue();
        assertEquals("Bob", key);
        assertEquals(30, val);
    }

    @Test
    void testKeyWithMaxVal() {
        Map<String, Integer> map = Map.of("Alice", 25, "Bob", 30, "Charlie", 20);

        String result = MapUtil.findKeyWithMaxVal(map);
        assertEquals("Bob", result, "key with max val: " + result);
    }

    @Test
    void testInvertMap() {
        Map<String, Integer> map = Map.of("Alice", 25, "Bob", 30, "Charlie", 20);
        Map<Integer, String> result = MapUtil.invertMap(map);
        assertEquals("Alice", result.get(25));
    }

    @Test
    void testCombineValues() {
        Map<String, Integer> map = Map.of("Alice", 25, "Bob", 30, "Charlie", 20);
        Map<String, Integer> result = MapUtil.combineValues(map);
        assertEquals(30, result.get("Alice"));
        assertEquals(20, result.get("Charlie"));
    }

    @Test
    void testUpdateValues() {
        Map<String, Integer> map = Map.of("Alice", 25, "Bob", 30, "Charlie", 20);
        Map<String, Integer> result = MapUtil.updateValues(map);
        assertEquals(30, result.get("Alice"));
        assertEquals(20, result.get("Charlie"));
    }

    @Test
    void testSortMapByKeyLength() {
        Map<String, Integer> map = Map.of("Alice", 25, "Bob", 30, "Charlie", 20);
        Map<String, Integer> result = MapUtil.sortMapByKeyLength(map);
        String keyStr = String.join("", result.keySet());
        assertEquals("BobAliceCharlie", keyStr);
    }

    @Test
    void testCommonKeysInMaps() {
        Map<String, Integer> map1 = Map.of("Alice", 25, "Bob", 30);
        Map<String, Integer> map2 = Map.of("Bob", 30, "Charlie", 20);
        List<String> result = MapUtil.findCommonKeys(map1, map2);
        assertEquals(1, result.size());
        assertEquals("Bob", result.getFirst());
    }

    @Test
    void testFindDiffBetweenMaps() {
        Map<String, Integer> map1 = Map.of("Alice", 25, "Bob", 30, "Charlie", 20);
        Map<String, Integer> map2 = Map.of("Bob", 35, "Charlie", 20);

        Map<String, Integer> result = MapUtil.findDiffBetweenMaps(map1, map2);
        assertEquals(2, result.size());
    }

    @Test
    void testFrequencyMap() {
        String str = "hello world";
        Map<Character, Long> result = MapUtil.getFrequencyMap(str);
        assertEquals(3, result.get('l'));
        assertEquals(1, result.get('h'));
    }

}