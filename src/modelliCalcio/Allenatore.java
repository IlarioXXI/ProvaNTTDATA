package modelliCalcio;

public class Allenatore extends Persona { ;
    int numeroPanchine;
    public Allenatore(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        numeroPanchine=100;
    }

    public Allenatore(){}

    @Override
    public String toString() {
        return  "Numero panchine= " + numeroPanchine;
    }
}
