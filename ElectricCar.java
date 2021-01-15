package com.example.interfaceandabstractclasses;

public class ElectricCar implements CarInterface{

    private String name;

    public ElectricCar(String name) {
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
        System.out.println(this);
        System.out.println("Elektrizität fliesst");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " fährt mit " + speed + " km/h");
    }
}
