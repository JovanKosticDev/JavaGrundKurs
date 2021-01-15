package com.example.myapplication;

public class TestClass2 {
    private static int age;
    private String color;


      private static class TestInnerClass{
          private String name;

          public TestInnerClass(String name) {
              this.name = name;
          }

          private void printAge(){
              System.out.println("Age: " + age);
          }
      }
}
