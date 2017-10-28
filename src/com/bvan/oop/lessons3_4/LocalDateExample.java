package com.bvan.oop.lessons3_4;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);

        LocalDate d2 = LocalDate.of(2021, 2, 29);
        System.out.println(d2);
    }
}
