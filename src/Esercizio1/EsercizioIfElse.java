package Esercizio1;

public class EsercizioIfElse {

    public static boolean pariDispari(String stringa){
        if(stringa.length() % 2 == 0){
            System.out.println("La stringa è pari");
            return true;
        }else {
            System.out.println("La stringa è dispari");
            return false;
        }
    }

    public static boolean annoBisestile(int anno){
        if (anno % 4 == 0 || (anno % 100 == 0 && anno % 400 == 0) ){
            System.out.println("l'anno è bisestile");
            return true;
        }else {
            System.out.println("l'anno non è bisestile");
            return false;
        }
    }



    public static void main(String[] args) {
        pariDispari("arzanese");
        annoBisestile(2087);
    }
}
