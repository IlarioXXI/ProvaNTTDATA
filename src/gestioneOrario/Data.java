package gestioneOrario;

import javax.swing.*;

public class Data{
    private int giorno;
    private int anno;
    private int numeroMese;
    private Mese mese;

    public int getNumeroMese() {
        return numeroMese;
    }
    
    public void setMese(Mese mese){
        this.mese = mese;
    }
    
    public Mese getMese(){
        return mese;
    }

    public int getGiorno() {
        return giorno;
    }

    public void setGiorno(int giorno) {
        if (giorno < 1 || giorno > 31) {
        } else if (mese == Mese.FEBBRAIO && giorno > 28) {
            System.out.println("Giorno non valido.");
        } else if ((mese == Mese.APRILE || mese == Mese.GIUGNO || mese == Mese.SETTEMBRE || mese == Mese.NOVEMBRE) && giorno > 30) {
            System.out.println("Giorno non valido.");
        } else {
            this.giorno = giorno;
        }
    }

    public int getAnno() {
        return anno;
    }




    public void setAnno(int anno) {
        if (anno<0 ){
            System.out.println("inserire data valida.");
        }else{
            this.anno = anno;
        }
    }
     public void controllaAnno(int anno){
        if (anno%4==0 && anno%100==0){
            
        }
     }
}
