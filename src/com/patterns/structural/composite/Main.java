package com.patterns.structural.composite;

/**
 * Composite is a structural design pattern that lets you compose objects into tree structures and
 * then work with these structures as if they were individual objects.
 *
 * Imagine having two objects, Products and Boxes. A Box can contain several Products as well as a number of smaller Boxes.
 * These little Boxes can also hold some Products or even smaller Boxes, and so on.
 * In order to get the total price, you have to know the classes of Products and Boxes you’re going through,
 * the nesting level of the boxes and other nasty details beforehand.
 *
 * The Composite pattern suggests that you work with Products and Boxes through a common interface
 * which declares a method for calculating the total price.
 *
 * Another example is creating a File System application where all folders can contain additional folders/files.
 * All of the entities have to implement a common interface in order to recursively iterate and search for directories/files.
 *
 * Using the Composite pattern makes sense only when the core model of your app can be represented as a tree.
 */
public class Main {
    public static void main(String[] args) {
        // The Base Component object is Department. All objects implement this interface

        // These are Leaf classes. They dont contain any references to other objects
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");

        // This is a Composite class as it holds a collection of Department components. It
        // implements the base component methods and defines the child related operations
        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        // Print the name of all departments
        headDepartment.printDepartmentName();
    }
}
