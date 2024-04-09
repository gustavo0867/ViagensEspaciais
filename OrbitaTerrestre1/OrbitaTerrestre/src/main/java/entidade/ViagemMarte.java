package entidade;

public class ViagemMarte extends Viagem {

    public enum VisitarLua {
        FOBOS, DEIMOS
    }

    public boolean lembrancaMarte;
    public VisitarLua visita;

    public ViagemMarte(int sequencial,int tempoViagem, int totalPessoas, Classe classe, Boolean lembrancaMarte, VisitarLua visita) {
        super(sequencial, tempoViagem, totalPessoas, classe);
        this.lembrancaMarte = lembrancaMarte;
        this.visita = visita;
    }

    public ViagemMarte(int sequencial, int totalPessoas) {
        super(sequencial, totalPessoas);
    }

    public boolean isLembrancaMarte() {
        return lembrancaMarte;
    }

    public void setLembrancaMarte(Boolean lembrancaMarte) {
        this.lembrancaMarte = lembrancaMarte;
    }

    public VisitarLua getVisita() {
        return visita;
    }

    public void setVisita(VisitarLua visita) {
        this.visita = visita;
    }

    @Override
    public ViagemMarte getVisao() {
        return new ViagemMarte(getSequencial(), getTotalPessoas());
    }

    @Override
    public String toString() {
        return super.toString() + " - Viagem Marte - Total Pessoas: " + getTotalPessoas();
    }
    public String toStringFull(){
        String str = super.toStringFull() + " --- Viagem marte:: ";
        if(lembrancaMarte) str += "Lembraça";
        str += " - Visita Lua: " + visita ;   
       return str; 
    }
    
    
}