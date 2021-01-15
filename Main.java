package com.example.oopsektion2;

public class Main {
    public static void main(String[] args) {

        Bird phoenix = new Bird("Marco", "Blau", 2, true, 2);
        System.out.println(phoenix.getName());
        phoenix.eat("Mythical Zoan");

        //System.out.println(phoenix.getWings());
        phoenix.fly();
        phoenix.fly(120);


    }
}
