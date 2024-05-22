package modelliClasse;

public class Studenti extends Persona{
    public int esamiSuperati;
    public int numeroMatricola;

    public Studenti(String nome, String cognome, int eta, int esamiSuperati,int numeroMatricola) {
        super(nome, cognome, eta);
        this.esamiSuperati = esamiSuperati;
        this.numeroMatricola=numeroMatricola;
    }
    public Studenti(){}

    @Override
    public String toString() {
        return "Studenti{" +
                "esamiSuperati=" + esamiSuperati +
                ", numeroMatricola=" + numeroMatricola +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
