/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.uni.edu.programacion.views.panels;

import javax.swing.JOptionPane;

/**
 *
 * @author manuel josue
 */
public class PnlMoneda extends javax.swing.JPanel {

    /**
     * Creates new form PnlMoneda1
     */
    public PnlMoneda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDolar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCovertir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(71, 78));
        setPreferredSize(new java.awt.Dimension(71, 78));

        jLabel1.setText("Conversor Dolare a Cordoba");

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        jLabel2.setText("córdoba oro");

        txtDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDolarActionPerformed(evt);
            }
        });

        jLabel3.setText("dólares USA");

        btnCovertir.setText("Convertir");
        btnCovertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCovertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCovertir)
                            .addComponent(txtDolar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtPeso))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCovertir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDolarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDolarActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void btnCovertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCovertirActionPerformed
        String tempDolar = txtDolar.getText().trim().replace(",", ".");
        String tempPeso = txtPeso.getText().trim();
        
         if(tempPeso.isEmpty() && tempDolar.isEmpty()){
        JOptionPane.showMessageDialog(null, "Debe rellenar al menos un campo", "Error", 0);
        }else {
         
        if(!tempDolar.isEmpty()){
            try {
            double dolar = Double.parseDouble(tempDolar);
            double peso = dolar * 35.10;
            String ps = String.valueOf(peso);
            txtPeso.setText(ps);
            }catch(NumberFormatException e){
                txtDolar.setText("");
            JOptionPane.showMessageDialog(null, "Debe Ingresar un valor numérico", "Error", 0);
            }
        }
        
        if(!tempPeso.isEmpty()){
            try {
            double peso = Double.parseDouble(tempPeso);
            double dolar = peso/35.10;
            String ds = String.valueOf(dolar);
            txtDolar.setText(ds);
            } catch(NumberFormatException e){
                txtPeso.setText("");
            JOptionPane.showMessageDialog(null, "Debe Ingresar un valor numérico", "Error", 0);
            }
        }
        
      } 
    }//GEN-LAST:event_btnCovertirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCovertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDolar;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
