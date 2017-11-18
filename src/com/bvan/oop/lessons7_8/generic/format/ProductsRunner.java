package com.bvan.oop.lessons7_8.generic.format;

import com.bvan.oop.lessons1_2.person.oop.Person;

/**
 * @author bvanchuhov
 */
public class ProductsRunner {

    public static void main(String[] args) {
        Printer<Person> products = new Printer<>();
        products.add(new Person("John", 25));
        products.add(new Person("Bob", 30));

        products.print(new NameFormatter());
        System.out.println();
    }
}

class NameFormatter implements Formatter<Person> {

    @Override
    public String format(Person value) {
        return Integer.toString(value.getAge());
    }
}
