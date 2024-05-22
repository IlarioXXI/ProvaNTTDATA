package modelliClasse;

public class Docenti extends Persona{
    public String materiaInsegnata;
    public String titolo;
    public int anniDiInsegnamento;

    public Docenti(String nome, String cognome, int eta, String materiaInsegnata, String titolo, int anniDiInsegnamento) {
        super(nome, cognome, eta);
        this.materiaInsegnata = materiaInsegnata;
        this.titolo = titolo;
        this.anniDiInsegnamento = anniDiInsegnamento;
    }
    public Docenti(){}


    @Override
    public String toString() {
        return "Docenti{" +
                "materiaInsegnata='" + materiaInsegnata + '\'' +
                ", titolo='" + titolo + '\'' +
                ", anniDiInsegnamento=" + anniDiInsegnamento +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
