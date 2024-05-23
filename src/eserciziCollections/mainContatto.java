package eserciziCollections;

import java.util.ArrayList;

public class mainContatto {
    public static void main(String[]args){
        Contatto contatto1 = new Contatto("ilario","113425");
        Contatto contatto2 = new Contatto("giuseppe","1387637");
        Rubrica rubrica = new Rubrica();

        rubrica.aggiungiNumero(contatto1);
        rubrica.aggiungiNumero(contatto2);
        System.out.println(rubrica.cercaNumero(1));
        rubrica.eliminaNumero(contatto2);
        System.out.println(rubrica.cercaNumero(0));
        System.out.println(rubrica.cercaNumero("113425"));
    }
}
