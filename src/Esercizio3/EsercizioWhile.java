package Esercizio3;

import java.util.Scanner;

public class EsercizioWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringaUtente;


        while (true) {
            System.out.println("Inserisci una stringa (o ':q' per uscire):");
            stringaUtente = scanner.nextLine();


            if (stringaUtente.equals(":q")) {
                System.out.println("Hai scritto :q, il programma verrà terminato");
                break;
            }


            String[] caratteri = stringaUtente.split("");
            String risultato = String.join(",", caratteri);

            System.out.println("Stringa suddivisa: " + risultato);
        }

        scanner.close();
    }
    }

