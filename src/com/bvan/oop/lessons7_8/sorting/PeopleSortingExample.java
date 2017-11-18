package com.bvan.oop.lessons7_8.sorting;

import com.bvan.oop.common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class PeopleSortingExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Bobby", 30),
                new Person("Phil", 20)
        );

        NameLengthComparator c = new NameLengthComparator();
        Collections.sort(people, Collections.reverseOrder(c));
        System.out.println(people);
    }
}

class NameLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int length1 = o1.getName().length();
        int length2 = o2.getName().length();
        return Integer.compare(length1, length2);
    }
}
