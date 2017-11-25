package com.bvan.oop.lessons9_10.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bvanchuhov
 */
public class WordsCounter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java",
                "Kotlin",
                "Java",
                "Scala",
                "Kotlin",
                "Kotlin",
                "Scala",
                "C#",
                "Java",
                "Scala",
                "Python",
                "Scala"
        );
        Map<String, Integer> wordToCount = countWords(words);
        for (Map.Entry<String, Integer> entry : wordToCount.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();

        List<Map.Entry<String, Integer>> entries = sortedByCount(wordToCount);
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }
    }

    private static List<Map.Entry<String, Integer>> sortedByCount(Map<String, Integer> wordToCount) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordToCount.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        });
        return entries;
    }

    public static Map<String, Integer> countWords(
            List<String> words) {

        Map<String, Integer> wordToCount = new LinkedHashMap<>();

        for (String word : words) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }

        return wordToCount;
    }
}
