package com.structural.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;
    private String someField;
    private String anotherField;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }

    public void setAnotherField(String anotherField) {
        this.anotherField = anotherField;
    }

    public void update() {
        System.out.println("Send DB request to update values: " + this.someField + ", " + this.anotherField);
    }
}
