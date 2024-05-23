package eserciziCollections;

import java.util.ArrayList;

public class Contatto {
    public String nome;
    public String numero;

    public Contatto(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contatto{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
