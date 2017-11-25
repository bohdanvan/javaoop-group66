package com.bvan.oop.lessons9_10.map;

import com.bvan.oop.common.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Map<Long, Person> idToUserMap = new HashMap<>();

        idToUserMap.put(100L, new Person("Taras", 25)); // O(1)
        idToUserMap.put(2000L, new Person("Tamara", 18));
        idToUserMap.put(500L, new Person("Ivan", 30));

        Set<Long> keys = idToUserMap.keySet();
        Collection<Person> values = idToUserMap.values();
        Set<Map.Entry<Long, Person>> entries = idToUserMap.entrySet();

        for (Map.Entry<Long, Person> entry : entries) {
            Long key = entry.getKey();
            Person value = entry.getValue();
            System.out.println(key + " -> " + value);
        }
    }
}
