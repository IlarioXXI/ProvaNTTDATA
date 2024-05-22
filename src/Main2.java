
import modelliCalcio.Calciatore;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire il nome.");
        String nome = in.nextLine();

        System.out.println("Inserire il cognome.");
        String cognome = in.nextLine();

        System.out.println("Inserire il numero di maglia.");
        int numeroMaglia = in.nextInt();

        System.out.println("Inserire lo stipendio.");
        float stipendi = in.nextFloat();
        int goal=0;

        Calciatore calciatore = new Calciatore(nome,cognome,numeroMaglia,stipendi,goal);

        int x = 0;
        while (x!=5) {
        System.out.println("1)Vuoi cambiare il numero di maglia?");
        System.out.println("2)Vuoi cambiare lo stipendio?");
        System.out.println("3)Stampa la prospettiva del calciatore.");
        System.out.println("4)Segna goal.");
        System.out.println("5)Esci.");



            x = in.nextInt();

            if (x == 1) {
                System.out.println("Inserire il nuovo numero maglia.");
                int nuovoNumeroMaglia = in.nextInt();
                if (nuovoNumeroMaglia >= 99 || nuovoNumeroMaglia == 0) {
                    System.out.println("Inserire un numero maglia valido (da 0 a 99)");
                } else {
                    calciatore.cambiaNumeroMaglia(nuovoNumeroMaglia);
                }
            } else if (x == 2) {
                System.out.println("Scrivi la percentuale di aumento dello stipendio");
                int nuovaPercentualeAumento = in.nextInt();
                calciatore.chiediAumento(nuovaPercentualeAumento);
            } else if (x == 3) {
                System.out.println("Prospettiva del calciatore = " + calciatore.toString());

            } else if (x==4) {
                calciatore.segnaGoal(goal);
                System.out.println("Ha segnato: " + calciatore.goal + "goal!");
            }
        }



//        Persona persona = new Persona();
//        System.out.println("Inserire il nome.");
//        Scanner in = new Scanner(System.in);
//        persona.setNome(in.nextLine());
//
//        System.out.println("Inserire il cognome.");
//        persona.setCognome(in.nextLine());
//
//        System.out.println("Inserire il ");
//
//        System.out.println(persona.toString());

    }

    public static void trovaNumeriPrimi() {
        System.out.println("Inserire un numero.");
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();


        for (int i = numero; i >= 3; i--) {

            boolean isPrimo=true;

            for(int j = i-1; j>=2;j--){
                if ((i%j)==0){
                    isPrimo=false;
                }

            }
            if(isPrimo){
                System.out.println(i);
            }

        }


    }

    public static boolean isPalindroma(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }

    private static void sottostringhe(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j >i + 2; j--) {
                var sub = s.substring(i, j);
                if(isPalindroma(sub))
                    System.out.println(sub);
            }
        }
    }
}