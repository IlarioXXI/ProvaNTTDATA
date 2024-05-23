package modelliCalcio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Squadra {
    public String nome;
    public String sede;
    public int annoDiFondazione;
    public double budget;
    public double sommaStipendi;
    public int punti;
    public int goal;
    public ArrayList<Calciatore> calciatori;
    public Allenatore allenatore;

    public Squadra(String nome, int annoDiFondazione,String sede) {
        this.nome = nome;
        this.annoDiFondazione = annoDiFondazione;
        this.sede = sede;
        calciatori = new ArrayList<>();
        allenatore = new Allenatore();
    }
    public Squadra(){}

    public void add(Calciatore calciatore) {
            calciatori.add(calciatore);
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
                ", calciatori=" + calciatori +
                ", allenatore=" + allenatore +
                '}';
    }
}



