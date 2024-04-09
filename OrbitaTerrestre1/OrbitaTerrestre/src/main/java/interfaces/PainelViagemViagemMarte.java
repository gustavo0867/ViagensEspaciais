package interfaces;

import entidade.ViagemMarte;
import entidade.ViagemMarte.VisitarLua;
import javax.swing.DefaultComboBoxModel;



public class PainelViagemViagemMarte extends javax.swing.JPanel {

    
    public PainelViagemViagemMarte() {
        initComponents();
        limparCampos();
    }
    
    
    public VisitarLua getSelectedVisitaLua(){
        VisitarLua visita = null;
        if(visitabuttonGroup.getSelection() != null)
            visita = VisitarLua.values()[visitabuttonGroup.getSelection().getMnemonic()];
        return visita;
    }
    
    public void setSelectedVisitaLua(int indice_visita){
        switch(indice_visita){
            case 0: fobosRadioButton.setSelected(true);break;
            case 1: deimosRadioButton.setSelected(true);
        }
    }
    
    public boolean isLembranca() {
        return lembrança_marteCheckBox.isSelected();
    }

    public void setLembranca(boolean lembranca) {
        lembrança_marteCheckBox.setSelected(lembranca);
    }

    public void limparCampos(){
        lembrança_marteCheckBox.setSelected(false);
        visitabuttonGroup.clearSelection();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visitabuttonGroup = new javax.swing.ButtonGroup();
        visitar_luaLabel = new javax.swing.JLabel();
        fobosRadioButton = new javax.swing.JRadioButton();
        deimosRadioButton = new javax.swing.JRadioButton();
        lembrança_marteCheckBox = new javax.swing.JCheckBox();
        lembrança_marteLabel = new javax.swing.JLabel();

        visitar_luaLabel.setText("Visitar Lua: ");

        visitabuttonGroup.add(fobosRadioButton);
        fobosRadioButton.setText("Fobos");

        visitabuttonGroup.add(deimosRadioButton);
        deimosRadioButton.setMnemonic('\u0001');
        deimosRadioButton.setText("Deimos");
        deimosRadioButton.setToolTipText("");

        lembrança_marteLabel.setText("Lembrança Marte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(visitar_luaLabel)
                        .addGap(29, 29, 29)
                        .addComponent(fobosRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deimosRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lembrança_marteCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(lembrança_marteLabel)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visitar_luaLabel)
                    .addComponent(fobosRadioButton)
                    .addComponent(deimosRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lembrança_marteCheckBox)
                    .addComponent(lembrança_marteLabel))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton deimosRadioButton;
    private javax.swing.JRadioButton fobosRadioButton;
    private javax.swing.JCheckBox lembrança_marteCheckBox;
    private javax.swing.JLabel lembrança_marteLabel;
    private javax.swing.ButtonGroup visitabuttonGroup;
    private javax.swing.JLabel visitar_luaLabel;
    // End of variables declaration//GEN-END:variables
}
