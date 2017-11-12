package com.bvan.oop.lessons5_6.inheritance;

/**
 * @author bvanchuhov
 */
public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
