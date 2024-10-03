package entidade;

public class ÓrbitaTerrestre extends Viagem {

    public enum TipoOrbita {
        LEO, MEO, GEO, SSO, GTO
    }

    public TipoOrbita tipoOrbita;
    public float periodoOrbital;

    public ÓrbitaTerrestre(int sequencial,int tempoViagem, int totalPessoas, Classe classe, TipoOrbita tipoOrbita, float periodoOrbital) {
        super(sequencial, tempoViagem, totalPessoas, classe);
        this.tipoOrbita = tipoOrbita;
        this.periodoOrbital = periodoOrbital;
    }
    
   
    public ÓrbitaTerrestre(int sequencial, int totalPessoas) {
        super(sequencial, totalPessoas);
    }

    public TipoOrbita getTipoOrbita() {
        return tipoOrbita;
    }

    public void setTipoOrbita(TipoOrbita tipoOrbita) {
        this.tipoOrbita = tipoOrbita;
    }

    public float getPeriodoOrbital() {
        return periodoOrbital;
    }

    public void setPeriodoOrbital(float periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }
    
    @Override
    public ÓrbitaTerrestre getVisao() {
        return new ÓrbitaTerrestre(getSequencial(), getTotalPessoas());
    }

    @Override
    public String toString() {
        return super.toString() + " - Viagem Orbita Terrestre - Total Pessoas: " + getTotalPessoas();
    }
    public String toStringFull() {
        return super.toStringFull() + " --- Viagem Orbita Terrestre:: " + "Tipo Orbita: " + tipoOrbita + " - Periodo Orbital: " + periodoOrbital;
    }
    
}
