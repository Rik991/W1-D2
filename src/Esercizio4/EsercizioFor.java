package Esercizio4;


/*Scrivere un programma che chiede all'utente di inserire un numero intero e stampi il conto alla rovescia
a partire da quel numero fino a zero */


import java.util.Scanner;

public class EsercizioFor {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Inserisci un numero");
        int numeroUtente = scanner.nextInt();

        for (int i = numeroUtente; i > 0; i--) {
            System.out.println(i);
        }
    }
}
