/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;
import entidade.Agendamento;
import entidade.Cliente;
import entidade.Agendamento.MetodoPagamento;
import controle.ControladorCadastroAgendamentos;
import entidade.Empresa;
import entidade.Viagem;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author gusta
 */
public class JanelaCadastroAgendamentos extends javax.swing.JFrame {
    ControladorCadastroAgendamentos controlador;
       DefaultListModel modelo_lista_agendamentos;
       Cliente[] clientes_cadastrados;
       Empresa[] empresas_cadastradas;
       Viagem[] viagens_cadastradas;
    public JanelaCadastroAgendamentos(ControladorCadastroAgendamentos controlador) {
        this.controlador = controlador;
        clientes_cadastrados = Cliente.getVisoes();
        empresas_cadastradas = Empresa.getVisoes();
        viagens_cadastradas = Viagem.getVisoes();
        initComponents();
        inicializarListaAgendamentos();
        limparCampos(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClassebuttonGroup = new javax.swing.ButtonGroup();
        agendamentos_cadastradosLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        viagens_cadastradasScrollPane = new javax.swing.JScrollPane();
        agendamentos_cadastradosList = new javax.swing.JList();
        sequencialTextField = new javax.swing.JTextField();
        clientes_cadastradosLabel = new javax.swing.JLabel();
        clientes_cadastradosComboBox = new javax.swing.JComboBox();
        viagens_cadastradasLabel = new javax.swing.JLabel();
        viagens_cadastradasComboBox = new javax.swing.JComboBox();
        metodo_pagamentoLabel = new javax.swing.JLabel();
        metodo_pagamentoComboBox = new javax.swing.JComboBox<>();
        empresas_cadastradasLabel = new javax.swing.JLabel();
        empresas_cadastradosComboBox = new javax.swing.JComboBox();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        inserirButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        sequenciallabel2 = new javax.swing.JLabel();
        data_horalTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Agendamentos");

        agendamentos_cadastradosLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agendamentos_cadastradosLabel.setText("Agendamentos Cadastrados ");

        idLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idLabel.setText("ID");

        agendamentos_cadastradosList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agendamentos_cadastradosList.setModel(new DefaultListModel()
        );
        viagens_cadastradasScrollPane.setViewportView(agendamentos_cadastradosList);

        sequencialTextField.setEditable(false);

        clientes_cadastradosLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clientes_cadastradosLabel.setText("Clientes Cadastrados");

        clientes_cadastradosComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clientes_cadastradosComboBox.setModel(new DefaultComboBoxModel(clientes_cadastrados));

        viagens_cadastradasLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viagens_cadastradasLabel.setText("Viagens Cadastradas");

        viagens_cadastradasComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viagens_cadastradasComboBox.setModel(new DefaultComboBoxModel(viagens_cadastradas));

        metodo_pagamentoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        metodo_pagamentoLabel.setText("Metodo de Pagamento");

        metodo_pagamentoComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        metodo_pagamentoComboBox.setModel(new DefaultComboBoxModel (MetodoPagamento.values()));

        empresas_cadastradasLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        empresas_cadastradasLabel.setText("Empresas Cadastradas");

        empresas_cadastradosComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        empresas_cadastradosComboBox.setModel(new DefaultComboBoxModel(empresas_cadastradas));

        removerButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        removerButton.setText("Remover");
        removerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        removerButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAgendamento(evt);
            }
        });

        limparButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        limparButton.setText("Limpar");
        limparButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limparButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos(evt);
            }
        });

        consultarButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        consultarButton.setText("Consultar");
        consultarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        consultarButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAgendamento(evt);
            }
        });

        inserirButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        inserirButton.setText("Inserir");
        inserirButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inserirButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirAgendamento(evt);
            }
        });

        alterarButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        alterarButton.setText("Alterar");
        alterarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        alterarButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarAgendamento(evt);
            }
        });

        jLayeredPane1.setLayer(removerButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(limparButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(consultarButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(inserirButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(alterarButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inserirButton)
                .addGap(5, 5, 5)
                .addComponent(consultarButton)
                .addGap(5, 5, 5)
                .addComponent(alterarButton)
                .addGap(5, 5, 5)
                .addComponent(removerButton)
                .addGap(5, 5, 5)
                .addComponent(limparButton)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inserirButton)
                    .addComponent(consultarButton)
                    .addComponent(alterarButton)
                    .addComponent(removerButton)
                    .addComponent(limparButton))
                .addContainerGap())
        );

        sequenciallabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sequenciallabel2.setText("Data e hora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 384, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(viagens_cadastradasScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(agendamentos_cadastradosLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clientes_cadastradosLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viagens_cadastradasLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sequenciallabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(metodo_pagamentoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(empresas_cadastradasLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(metodo_pagamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sequencialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_horalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viagens_cadastradasComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(empresas_cadastradosComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clientes_cadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(agendamentos_cadastradosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viagens_cadastradasScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sequencialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientes_cadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientes_cadastradosLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empresas_cadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresas_cadastradasLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viagens_cadastradasLabel)
                    .addComponent(viagens_cadastradasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metodo_pagamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(metodo_pagamentoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data_horalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sequenciallabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removerAgendamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAgendamento
        Agendamento visão = (Agendamento) agendamentos_cadastradosList.getSelectedValue();
        String mensagem_erro = null;
        if (visão != null) mensagem_erro = controlador.removerAgendamento(visão.getSequencial());
        else mensagem_erro = "Nenhum agendamento selecionado";
        if (mensagem_erro == null){
            modelo_lista_agendamentos.removeElement(visão);
        }else informarErro(mensagem_erro);
    }//GEN-LAST:event_removerAgendamento

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
        clientes_cadastradosComboBox.setSelectedIndex(-1);
        empresas_cadastradosComboBox.setSelectedIndex(-1);
        viagens_cadastradasComboBox.setSelectedIndex(-1);
        sequencialTextField.setText("");
        data_horalTextField.setText("");
        metodo_pagamentoComboBox.setSelectedIndex(-1);
    }//GEN-LAST:event_limparCampos

    private void consultarAgendamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAgendamento
        Agendamento visão = (Agendamento)agendamentos_cadastradosList.getSelectedValue();
        Agendamento agendamento = null;
        String mensagem_erro = null;
        if (visão != null){
            agendamento = Agendamento.buscarAgendamento(visão.getSequencial());
            if(agendamento == null)mensagem_erro = "Agendamento não cadastrado";
        }else mensagem_erro = "Nenhum agendamento Selecionado";
        if (mensagem_erro == null) {
            int id_int = agendamento.getSequencial();
            String id_str = String.valueOf(id_int);
            sequencialTextField.setText(id_str);
            data_horalTextField.setText(Agendamento.formatarDataHora(agendamento.getDataHora().toString()));
            metodo_pagamentoComboBox.setSelectedItem(agendamento.getMetodo_pagamento());
            clientes_cadastradosComboBox.setSelectedIndex(getVisãoClienteSelecionado(agendamento));
            empresas_cadastradosComboBox.setSelectedIndex(getVisãoEmpresaSelecionada(agendamento));
            viagens_cadastradasComboBox.setSelectedIndex(getVisãoViagemSelecionada(agendamento));
        }
    }//GEN-LAST:event_consultarAgendamento

    private void alterarAgendamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarAgendamento
        Agendamento agendamento = obterAgendamentoInformado();
        String mensagem_erro = null;
        if(agendamento != null) mensagem_erro = controlador.alterarAgendamento(agendamento);
        else mensagem_erro = "Algum atributo do agendamento não foi informado";
        if(mensagem_erro != null) informarErro(mensagem_erro);
    }//GEN-LAST:event_alterarAgendamento

    private void inserirAgendamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirAgendamento
        Agendamento agendamento = obterAgendamentoInformado();
        String mensagem_erro = null;
        if(agendamento != null) mensagem_erro = controlador.inserirAgendamento(agendamento);
        else mensagem_erro = "Algum atributo do agendamento não for informado";
        if(mensagem_erro == null){
            int sequencial = agendamento.últimoSequencial();
            agendamento.setSequencial(sequencial);
            modelo_lista_agendamentos.addElement(agendamento.getVisao());
            agendamentos_cadastradosList.setSelectedIndex(modelo_lista_agendamentos.size() - 1);
            sequencialTextField.setText("" + sequencial);
            data_horalTextField.setText(Agendamento.formatarDataHora(agendamento.getDataHora().toString()));
        }
        else informarErro(mensagem_erro);    }//GEN-LAST:event_inserirAgendamento

    private void informarErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    private int getVisãoClienteSelecionado(Agendamento agendamento){
        clientes_cadastrados = Cliente.getVisoes();
        int index = 0;
        for (Cliente visão : clientes_cadastrados){       
            if(visão.getCpf().equals(agendamento.getCliente().getCpf())) 
                return index;
            index++;
        }
        return -1;
    }
    
    private int getVisãoEmpresaSelecionada(Agendamento agendamento){
        empresas_cadastradas = Empresa.getVisoes();
        int index = 0;
        for (Empresa visão : empresas_cadastradas){
            if(visão.getCnpj().equals(agendamento.getEmpresa().getCnpj())) 
                return index;   
            index++;
        }
        return -1;
    }
    
    private int getVisãoViagemSelecionada(Agendamento agendamento){
        viagens_cadastradas = Viagem.getVisoes();
        int index = 0;
        for (Viagem visão : viagens_cadastradas){
            if(visão.getSequencial() == (agendamento.getViagem().getSequencial())) 
                return index;   
            index++;
        }
        return -1;
    }

    public static Timestamp formatarDataHora(String data) throws IllegalArgumentException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            Date date = sdf.parse(data);
            return new Timestamp(date.getTime());
        } catch (java.text.ParseException e) {
            throw new IllegalArgumentException("Erro ao formatar data e hora: " + e.getMessage());
        }
    }
    
    private Agendamento obterAgendamentoInformado(){
        String sequencial_str = sequencialTextField.getText();
        int sequencial = 0;
        if(!sequencial_str.isEmpty()) sequencial = Integer.parseInt(sequencial_str);
        Cliente visão_cliente = (Cliente) clientes_cadastradosComboBox.getSelectedItem();
        if(visão_cliente == null) return null;
        Empresa visão_empresa = (Empresa) empresas_cadastradosComboBox.getSelectedItem();
        if(visão_empresa == null) return null;
        Viagem visão_viagem = (Viagem) viagens_cadastradasComboBox.getSelectedItem();
        if(visão_viagem == null) return null;
        
        MetodoPagamento metodo_pagamento  = null;
        if(metodo_pagamentoComboBox.getSelectedItem() != null)
            metodo_pagamento = (MetodoPagamento)metodo_pagamentoComboBox.getSelectedItem();
        else return null;
        Timestamp DataFormatada;   
        String data_hora = data_horalTextField.getText();
        if(data_hora != null) DataFormatada = formatarDataHora(data_hora);
        else return null;   
        return new Agendamento(sequencial, visão_cliente, visão_empresa, visão_viagem, metodo_pagamento, DataFormatada);
    }
    
    private void inicializarListaAgendamentos(){
        modelo_lista_agendamentos = (DefaultListModel)agendamentos_cadastradosList.getModel();
        Agendamento[] visões = Agendamento.getVisões();
        for(Agendamento visão : visões) {
            modelo_lista_agendamentos.addElement(visão);    
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ClassebuttonGroup;
    private javax.swing.JLabel agendamentos_cadastradosLabel;
    private javax.swing.JList agendamentos_cadastradosList;
    private javax.swing.JButton alterarButton;
    private javax.swing.JComboBox clientes_cadastradosComboBox;
    private javax.swing.JLabel clientes_cadastradosLabel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JTextField data_horalTextField;
    private javax.swing.JLabel empresas_cadastradasLabel;
    private javax.swing.JComboBox empresas_cadastradosComboBox;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton inserirButton;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton limparButton;
    private javax.swing.JComboBox<String> metodo_pagamentoComboBox;
    private javax.swing.JLabel metodo_pagamentoLabel;
    private javax.swing.JButton removerButton;
    private javax.swing.JTextField sequencialTextField;
    private javax.swing.JLabel sequenciallabel2;
    private javax.swing.JComboBox viagens_cadastradasComboBox;
    private javax.swing.JLabel viagens_cadastradasLabel;
    private javax.swing.JScrollPane viagens_cadastradasScrollPane;
    // End of variables declaration//GEN-END:variables
}
