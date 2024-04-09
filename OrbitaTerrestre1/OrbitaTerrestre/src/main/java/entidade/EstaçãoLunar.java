package entidade;

public class EstaçãoLunar extends Viagem {

    public enum TipoPacoteLunar {
        COMPLETO, SIMPLES
    };

    public enum OrbitaLua {
        PERIGEU, APOGEU
    };
    

    public OrbitaLua orbita;
    public TipoPacoteLunar pacote;
    
    
    public EstaçãoLunar(int sequencial,int tempoViagem, int totalPessoas, Classe classe, OrbitaLua orbita, TipoPacoteLunar pacote) {
        super(sequencial, tempoViagem, totalPessoas, classe);
        this.orbita = orbita;
        this.pacote = pacote;
    }

    public EstaçãoLunar(int sequencial, int totalPessoas) {
        super(sequencial, totalPessoas);
    }

    public TipoPacoteLunar getPacote() {
        return pacote;
    }

    public void setPacote(TipoPacoteLunar pacote) {
        this.pacote = pacote;
    }

    public OrbitaLua getOrbita() {
        return orbita;
    }

    public void setOrbita(OrbitaLua orbita) {
        this.orbita = orbita;
    }
    
    @Override
    public EstaçãoLunar getVisao() {
        return new EstaçãoLunar(getSequencial(), getTotalPessoas());
    }

    @Override
    public String toString() {       
        return super.toString() + " - Viagem Estação Lunar - Total Pessoas: " + getTotalPessoas();
    }
    
    public String toStringFull() {
        return super.toStringFull() + " --- Viagem Estação lunar:: " + "Orbita: " + orbita + " - Pacote: " + pacote;
    }
    
}

