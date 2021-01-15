package com.example.interfaceandabstractclasses;

public class FossilFuelCar implements CarInterface, TestInterface {

    private String name;

    public FossilFuelCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Explosion im Motorblock, startet das Auto.");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " fährt mit " + speed + " km/h");
    }

    @Override
    public void printName(String name) {

    }
}
