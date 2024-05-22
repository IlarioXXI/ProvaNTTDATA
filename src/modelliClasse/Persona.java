package modelliClasse;

public class Persona {
    public String nome;
    public String cognome;
    public int eta;

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }
    public Persona(){}

    public int getEta() {
        return eta;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta;
    }
}
