package com.example.interfaceandabstractclasses;

public class TestClass extends TestAbstractClass {
    public TestClass(String name) {
        super(name);
    }

    @Override
    public void printName(String name) {
        System.out.println("Name: " + name);
    }
}
