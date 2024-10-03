package interfaces;

import controle.ControladorCadastroClientes;
import entidade.Cliente;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class JanelaCadastroClientes extends javax.swing.JFrame {

    ControladorCadastroClientes controlador;
    DefaultListModel modelo_lista_clientes;

    public JanelaCadastroClientes(ControladorCadastroClientes controlador) {
        this.controlador = controlador;
        initComponents();
        inicializarListaClientes();
        limparCampos();
    }

    private void inicializarListaClientes() {
        modelo_lista_clientes = (DefaultListModel) clientesCadastradosList.getModel();
        Cliente[] visoes = Cliente.getVisoes();
        for (Cliente visao : visoes) {
            modelo_lista_clientes.addElement(visao);
        }
    }

    private void limparCampos() {
        cpfTextField.setText("");
        telefoneTextField.setText("");
        nomeTextField.setText("");

    }
    
    private Cliente buscarClientePorCPF(String cpf) {
    for (int i = 0; i < modelo_lista_clientes.size(); i++) {
        Cliente visao = (Cliente) modelo_lista_clientes.getElementAt(i);
        if (visao.getCpf().equals(cpf)) {
            return visao;
        }
    }
    return null;
}


    private Cliente obterClienteInformado() {
        String cpf = cpfTextField.getText();
        if (cpf.isEmpty()) {
            return null;
        }
        String telefone = telefoneTextField.getText();
        if (telefone.isEmpty()) {
            return null;
        }
        String nome = nomeTextField.getText();
        if (nome.isEmpty()) {
            return null;
        }
        return new Cliente(cpf, telefone, nome);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientes_cadastradosScrollPane = new javax.swing.JScrollPane();
        clientesCadastradosList = new javax.swing.JList();
        clientes_cadastradosLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        cpfTextField = new javax.swing.JTextField();
        telefoneLabel = new javax.swing.JLabel();
        comandosPanel = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JFormattedTextField();
        inserirClienteButton = new javax.swing.JButton();
        consultarClienteButton = new javax.swing.JButton();
        alterarClienteButton = new javax.swing.JButton();
        removerClienteButton = new javax.swing.JButton();
        limparCamposButton = new javax.swing.JButton();
        telefoneTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Janela de Cadastro Cliente");

        clientes_cadastradosScrollPane.setPreferredSize(new java.awt.Dimension(400, 20));

        clientesCadastradosList.setModel(new DefaultListModel());
        clientesCadastradosList.setToolTipText("");
        clientes_cadastradosScrollPane.setViewportView(clientesCadastradosList);

        clientes_cadastradosLabel.setText("Clientes Cadastrados");

        cpfLabel.setText("Cpf");

        cpfTextField.setColumns(50);
        cpfTextField.setPreferredSize(new java.awt.Dimension(400, 20));

        telefoneLabel.setText("Telefone");

        nomeLabel.setText("Nome");

        inserirClienteButton.setText("Inserir");
        inserirClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirCliente(evt);
            }
        });

        consultarClienteButton.setText("Consultar");
        consultarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCliente(evt);
            }
        });

        alterarClienteButton.setText("Alterar");
        alterarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCliente(evt);
            }
        });

        removerClienteButton.setText("Remover");
        removerClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerCliente(evt);
            }
        });

        limparCamposButton.setText("Limpar");
        limparCamposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(inserirClienteButton)
                .addGap(29, 29, 29)
                .addComponent(consultarClienteButton)
                .addGap(29, 29, 29)
                .addComponent(alterarClienteButton)
                .addGap(21, 21, 21)
                .addComponent(removerClienteButton)
                .addGap(29, 29, 29)
                .addComponent(limparCamposButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comandosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clientes_cadastradosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientes_cadastradosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nomeLabel)
                                    .addComponent(cpfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addComponent(telefoneLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefoneTextField)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clientes_cadastradosScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(clientes_cadastradosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cpfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(cpfTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(nomeTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comandosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inserirClienteButton)
                        .addComponent(consultarClienteButton)
                        .addComponent(alterarClienteButton)
                        .addComponent(removerClienteButton)
                        .addComponent(limparCamposButton)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirCliente
        Cliente cliente = obterClienteInformado();
        String mensagem_erro = null;
        if (cliente != null) {
            mensagem_erro = controlador.inserirCliente(cliente);
        } else {
            mensagem_erro = "Algum atributo do cliente nao foi informado";
        }
        if (mensagem_erro == null) {;
            modelo_lista_clientes.addElement(cliente.getVisao());
            clientesCadastradosList.setSelectedIndex(modelo_lista_clientes.size() - 1);
        } else {
            informarErro(mensagem_erro);
        }

    }//GEN-LAST:event_inserirCliente

    private void consultarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarCliente
        Cliente visao = (Cliente) clientesCadastradosList.getSelectedValue();
        Cliente cliente = null;
        String mensagem_erro = null;
        if (visao != null) {
            cliente = Cliente.buscarCliente(visao.getCpf());
            if (cliente == null) {
                mensagem_erro = "Cliente não cadastrado";
            }
        } else {
            mensagem_erro = "Nenhum cliente selecionado";
        }
        if (mensagem_erro == null) {
            cpfTextField.setText(cliente.getCpf());
            telefoneTextField.setText(cliente.getTelefone());
            nomeTextField.setText(cliente.getNome());
        } else {
            informarErro(mensagem_erro);
        }
    }//GEN-LAST:event_consultarCliente
    
    private void alterarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCliente
         Cliente cliente = obterClienteInformado();
        String mensagem_erro = null;
    if (cliente != null) {
         mensagem_erro = controlador.alterarCliente(cliente);
    } else {
        mensagem_erro = "Algum atributo do cliente não foi informado";
    }
    if (mensagem_erro == null) {
        Cliente visao = buscarClientePorCPF(cliente.getCpf());
        if (visao != null) {
            visao.setNome(cliente.getNome());
            clientesCadastradosList.updateUI();
            informarSucesso("Cliente alterado com sucesso!");
        } else {
            informarErro("Cliente não encontrado para a alteração.");
        }
    } else {
        informarErro(mensagem_erro);
    }
    }//GEN-LAST:event_alterarCliente

    private void removerCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerCliente
        Cliente visao = (Cliente) clientesCadastradosList.getSelectedValue();
        String mensagem_erro = null;
        if (visao != null) {
            mensagem_erro = controlador.removerCliente(visao.getCpf());
        } else {
            mensagem_erro = "Nenhum cliente selecionado";
        }
        if (mensagem_erro == null) {
            modelo_lista_clientes.removeElement(visao);
        } else {
            informarErro(mensagem_erro);
        }
    }//GEN-LAST:event_removerCliente

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
        limparCampos();
    }//GEN-LAST:event_limparCampos

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarClienteButton;
    private javax.swing.JList clientesCadastradosList;
    private javax.swing.JLabel clientes_cadastradosLabel;
    private javax.swing.JScrollPane clientes_cadastradosScrollPane;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JButton consultarClienteButton;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JButton inserirClienteButton;
    private javax.swing.JButton limparCamposButton;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JFormattedTextField nomeTextField;
    private javax.swing.JButton removerClienteButton;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JFormattedTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
private void informarSucesso(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "informação", JOptionPane.INFORMATION_MESSAGE);
    }

    private void informarErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "ERRO", JOptionPane.ERROR_MESSAGE);
    }

}


