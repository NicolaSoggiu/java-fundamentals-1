package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcoloBigliettoDelTreno {

    /**
     * Il programma chiede al passeggero la sua età e quanti km ha intenzione di percorrere;
     * Sulla base di queste info calcolerà il prezzo del biglietto;
     * In base a i km (0.21€ al km) e in base all'età, sconto del 20% per i minorenni e del 40% per gli over 65
     */
    public static void main(String[] args) {
        // creo uno scanner
        Scanner scan = new Scanner(System.in);
        // creo un DecimalFormat
        DecimalFormat format = new DecimalFormat("#.##");

        // inizializzo una variabile per il prezzo fisso di un km
        double priceKm = 0.21;


        // chiedo le informazioni al passeggero
        System.out.println("Inserire l'età del passeggero");
        int age = scan.nextInt();
        System.out.println("Inserire il numero dei km da percorrere");
        int kmNumber = scan.nextInt();

        // moltiplico il numero dei km inseriti dall'utente per il prezzo base di un km
        double price = kmNumber * priceKm;

        // metto i calcoli degli sconti in delle variabili
        double underAge = (price * 20) / 100;
        double overAge = (price * 40) / 100;

        // applico lo sconto per le età
        if (age < 18) {
            price = price - underAge;
        } else if (age > 65) {
            price = price - overAge;
        }

        // stampo il prezzo finale del biglietto
        System.out.println("Il prezzo del biglietto è " + format.format(price) + "€");

        // chiudo lo scanner
        scan.close();
    }
}
