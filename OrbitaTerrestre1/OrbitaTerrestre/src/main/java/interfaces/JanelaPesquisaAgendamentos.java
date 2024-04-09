/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;
import entidade.*;
import entidade.Agendamento.*;
import entidade.Cliente;
import entidade.Empresa;
import entidade.Viagem.Classe;
import entidade.EstaçãoLunar.*;
import entidade.ÓrbitaTerrestre.*;
import interfaces.JanelaCadastroAgendamentos;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
        
/**
 *
 * @author guima
 */
public class JanelaPesquisaAgendamentos extends javax.swing.JFrame {
    Cliente[] clientes_cadastrados;
    Empresa[] empresas_cadastradas;
    Viagem[] viagens_cadastradas;
    PainelFiltrosEstaçãoLunar filtrosEstaçãoLunarPainel;
    PainelFiltrosOrbitaTerrestre filtrosOrbitaTerrestrePainel;
    PainelFiltrosViagemMarte filtrosViagemMartePainel;
 
    public JanelaPesquisaAgendamentos() {
        clientes_cadastrados = Cliente.getVisoes();
        empresas_cadastradas = Empresa.getVisoes();
        viagens_cadastradas = Viagem.getVisoes();
        initComponents();
        filtrosEstaçãoLunarPainel = new PainelFiltrosEstaçãoLunar();
        filtrosOrbitaTerrestrePainel = new PainelFiltrosOrbitaTerrestre();
        filtrosViagemMartePainel = new PainelFiltrosViagemMarte();
        filtros_agendamentosTabbedPane.addTab("Filtros Estação Lunar", filtrosEstaçãoLunarPainel);
        filtros_agendamentosTabbedPane.addTab("Filtros Órbita terrestre", filtrosOrbitaTerrestrePainel);
        filtros_agendamentosTabbedPane.addTab("Filtros Viagem Marte", filtrosViagemMartePainel);
        limparFiltros(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classebuttonGroup = new javax.swing.ButtonGroup();
        buttonsPanel = new javax.swing.JPanel();
        pesquisarButton = new javax.swing.JButton();
        limparFiltrosButton = new javax.swing.JButton();
        limparPesquisaButton = new javax.swing.JButton();
        filtrosAgendamentosPanel = new javax.swing.JPanel();
        data_minimalLabel = new javax.swing.JLabel();
        data_minimaTextField = new javax.swing.JTextField();
        metodo_pagamentoComboBox = new javax.swing.JComboBox();
        metodoPagamentoLabel = new javax.swing.JLabel();
        filtros_clientesPanel = new javax.swing.JPanel();
        clientes_cadastradosComboBox = new javax.swing.JComboBox<>();
        clientes_cadastradosLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        filtros_serviçosPanel = new javax.swing.JPanel();
        viagens_cadastradoslabel = new javax.swing.JLabel();
        viagens_cadastradosComboBox = new javax.swing.JComboBox<>();
        pacotePanel = new javax.swing.JPanel();
        economicaRadioButton = new javax.swing.JRadioButton();
        executivaRadioButton = new javax.swing.JRadioButton();
        classe_viagemLabel = new javax.swing.JLabel();
        filtros_agendamentosTabbedPane = new javax.swing.JTabbedPane();
        agendamentos_SelecionadosPanel = new javax.swing.JPanel();
        agendamentos_selecionadosScrollPane = new javax.swing.JScrollPane();
        pesquisasTextArea = new javax.swing.JTextArea();
        filtros_EmpresaPanel = new javax.swing.JPanel();
        empresas_cadastradasComboBox = new javax.swing.JComboBox<>();
        empresas_cadastradasLabel = new javax.swing.JLabel();
        max_passageirosTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Agendamentos");
        setName("PesquisaFrame"); // NOI18N

        pesquisarButton.setText("Pesquisar");
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarAgendamentos(evt);
            }
        });
        buttonsPanel.add(pesquisarButton);

        limparFiltrosButton.setText("Limpar Filtros");
        limparFiltrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparFiltros(evt);
            }
        });
        buttonsPanel.add(limparFiltrosButton);

        limparPesquisaButton.setText("Limpar Pesquisa");
        limparPesquisaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparAgendamentosSelecionados(evt);
            }
        });
        buttonsPanel.add(limparPesquisaButton);

        filtrosAgendamentosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros de Agendamentos"));

        data_minimalLabel.setText("Data minima");

        /*JComboBox<String> metodo_pagamentoComboBox = new JComboBox<>();
        for (Tipo_sessão_fotográfica tipo : Tipo_sessão_fotográfica.values()) {
            metodo_pagamentoComboBox.addItem(tipo.getop());
        }*/
        metodo_pagamentoComboBox.setModel(new DefaultComboBoxModel(MetodoPagamento.values()));

        metodoPagamentoLabel.setText("Método de pagamento");

        javax.swing.GroupLayout filtrosAgendamentosPanelLayout = new javax.swing.GroupLayout(filtrosAgendamentosPanel);
        filtrosAgendamentosPanel.setLayout(filtrosAgendamentosPanelLayout);
        filtrosAgendamentosPanelLayout.setHorizontalGroup(
            filtrosAgendamentosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtrosAgendamentosPanelLayout.createSequentialGroup()
                .addGroup(filtrosAgendamentosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filtrosAgendamentosPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(data_minimalLabel)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filtrosAgendamentosPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(data_minimaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(filtrosAgendamentosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filtrosAgendamentosPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(metodo_pagamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(filtrosAgendamentosPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(metodoPagamentoLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        filtrosAgendamentosPanelLayout.setVerticalGroup(
            filtrosAgendamentosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtrosAgendamentosPanelLayout.createSequentialGroup()
                .addGroup(filtrosAgendamentosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(metodoPagamentoLabel)
                    .addComponent(data_minimalLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(filtrosAgendamentosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(metodo_pagamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data_minimaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        filtros_clientesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros de Clientes"));

        clientes_cadastradosComboBox.setModel(new DefaultComboBoxModel(clientes_cadastrados));

        clientes_cadastradosLabel.setText("Clientes cadastrados");

        nomeLabel.setText("Nome");

        javax.swing.GroupLayout filtros_clientesPanelLayout = new javax.swing.GroupLayout(filtros_clientesPanel);
        filtros_clientesPanel.setLayout(filtros_clientesPanelLayout);
        filtros_clientesPanelLayout.setHorizontalGroup(
            filtros_clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtros_clientesPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(filtros_clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filtros_clientesPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(clientes_cadastradosLabel))
                    .addComponent(clientes_cadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(filtros_clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filtros_clientesPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(filtros_clientesPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(nomeLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        filtros_clientesPanelLayout.setVerticalGroup(
            filtros_clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtros_clientesPanelLayout.createSequentialGroup()
                .addGroup(filtros_clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientes_cadastradosLabel)
                    .addComponent(nomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(filtros_clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientes_cadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        filtros_serviçosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros de Viagens"));

        viagens_cadastradoslabel.setText("Viangens cadastradas");

        viagens_cadastradosComboBox.setModel(new DefaultComboBoxModel(viagens_cadastradas));

        classebuttonGroup.add(economicaRadioButton);
        economicaRadioButton.setText("Ecônomica");
        economicaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                economicaRadioButtonActionPerformed(evt);
            }
        });

        classebuttonGroup.add(executivaRadioButton);
        executivaRadioButton.setMnemonic(1);
        executivaRadioButton.setText("Executiva");
        executivaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executivaRadioButtonActionPerformed(evt);
            }
        });

        classe_viagemLabel.setText("Classe");

        javax.swing.GroupLayout pacotePanelLayout = new javax.swing.GroupLayout(pacotePanel);
        pacotePanel.setLayout(pacotePanelLayout);
        pacotePanelLayout.setHorizontalGroup(
            pacotePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pacotePanelLayout.createSequentialGroup()
                .addGroup(pacotePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pacotePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(executivaRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(economicaRadioButton))
                    .addGroup(pacotePanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(classe_viagemLabel)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        pacotePanelLayout.setVerticalGroup(
            pacotePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pacotePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(classe_viagemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pacotePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(executivaRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(economicaRadioButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout filtros_serviçosPanelLayout = new javax.swing.GroupLayout(filtros_serviçosPanel);
        filtros_serviçosPanel.setLayout(filtros_serviçosPanelLayout);
        filtros_serviçosPanelLayout.setHorizontalGroup(
            filtros_serviçosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtros_serviçosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filtros_serviçosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filtros_serviçosPanelLayout.createSequentialGroup()
                        .addComponent(viagens_cadastradosComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(filtros_serviçosPanelLayout.createSequentialGroup()
                        .addGroup(filtros_serviçosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(filtros_serviçosPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(viagens_cadastradoslabel))
                            .addComponent(pacotePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)))
                .addComponent(filtros_agendamentosTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        filtros_serviçosPanelLayout.setVerticalGroup(
            filtros_serviçosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtros_serviçosPanelLayout.createSequentialGroup()
                .addGroup(filtros_serviçosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filtros_serviçosPanelLayout.createSequentialGroup()
                        .addComponent(viagens_cadastradoslabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viagens_cadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pacotePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(filtros_serviçosPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(filtros_agendamentosTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        agendamentos_SelecionadosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Agendamentos Selecionados"));

        pesquisasTextArea.setEditable(false);
        pesquisasTextArea.setColumns(20);
        pesquisasTextArea.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pesquisasTextArea.setRows(5);
        pesquisasTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        agendamentos_selecionadosScrollPane.setViewportView(pesquisasTextArea);

        javax.swing.GroupLayout agendamentos_SelecionadosPanelLayout = new javax.swing.GroupLayout(agendamentos_SelecionadosPanel);
        agendamentos_SelecionadosPanel.setLayout(agendamentos_SelecionadosPanelLayout);
        agendamentos_SelecionadosPanelLayout.setHorizontalGroup(
            agendamentos_SelecionadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agendamentos_SelecionadosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agendamentos_selecionadosScrollPane))
        );
        agendamentos_SelecionadosPanelLayout.setVerticalGroup(
            agendamentos_SelecionadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agendamentos_selecionadosScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        filtros_EmpresaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros de Empresas"));

        empresas_cadastradasComboBox.setModel(new DefaultComboBoxModel(empresas_cadastradas));

        empresas_cadastradasLabel.setText("Empresas Cadastradas");

        max_passageirosTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel1.setText("N° máximo de passageiros");

        javax.swing.GroupLayout filtros_EmpresaPanelLayout = new javax.swing.GroupLayout(filtros_EmpresaPanel);
        filtros_EmpresaPanel.setLayout(filtros_EmpresaPanelLayout);
        filtros_EmpresaPanelLayout.setHorizontalGroup(
            filtros_EmpresaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtros_EmpresaPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(empresas_cadastradasLabel)
                .addGap(18, 18, 18)
                .addComponent(empresas_cadastradasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(max_passageirosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        filtros_EmpresaPanelLayout.setVerticalGroup(
            filtros_EmpresaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtros_EmpresaPanelLayout.createSequentialGroup()
                .addGroup(filtros_EmpresaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empresas_cadastradasLabel)
                    .addComponent(empresas_cadastradasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(max_passageirosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(agendamentos_SelecionadosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filtros_clientesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filtros_serviçosPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filtrosAgendamentosPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filtros_EmpresaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(filtros_clientesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtros_serviçosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtros_EmpresaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtrosAgendamentosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agendamentos_SelecionadosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparFiltros(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparFiltros
        clientes_cadastradosComboBox.setSelectedIndex(-1);
        nomeTextField.setText("");
        viagens_cadastradosComboBox.setSelectedIndex(-1);
        empresas_cadastradasComboBox.setSelectedIndex(-1);
        classebuttonGroup.clearSelection();
        data_minimaTextField.setText("");
        max_passageirosTextField.setText("");
        metodo_pagamentoComboBox.setSelectedIndex(-1);
        filtrosOrbitaTerrestrePainel.limparFiltros();
        filtrosEstaçãoLunarPainel.LimparFiltros();
        filtrosViagemMartePainel.limparFiltros();
    }//GEN-LAST:event_limparFiltros

    private void limparAgendamentosSelecionados(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparAgendamentosSelecionados
        pesquisasTextArea.setText("");
    }//GEN-LAST:event_limparAgendamentosSelecionados

    private void pesquisarAgendamentos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarAgendamentos
        String chave_cliente = null;
        if(clientes_cadastradosComboBox.getSelectedItem() != null)
            chave_cliente = ((Cliente) clientes_cadastradosComboBox.getSelectedItem()).getCpf();
        String nome_cliente = null;
        if(!nomeTextField.getText().isEmpty())
            nome_cliente = nomeTextField.getText();
        
        int chave_viagem = -1;
        if(viagens_cadastradosComboBox.getSelectedItem() != null)
            chave_viagem = ((Viagem)viagens_cadastradosComboBox.getSelectedItem()).getSequencial();
        Classe classe = null;
        if(classebuttonGroup.getSelection() != null)
            classe = Classe.values()[classebuttonGroup.getSelection().getMnemonic()];
        
        String chave_empresa = null;
        if(empresas_cadastradasComboBox.getSelectedItem() != null)
            chave_empresa = ((Empresa)empresas_cadastradasComboBox.getSelectedItem()).getCnpj();
        int n_max_passageiros = -1;
            n_max_passageiros = getNMaxPassageiros();
        
        Timestamp data_minima = getDataMínima();
        MetodoPagamento metodo_pagamento = null;
        if(metodo_pagamentoComboBox.getSelectedItem() != null)
            metodo_pagamento = (MetodoPagamento) metodo_pagamentoComboBox.getSelectedItem();
        
        
        OrbitaLua orbita_lua = null;
        TipoOrbita tipo_orbita = null;
        char lembrança_marte = 'X';
        int indice_aba_selecionada = filtros_agendamentosTabbedPane.getSelectedIndex();
       if(indice_aba_selecionada == 0)
           orbita_lua = filtrosEstaçãoLunarPainel.getSelectedOrbitaLua();
       else if(indice_aba_selecionada == 1)
           tipo_orbita = filtrosOrbitaTerrestrePainel.getTipoOrbita();
       else if(indice_aba_selecionada == 2)
            lembrança_marte = filtrosViagemMartePainel.isLembrança();
       ArrayList<Agendamento> agendamentos = Agendamento.PesquisarAgendamentos(chave_cliente, nome_cliente,
               chave_viagem, classe , chave_empresa, n_max_passageiros, data_minima, metodo_pagamento,
               orbita_lua, tipo_orbita, lembrança_marte);
        mostrarAgendamentosSelecionados(agendamentos);
    }//GEN-LAST:event_pesquisarAgendamentos

    private void economicaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_economicaRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_economicaRadioButtonActionPerformed

    private void executivaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executivaRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_executivaRadioButtonActionPerformed
    
    public int getNMaxPassageiros(){
        String n_max_passageiros = max_passageirosTextField.getText();
        if(!n_max_passageiros.isEmpty())
            return Integer.parseInt(n_max_passageiros);
        else return -1;
    }
    private Timestamp getDataMínima(){
        Timestamp data_mínima = null;
        String data_mínima_str = data_minimaTextField.getText();
        if(!data_mínima_str.isEmpty()){
            String[] data_mínima_partes = data_mínima_str.toString().split("/");
            String dia = data_mínima_partes[0];
            String mês = data_mínima_partes[1];
            String ano = data_mínima_partes[2];
            if((dia.length() == 2) && (mês.length() == 2) && (ano.length() == 4)){
                data_mínima_str = ano + "-" + mês + "-" + dia + " 00:00:00";
                data_mínima = Timestamp.valueOf(data_mínima_str);
            }
        }
        return data_mínima;
    }
    
    
    private void mostrarAgendamentosSelecionados(ArrayList<Agendamento> agendamentos){
        boolean primeiro_agendamento = true;
        pesquisasTextArea.setText("");
        for(Agendamento agendamento : agendamentos){
            if(primeiro_agendamento){
                pesquisasTextArea.append(agendamento.toStringFull());
                primeiro_agendamento = false;
            }else pesquisasTextArea.append("\n" + agendamento.toStringFull());
        }
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agendamentos_SelecionadosPanel;
    private javax.swing.JScrollPane agendamentos_selecionadosScrollPane;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JLabel classe_viagemLabel;
    private javax.swing.ButtonGroup classebuttonGroup;
    private javax.swing.JComboBox<Cliente> clientes_cadastradosComboBox;
    private javax.swing.JLabel clientes_cadastradosLabel;
    private javax.swing.JTextField data_minimaTextField;
    private javax.swing.JLabel data_minimalLabel;
    private javax.swing.JRadioButton economicaRadioButton;
    private javax.swing.JComboBox<Empresa> empresas_cadastradasComboBox;
    private javax.swing.JLabel empresas_cadastradasLabel;
    private javax.swing.JRadioButton executivaRadioButton;
    private javax.swing.JPanel filtrosAgendamentosPanel;
    private javax.swing.JPanel filtros_EmpresaPanel;
    private javax.swing.JTabbedPane filtros_agendamentosTabbedPane;
    private javax.swing.JPanel filtros_clientesPanel;
    private javax.swing.JPanel filtros_serviçosPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton limparFiltrosButton;
    private javax.swing.JButton limparPesquisaButton;
    private javax.swing.JTextField max_passageirosTextField;
    private javax.swing.JLabel metodoPagamentoLabel;
    private javax.swing.JComboBox metodo_pagamentoComboBox;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JPanel pacotePanel;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JTextArea pesquisasTextArea;
    private javax.swing.JComboBox<Viagem> viagens_cadastradosComboBox;
    private javax.swing.JLabel viagens_cadastradoslabel;
    // End of variables declaration//GEN-END:variables
}
