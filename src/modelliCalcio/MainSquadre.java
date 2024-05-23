package modelliCalcio;

public class MainSquadre {

    public static void cambiaNomeSquadra(Squadra squadra){
        squadra.nome = "ciao";
    }

    public  static int incrementaNumero(int numero){
        numero++;
        return numero;
    }

    public static void ricreaSquadra(Squadra squadra){
        squadra = new Squadra();
    }

    public static void main(String[] args) throws Exception {
        Calciatore calciatore = new Calciatore("ilario","ciao",12,50000,12);

        Calciatore calciatore1 = new Calciatore("Sandro","Vitucci",69,12000,12);

        Allenatore allenatore = new Allenatore("icaic","adhiwd",23);

        Squadra squadra = new Squadra("Bari",12,"io");
        Squadra squadra1 = new Squadra("paolo",4,"altamura");
        squadra.allenatore = allenatore;

        squadra.budget = 10000000;
        squadra.add(calciatore);
        squadra1.add(calciatore1);

        System.out.println(squadra);
        System.out.println(squadra1);

        PartitaDiCalcio partita = new PartitaDiCalcio(squadra,"io",squadra1);
        System.out.println(partita);

        squadra1.nome = "adesso";

        System.out.println(squadra.nome);
        ricreaSquadra(squadra);
        System.out.println(squadra.nome);
        System.out.println(calciatore1.nome);

        Persona persona;
        persona=calciatore1;

        System.out.println(persona);

        System.out.println(allenatore);
        System.out.println(squadra.calcolaSommaStipendi());


    }
}