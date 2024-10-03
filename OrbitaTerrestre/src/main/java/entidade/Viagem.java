package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import persistência.BD;
import entidade.Viagem;
import entidade.EstaçãoLunar;
import entidade.EstaçãoLunar.OrbitaLua;
import entidade.EstaçãoLunar.TipoPacoteLunar;
import entidade.ViagemMarte;
import entidade.ViagemMarte.VisitarLua;
import entidade.ÓrbitaTerrestre;
import entidade.ÓrbitaTerrestre.TipoOrbita;

public class Viagem {

    public enum Classe {
        ECONOMICA, EXECUTIVA
    }

    protected int sequencial;
    protected int tempoViagem;
    protected int totalPessoas;
    protected Classe classe;

    public static boolean existeViagemMesmosAtributos(Viagem viagem) {
    String sql = "SELECT COUNT(Sequencial) FROM Viagem WHERE Tempo_viagem = ? AND Total_pessoas = ? AND Classe = ?";
    ResultSet lista_resultados = null;
    int n_viagens_mesmos_atributos = 0;
    try {
        PreparedStatement comando = BD.conexao.prepareStatement(sql);
        comando.setInt(1, viagem.getTempoViagem());
        comando.setInt(2, viagem.getTotalPessoas());
        comando.setInt(3, viagem.getClasse().ordinal());
        

        lista_resultados = comando.executeQuery();
        while (lista_resultados.next()) {
            n_viagens_mesmos_atributos = lista_resultados.getInt(1);
        }
        lista_resultados.close();
        comando.close();
    } catch (SQLException exceção_sql) {
        exceção_sql.printStackTrace();
    }
    if (n_viagens_mesmos_atributos > 0) {
            return true;
        } else {
            return false;
        }
}


    public static int últimoSequencial() {
        String sql = "SELECT MAX(Sequencial) FROM Viagem";
        ResultSet lista_resultados = null;
        int sequencial = 0;
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial = lista_resultados.getInt(1);
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return sequencial;
    }


public static Viagem[] getVisoes() {
    String sql = "SELECT " +
    "s.Sequencial , " +
    "s.Tempo_viagem, " +
    "s.Total_pessoas, " +
    "s.Classe, " +
    "l.orbita_lua, " +
    "l.tipo_de_pacotelunar, " +
    "m.visitar_lua, " +
    "m.lembranca_marte, " +
    "o.PeriodoOrbital, " +
    "o.Tipo_orbita " +
    "FROM Viagem s " +
    "LEFT JOIN Viagemestacaolunar l ON s.Sequencial = l.ViagemID " +
    "LEFT JOIN Viagemviagemmarte m ON s.Sequencial = m.ViagemID " +
    "LEFT JOIN Viagemorbitaterrestre o ON s.Sequencial = o.ViagemID;";


    ResultSet lista_resultados = null;
    ArrayList<Viagem> Visoes = new ArrayList();
    try {
        PreparedStatement comando = BD.conexao.prepareStatement(sql);
        
        lista_resultados = comando.executeQuery();
        
        while (lista_resultados.next()) {
            int sequencial = lista_resultados.getInt("Sequencial");
            int tempoViagem = lista_resultados.getInt("Tempo_viagem");
            int totalPessoas = lista_resultados.getInt("Total_pessoas");
            Classe classe = Classe.values()[lista_resultados.getInt("Classe")];
            
           // int tipoPacoteLunarInt = lista_resultados.getInt("tipo_de_pacotelunar");
            //TipoPacoteLunar tipopacotelunar = (tipoPacoteLunarInt != 0) ? TipoPacoteLunar.values()[tipoPacoteLunarInt] : null;
            TipoPacoteLunar tipopacotelunar = TipoPacoteLunar.values()[lista_resultados.getInt("tipo_de_pacotelunar")];           
            OrbitaLua orbitalua = OrbitaLua.values()[lista_resultados.getInt("orbita_lua")];
            
            boolean lembrancaMarte = lista_resultados.getBoolean("lembranca_marte");
            //int visitarLuaInt = lista_resultados.getInt("visitar_lua");
           // VisitarLua visitarlua = (visitarLuaInt != 0) ? VisitarLua.values()[visitarLuaInt] : null;
            VisitarLua visitarlua = VisitarLua.values()[ lista_resultados.getInt("visitar_lua")];
            
            float periodoOrbital = lista_resultados.getFloat("PeriodoOrbital");
            // tipoOrbitaInt = lista_resultados.getInt("Tipo_orbita");
            //TipoOrbita tipoorbita = (tipoOrbitaInt != 0) ? TipoOrbita.values()[tipoOrbitaInt] : null;
            TipoOrbita tipoorbita = TipoOrbita.values()[ lista_resultados.getInt("Tipo_orbita")];
               
            if(lembrancaMarte){
                Visoes.add(new ViagemMarte(sequencial, tempoViagem, totalPessoas, classe, lembrancaMarte, visitarlua) );
            }else if(periodoOrbital != 0){
                           Visoes.add(new ÓrbitaTerrestre(sequencial, tempoViagem, totalPessoas, classe, tipoorbita, periodoOrbital));
            }else {
                Visoes.add(new EstaçãoLunar(sequencial, tempoViagem, totalPessoas, classe, orbitalua, tipopacotelunar));

            }
             
                               
        }

        lista_resultados.close();
        comando.close();
    } catch (SQLException exceção_sql) {
        exceção_sql.printStackTrace();
    }
    return Visoes.toArray(new Viagem[Visoes.size()]);
}



    public static Viagem buscarViagem(int sequencial) {
    String sql = null;
    ResultSet lista_resultados = null;
    sql = "SELECT * FROM Viagem WHERE Sequencial = ?";
    int tempoViagem = 0;
    int totalPessoas = 0;
    Classe classe = null;

    try {
        PreparedStatement comando = BD.conexao.prepareStatement(sql);
        comando.setInt(1, sequencial);
        lista_resultados = comando.executeQuery();
        while (lista_resultados.next()) {
            tempoViagem = lista_resultados.getInt("Tempo_viagem");
            totalPessoas = lista_resultados.getInt("Total_pessoas");
            classe = Classe.values()[lista_resultados.getInt("Classe")];
        }
        lista_resultados.close();
        comando.close();
    } catch (SQLException exceção_sql) {
        exceção_sql.printStackTrace();
       /* if(classe == null)
           return null;*/
    }

    sql = "SELECT orbita_lua, tipo_de_pacotelunar FROM Viagemestacaolunar WHERE ViagemID = ?";
    lista_resultados = null;
    try {
        PreparedStatement comando = BD.conexao.prepareStatement(sql);
        comando.setInt(1, sequencial);
        lista_resultados = comando.executeQuery();
        while (lista_resultados.next()) {
            return new EstaçãoLunar(sequencial, tempoViagem, totalPessoas, classe,
                    OrbitaLua.values()[lista_resultados.getInt("orbita_lua")],
                    TipoPacoteLunar.values()[lista_resultados.getInt("tipo_de_pacotelunar")]
            );
        }
        lista_resultados.close();
        comando.close();
    } catch (SQLException exceção_sql) {
        exceção_sql.printStackTrace();
    }

    sql = "SELECT visitar_lua, lembranca_marte FROM Viagemviagemmarte WHERE ViagemID = ?";
    lista_resultados = null;
    try {
        PreparedStatement comando = BD.conexao.prepareStatement(sql);
        comando.setInt(1, sequencial);
        lista_resultados = comando.executeQuery();
        while (lista_resultados.next()) {
            return(new ViagemMarte(sequencial, tempoViagem, totalPessoas, classe,
                lista_resultados.getBoolean("lembranca_marte"),
                VisitarLua.values()[lista_resultados.getInt("visitar_lua")])
            );
        }
        lista_resultados.close();
        comando.close();
    } catch (SQLException exceção_sql) {
        exceção_sql.printStackTrace();
    }

    sql = "SELECT PeriodoOrbital, Tipo_orbita FROM Viagemorbitaterrestre WHERE ViagemID = ?";
    lista_resultados = null;
    try {
        PreparedStatement comando = BD.conexao.prepareStatement(sql);
        comando.setInt(1, sequencial);
        lista_resultados = comando.executeQuery();
        while (lista_resultados.next()) {
            return (new ÓrbitaTerrestre(sequencial, tempoViagem,totalPessoas, classe,
                    TipoOrbita.values()[lista_resultados.getInt("Tipo_orbita")],
                    lista_resultados.getFloat("PeriodoOrbital")
                    ));
    
        }
        lista_resultados.close();
        comando.close();
    } catch (SQLException exceção_sql) {
        exceção_sql.printStackTrace();
    }

    return null;
}

public static String inserirViagem(Viagem viagem) {
    String sql = "INSERT INTO Viagem (Tempo_viagem, Total_pessoas, Classe) VALUES (?, ?, ?)";

    try {
        PreparedStatement comando = BD.conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        comando.setInt(1, viagem.getTempoViagem());
        comando.setInt(2, viagem.getTotalPessoas());
        comando.setInt(3, viagem.getClasse() != null ? viagem.getClasse().ordinal() : -1);

        
        comando.executeUpdate();

        ResultSet generatedKeys = comando.getGeneratedKeys();
        if (generatedKeys.next()) {
            int sequencial = generatedKeys.getInt(1);

            if (viagem instanceof EstaçãoLunar) {
                EstaçãoLunar viagemEstacaoLunar = (EstaçãoLunar) viagem;
                sql = "INSERT INTO Viagemestacaolunar (orbita_lua, tipo_de_pacotelunar, ViagemID) VALUES (?, ?, ?)";
                PreparedStatement subComando = BD.conexao.prepareStatement(sql);
                subComando.setInt(1, viagemEstacaoLunar.getOrbita().ordinal());
                subComando.setInt(2, viagemEstacaoLunar.getPacote().ordinal());
                subComando.setInt(3, sequencial);
                subComando.executeUpdate();
                subComando.close();
            } else if (viagem instanceof ViagemMarte) {
                ViagemMarte viagemViagemMarte = (ViagemMarte) viagem;
                sql = "INSERT INTO Viagemviagemmarte (visitar_lua, lembranca_marte, ViagemID) VALUES (?, ?, ?)";
                PreparedStatement subComando = BD.conexao.prepareStatement(sql);
                subComando.setInt(1, viagemViagemMarte.getVisita().ordinal());
                subComando.setBoolean(2, viagemViagemMarte.isLembrancaMarte());
                subComando.setInt(3, sequencial);
                subComando.executeUpdate();
                subComando.close();
            } else if (viagem instanceof ÓrbitaTerrestre) {
                ÓrbitaTerrestre viagemOrbitaTerrestre = (ÓrbitaTerrestre) viagem;
                sql = "INSERT INTO Viagemorbitaterrestre (PeriodoOrbital, Tipo_orbita, ViagemID) VALUES (?, ?, ?)";
                PreparedStatement subComando = BD.conexao.prepareStatement(sql);
                subComando.setFloat(1, viagemOrbitaTerrestre.getPeriodoOrbital());
                subComando.setInt(2, viagemOrbitaTerrestre.getTipoOrbita().ordinal());
                subComando.setInt(3, sequencial);
                subComando.executeUpdate();
                subComando.close();
            }

            comando.close();
            return null;
        } else {
            comando.close();
            return "Erro ao obter a chave gerada para a Viagem.";
        }
    } catch (SQLException exceção_sql) {
        exceção_sql.printStackTrace();
        return "Erro na inserção da Viagem no BD";
    }
}

public static String alterarViagem(Viagem viagem) {
    String sql = "UPDATE Viagem SET Tempo_viagem = ?, Total_pessoas = ?, Classe = ? WHERE Sequencial = ?";
    try {
        PreparedStatement comando = BD.conexao.prepareStatement(sql);
        comando.setInt(1, viagem.getTempoViagem());
        comando.setInt(2, viagem.getTotalPessoas());
        comando.setInt(3, viagem.getClasse().ordinal());
        comando.setInt(4, viagem.getSequencial());
        comando.executeUpdate();
        comando.close();
    } catch (SQLException exceção_sql) {
        exceção_sql.printStackTrace();
        return "Erro na alteração da Viagem no BD";
    }

    if (viagem instanceof EstaçãoLunar) {
        EstaçãoLunar viagemEstacaoLunar = (EstaçãoLunar) viagem;

        sql = "UPDATE Viagemestacaolunar SET orbita_lua = ?, tipo_de_pacotelunar = ? WHERE ViagemID = ?";
        try {
            PreparedStatement subComando = BD.conexao.prepareStatement(sql);
            subComando.setInt(1, viagemEstacaoLunar.getOrbita().ordinal());
            subComando.setInt(2, viagemEstacaoLunar.getPacote().ordinal());
            subComando.setInt(3, viagem.getSequencial());
            subComando.executeUpdate();
            subComando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na alteração da Viagem Estação Lunar no BD";
        }
    } else if (viagem instanceof ViagemMarte) {
        ViagemMarte viagemViagemMarte = (ViagemMarte) viagem;

        sql = "UPDATE Viagemviagemmarte SET visitar_lua = ?, lembranca_marte = ? WHERE ViagemID = ?";
        try {
            PreparedStatement subComando = BD.conexao.prepareStatement(sql);
            subComando.setInt(1, viagemViagemMarte.getVisita().ordinal());
            subComando.setBoolean(2, viagemViagemMarte.isLembrancaMarte());
            subComando.setInt(3, viagem.getSequencial());
            subComando.executeUpdate();
            subComando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na alteração da Viagem Viagem Marte no BD";
        }
    } else if (viagem instanceof ÓrbitaTerrestre) {
        ÓrbitaTerrestre viagemOrbitaTerrestre = (ÓrbitaTerrestre) viagem;

        sql = "UPDATE Viagemorbitaterrestre SET PeriodoOrbital = ?, Tipo_orbita = ? WHERE ViagemID = ?";
        try {
            PreparedStatement subComando = BD.conexao.prepareStatement(sql);
            subComando.setFloat(1, viagemOrbitaTerrestre.getPeriodoOrbital());
            subComando.setInt(2, viagemOrbitaTerrestre.getTipoOrbita().ordinal());
            subComando.setInt(3, viagem.getSequencial());
            subComando.executeUpdate();
            subComando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na alteração da Viagem Órbita Terrestre no BD";
        }
    }

    return null;
}

public static String removerViagem(Viagem viagem) {
    int sequencial = viagem.getSequencial();
    
    if (viagem instanceof EstaçãoLunar) {
        String sql = "DELETE FROM Viagemestacaolunar WHERE ViagemID = ?";
        try {
            PreparedStatement subComando = BD.conexao.prepareStatement(sql);
            subComando.setInt(1, sequencial);
            subComando.executeUpdate();
            subComando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na Remoção da Viagem Estação Lunar no BD";
        }
    } else if (viagem instanceof ViagemMarte) {
        String sql = "DELETE FROM Viagemviagemmarte WHERE ViagemID = ?";
        try {
            PreparedStatement subComando = BD.conexao.prepareStatement(sql);
            subComando.setInt(1, sequencial);
            subComando.executeUpdate();
            subComando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na Remoção da Viagem Viagem Marte no BD";
        }
    } else if (viagem instanceof ÓrbitaTerrestre) {
        String sql = "DELETE FROM Viagemorbitaterrestre WHERE ViagemID = ?";
        try {
            PreparedStatement subComando = BD.conexao.prepareStatement(sql);
            subComando.setInt(1, sequencial);
            subComando.executeUpdate();
            subComando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na Remoção da Viagem Órbita Terrestre no BD";
        }
    }

    String sql = "DELETE FROM Viagem WHERE Sequencial = ?";
    try {
        PreparedStatement comando = BD.conexao.prepareStatement(sql);
        comando.setInt(1, sequencial);
        comando.executeUpdate();
        comando.close();
        return null;
    } catch (SQLException exceção_sql) {
        exceção_sql.printStackTrace();
        return "Erro na Remoção da Viagem no BD";
    }
}

    public String toStringFull(){
        String str = " Tempo de viagem: " + tempoViagem + " - Tripulantes: " + totalPessoas
                + " - Classe: " + classe;
        return str;
    }

    public Viagem(int sequencial, int tempoViagem, int totalPessoas, Classe classe) {
        this.sequencial = sequencial;
        this.tempoViagem = tempoViagem;
        this.totalPessoas = totalPessoas;
        this.classe = classe;
    }
    
    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    
    public Viagem(int sequencial, int totalPessoas ) {
        this.sequencial = sequencial;
        this.totalPessoas = totalPessoas;
    }

    public Viagem(int sequencial) {
        this.sequencial = sequencial;
    }    

    public int getTempoViagem() {
        return tempoViagem;
    }

    public void setTempoViagem(int tempoViagem) {
        this.tempoViagem = tempoViagem;
    }

    public int getTotalPessoas() {
        return totalPessoas;
    }

    public void setTotalPessoas(int totalPessoas) {
        this.totalPessoas = totalPessoas;
    }
    
    public int getSequencial() {
        return sequencial;
    }
    
    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
   
    public Viagem getVisao(){
        return new Viagem(sequencial, totalPessoas);
    }
    
    public String toString() {
        return "[" + getSequencial() + "]" ;
    }
    public String toStringAgendamento(Viagem viagem){
        Viagem viagem1 = buscarViagem(sequencial);
        if (viagem1 instanceof EstaçãoLunar)
            return "Estação Lunar";
        else if(viagem1 instanceof ViagemMarte)
            return "Viagem Marte";
        else
            return "Órbita terrestre";
    }
  

}




