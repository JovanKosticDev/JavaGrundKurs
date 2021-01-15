package com.example.myapplication;

public class TestClass {
    public static String name;
    public int age;
    public String favoriteColor;

    public TestClass(int age, String favoriteColor) {
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    public void print(){

    }

    public static void printSomething(){
        System.out.println("Printing...");
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
}
