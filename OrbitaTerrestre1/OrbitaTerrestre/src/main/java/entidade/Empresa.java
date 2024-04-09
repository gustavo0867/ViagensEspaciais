package entidade;

import static entidade.Agendamento.formatarDataHora;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Empresa {


    private String cnpj;
    private String nome;
    private int capacidadePassageiros;
    private int numeroNavesEspaciais;
    private float alcanceEspacial;

    public static Empresa[] getVisoes() {
        String sql = "SELECT CNPJ, Nome FROM Empresas";
        ResultSet listaResultados = null;
        ArrayList<Empresa> visões = new ArrayList<>();
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            listaResultados = comando.executeQuery();
            while (listaResultados.next()) {
             visões.add(new Empresa(
            listaResultados.getString("CNPJ"),
            listaResultados.getString("Nome")
           
    ));
}
            listaResultados.close();
            comando.close();
        } catch (SQLException excecaoSql) {
            excecaoSql.printStackTrace();
        }
        return visões.toArray(new Empresa[visões.size()]);
    }

    public static boolean existeEmpresasMesmosAtributos(Empresa empresa) {
        String sql = "SELECT CNPJ FROM Empresas WHERE CNPJ = ? AND Nome = ?";
        ResultSet listaResultados = null;
        int nEmpresasMesmosAtributos = 0;
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setString(1, empresa.getCnpj());
            comando.setString(2, empresa.getNome());
            listaResultados = comando.executeQuery();
            while (listaResultados.next()) {
                nEmpresasMesmosAtributos = listaResultados.getInt(1);
            }
            listaResultados.close();
            comando.close();
        } catch (SQLException excecaoSql) {
            excecaoSql.printStackTrace();
        }
        return nEmpresasMesmosAtributos > 0;
    }

    public static String inserirEmpresa(Empresa empresa) {
        String sql = "INSERT INTO Empresas(CNPJ, Nome, CapacidadePassageiros, NumeroNavesEspaciais, AlcanceEspacial)"
                + " VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setString(1, empresa.getCnpj());
            comando.setString(2, empresa.getNome());
            comando.setInt(3, empresa.getCapacidadePassageiros());
            comando.setInt(4, empresa.getNumeroNavesEspaciais());
            comando.setFloat(5, empresa.getAlcanceEspacial());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException excecaoSql) {
            excecaoSql.printStackTrace();
            return "Erro na Inserção da Empresa no BD";
        }
    }

    public static String alterarEmpresa(Empresa empresa) {
        String sql = "UPDATE Empresas SET Nome = ?, CapacidadePassageiros = ?, NumeroNavesEspaciais = ?, AlcanceEspacial = ?"
                + " WHERE CNPJ = ?";
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setString(1, empresa.getNome());
            comando.setInt(2, empresa.getCapacidadePassageiros());
            comando.setInt(3, empresa.getNumeroNavesEspaciais());
            comando.setFloat(4, empresa.getAlcanceEspacial());
            comando.setString(5, empresa.getCnpj());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException excecaoSql) {
            excecaoSql.printStackTrace();
            return "Erro na Alteração da Empresa no BD";
        }
    }

    public static String removerEmpresa(String cnpj) {
        String sql = "DELETE FROM Empresas WHERE CNPJ = ?";
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setString(1, cnpj);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException excecaoSql) {
            excecaoSql.printStackTrace();
            return "Erro na Remoção da Empresa no BD";
        }
    }

    public static Empresa buscarEmpresa(String cnpj) {
        String sql = "SELECT * FROM Empresas WHERE CNPJ = ?";
        ResultSet listaResultados = null;
        Empresa empresa = null;
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setString(1, cnpj);
            listaResultados = comando.executeQuery();
            while (listaResultados.next()) {
                empresa = new Empresa(cnpj,
                        listaResultados.getString("Nome"),
                        listaResultados.getInt("CapacidadePassageiros"),
                        listaResultados.getInt("NumeroNavesEspaciais"),
                        listaResultados.getFloat("AlcanceEspacial")
                        
                );
            }
            listaResultados.close();
            comando.close();
        } catch (SQLException excecaoSql) {
            excecaoSql.printStackTrace();
        }
        return empresa;
    }
    
    public Empresa getVisao() {
        return new Empresa(cnpj,nome);
        
    }
    
    public String toString() {
        return "[" + getCnpj()+ "]" + getNome();
    }
    
    public String toStringFull(){
        String str = nome + " - Capacidade max passageiros: " + capacidadePassageiros + " - Numero de naves: "  
                + numeroNavesEspaciais + " - Alcance espacial: " + alcanceEspacial;
        return str; 
    }
  
    
    public String toStringAgendamento() {
        return "Empresa: " + getNome();
    }
    public Empresa( String cnpj, String nome, int capacidadePassageiros, int numeroNavesEspaciais, float alcanceEspacial) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.capacidadePassageiros = capacidadePassageiros;
        this.numeroNavesEspaciais = numeroNavesEspaciais;
        this.alcanceEspacial = alcanceEspacial;
    }

    public Empresa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        
    }

     public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getNumeroNavesEspaciais() {
        return numeroNavesEspaciais;
    }

    public void setNumeroNavesEspaciais(int numeroNavesEspaciais) {
        this.numeroNavesEspaciais = numeroNavesEspaciais;
    }

    public float getAlcanceEspacial() {
        return alcanceEspacial;
    }

    public void setAlcanceEspacial(float alcanceEspacial) {
        this.alcanceEspacial = alcanceEspacial;
    }
}
