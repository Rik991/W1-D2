package Esercizio2;

import java.util.Scanner;

public class EsercizioSwitch {

   public static  Scanner scanner = new Scanner(System.in);

    public static String switchNumber(int numero){
        System.out.println("inserisci un numero");
          numero = scanner.nextInt();
        switch (numero){
            case 0:
                System.out.println(numero);
                break;
            case 1:
                System.out.println(numero);
                break;
                case 2:
                System.out.println(numero);
                break;
                case 3:
                System.out.println(numero);
                break;
            default:
                System.out.println("numero troppo grande");

        }


        return "";
    }


    public static void main(String[] args) {

        switchNumber(2);
    }
}
