package org.lessons.java;

public class FizzBuzz {

    /**
     * Scrivo un programma che stampi i numeri da 1 a 100;
     * Per i multipli di 3 stampo "Fizz";
     * Per i multipli di 5 stampo "Buzz";
     * Per i multipli sia di 3 che di 5 stampo "FizzBuzz".
     */
    public static void main(String[] args) {

        // itero un ciclo for 100 volte
        for (int i = 1; i <= 100; i++) {

            // se il numero iterato, cioè i, è multiplo sia di 3 che di 5 stampo FizzBuzz
            if ( i % 3 == 0 && i % 5 == 0 ) {
                System.out.println("FizzBuzz");

                // se è multiplo di 3 stampo Fizz
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");

                // se è multiplo di 5 stampo Buzz
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
