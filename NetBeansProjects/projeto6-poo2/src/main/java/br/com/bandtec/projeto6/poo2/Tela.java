/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto6.poo2;

/**
 *
 * @author adeli
 */
public class Tela extends javax.swing.JFrame {
    
    Cofrinho cofrinho01 = new Cofrinho();    
    Cofrinho cofrinho02 = new Cofrinho();

    public Tela() {
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

        lbl2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSaldo2 = new javax.swing.JLabel();
        btnSacar2 = new javax.swing.JButton();
        btnDepositar2 = new javax.swing.JButton();
        btnDepositar1 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lblSaldo1 = new javax.swing.JLabel();
        btnSacar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl2.setText("Saldo:");

        lblSaldo2.setText("0");

        btnSacar2.setText("Sacar 5");
        btnSacar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacar2ActionPerformed(evt);
            }
        });

        btnDepositar2.setText("Depositar 10");
        btnDepositar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositar2ActionPerformed(evt);
            }
        });

        btnDepositar1.setText("Depositar 10");
        btnDepositar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositar1ActionPerformed(evt);
            }
        });

        lbl1.setText("Saldo:");

        lblSaldo1.setText("0");

        btnSacar1.setText("Sacar 5");
        btnSacar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSaldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnDepositar2)
                        .addGap(18, 18, 18)
                        .addComponent(btnSacar2)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(lblSaldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnDepositar1)
                            .addGap(18, 18, 18)
                            .addComponent(btnSacar1)))
                    .addContainerGap(41, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo2)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepositar2)
                    .addComponent(btnSacar2))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(lblSaldo1)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDepositar1)
                        .addComponent(btnSacar1))
                    .addContainerGap(203, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositar2ActionPerformed
        
        cofrinho02.depositar10();
        
        lblSaldo2.setText(cofrinho02.saldo.toString());
        
    }//GEN-LAST:event_btnDepositar2ActionPerformed

    private void btnSacar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacar2ActionPerformed
        
        cofrinho02.sacar5();
        
        lblSaldo2.setText(cofrinho02.saldo.toString());
        
    }//GEN-LAST:event_btnSacar2ActionPerformed

    private void btnDepositar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositar1ActionPerformed
        
        cofrinho01.depositar10();
        
        lblSaldo1.setText(cofrinho01.saldo.toString());
        
    }//GEN-LAST:event_btnDepositar1ActionPerformed

    private void btnSacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacar1ActionPerformed
        
        cofrinho01.sacar5();
        
        lblSaldo1.setText(cofrinho01.saldo.toString());
        
    }//GEN-LAST:event_btnSacar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar1;
    private javax.swing.JButton btnDepositar2;
    private javax.swing.JButton btnSacar1;
    private javax.swing.JButton btnSacar2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblSaldo1;
    private javax.swing.JLabel lblSaldo2;
    // End of variables declaration//GEN-END:variables
}
