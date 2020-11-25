package com.patterns.behavioral.visitor;

import com.patterns.behavioral.visitor.items.Book;
import com.patterns.behavioral.visitor.items.Fruit;

/**
 * The Visitor interface declares a set of visiting methods that
 * correspond to element classes. The signature of a visiting
 * method lets the visitor identify the exact class of the
 * element that it's dealing with.
 */
public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
