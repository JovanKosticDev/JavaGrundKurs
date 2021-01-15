package com.example.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String[] studentenListe = new String[5];
//
//        studentenListe[0] = "Max";
//        studentenListe[1] = "Jovan";
//        studentenListe[2] = "Alex";
//        studentenListe[3] = "Sara";
//        studentenListe[4] = "Laura";
//        studentenListe[5] = "Peter";
//
//        System.out.println(studentenListe[5]);
//
//        String[] mitarbeiter = {"Jovan", "Tom", "Michelle", "Franz", "Nina", "Adrian", "Markus", "Marc"};
//        int[] zahlen = {1,2,3,4,5,6,7,8,9,10};
//        for(int i = 0; i < mitarbeiter.length; i++){
//            System.out.println(mitarbeiter[i]);
//        }

        String[] namen = {"Jovan", "Alex", "Sara", "Peter", "Adrian"};
        int[] nummern = {154212, 57124, 548721, 87575, 657212};

        for(int i = 0; i < namen.length; i++){
            System.out.println(namen[i]);
        }

        System.out.println("Bitte wähle einen Namen aus: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for(int i = 0; i < namen.length; i++){
            if(name.equals(namen[i])){
                System.out.println(nummern[i]);
            }
        }

    }
}
