package com.bvan.oop.lessons1_2.dynamic_array.oop;

/**
 * @author bvanchuhov
 */
public class DynamicArrayApp {

    public static void main(String[] args) {
        DynamicArray elems = readClientElemsFromConsole();

        System.out.println(elems.toString());
        System.out.println("Goodbye");
    }

    private static DynamicArray readClientElemsFromConsole() {
        RepeatableReader reader = new RepeatableReader(System.in);

        DynamicArray elems = new DynamicArray(8, 2.0);

        int n = reader.readInt();
        while (n != 0) {
            elems.addLast(n);

            n = reader.readInt();
        }
        return elems;
    }
}
