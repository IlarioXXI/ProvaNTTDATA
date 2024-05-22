import java.util.Locale;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws Exception {

        System.out.println("Selezionare il programma da avviare:");
        System.out.println("Premi 1 per trovare tutti i numeri pari da zero a quello da te inserito.");
        System.out.println("Premi 2 per stampare la tabellina del tuo numero.");
        System.out.println("Premi 3 per sommare tutti i numeri dispari da zero a quello da te inserito.");
        System.out.println("Premi 4 individuare quante vocali ci sono in una stringa.");
        System.out.println("Premi 5 per calcolare il fattoriale del numero inserito.");

        Scanner in = new Scanner(System.in);

        int programmi = in.nextInt();

        switch(programmi){
            case 1 :
                System.out.println("Inserire un numero intero e positivo.");

                numeriPari();
                break;
            case 2 :
                System.out.println("Inserire un numero intero e positivo.");

                stampaTabellina();
                break;
            case 3 :
                System.out.println("Inserire un numero intero e positivo.");

                sommaNumeri();
                break;
            case 4 :
                System.out.println("Inserire una stringa. ");

                vocaliInStringa(in.nextLine());
                break;
            case 5 :
                System.out.println("Inserire un numero intero e positivo.");

                calcolaFattoriale();
                break;
        }



    }
    public static void numeriPari(){
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();

        if (numero<0){
            System.out.println("Inserire un numero positivo.");
            numeriPari();
        }
        System.out.println("I numeri pari sono: ");
            for (int i = 2; i <= numero; i++) {
                if ((i % 2) == 0) {
                    System.out.println(i);
                }
            }

    }

    public static void stampaTabellina(){

        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();

        if (numero<0){
            System.out.println("Inserire un numero positivo.");
            stampaTabellina();
        }
        System.out.println("Questa è la tabellina del: "+numero);

        for (int i = 0; i <= 10; i++) {
                System.out.println(numero * i);
            }

    }

    public static void sommaNumeri(){
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();

        if (numero<0){
            System.out.println("Inserire un numero positivo.");
            sommaNumeri();
        }

            int somma = 0;
            for (int i = 0; i <= numero; i++) {
                if ((i % 2) != 0) {
                    somma = somma + i;
                }

            }
            System.out.println("Questa è la somma di tutti i numeri dispari compresi tra 0 e il numero selezionato: "+somma);


    }

    public static void vocaliInStringa(String in){

        int vocale = 0;
        for(int i=0;i<in.length();i++){
            String x = String.valueOf(in.charAt(i)).toLowerCase(Locale.ROOT);
            if (x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u")){
                vocale = vocale + 1;
            }
        }
        System.out.println("Il numero delle vocali in questa stringa è: "+vocale);
    }

    public static void calcolaFattoriale(){
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();

        if (numero<0){
            System.out.println("Inserire un numero positivo.");
            calcolaFattoriale();
        }

            int fattoriale = numero;
            for (int i = numero-1; i > 1; i--) {
                fattoriale = fattoriale * i;
            }
            System.out.println("Il fattoriale di "+numero+"è: "+fattoriale);
    }
}
