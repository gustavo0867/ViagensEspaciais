package interfaces;

import javax.swing.JOptionPane;
import controle.ControladorCadastroViagens;
import entidade.Viagem;
import entidade.Viagem.Classe;
import entidade.EstaçãoLunar;
import entidade.EstaçãoLunar.OrbitaLua;
import entidade.EstaçãoLunar.TipoPacoteLunar;
import entidade.ÓrbitaTerrestre;
import entidade.ÓrbitaTerrestre.TipoOrbita;
import entidade.ViagemMarte;
import entidade.ViagemMarte.VisitarLua;
import javax.swing.DefaultComboBoxModel;

public class JanelaCadastroViagens extends javax.swing.JFrame {
    ControladorCadastroViagens controlador;
    Viagem[] viagens_cadastradas;
    PainelViagemEstaçãoLunar viagem_estacao_lunarPainel;
    PainelViagemOrbitaTerrestre viagem_orbita_terrestrePainel;
    PainelViagemViagemMarte viagem_martePainel;
    
            
    public JanelaCadastroViagens(ControladorCadastroViagens controlador) {
        this.controlador = controlador;
        viagens_cadastradas = Viagem.getVisoes();
        initComponents();
        viagem_estacao_lunarPainel = new PainelViagemEstaçãoLunar();
        viagem_orbita_terrestrePainel = new PainelViagemOrbitaTerrestre();
        viagem_martePainel = new PainelViagemViagemMarte();
        especialização_viagemTabbedPane.addTab("Estação Lunar", viagem_estacao_lunarPainel);
        especialização_viagemTabbedPane.addTab("Orbita Terrestre", viagem_orbita_terrestrePainel);
        especialização_viagemTabbedPane.addTab("Viagem a Marte", viagem_martePainel);
     limparCampos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classebuttonGroup = new javax.swing.ButtonGroup();
        tempo_viagemLabel = new javax.swing.JLabel();
        inserirButton = new javax.swing.JButton();
        consultar_orbita_terrestreButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        orbitas_cadastradasLabel = new javax.swing.JLabel();
        sequencialLabel = new javax.swing.JLabel();
        sequencialTextField = new javax.swing.JTextField();
        viagem_cadastradasComboBox = new javax.swing.JComboBox<>();
        total_pessoasLabel = new javax.swing.JLabel();
        total_pessoasTextField = new javax.swing.JTextField();
        classeLabel = new javax.swing.JLabel();
        executivaRadionButton = new javax.swing.JRadioButton();
        econômicaRadioButton = new javax.swing.JRadioButton();
        especialização_viagemTabbedPane = new javax.swing.JTabbedPane();
        tempo_viagemTextField = new javax.swing.JTextField();
        mesesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Janela Cadastro Viagens Espaciais");

        tempo_viagemLabel.setText("Tempo de viagem ");

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirViagem(evt);
            }
        });

        consultar_orbita_terrestreButton.setText("Consultar");
        consultar_orbita_terrestreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarViagem(evt);
            }
        });

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarViagem(evt);
            }
        });

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerViagem(evt);
            }
        });

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos(evt);
            }
        });

        orbitas_cadastradasLabel.setText("Viagens Cadastradas");

        sequencialLabel.setText("Identificador Sequencial ");

        sequencialTextField.setEditable(false);
        sequencialTextField.setColumns(20);
        sequencialTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        viagem_cadastradasComboBox.setModel(new DefaultComboBoxModel(viagens_cadastradas));

        total_pessoasLabel.setText("Total de pessoas:");

        classeLabel.setText("Classe");

        classebuttonGroup.add(executivaRadionButton);
        executivaRadionButton.setText("Executiva");

        classebuttonGroup.add(econômicaRadioButton);
        econômicaRadioButton.setMnemonic('\u0001');
        econômicaRadioButton.setText("Econômica");
        econômicaRadioButton.setToolTipText("");

        especialização_viagemTabbedPane.setPreferredSize(new java.awt.Dimension(600, 200));

        mesesLabel.setText("Meses");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(orbitas_cadastradasLabel)
                                        .addComponent(sequencialLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(tempo_viagemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(total_pessoasLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sequencialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(total_pessoasTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tempo_viagemTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mesesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(viagem_cadastradasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(classeLabel)
                                .addGap(40, 40, 40)
                                .addComponent(executivaRadionButton)
                                .addGap(29, 29, 29)
                                .addComponent(econômicaRadioButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(inserirButton)
                        .addGap(5, 5, 5)
                        .addComponent(consultar_orbita_terrestreButton)
                        .addGap(5, 5, 5)
                        .addComponent(alterarButton)
                        .addGap(5, 5, 5)
                        .addComponent(removerButton)
                        .addGap(5, 5, 5)
                        .addComponent(limparButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addComponent(especialização_viagemTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orbitas_cadastradasLabel)
                    .addComponent(viagem_cadastradasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sequencialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sequencialLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempo_viagemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempo_viagemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesesLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_pessoasLabel)
                    .addComponent(total_pessoasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(executivaRadionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(classeLabel)
                        .addComponent(econômicaRadioButton)))
                .addGap(39, 39, 39)
                .addComponent(especialização_viagemTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inserirButton)
                    .addComponent(consultar_orbita_terrestreButton)
                    .addComponent(alterarButton)
                    .addComponent(removerButton)
                    .addComponent(limparButton))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
               limparCampos();

    }//GEN-LAST:event_limparCampos
    private void limparCampos() {
    sequencialTextField.setText("");
    tempo_viagemTextField.setText("");
    total_pessoasTextField.setText("");
    classebuttonGroup.clearSelection();
    viagem_estacao_lunarPainel.limparCampos();
    viagem_martePainel.limparCampos();
    viagem_orbita_terrestrePainel.limparCampos();
    }
    
    
    private Viagem obterOrbitaInformada() {
    String sequencialStr = sequencialTextField.getText();
    int sequencial = 0;
    if (!sequencialStr.isEmpty()) sequencial = Integer.parseInt(sequencialStr);
    
    String tempoViagemStr = tempo_viagemTextField.getText();
    int tempoViagem = 0;
    if (!tempoViagemStr.isEmpty()) tempoViagem = Integer.parseInt(tempoViagemStr);
    
    String totalPessoasStr = total_pessoasTextField.getText();
    int totalPessoas = 0;
    if (!totalPessoasStr.isEmpty()) totalPessoas = Integer.parseInt(totalPessoasStr);
    
    Classe classe = null;
    if(classebuttonGroup.getSelection() != null)
        classe = Classe.values()[classebuttonGroup.getSelection().getMnemonic()];
    else return null;
    
    Viagem viagem = null;
    
    int indiceAbaSelecionada = especialização_viagemTabbedPane.getSelectedIndex();
    switch (indiceAbaSelecionada) {
        case 0:
            TipoPacoteLunar tipoPacote = viagem_estacao_lunarPainel.getSelectedTipoOrbitaLunar();
        if (tipoPacote == null) {
            return null;
        }
        
        OrbitaLua orbitaLua = viagem_estacao_lunarPainel.getSelectedOrbitaLua();
        if (orbitaLua == null) {
            return null;
        }
            System.out.println("orbita: "+orbitaLua);
            System.out.println("tipo pacote: "+tipoPacote);
        viagem = new EstaçãoLunar(sequencial, tempoViagem, totalPessoas, classe, orbitaLua, tipoPacote);
        break;
        
            
        case 1:
            TipoOrbita viagemOrbitaTerrestre = viagem_orbita_terrestrePainel.getSelectedTipoOrbita();
            if (viagemOrbitaTerrestre == null) {
                return null;
            }
            float periodoOrbital = viagem_orbita_terrestrePainel.getPeriodoOrbital();
            
            viagem = new ÓrbitaTerrestre(sequencial, tempoViagem, totalPessoas, classe,viagemOrbitaTerrestre , periodoOrbital);
            break;
        case 2:
            VisitarLua viagemViagemMarte = viagem_martePainel.getSelectedVisitaLua();
            if (viagemViagemMarte == null) {
                return null;
            }
            boolean lembranca = viagem_martePainel.isLembranca();
            
            viagem = new ViagemMarte(sequencial, tempoViagem, totalPessoas, classe, lembranca, viagemViagemMarte);
            
            
    }

    return  viagem;
    
    }
    
     private void informarErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
   
          
    private void inserirViagem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirViagem
        Viagem viagem = obterOrbitaInformada();
        String mensagem_erro = null;
        if (viagem != null) {
            mensagem_erro = controlador.inserirViagem(viagem);
        } else {
            mensagem_erro = "Algum atributo da viagem não foi informado";
        }
        if (mensagem_erro == null) {
            int sequencial = Viagem.últimoSequencial();
            viagem.setSequencial(sequencial);
            viagem_cadastradasComboBox.addItem(viagem.getVisao());
            viagem_cadastradasComboBox.setSelectedItem(viagem.getVisao());
        }
    }//GEN-LAST:event_inserirViagem
    
    private Viagem getVisaoAlterada(int sequencial) {
    viagens_cadastradas = Viagem.getVisoes();
    for (Viagem visao : viagens_cadastradas) {
        if (visao.getSequencial() == sequencial) return visao;
    }
    return null;
    }
    
    
    private void alterarViagem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarViagem
        Viagem novaviagem = obterOrbitaInformada();
        String mensagem_erro = null;
        if (novaviagem != null) {
            mensagem_erro = controlador.alterarViagem(novaviagem);
        } else {
            mensagem_erro = "Algum atributo da viagem não informado";
        }
        if (mensagem_erro == null) {
            Viagem visao =  (Viagem)viagem_cadastradasComboBox.getSelectedItem();
            if (visao != null) {
                visao.setTotalPessoas(visao.getTotalPessoas()); 
                viagem_cadastradasComboBox.setSelectedItem(visao);
                viagem_cadastradasComboBox.updateUI();
                
            }
        } else
            informarErro(mensagem_erro);
    }//GEN-LAST:event_alterarViagem
    
    public Classe getSelectedClasse(){
        Classe classe = null;
        if (classebuttonGroup.getSelection() != null)
            classe = Classe.values()[classebuttonGroup.getSelection().getMnemonic()];
        return classe;
    }
    
    public void setSelectedClasse(int indice_classe){
        switch(indice_classe){
            case 0: executivaRadionButton.setSelected(true);break;
            case 1: econômicaRadioButton.setSelected(true);;
        }
    }
    private void consultarViagem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarViagem
    Viagem visao = (Viagem) viagem_cadastradasComboBox.getSelectedItem();
    String mensagem_erro = null;
    Viagem viagem = null;    
    if (visao != null) {
            viagem = Viagem.buscarViagem(visao.getSequencial());
            if (viagem == null) {
                mensagem_erro = "Viagem não cadastrado";
            }
        } else {
            mensagem_erro = "Viagem não identificada";
        }
        if (mensagem_erro == null) {
            tempo_viagemTextField.setText(String.valueOf(viagem.getTempoViagem()));
            total_pessoasTextField.setText(String.valueOf(viagem.getTotalPessoas()));
            setSelectedClasse(viagem.getClasse().ordinal());
            sequencialTextField.setText(viagem.getSequencial() + "");
        } else{
            informarErro(mensagem_erro);
        
            }
        
        if(viagem instanceof Viagem)


    if (viagem instanceof EstaçãoLunar) {
        especialização_viagemTabbedPane.setSelectedIndex(0);
        viagem_estacao_lunarPainel.limparCampos();
        EstaçãoLunar estacaoLunar = (EstaçãoLunar) viagem;
        viagem_estacao_lunarPainel.setSelectedOrbitaLua(estacaoLunar.getOrbita().ordinal());
        viagem_estacao_lunarPainel.setSelectedTipoOrbita(estacaoLunar.getPacote());
    } else if (viagem instanceof ÓrbitaTerrestre) {
        especialização_viagemTabbedPane.setSelectedIndex(1);
        viagem_orbita_terrestrePainel.limparCampos();
        ÓrbitaTerrestre orbitaTerrestre = (ÓrbitaTerrestre) viagem;
        viagem_orbita_terrestrePainel.setSelectedTipoOrbita(orbitaTerrestre.getTipoOrbita());
        viagem_orbita_terrestrePainel.setPeriodoOrbital(orbitaTerrestre.getPeriodoOrbital());
    } else if (viagem instanceof ViagemMarte) {
        especialização_viagemTabbedPane.setSelectedIndex(2);
        viagem_martePainel.limparCampos();
        ViagemMarte viagemMarte = (ViagemMarte) viagem;
        viagem_martePainel.setSelectedVisitaLua(viagemMarte.getVisita().ordinal());
        viagem_martePainel.setLembranca(viagemMarte.isLembrancaMarte());
    }


    }//GEN-LAST:event_consultarViagem
       
    private void removerViagem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerViagem
        Viagem visao = (Viagem) viagem_cadastradasComboBox.getSelectedItem();
    String mensagem_erro = null;
    if (visao != null) {
        mensagem_erro = controlador.removerViagem(visao.getSequencial());
        viagem_cadastradasComboBox.removeItem(visao);
        
        if (viagem_cadastradasComboBox.getItemCount() > 0) {
            viagem_cadastradasComboBox.setSelectedIndex(0);
        } else {
            limparCampos();
        }
    } else {
        mensagem_erro = "Nenhuma viagem selecionada";
    }
    
    if (mensagem_erro != null) {
        informarErro(mensagem_erro);
    }
    }//GEN-LAST:event_removerViagem

   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JLabel classeLabel;
    private javax.swing.ButtonGroup classebuttonGroup;
    private javax.swing.JButton consultar_orbita_terrestreButton;
    private javax.swing.JRadioButton econômicaRadioButton;
    private javax.swing.JTabbedPane especialização_viagemTabbedPane;
    private javax.swing.JRadioButton executivaRadionButton;
    private javax.swing.JButton inserirButton;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel mesesLabel;
    private javax.swing.JLabel orbitas_cadastradasLabel;
    private javax.swing.JButton removerButton;
    private javax.swing.JLabel sequencialLabel;
    private javax.swing.JTextField sequencialTextField;
    private javax.swing.JLabel tempo_viagemLabel;
    private javax.swing.JTextField tempo_viagemTextField;
    private javax.swing.JLabel total_pessoasLabel;
    private javax.swing.JTextField total_pessoasTextField;
    private javax.swing.JComboBox<Viagem> viagem_cadastradasComboBox;
    // End of variables declaration//GEN-END:variables
}
