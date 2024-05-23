package gestioneOrario;

public class Orario {
    private int ora;
    private int minuti;
    private int  secondi;

    public String getOra() {
        return (ora<10)?"0"+ora:String.valueOf(ora);
    }

    public void setOra(int ora) {
        if (ora>=0 && ora <24){
            this.ora=ora;
        }else {
            System.out.println("ouu");
        }
    }

    public String getMinuti() {
        return (minuti<10)?"0"+minuti:String.valueOf(minuti);
    }

    public void setMinuti(int minuti) {
        if (minuti>=0 && minuti <60) {
            this.minuti = minuti;
        }else {
            System.out.println("ouu");
        }
    }

    public String getSecondi() {
        return (secondi<10)?"0"+secondi:String.valueOf(secondi);
    }

    public void setSecondi(int secondi) {
        if (secondi>=0 && secondi <60) {
            this.secondi = secondi;
        }else {
            System.out.println("ouu");
        }
    }

    public String calcolaAggiunta(int aggiunta, TipoOrario tipo){

        switch (tipo){
            case ORA :
                this.ora+=aggiunta;
                break;
            case MINUTI:
                this.minuti+=aggiunta;
                break;
            case SECONDI:
                this.secondi+=aggiunta;
                break;
        }

        return toString();
    }

    @Override
    public String toString() {
        return getOra()+":"+minuti+":"+secondi;
    }
}
