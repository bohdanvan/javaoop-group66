package com.bvan.oop.lessons11_12.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bvanchuhov
 */
public class TxtFileInput {

    public static void main(String[] args) {
        try {
            String fileName = "files/hello.txt";
            String s = oldReadMessageFromFile(fileName);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file is not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Sorry, IO error: " + e.getMessage());
        }

        System.out.println("Goodbye");
    }

    /**
     * @throws IOException
     * @throws FileNotFoundException
     */
    private static String readMessageFromFile(String fileName) throws IOException {
        // Java 7: try-with-resource
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {

            return reader.readLine();
        }
    }

    /**
     * @throws IOException
     * @throws FileNotFoundException
     */
    private static String oldReadMessageFromFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            return reader.readLine();
        } finally {
            closeReader(reader);
        }
    }

    private static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
