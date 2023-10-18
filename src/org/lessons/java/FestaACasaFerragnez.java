package org.lessons.java;

import java.util.Scanner;

public class FestaACasaFerragnez {

    /**
     * Scrivo un programma che controlli la lista invitati di una festa;
     * Il nome inserito deve essere presente nella lista degli invitati per poter entrare;
     */
    public static void main(String[] args) {

        // Creo uno scanner
        Scanner scan = new Scanner(System.in);

        // Creo un array di stringhe dove inserisco la lista degli invitati
        String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax",
                "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis",
                "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        // Inizializzo una variabile booleana per tenere traccia della presenza del nome
        boolean present = false;

        // Chiedo all'ospite il suo nome
        System.out.println("Qual è il suo nome?");
        String name = scan.nextLine();

        // creo un ciclo for per controllare tutti i nomi sulla lista e confrontare
        for (int i = 0; i < guestList.length; i++) {
            if (guestList[i].equals(name)) {
                present = true;
                break;
            }
        }

        // se è present è true stampo un messaggio
        if (present) {
            System.out.println("Il suo nome è sulla lista, può entrare");
            // altrimenti stampo un altro messaggio
        } else {
            System.out.println("Il suo nome non è presente sulla lista, mi spiace ma non posso farla entrare");
        }

        // Chiudo lo scanner
        scan.close();
    }
}