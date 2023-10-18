package org.lessons.java.security;

import java.util.Scanner;
public class PasswordGenerator {
    /**
     * Il programma deve generare una password in base ai dati che vengono chiesti all'utente
     */
    public static void main(String[] args) {
        // creo lo scanner
        Scanner scan = new Scanner(System.in);

        // chiedo le informazioni all'utente
        System.out.println("Inserisci il tuo nome");
        String firstName = scan.nextLine();
        System.out.println("Inserisci il tuo cognome");
        String lastName = scan.nextLine();
        System.out.println("Inserisci il tuo colore preferito");
        String color = scan.nextLine();
        System.out.println("Inserisci il tuo giorno di nascita");
        int day = scan.nextInt();
        System.out.println("Inserisci il tuo mese di nascita");
        int month = scan.nextInt();
        System.out.println("Inserisci il tuo anno di nascita");
        int year = scan.nextInt();

        //sommo il giorno, il mese e l'anno di nascita
        int sum = day + month + year;

        //metto in un unica variabile tutti i dati raccolti
        String password = firstName + "-" + lastName + "-" + color + "-" + sum;

        //stampo la password
        System.out.println("La tua nuova password è: " + password);

    // chiudo lo scanner
    scan.close();
    }
}
