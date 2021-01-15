package com.example.oopsektion3;

public class Main {
    public static void main(String[] args) {
//        Car mercedes = new Car("Mercedes CL 500", 2, "schwarz", new Engine("M275 AMG", 5000));
//        System.out.println(mercedes.getName());
//        Engine engine = mercedes.getEngine();
//
//        System.out.println("Engine Model: " + mercedes.getEngine().getModel());


        // NULL bedeutet in Java = Gar Nichts

//        Car mercedes = null;
//        if(mercedes != null){
//            System.out.println(mercedes.getName());
//        } else{
//            System.out.println("Das Objekt war null");
//        }

//        final int a = 5;
//        a = a + 5;

        final Engine cl500Engine = new Engine("M275 AMG", 5000);
        cl500Engine.setRpm(4800);
        System.out.println(cl500Engine.getRpm());

    }
}
