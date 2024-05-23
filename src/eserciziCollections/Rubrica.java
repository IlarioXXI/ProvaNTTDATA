package eserciziCollections;

import java.util.ArrayList;

public class Rubrica {
    public ArrayList<Contatto> listaContatto;

    public Rubrica() {
        listaContatto=new ArrayList<>();
    }

    public void aggiungiNumero(Contatto contatto){
        listaContatto.add(contatto);
    }
    public void eliminaNumero(Contatto contatto){
        listaContatto.remove(contatto);
    }
    public Contatto cercaNumero(int index){
        return listaContatto.get(index);
    }
    public Contatto cercaNumero(String numero){
        for (Contatto contatto : listaContatto){
            if (numero.equals(contatto.numero)){
                return contatto;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Rubrica{" +
                "listaContatto=" + listaContatto +
                '}';
    }
}
