package com.example.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        String[] names = {"Peter", "Max", "Claudia", "Melanie", "Max"};
//        String[] newNames = new String[6];
//        for(int i = 0; i < names.length; i++){
//            newNames[i] = names[i];
//        }
//        newNames[5] = "Florian";
//        System.out.println(newNames[5]);

        ArrayList<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Max");

//        System.out.println(names.get(0));
//        System.out.println(names.size());
//        //names.clear();
//        System.out.println(names.size());
//
//        names.remove("Peter");
//        System.out.println(names.get(0));
//        System.out.println(names.contains("Max"));
//        names.remove("Max");
//        System.out.println(names.isEmpty());

        //System.out.println(names.indexOf("Alex"));

//        for(int i = 0; i < names.size(); i++){
//            System.out.println(names.get(i));
//        }

        Map<String, String> emailList = new HashMap<>();
        emailList.put("Max", "Max@gmail.com");
        emailList.put("Lisa", "Lisa@gmail.com");

        System.out.println(emailList.get("Max"));
        System.out.println(emailList.size());

        emailList.remove("Lisa");
        System.out.println(emailList.size());

        System.out.println(emailList.containsKey("Lisa"));
        System.out.println(emailList.containsValue("Lisa@gmail.com"));

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Max", 10));
        students.add(new Student("Nina", 25));

        for(Student s: students){
            System.out.println(s.getName());
        }




    }
}
