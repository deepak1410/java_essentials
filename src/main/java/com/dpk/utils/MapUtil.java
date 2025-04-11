package com.dpk.utils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapUtil {

    /**
     * Count Word Frequencies;
     * Given a string e.g. "hello world hello java world", create a map where the key is a word and the value is its frequency in the string.
     */
    public static  Map<String, Long> countWordFreq(String str) {
        // Method-1: Using compute method of Map
        Map<String, Integer> freq = new HashMap<>();
        Arrays.stream(str.split("\\s"))
                .forEach(item -> freq.compute(item, (k, v) -> v == null ? 1 : v+1));

        // Method-2: Using groupingBy of Collectors
        return Arrays.stream(str.split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    /**
     * Merge Two Maps
     * Given two maps {"Alice": 25, "Bob": 30} and {"Charlie": 20, "Bob": 35}, merge them into a single map. If a key exists in both maps, add their values.
     */
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        map1.forEach((k,v) -> map2.merge(k, v, Integer::sum));
        return map2;
    }

    /**
     * Sort a Map by Keys
     * Given a map {"Charlie": 20, "Alice": 25, "Bob": 30}, sort the map by keys in natural order.
     */
    public static Map<String, Integer> sortMapByKeys(Map<String, Integer> map) {
        return map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                                (oldVal, newVal) -> oldVal,
                        LinkedHashMap<String, Integer>::new));
    }

    /**
     * Sort a Map by Values
     * Given a map {"Alice": 25, "Bob": 30, "Charlie": 20}, sort the map by values in ascending order
     */
    public static Map<String, Integer> sortMapByValues(Map<String, Integer> map) {
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal,
                        LinkedHashMap::new
                ));
    }

    /**
     * Filter a Map
     * Given a map {"Alice": 25, "Bob": 30, "Charlie": 20}, create a new map containing only entries where the value is greater than 25.
     */
    public static Map<String, Integer> filterMapByValue(Map<String, Integer> map) {
        return map.entrySet().stream().filter(e -> e.getValue() > 25)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal,
                        HashMap::new
                ));
    }

    /**
     * Find the Key with the Maximum Value
     * Given a map {"Alice": 25, "Bob": 30, "Charlie": 20}, find the key with the maximum value.
     */
    public static String findKeyWithMaxVal(Map<String, Integer> map) {
        return map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
    }

    /**
     * Invert a Map
     * Given a map {"Alice": 25, "Bob": 30, "Charlie": 20}, create a new map where the keys and values are swapped.
     */
    public static Map<Integer, String> invertMap(Map<String, Integer> map) {
        return map.entrySet().stream().collect(Collectors.toMap(
                Map.Entry::getValue,
                Map.Entry::getKey,
                (oldVal, newVal) -> oldVal,
                HashMap::new
        ));
    }

    /**
     * Update Values Using compute
     * Given a map {"Alice": 25, "Bob": 30, "Charlie": 20}, use the compute method to increase the value of "Alice" by 5.
     */
    public static Map<String, Integer> updateValues(Map<String, Integer> map) {
        Map<String, Integer> result = new HashMap<>(map);
        result.forEach((key, val) -> result.compute(key, (k, v) -> key.equals("Alice") ? v + 5: v));
        return result;
    }

    /**
     * Combine Values Using merge
     * Given a map {"Alice": 25, "Bob": 30, "Charlie": 20}, use the merge method to add 5 to the value of "Alice".
     */
    public static Map<String, Integer> combineValues(Map<String, Integer> map) {
        Map<String, Integer> result = new HashMap<>(map);
        result.forEach((key, value) -> result.merge(key, value, (k, v) -> key.equals("Alice") ? v + 5 : v));
        return result;
    }

    /**
     * Sort a Map by Key Length
     * Given a map {"Alice": 25, "Bob": 30, "Charlie": 20}, sort the map by the length of the keys and print the sorted map.
     */
    public static Map<String, Integer> sortMapByKeyLength(Map<String, Integer> map) {
        return map.entrySet().stream().sorted(Comparator.comparingInt(e -> e.getKey().length())).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldVal, newVal) -> oldVal,
                LinkedHashMap::new
        ));
    }

    /**
     * Find Common Keys in Two Maps
     * Given two maps {"Alice": 25, "Bob": 30} and {"Bob": 35, "Charlie": 20}, find and print the common keys.
     */
    public static List<String> findCommonKeys(Map<String, Integer> map1, Map<String, Integer> map2) {
        return map1.keySet().stream().filter(map2::containsKey).collect(Collectors.toList());
    }

    /**
     * Find the Difference Between Two Maps
     * Given two maps {"Alice": 25, "Bob": 30} and {"Bob": 35, "Charlie": 20}, find and print the key-value pairs that are different between the two maps.
     */
    public static Map<String, Integer> findDiffBetweenMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();

        Set<String> allKeys = new HashSet<>(map1.keySet());
        allKeys.addAll(map2.keySet());

        allKeys.stream().filter(key -> !Objects.equals(map1.get(key), map2.get(key)))
                .forEach(key -> result.put(key, map1.getOrDefault(key, map2.get(key))));

        return result;
    }

    /**
     * Create a Frequency Map of Characters
     * Given a string "hello world", create a map where the key is a character and the value is its frequency in the string.
     */
    public static Map<Character, Long> getFrequencyMap(String str) {
        Map<Character, Long> result = new HashMap<>();

        str.chars().mapToObj(c -> (char)c).forEach(c -> result.put(c, result.getOrDefault(c, 0L) + 1));
        return result;
    }


}
