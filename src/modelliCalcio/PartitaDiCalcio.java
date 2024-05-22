package modelliCalcio;

public class PartitaDiCalcio {
    public Squadra squadraCasa;
    public Squadra squadraFuoriCasa;
    public String nomeArbitro;

    public PartitaDiCalcio(Squadra squadraCasa, String nomeArbitro, Squadra squadraFuoriCasa) {
        this.squadraCasa = squadraCasa;
        this.nomeArbitro = nomeArbitro;
        this.squadraFuoriCasa = squadraFuoriCasa;
    }

    public PartitaDiCalcio(String nomeArbitro){
        squadraCasa = new Squadra();
        squadraFuoriCasa = new Squadra();
        this.nomeArbitro = nomeArbitro;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraCasa=" + squadraCasa.nome +
                ", squadraFuoriCasa=" + squadraFuoriCasa.nome +
                ", nomeArbitro='" + nomeArbitro + '\'' +
                '}';
    }
}
