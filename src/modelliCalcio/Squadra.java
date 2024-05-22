package modelliCalcio;

import java.util.Arrays;

public class Squadra {
    public String nome;
    public String sede;
    public int annoDiFondazione;
    public double budget;
    public double sommaStipendi;
    public int punti;
    public int goal;
    public Calciatore[] calciatori;
    public Allenatore allenatore;
    private int calciatoriInSquadra;

    public Squadra(String nome, int annoDiFondazione,String sede) {
        this.nome = nome;
        this.annoDiFondazione = annoDiFondazione;
        this.sede = sede;
        calciatori = new Calciatore[11];
        calciatoriInSquadra =0;
        allenatore = new Allenatore();
    }
    public Squadra(){}

    public void add(Calciatore calciatore) {
            calciatori[calciatoriInSquadra] = calciatore;
            calciatoriInSquadra++;
    }

    public void add(Calciatore calciatore, int i){
        calciatori[i] = calciatore;
        calcolaSommaStipendi(calciatore.stipendi);
    }



    private void calcolaSommaStipendi(double stipendi){
                sommaStipendi += stipendi;

    }

    public void aggiungiGoal(int nuoviGoalDaAggiungere) {
        goal = nuoviGoalDaAggiungere + goal;
        System.out.print(goal);
    }

    public int getGoal() {
        return goal;
    }

    @Override
    public String toString() {
        return "Squadra{" +
                "nome='" + nome + '\'' +
                ", sede='" + sede + '\'' +
                ", annoDiFondazione=" + annoDiFondazione +
                ", budget=" + budget +
                ", sommaStipendi=" + sommaStipendi +
                ", punti=" + punti +
                ", goal=" + goal +
                ", calciatori=" + Arrays.toString(calciatori) +
                 allenatore +
                '}';
    }
}



