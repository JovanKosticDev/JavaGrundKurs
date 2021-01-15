package com.example.oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Max", 25,
                new Eye("Linkes Auge", "Kurzsichtig", "blau", true),
                new Eye("Rechtes Auge", "Kurzsichtig", "Braun", false),
                new Heart("Herz", "Normal", 65),
                new Stomach("Magen","Sodbrennen", false),
                new Skin("Haut", "Verbrannt", "Weiss", 50));

        System.out.println("Name: " + patient1.getName());
        System.out.println("Alter: " + patient1.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;
        while (!shouldFinish){
            System.out.println("Wähle ein Organ: " +
                    "\n\t1. Linkes Auge" +
                    "\n\t2. Rechtes Auge" +
                    "\n\t3. Herz" +
                    "\n\t4. Magen" +
                    "\n\t5. Haut" +
                    "\n\t6. Beenden");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    patient1.getLeftEye().getDetails();
                    if(patient1.getLeftEye().isOpend()){
                        System.out.println("\t\t1. Auge schliessen");
                        if(scanner.nextInt() == 1){
                            patient1.getLeftEye().close();
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("\t\t1. Auge öffnen");
                        if(scanner.nextInt() == 1){
                            patient1.getLeftEye().open();
                        }else{
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient1.getRightEye().getDetails();
                    if(patient1.getRightEye().isOpend()){
                        System.out.println("\t\t1. Auge schliessen");
                        if(scanner.nextInt() == 1){
                            patient1.getRightEye().close();
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("\t\t1. Auge öffnen");
                        if(scanner.nextInt() == 1){
                            patient1.getRightEye().open();
                        }else{
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient1.getHeart().getDetails();
                    System.out.println("\t\t1. Herzrate ändern");
                    if(scanner.nextInt() == 1){
                        System.out.println("Bitte eine neue Herzrate eingeben: ");
                        int newHeartRate = scanner.nextInt();
                        patient1.getHeart().setRate(newHeartRate);
                        System.out.println("Herzrate geändert zu: " + patient1.getHeart().getRate());
                    }else{
                        continue;
                    }
                    break;
                case 4:
                    patient1.getStomach().getDetails();
                    System.out.println("\t\t1. Verdauen");
                    if(scanner.nextInt() == 1){
                        patient1.getStomach().digest();
                    }else{
                        continue;
                    }
                    break;
                case 5:
                    patient1.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;

            }
        }
    }
}
