package com.bvan.oop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class Person {

    private final String name; // field, attribute
    private final int age;

    public Person(String name, int age) {
        if (!isAge(age)) {
            throw new IllegalArgumentException("illegal age: " + age);
        }

        this.name = name;
        this.age = age;
    }

    public Person(int age) {
        this("UNDEFINED", age);
    }

    public String sayHello() {
        return "Hello, I'm " + name + ", "
                + age + " years old";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person changeName(String name) {
        return new Person(name, this.age);
    }

    public Person changeAge(int age) {
        return new Person(this.name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private boolean isAge(int n) {
        return n >= 0 && n <= 120;
    }
}
