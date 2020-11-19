package com.creational.prototype;

import com.creational.prototype.shape.Shape;

/**
 * Prototype pattern delegates the cloning process to the actual object that is being cloned itself.
 * It lets you copy existing objects without making your code dependent on the concrete classes.
 *
 * The pattern declares a common interface for all objects that support cloning.
 * This interface lets you clone an object without coupling your code to the class of that object.
 * Usually, such an interface contains just a single clone method. Java has a built-in one called Cloneable
 *
 * An object that supports cloning is called a prototype. When your objects have dozens of fields and hundreds of possible configurations,
 * cloning them (and then configuring them manually) might serve as an alternative to subclassing.
 *
 * Problem:
 * Say you have an object, and you want to create an exact copy of it.
 * How would you do it? First, you have to create a new object of the same class.
 * Then you have to go through all the fields of the original object and copy their values over to the new object.
 *
 * There’s one more problem with the direct approach. Since you have to know the object’s class to create a duplicate,
 * your code becomes dependent on that class.
 *
 * Sometimes you only know the interface that the object follows, but not its concrete class, when, for example,
 * a parameter in a method accepts any objects that follow some interface.
 */
public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        // You can grab a clone of the shape without necessarily knowing the concrete shape class itself
        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
