package com.patterns.behavioral.visitor;

import com.patterns.behavioral.visitor.items.Book;
import com.patterns.behavioral.visitor.items.Fruit;
import com.patterns.behavioral.visitor.items.Visitable;

/**
 *
 * The purpose of a Visitor pattern is to define a new operation (calculating special price) without
 * introducing the modifications to an existing object structure (getPrice() of items)
 *
 * Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.
 *
 * The visitor pattern consists of two parts:
 * - Visitor: has a method called visit() which is implemented by the visitor and is called for every element in the data structure
 * - Visitable: classes providing accept() methods that accept a visitor
 *
 * - Use the Visitor when you need to perform an operation on all elements of a complex object structure (for example, an object tree).
 * - Use the pattern when a behavior makes sense only in some classes of a class hierarchy, but not in others.
 *
 * Real world analogy:
 * Imagine a seasoned insurance agent who’s eager to get new customers. He can visit every building in a neighborhood,
 * trying to sell insurance to everyone he meets. Depending on the type of organization that occupies the building,
 * he can offer specialized insurance policies:
 *
 * - If it’s a residential building, he sells medical insurance.
 * - If it’s a bank, he sells theft insurance.
 * - If it’s a coffee shop, he sells fire and flood insurance.
 */
public class Main {
    public static void main(String[] args) {
        Visitable[] items = new Visitable[] {
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")
        };

        // Calculate price
        // This visitor contains complex/special logic to calculate the price which
        // we do not want to locate in the items themselves
        PriceCalculator visitor = new PriceCalculator();

        int sum = 0;
        for (Visitable item : items) {
            sum = sum + item.accept(visitor);
        }
        int total = sum;

        System.out.println("Total Cost = "+total);
    }
}
