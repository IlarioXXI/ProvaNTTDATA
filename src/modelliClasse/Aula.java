package modelliClasse;

import java.util.Arrays;

public class Aula {
    public String nomeClasse;
    public Persona[] persone;
    public int i;

    public Aula(String nomeClasse) {
        this.nomeClasse = nomeClasse;
        persone = new Persona[10];
        i = 0;
    }


    public void add(Persona persona, int i) {
        persone[i] = persona;
        i++;
    }

    public double sommaEta() {
        int i = 0;
        int sommaEta=0;
        for(Persona persona : persone){
            if(persona!=null){
                sommaEta += persona.eta;
                i++;
            }
        }
        return (double) sommaEta /i ;
    }

    public double mediaAnniDocenza(){
        int somma = 0;
        int i = 0;
        for(Persona persona : persone){
            int anniDocenza=0;
            if (persona instanceof Docenti){
                Docenti docenti = (Docenti)persona;
                somma += docenti.anniDiInsegnamento;
                i++;
            }
        }
        return (double) somma/i;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "nomeClasse='" + nomeClasse + '\'' +
                ", persone=" + Arrays.toString(persone) +
                '}';
    }


}
