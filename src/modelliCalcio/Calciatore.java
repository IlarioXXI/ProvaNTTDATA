package modelliCalcio;

public class Calciatore extends Persona {
    public int numeroMaglia;
    public float stipendi;
    public int nuovoNumeroMaglia;
    public int goal=0;


    public Calciatore(String nome, String cognome, int numeroMaglia, float stipendi,int goal) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroMaglia = numeroMaglia;
        this.stipendi = stipendi;
        this.goal = goal;
    }
    public Calciatore(String nome,int numeroMaglia){
        this.nome=nome;
        this.numeroMaglia=numeroMaglia;
    }



    public void cambiaNumeroMaglia(int nuovoNumeroMaglia){
                numeroMaglia = nuovoNumeroMaglia;
    }

    public void chiediAumento(float nuovaPercentualeAumento){
       stipendi= ((nuovaPercentualeAumento/100) * stipendi)+stipendi;
    }

    public int segnaGoal(int goal){

       return this.goal ++;

    }

    @Override
    public String toString() {
        return "Calciatore{" +
                "numeroMaglia=" + numeroMaglia +
                ", stipendi=" + stipendi +
                ", nuovoNumeroMaglia=" + nuovoNumeroMaglia +
                ", goal=" + goal +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
