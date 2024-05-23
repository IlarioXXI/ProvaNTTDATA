package gestioneOrario;

import java.util.ArrayList;
import java.util.List;

public class MainOrario {
    public static void main(String[]args){
        Orario orario = new Orario();
        orario.setOra(9);
        orario.setMinuti(16);
        orario.setSecondi(45);
        System.out.println(orario);
        System.out.println(orario.calcolaAggiunta(2,TipoOrario.MINUTI));


    }
}
