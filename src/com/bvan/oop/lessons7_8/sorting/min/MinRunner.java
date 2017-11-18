package com.bvan.oop.lessons7_8.sorting.min;

import com.bvan.oop.common.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class MinRunner {

    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(30, 20, 45);
        List<String> names = Arrays.asList("John", "Bob", "Phil");
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Bob", 30),
                new Person("Phil", 20)
        );

        System.out.println(Min.min(ages)); // 20
        System.out.println(Min.min(names)); // "Bob"

        System.out.println(Min.min(people, byAge()));
        System.out.println(Min.min(people, byName()));
    }

    private static Comparator<Person> byAge() {
        return new AgeComparator();
    }

    private static Comparator<Person> byName() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

