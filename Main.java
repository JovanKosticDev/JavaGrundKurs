package com.example.interfaceandabstractclasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        CarInterface carInterface = new ElectricCar("BMW I3");
//        carInterface.start();
//        carInterface.move(45);
//
//        CarInterface fossilCarInterface = new FossilFuelCar("Audi A3");
//        fossilCarInterface.start();
//        fossilCarInterface.move(140);

    TestAbstractClass testAbstractClass = new TestClass("Test");
    testAbstractClass.print("Hallo Welt");
    testAbstractClass.printName("Max Mustermann");

    }
}
