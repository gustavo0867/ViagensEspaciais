package interfaces;
import controle.ControladorCadastroEmpresas;
import entidade.Empresa;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

public class JanelaCadastroEmpresas extends javax.swing.JFrame {
    ControladorCadastroEmpresas controlador;
    Empresa[] empresas_cadastradas;
    public JanelaCadastroEmpresas(ControladorCadastroEmpresas controlador) {
        this.controlador = controlador;
        empresas_cadastradas = Empresa.getVisoes();
        initComponents();
        limparCampos();
    }

    private void limparCampos() {
        nomeTextField.setText("");
        cnpjTextField.setText("");
        maximo_passageirosTextField.setText("");
        numero_navesTextField.setText("");
        alcance_espacialTextField.setText("");
    }

    private Empresa obterEmpresaInformada() {
    String cnpj = cnpjTextField.getText();
    if (cnpj.isEmpty()) {
        return null;
    }

    String nome = nomeTextField.getText();
    if (nome.isEmpty()) {
        return null;
    }

    String capacidadePassageirosStr = maximo_passageirosTextField.getText();
    int capacidadePassageiros = 0;
    if (!capacidadePassageirosStr.isEmpty()) {
        capacidadePassageiros = Integer.parseInt(capacidadePassageirosStr);
    }

    String numeroNavesStr = numero_navesTextField.getText();
    int numeroNaves = 0;
    if (!numeroNavesStr.isEmpty()) {
        numeroNaves = Integer.parseInt(numeroNavesStr);
    }

    String alcanceEspacialStr = alcance_espacialTextField.getText();
    float alcanceEspacial = 0;
    if (!alcanceEspacialStr.isEmpty()) {
        alcanceEspacial = Float.parseFloat(alcanceEspacialStr);
    }

    return new Empresa(cnpj, nome, capacidadePassageiros, numeroNaves, alcanceEspacial);
}


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empresas_cadastradasLabel = new javax.swing.JLabel();
        cnpjLabel = new javax.swing.JLabel();
        cnpjTextField = new javax.swing.JTextField();
        maximo_passageirosTextField = new javax.swing.JFormattedTextField();
        maximo_passageiroLabel = new javax.swing.JLabel();
        alcance_espacialLabel = new javax.swing.JLabel();
        numero_navesTextField = new javax.swing.JFormattedTextField();
        inserir_empresaButton = new javax.swing.JButton();
        consultar_empresaButton = new javax.swing.JButton();
        alterar_empresaButton = new javax.swing.JButton();
        remover_empresaButton = new javax.swing.JButton();
        limpar_camposButton = new javax.swing.JButton();
        numero_navesLabel = new javax.swing.JLabel();
        alcance_espacialTextField = new javax.swing.JFormattedTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        empresas_cadastradasComboBox = new javax.swing.JComboBox<>();
        kmLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Janela Cadastro Empresa ");

        empresas_cadastradasLabel.setText("Empresas Cadastrados");

        cnpjLabel.setText("Cnpj");

        cnpjTextField.setColumns(50);
        cnpjTextField.setPreferredSize(new java.awt.Dimension(400, 20));

        maximo_passageiroLabel.setText("Maximo Passageiros");

        alcance_espacialLabel.setText("Alcance  Espacial");

        inserir_empresaButton.setText("Inserir");
        inserir_empresaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirEmpresa(evt);
            }
        });

        consultar_empresaButton.setText("Consultar");
        consultar_empresaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEmpresa(evt);
            }
        });

        alterar_empresaButton.setText("Alterar");
        alterar_empresaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarEmpresa(evt);
            }
        });

        remover_empresaButton.setText("Remover");
        remover_empresaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmpresa(evt);
            }
        });

        limpar_camposButton.setText("Limpar");
        limpar_camposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparEmpresa(evt);
            }
        });

        numero_navesLabel.setText("Número de naves");

        nomeLabel.setText("Nome");

        nomeTextField.setColumns(50);
        nomeTextField.setPreferredSize(new java.awt.Dimension(400, 20));

        empresas_cadastradasComboBox.setModel(new DefaultComboBoxModel(empresas_cadastradas));

        kmLabel.setText("KM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(alcance_espacialLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cnpjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(maximo_passageiroLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(numero_navesLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                            .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empresas_cadastradasLabel))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_navesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maximo_passageirosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alcance_espacialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(empresas_cadastradasComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cnpjTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(inserir_empresaButton)
                        .addGap(29, 29, 29)
                        .addComponent(consultar_empresaButton)
                        .addGap(29, 29, 29)
                        .addComponent(alterar_empresaButton)
                        .addGap(21, 21, 21)
                        .addComponent(remover_empresaButton)
                        .addGap(29, 29, 29)
                        .addComponent(limpar_camposButton)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empresas_cadastradasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresas_cadastradasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maximo_passageirosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximo_passageiroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_navesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero_navesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alcance_espacialLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(alcance_espacialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmLabel))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserir_empresaButton)
                    .addComponent(consultar_empresaButton)
                    .addComponent(alterar_empresaButton)
                    .addComponent(remover_empresaButton)
                    .addComponent(limpar_camposButton))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                 

    private void inserirEmpresa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirEmpresa
        Empresa empresa = obterEmpresaInformada();
        String mensagemErro = null;
        if (empresa != null) {
            mensagemErro = controlador.inserirEmpresa(empresa);
        } else {
            mensagemErro = "Algum atributo da empresa não foi informado";
        }
        if (mensagemErro == null) {
            Empresa visao = empresa.getVisao();
            empresas_cadastradasComboBox.addItem(visao);
            empresas_cadastradasComboBox.setSelectedItem(visao);
        } else {
            informarErro(mensagemErro);
        }
    }//GEN-LAST:event_inserirEmpresa

    private void consultarEmpresa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEmpresa
       Empresa visao = (Empresa) empresas_cadastradasComboBox.getSelectedItem();
        Empresa empresa = null;
        String mensagemErro = null; 
        if (visao != null) {    
            empresa = Empresa.buscarEmpresa(visao.getCnpj());
            if (empresa == null) {
                mensagemErro = "Empresa não cadastrada";
            }
        } else {
            mensagemErro = "Nenhuma empresa selecionada";
        }
        if (mensagemErro == null) {
            cnpjTextField.setText(empresa.getCnpj());
            nomeTextField.setText(empresa.getNome());
            maximo_passageirosTextField.setText(String.valueOf(empresa.getCapacidadePassageiros()));
            numero_navesTextField.setText(String.valueOf(empresa.getNumeroNavesEspaciais()));
            alcance_espacialTextField.setText(String.valueOf(empresa.getAlcanceEspacial()));
   
        } else {
            informarErro(mensagemErro);
        }
    }//GEN-LAST:event_consultarEmpresa

    private void limparEmpresa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparEmpresa
        limparCampos();
    }//GEN-LAST:event_limparEmpresa

    private void alterarEmpresa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarEmpresa
        Empresa empresa = obterEmpresaInformada();
String mensagem_erro = null;
if (empresa != null) {
mensagem_erro = controlador.alterarEmpresa(empresa);
} else {
mensagem_erro = "Algum atributo da empresa nao foi informado";
}
if (mensagem_erro == null) {
Empresa visao = getVisãoAlterada(empresa.getCnpj());
if (visao != null) {
visao.setNome(empresa.getNome());
empresas_cadastradasComboBox.updateUI();
empresas_cadastradasComboBox.setSelectedItem(visao);

}
} else {
informarErro(mensagem_erro);
}

    }//GEN-LAST:event_alterarEmpresa

    private void removeEmpresa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmpresa
        Empresa visao = (Empresa) empresas_cadastradasComboBox.getSelectedItem();
String mensagem_erro = null;
if (visao != null) {
mensagem_erro = controlador.removerEmpresa(visao.getCnpj());
} else {
mensagem_erro = "Nenhuma empresa selecionado";
}
if (mensagem_erro == null) {
empresas_cadastradasComboBox.removeItem(visao);
if(empresas_cadastradas.length >= 1)
empresas_cadastradasComboBox.setSelectedIndex(-1);
else empresas_cadastradasComboBox.setSelectedIndex(-1);
} else {
informarErro(mensagem_erro);
}
    }//GEN-LAST:event_removeEmpresa

    /**
     * @param args the command line arguments
     */
   
    private Empresa getVisãoAlterada(String cnpj){     
        for (Empresa visão : empresas_cadastradas){
            if(visão.getCnpj().equals(cnpj)) return visão;
        }
        return null;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alcance_espacialLabel;
    private javax.swing.JFormattedTextField alcance_espacialTextField;
    private javax.swing.JButton alterar_empresaButton;
    private javax.swing.JLabel cnpjLabel;
    private javax.swing.JTextField cnpjTextField;
    private javax.swing.JButton consultar_empresaButton;
    private javax.swing.JComboBox<Empresa> empresas_cadastradasComboBox;
    private javax.swing.JLabel empresas_cadastradasLabel;
    private javax.swing.JButton inserir_empresaButton;
    private javax.swing.JLabel kmLabel;
    private javax.swing.JButton limpar_camposButton;
    private javax.swing.JLabel maximo_passageiroLabel;
    private javax.swing.JFormattedTextField maximo_passageirosTextField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel numero_navesLabel;
    private javax.swing.JFormattedTextField numero_navesTextField;
    private javax.swing.JButton remover_empresaButton;
    // End of variables declaration//GEN-END:variables
private void informarSucesso(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "informação", JOptionPane.INFORMATION_MESSAGE);
    }

    private void informarErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "ERRO", JOptionPane.ERROR_MESSAGE);
    }
}
