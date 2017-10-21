package com.bvan.oop.lessons1_2.dynamic_array.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ProcDynamicArrayApp {

    public static void main(String[] args) {
        int[] elems = readClientElemsFromConsole();

        System.out.println(Arrays.toString(elems));
        System.out.println(sum(elems));

        System.out.println("Goodbye");
    }

    private static int sum(int[] elems) {
        int sum = 0;
        for (int elem : elems) {
            sum += elem;
        }
        return sum;
    }

    private static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int[] elems = new int[4];
        int size = 0;

        int n = readClientElem(scanner);
        while (n != 0) {
            // BL
            if (size == elems.length) {
                int newLength = (int) (1.5 * elems.length);
                elems = Arrays.copyOf(elems, newLength);
            }
            elems[size] = n;
            size++;

            n = readClientElem(scanner);
        }
        return Arrays.copyOf(elems, size);
    }

    private static int readClientElem(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // skip
            System.out.println("Illegal elem");

            System.out.print(">> ");
        }
        return scanner.nextInt();
    }

    private static int[] addLastElem(int[] elems, int n) {
        int[] newElems = Arrays.copyOf(elems, elems.length+1);
        newElems[newElems.length - 1] = n;
        return newElems;
    }
}
