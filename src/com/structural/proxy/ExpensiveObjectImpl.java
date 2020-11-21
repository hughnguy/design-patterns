package com.structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {
    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("processing complete.");
    }

    @Override
    public void setSomeField(String someField) {
        System.out.println("Send DB request to update value: " + someField);
    }

    @Override
    public void setAnotherField(String anotherField) {
        System.out.println("Send DB request to update value: " + anotherField);
    }

    @Override
    public void update() {}

    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration...this is an expensive operation!!");
    }
}
