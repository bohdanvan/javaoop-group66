package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class ProductsRunner {

    public static void main(String[] args) {
        Products products = new Products();
        products.add(new Product("MacBook", 2000));
        products.add(new Product("Lenovo", 1500));

        products.print(new NameFormatter());
        System.out.println();

        products.print(new CsvFormatter(";"));
        System.out.println();

        products.print(jsonFormatter());
        System.out.println();

        products.print(toStringFormatter());
    }

    private static Formatter jsonFormatter() {
        return new JsonFormatter();
    }

    private static Formatter toStringFormatter() {
        return new Formatter() {
            @Override
            public String format(Product product) {
                return product.toString();
            }
        };
    }

    private static Formatter toStringFormatterWithLambda() {
        return product -> product.toString();
    }
}
