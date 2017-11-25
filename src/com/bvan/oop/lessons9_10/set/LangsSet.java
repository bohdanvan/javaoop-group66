package com.bvan.oop.lessons9_10.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class LangsSet {

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

        Set<String> uniqueWords = new LinkedHashSet<>(words);
        System.out.println(uniqueWords);
    }
}
