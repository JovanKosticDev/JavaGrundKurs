package com.example.challenge;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Willkommen zum Ratespiel!");
        System.out.println("Bitte gib deinen Namen ein: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hallo und herzlich Willkommen zu meiner ersten Applikation " + name);

        System.out.println("Willst du das Spiel starten?");
        System.out.println("\t1. Ja");
        System.out.println("\t2. Nein");

        int antwortUser = scanner.nextInt();

        while (antwortUser != 1){
            System.out.println("Willst du das Spiel starten?");
            System.out.println("\t1. Ja");
            System.out.println("\t2. Nein");

            antwortUser = scanner.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(20) + 1;
        System.out.println("Bitte rate eine Zahl zwischen 0 und 20: ");
        int userInput = scanner.nextInt();

        int anzahlVersuche = 0;
        boolean hatGewonnen = false;
        boolean spielBeenden = false;

        while (!spielBeenden){
            anzahlVersuche++;

            if(anzahlVersuche < 5){
                if(userInput == x){
                    hatGewonnen = true;
                    spielBeenden = true;
                }else if(userInput > x){
                    System.out.println("Rate niedriger!");
                    userInput = scanner.nextInt();
                }else{
                    System.out.println("Rate höher!");
                    userInput = scanner.nextInt();
                }
            }else{
                spielBeenden = true;
            }
        }

        if(hatGewonnen){
            System.out.println("Kongratulation! Du hast die Zahl im " + anzahlVersuche + " Versuch erraten.");
        }else{
            System.out.println("GAME OVER");
            System.out.println("Die gesuchte Zahl war: " + x);
        }

    }
}


/*
* Wir erstellen ein Spiel!
* Das Konzept ist folgendes: Generiere eine zufällige Zahl, die der User raten muss.
* Gebe den User 5 Versuche, bevor du Game Over in der Konsole anzeigst
*
*
* So soll es funktionieren:
* Zeige eine Willkommensnachricht
* Frage den User nach seinen Namen und sage Hallo
* Frage den User ob er das Spiel starten will
* Nachdem du eine positive Antwort gekriegt hast, generiere eine zufällige Zahl und sage dem User das er raten muss
* Wenn der User die Zahl erraten hat, dann zeige eine: Du hast gewonnen! Nachricht an und beende das Spiel
* Wenn der User die Zahl nicht erraten hat, dann frage solange weiter bis er die richtige Zahl erraten hat
* Als ein Tipp, ausser dem ersten Rateversuch, jedes mal wo du nach der Nummer frägst, sage dem User das er niedriger oder höher raten soll
* Wenn der User 5 mal falsch geraten hat, dann zeige Game Over an und beende das Spiel
*
*
* */