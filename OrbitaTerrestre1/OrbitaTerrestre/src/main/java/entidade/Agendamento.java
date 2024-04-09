/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;
import entidade.*;
import entidade.Empresa.*;
import entidade.EstaçãoLunar.*;
import entidade.Viagem.Classe;
import entidade.ÓrbitaTerrestre.TipoOrbita;
import entidade.Agendamento.MetodoPagamento;
import entidade.ViagemMarte.*;
import controle.*;
import interfaces.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import persistência.BD;
        
/**
 *
 * @author gusta
 */
public class Agendamento {
    public static Agendamento[] getVisões(){
        String sql = "SELECT Sequencial, ClienteId, EmpresaId, ViagemId, DataHora FROM Agendamentos";
        ResultSet lista_resultados = null;
        ArrayList<Agendamento> visões = new ArrayList();
        try{
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            lista_resultados = comando.executeQuery();   
            while (lista_resultados.next()){
                visões.add(new Agendamento(lista_resultados.getInt("Sequencial"),
                        Cliente.buscarCliente(lista_resultados.getString("ClienteID")).getVisao(),
                        Empresa.buscarEmpresa(lista_resultados.getString("EmpresaId")).getVisao(),
                        Viagem.buscarViagem(lista_resultados.getInt("ViagemId")).getVisao(),
                        lista_resultados.getTimestamp("DataHora")
                ));
                
            }
            lista_resultados.close();
            comando.close();
            
        }catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();}
        return visões.toArray(new Agendamento[visões.size()]); 
    }
    public static boolean existeAgendamento(String chave_cliente, String chave_empresa, int chave_viagem){
       String sql = "SELECT Sequencial FROM Agendamentos WHERE ClienteId = ? AND EmpresaId = ? AND ViagemId = ?";
       ResultSet lista_resultados = null;
       boolean existe = false;
       try{
           PreparedStatement comando = BD.conexao.prepareStatement(sql);
           comando.setString(1, chave_cliente);
           comando.setString(2, chave_empresa);
           comando.setInt(3, chave_viagem);
           lista_resultados = comando.executeQuery();
           while(lista_resultados.next()){
               existe = true;
           }
           lista_resultados.close();
           comando.close();
       }catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();}
       return existe;
   }
    
    public static boolean existeAgendamento(int sequencial){
      String sql = "SELECT COUNT(Sequencial) FROM Agendamentos WHERE sequencial = ?";
       ResultSet lista_resultados = null;
       boolean existe = false;
       try{
           PreparedStatement comando = BD.conexao.prepareStatement(sql);
           comando.setInt(1, sequencial);
           lista_resultados = comando.executeQuery();
           while(lista_resultados.next()){
               existe = true;
           }
           lista_resultados.close();
           comando.close();
       }catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();}
       return existe; 
       
   }
    
    public static String inserirAgendamento(Agendamento agendamento) {
        String sql =  "INSERT INTO Agendamentos (ClienteId, EmpresaId, ViagemId, MetodoPagamento, DataHora)" 
            + " VALUES (?,?,?,?,?)";
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setString(1, agendamento.getCliente().getCpf());
            comando.setString(2, agendamento.getEmpresa().getCnpj());
            comando.setInt(3, agendamento.getViagem().getSequencial());
            comando.setInt(4, agendamento.getMetodo_pagamento().ordinal());
            comando.setTimestamp(5, agendamento.getDataHora());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na inserção do agendamento no BD";
        }
    }
    
    public static String alterarAgendamento(Agendamento agendamento) {
        String sql =  "UPDATE Agendamentos SET MetodoPagamento = ?, DataHora = ?"
                + " WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setInt(1, agendamento.getMetodo_pagamento().ordinal());
            comando.setTimestamp(2, agendamento.getDataHora());
            comando.setInt(3, agendamento.getSequencial());
            
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na alteração do agendamento no BD";
        }
    }
    
    public static String removerAgendamento(int sequencial){
        String sql = "DELETE FROM Agendamentos WHERE sequencial = ?";
        try {
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setInt(1, sequencial);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql){
            exceção_sql.printStackTrace();
            return "Erro na remoção do BD";
        }
    }
    
    public static Agendamento buscarAgendamento(int sequencial){
        String sql = "SELECT * FROM Agendamentos WHERE Sequencial = ?";
        ResultSet lista_resultados  = null;
        Agendamento agendamento = null;
        try{
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()){
                agendamento = new Agendamento(sequencial,
                        Cliente.buscarCliente(lista_resultados.getString("ClienteId")),
                        Empresa.buscarEmpresa(lista_resultados.getString("EmpresaId")),
                        Viagem.buscarViagem(lista_resultados.getInt("ViagemId")),
                        MetodoPagamento.values()[lista_resultados.getInt("MetodoPagamento")],
                        lista_resultados.getTimestamp("DataHora")
                );
            }
            lista_resultados.close();
            comando.close ();
        } catch (SQLException exceção_sql)
            {exceção_sql.printStackTrace();
            agendamento = null;
        }
        return agendamento;
    }
    
    public static int últimoSequencial(){
        String sql = "SELECT MAX(Sequencial) FROM Agendamentos";
        ResultSet lista_resultados = null;
        int sequencial = 0;
        try{
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()){
                sequencial = lista_resultados.getInt(1);
            }
            lista_resultados.close();
            comando.close();
            
        }catch (SQLException exceção_sql){exceção_sql.printStackTrace();}
        return sequencial;
    }
    
    public static ArrayList<Agendamento> PesquisarAgendamentos(String chave_cliente, String nome_cliente,
               int chave_viagem, Classe classe , String chave_empresa, int n_max_passageiros, Timestamp data_minima, MetodoPagamento metodo_pagamento,
                OrbitaLua orbita_lua, TipoOrbita tipo_orbita, char lembrança_marte){
        String sql  =  "SELECT V.Sequencial, V.Tempo_viagem, V.Total_pessoas, V.Classe,"
                + " C.CPF, C.Telefone, C.Nome,"
                + " E.CNPJ, E.Nome, E.CapacidadePassageiros, E.NumeroNavesEspaciais, E.AlcanceEspacial,"
                + " A.Sequencial, A.MetodoPagamento, A.DataHora"
                + " FROM Viagem V, clientes C, Empresas E, Agendamentos A "
                + "WHERE A.ViagemId = V.Sequencial AND A.ClienteId = C.CPF AND A.EmpresaId = E.CNPJ";
        if(chave_cliente != null)sql += " AND C.CPF = ?";
        if(chave_empresa != null)sql += " AND E.CNPj = ?";
        if(chave_viagem > -1) sql += " AND V.Sequencial = ?";
        if(nome_cliente != null) sql += " AND C.Nome = ?";
        if(classe != null) sql += " AND V.Classe = ?";
        if(n_max_passageiros > -1) sql += " AND E.CapacidadePassageiros <= ?";
        if(data_minima != null) sql += " AND A.DataHora >= ?";
        if(metodo_pagamento != null)sql += " AND A.MetodoPagamento = ?";
        sql += " ORDER BY A.Sequencial";
        ResultSet lista_resultados = null;
        ArrayList<Agendamento> agendamentos_selecionados = new ArrayList();
        int index = 0;
        int sequencial_viagem = -1;
        try{
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            if(chave_cliente != null)comando.setString(++index, chave_cliente);
            if(chave_empresa != null)comando.setString(++index, chave_empresa);
            if(chave_viagem > 0) comando.setInt(++index, chave_viagem); 
            if(nome_cliente != null) comando.setString(++index, nome_cliente);
            if(classe != null) comando.setInt(++index, classe.ordinal());
            if(n_max_passageiros > -1) comando.setInt(++index, n_max_passageiros);
            if(data_minima != null) comando.setTimestamp(++index, data_minima);
            if(metodo_pagamento != null) comando.setInt(++index, metodo_pagamento.ordinal());
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()){
                Agendamento agendamento_pesquisado = Agendamento.buscarAgendamento(lista_resultados.getInt(13));
                sequencial_viagem = lista_resultados.getInt(1);
                
                if(lembrança_marte != 'X'){
                    if(isOkPesquisaViagemMarte(sequencial_viagem, lembrança_marte))
                        agendamentos_selecionados.add(agendamento_pesquisado);  
                } else if(tipo_orbita != null){
                    if(isOkPesquisaÓrbitaTerrestre(sequencial_viagem, tipo_orbita))
                        agendamentos_selecionados.add(agendamento_pesquisado);
                }else if(orbita_lua != null){                 
                    if(isOkPesquisaViagemLua(sequencial_viagem, orbita_lua)){
                        agendamentos_selecionados.add(agendamento_pesquisado);
                    }
                }else agendamentos_selecionados.add(agendamento_pesquisado);
            }
            lista_resultados.close();
            comando.close ();
        } catch (SQLException exceção_sql){exceção_sql.printStackTrace();}
        return agendamentos_selecionados;
    }
    
    
    
    public static String formatarDataHora(String data_hora_db){
        String[] data_hora = data_hora_db.split(" ");
        String[] ano_mês_dia = data_hora[0].split("-");
        String[] hora_minuto_resto = data_hora[1].split(":");
        String data_hora_formatada = ano_mês_dia[2] + "/" + ano_mês_dia[1] + "/" + ano_mês_dia[0]
                + " " + hora_minuto_resto[0] + ":" + hora_minuto_resto[1];
        return data_hora_formatada;
        
    }

    private static boolean isOkPesquisaViagemMarte(int sequencial_viagem, char lembrança_marte) {
        boolean pesquisa_ok = false;
        String sql = "SELECT * FROM Viagemviagemmarte WHERE ViagemID = ?";
        if(lembrança_marte != 'X') sql += " AND lembranca_marte = ?";
        ResultSet lista_resultados = null;
        int index = 1;
        try{
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setInt(1, sequencial_viagem);
            switch(lembrança_marte){
                case 'T': comando.setBoolean(++index, true); break;
                case 'F': comando.setBoolean(++index, false);
            }
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()) pesquisa_ok = true;
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql)
            {exceção_sql.printStackTrace();}
            return pesquisa_ok;
    }

    private static boolean isOkPesquisaÓrbitaTerrestre(int sequencial_viagem, TipoOrbita tipo_orbita) {
        boolean pesquisa_ok = false;
        String sql = "SELECT * FROM Viagemorbitaterrestre WHERE ViagemID = ?";
        if(tipo_orbita != null) sql += " AND Tipo_orbita = ?";
        ResultSet lista_resultados = null;
       try{
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setInt(1, sequencial_viagem);
            comando.setObject(2, tipo_orbita.ordinal());
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()) pesquisa_ok = true;
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql)
            {exceção_sql.printStackTrace();}
        return pesquisa_ok;
    }

    private static boolean isOkPesquisaViagemLua(int sequencial_viagem, OrbitaLua orbita_lua) {
        boolean pesquisa_ok = false;
        String sql = "SELECT * FROM Viagemestacaolunar WHERE ViagemID = ?";
        if(orbita_lua != null) sql += " AND orbita_lua = ?";
        ResultSet lista_resultados = null;
       try{
            PreparedStatement comando = BD.conexao.prepareStatement(sql);
            comando.setInt(1, sequencial_viagem);
            comando.setObject(2, orbita_lua.ordinal());
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()) pesquisa_ok = true;
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql)
            {exceção_sql.printStackTrace();}
        return pesquisa_ok;
    }
    
    
    
    public String toStringFull(){
        String str = cliente.toStringFull() + " --- " + empresa.toStringFull() + " \n--- " + viagem.toStringFull()
                + " \n--- Data e hora: " + formatarDataHora(dataHora.toString()) + " - Metodo de pagamento: " + metodo_pagamento; 
        return str;
    } 
    
    public enum MetodoPagamento{
        Cartão, Dinheiro, Pix, Cheque
    };
    
    private int sequencial;
    private Cliente cliente;
    private Empresa empresa;
    private Viagem viagem;
    private MetodoPagamento metodo_pagamento;
    private Timestamp dataHora;

    public Agendamento(int sequencial, Cliente cliente, Empresa empresa, Viagem viagem, MetodoPagamento metodo_pagamento, Timestamp dataHora) {
        this.sequencial = sequencial;
        this.cliente = cliente;
        this.empresa = empresa;
        this.viagem = viagem;
        this.metodo_pagamento = metodo_pagamento;
        this.dataHora = dataHora;
    }

    public Agendamento(int sequencial, Cliente cliente, Empresa empresa, Viagem viagem, Timestamp dataHora) {
        this.sequencial = sequencial;
        this.cliente = cliente;
        this.empresa = empresa;
        this.viagem = viagem;
        this.dataHora = dataHora;
    }
    public Agendamento getVisao() {
        return new Agendamento(sequencial, cliente, empresa,viagem, dataHora);
    }

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    
    public String toString() {
        return "[" + sequencial + "] - " + cliente.toStringAgendamento() + " - " + empresa.toStringAgendamento() 
                + " - " + viagem.toStringAgendamento(viagem) + " - Data e Hora: " + dataHora;
    }
    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequecnial) {
        this.sequencial = sequecnial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public MetodoPagamento getMetodo_pagamento() {
        return metodo_pagamento;
    }

   

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setServiço(Empresa serviço) {
        this.empresa = serviço;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public void setMetodo_pagamento(MetodoPagamento metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

   
    
}
