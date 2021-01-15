package com.example.oopchallenge;

public class Eye extends Organ{
    private String color;
    private boolean isOpend;

    public Eye(String name, String medicalCondition, String color, boolean isOpend) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpend = isOpend;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
    }

    public void open(){
        this.setOpend(true);
        System.out.println(this.getName() + " Opened");
    }

    public void close(){
        this.setOpend(false);
        System.out.println(this.getName() + " Closed");
    }

    public String getColor() {
        return color;
    }

    public boolean isOpend() {
        return isOpend;
    }

    public void setOpend(boolean opend) {
        isOpend = opend;
    }
}
