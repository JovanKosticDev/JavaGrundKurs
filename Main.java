package com.example.oopsektion1;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 11", 32, 16, 12);


        System.out.println(iPhone.getName());


        iPhone.playMusic("187");
        iPhone.playMusic("Palmen aus Plastik");

        Phone pixel = new Phone("Pixel 3", 64);
    }
}
