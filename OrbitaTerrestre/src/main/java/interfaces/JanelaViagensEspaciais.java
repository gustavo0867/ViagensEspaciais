package interfaces;

import controle.ControladorCadastroClientes;
import controle.ControladorCadastroViagens;
import controle.ControladorCadastroEmpresas;
import controle.ControladorCadastroAgendamentos;
import javax.swing.JOptionPane;
import persistência.BD;


public class JanelaViagensEspaciais extends javax.swing.JFrame {

    public JanelaViagensEspaciais() {        
        BD.criarConexao();       
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orbita_terrestreMenuBar = new javax.swing.JMenuBar();
        viagemMenu = new javax.swing.JMenu();
        cadastrar_viagemtemMenu = new javax.swing.JMenuItem();
        clienteMenu = new javax.swing.JMenu();
        cadastrar_clienteMenuItem = new javax.swing.JMenuItem();
        empresaMenu = new javax.swing.JMenu();
        cadastrar_empresaMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        cadastrarAgendamentoMenuItem = new javax.swing.JMenuItem();
        pesquisarAgendamentoMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viagens Espaciais");

        viagemMenu.setText("Viagem");

        cadastrar_viagemtemMenu.setText("Cadastrar");
        cadastrar_viagemtemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarViagem(evt);
            }
        });
        viagemMenu.add(cadastrar_viagemtemMenu);

        orbita_terrestreMenuBar.add(viagemMenu);

        clienteMenu.setText("Cliente");

        cadastrar_clienteMenuItem.setText("Cadastrar");
        cadastrar_clienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_clienteMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(cadastrar_clienteMenuItem);

        orbita_terrestreMenuBar.add(clienteMenu);

        empresaMenu.setText("Empresa");

        cadastrar_empresaMenuItem.setText("Cadastrar");
        cadastrar_empresaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_empresaMenuItemActionPerformed(evt);
            }
        });
        empresaMenu.add(cadastrar_empresaMenuItem);

        orbita_terrestreMenuBar.add(empresaMenu);

        jMenu1.setText("Agendamento");

        cadastrarAgendamentoMenuItem.setText("Cadastrar");
        cadastrarAgendamentoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAgendamento(evt);
            }
        });
        jMenu1.add(cadastrarAgendamentoMenuItem);

        pesquisarAgendamentoMenuItem.setText("Pesquisar");
        pesquisarAgendamentoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarAgendamento(evt);
            }
        });
        jMenu1.add(pesquisarAgendamentoMenuItem);

        orbita_terrestreMenuBar.add(jMenu1);

        setJMenuBar(orbita_terrestreMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarViagem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarViagem
        new ControladorCadastroViagens();
    }//GEN-LAST:event_cadastrarViagem

    private void terminarSistema(java.awt.event.WindowEvent evt) {                                 
        BD.fechaConexao();
        System.exit(0);
    }  
    private void cadastrar_clienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_clienteMenuItemActionPerformed
        new ControladorCadastroClientes();
    }//GEN-LAST:event_cadastrar_clienteMenuItemActionPerformed

    private void cadastrar_empresaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_empresaMenuItemActionPerformed
        new ControladorCadastroEmpresas();
    }//GEN-LAST:event_cadastrar_empresaMenuItemActionPerformed

    private void cadastrarAgendamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAgendamento
        new ControladorCadastroAgendamentos();
    }//GEN-LAST:event_cadastrarAgendamento

    private void pesquisarAgendamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarAgendamento
        new JanelaPesquisaAgendamentos().setVisible(true);
    }//GEN-LAST:event_pesquisarAgendamento

    private void informarServicoIndisponivel(){
        JOptionPane.showMessageDialog(this, "Serviço Indisponivel", "Informação",
        JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaViagensEspaciais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarAgendamentoMenuItem;
    private javax.swing.JMenuItem cadastrar_clienteMenuItem;
    private javax.swing.JMenuItem cadastrar_empresaMenuItem;
    private javax.swing.JMenuItem cadastrar_viagemtemMenu;
    private javax.swing.JMenu clienteMenu;
    private javax.swing.JMenu empresaMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar orbita_terrestreMenuBar;
    private javax.swing.JMenuItem pesquisarAgendamentoMenuItem;
    private javax.swing.JMenu viagemMenu;
    // End of variables declaration//GEN-END:variables
}
