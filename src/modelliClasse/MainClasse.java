package modelliClasse;

public class MainClasse {



    public static void main(String[] args) throws Exception {
        Persona persona = new Persona("Ilario","Vitucci",24);
        Persona persona1 = new Persona("Sandro","D'Onghia",21);

        Studenti studente = new Studenti("nome","cognome",12,2,2345);

        Docenti docente = new Docenti("Nome", "Cognome",21,"materia","titolo",123);
        Docenti docente1 = new Docenti("Nome", "Cognome",21,"materia","titolo",1113);

        Aula devBa = new Aula("developer");
        devBa.add(persona,1);
        devBa.add(persona1,2);
        devBa.add(studente,3);
        devBa.add(docente1,4);
        devBa.add(docente,5);

        System.out.println(devBa);
        devBa.sommaEta();
        System.out.println(devBa.sommaEta());

        System.out.println(devBa.mediaAnniDocenza());

    }
}
