package com.patterns.behavioral.visitor.items;

import com.patterns.behavioral.visitor.ShoppingCartVisitor;

public interface Visitable {
    int accept(ShoppingCartVisitor visitor);
}
