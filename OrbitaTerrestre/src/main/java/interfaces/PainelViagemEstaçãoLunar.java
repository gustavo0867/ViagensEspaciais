package interfaces;

import entidade.EstaçãoLunar;
import entidade.EstaçãoLunar.OrbitaLua;
import entidade.EstaçãoLunar.TipoPacoteLunar;
import javax.swing.DefaultComboBoxModel;


public class PainelViagemEstaçãoLunar extends javax.swing.JPanel {

    
    public PainelViagemEstaçãoLunar() {
        initComponents();
        limparCampos();
    }
     public OrbitaLua getSelectedOrbitaLua(){
        OrbitaLua orbita = null;
        if(orbitabuttonGroup.getSelection() != null)
            orbita = OrbitaLua.values()[orbitabuttonGroup.getSelection().getMnemonic()];
        return orbita;
    }
    
    public void setSelectedOrbitaLua(int indice_orbita){
        switch(indice_orbita){
            case 0: apogeuRadioButton.setSelected(true);break;
            case 1: perigeuRadioButton.setSelected(true);
        }
    }
    
    public TipoPacoteLunar getSelectedTipoOrbitaLunar(){
        Object pacoteLunar = tipo_pacote_lunarComboBox.getSelectedItem();
        if(pacoteLunar != null) 
            return (TipoPacoteLunar)pacoteLunar;
        else return null;
    }
    public void setSelectedTipoOrbita(TipoPacoteLunar pacoteLunar){
        tipo_pacote_lunarComboBox.setSelectedItem(pacoteLunar);
    }
    
    public void limparCampos(){
        
        tipo_pacote_lunarComboBox.setSelectedIndex(-1);
        orbitabuttonGroup.clearSelection();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orbitabuttonGroup = new javax.swing.ButtonGroup();
        tipo_pacote_lunarComboBox = new javax.swing.JComboBox<>();
        tipo_pacoteLabel = new javax.swing.JLabel();
        orbita_luaLabel = new javax.swing.JLabel();
        apogeuRadioButton = new javax.swing.JRadioButton();
        perigeuRadioButton = new javax.swing.JRadioButton();

        tipo_pacote_lunarComboBox.setModel(new DefaultComboBoxModel (TipoPacoteLunar.values()));

        tipo_pacoteLabel.setText("Tipo de pacote: ");

        orbita_luaLabel.setText("Órbita da Lua:");

        orbitabuttonGroup.add(apogeuRadioButton);
        apogeuRadioButton.setText("Perigeu");
        apogeuRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apogeuRadioButtonActionPerformed(evt);
            }
        });

        orbitabuttonGroup.add(perigeuRadioButton);
        perigeuRadioButton.setMnemonic(1);
        perigeuRadioButton.setText("Apogeu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orbita_luaLabel)
                    .addComponent(tipo_pacoteLabel))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(apogeuRadioButton)
                        .addGap(32, 32, 32)
                        .addComponent(perigeuRadioButton))
                    .addComponent(tipo_pacote_lunarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orbita_luaLabel)
                    .addComponent(apogeuRadioButton)
                    .addComponent(perigeuRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_pacote_lunarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_pacoteLabel))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void apogeuRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apogeuRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apogeuRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton apogeuRadioButton;
    private javax.swing.JLabel orbita_luaLabel;
    private javax.swing.ButtonGroup orbitabuttonGroup;
    private javax.swing.JRadioButton perigeuRadioButton;
    private javax.swing.JLabel tipo_pacoteLabel;
    private javax.swing.JComboBox<String> tipo_pacote_lunarComboBox;
    // End of variables declaration//GEN-END:variables
}
