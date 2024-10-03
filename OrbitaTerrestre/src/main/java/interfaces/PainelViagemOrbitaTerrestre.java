package interfaces;

import entidade.ÓrbitaTerrestre;
import entidade.ÓrbitaTerrestre.TipoOrbita;
import javax.swing.DefaultComboBoxModel;


public class PainelViagemOrbitaTerrestre extends javax.swing.JPanel {

   
    public PainelViagemOrbitaTerrestre() {
        initComponents();
        limparCampos();
    }
    
    public TipoOrbita getSelectedTipoOrbita(){
        Object tipoOrbita = tipo_orbitaComboBox.getSelectedItem();
        if(tipoOrbita != null) return (TipoOrbita)tipoOrbita;
        else return null;
    }
    public void setSelectedTipoOrbita(TipoOrbita tipoOrbita){
        tipo_orbitaComboBox.setSelectedItem(tipoOrbita);
    }
    
    public float getPeriodoOrbital() {
    String periodoOrbitalStr = periodo_orbitalTextField.getText();
    if (!periodoOrbitalStr.isEmpty()) {
        try {
            return Float.parseFloat(periodoOrbitalStr);
        } catch (NumberFormatException e) {
            
            e.printStackTrace(); 
        }
    }
    return -1.0f; 
}

    public void setPeriodoOrbital(float periodoOrbital) {
    periodo_orbitalTextField.setText(String.valueOf(periodoOrbital));
    }

    
    
    public void limparCampos(){
        
        tipo_orbitaComboBox.setSelectedIndex(-1);
        periodo_orbitalTextField.setText("");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipo_orbitaLabel = new javax.swing.JLabel();
        tipo_orbitaComboBox = new javax.swing.JComboBox<>();
        periodo_orbitalLabel = new javax.swing.JLabel();
        periodo_orbitalTextField = new javax.swing.JTextField();
        horasLabel = new javax.swing.JLabel();

        tipo_orbitaLabel.setText("Tipo de Orbita ");

        tipo_orbitaComboBox.setModel(new DefaultComboBoxModel(TipoOrbita.values()));

        periodo_orbitalLabel.setText("Período Orbital");

        periodo_orbitalTextField.setPreferredSize(new java.awt.Dimension(400, 20));

        horasLabel.setText("Horas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipo_orbitaLabel)
                    .addComponent(periodo_orbitalLabel))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipo_orbitaComboBox, 0, 200, Short.MAX_VALUE)
                    .addComponent(periodo_orbitalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(horasLabel)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipo_orbitaLabel)
                    .addComponent(tipo_orbitaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodo_orbitalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodo_orbitalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horasLabel))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel horasLabel;
    private javax.swing.JLabel periodo_orbitalLabel;
    private javax.swing.JTextField periodo_orbitalTextField;
    private javax.swing.JComboBox<String> tipo_orbitaComboBox;
    private javax.swing.JLabel tipo_orbitaLabel;
    // End of variables declaration//GEN-END:variables
}
