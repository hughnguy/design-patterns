package com.behavioral.visitor.items;

import com.behavioral.visitor.ShoppingCartVisitor;

public interface Visitable {
    int accept(ShoppingCartVisitor visitor);
}
