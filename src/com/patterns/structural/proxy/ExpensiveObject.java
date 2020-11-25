package com.patterns.structural.proxy;

public interface ExpensiveObject {
    void process();
    void setSomeField(String someField);
    void setAnotherField(String anotherField);
    void update();
}
