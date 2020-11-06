
package br.com.bandtec.resolucoes.desafio;

import java.awt.Color;
import javax.swing.JLabel;

public class Aluno extends javax.swing.JFrame {
    private Boletim boletim1 = new Boletim();
    private Boletim boletim2 = new Boletim();
    
    public Aluno() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNota1 = new javax.swing.JTextField();
        tfNota2 = new javax.swing.JTextField();
        freq = new javax.swing.JTextField();
        resultado = new javax.swing.JLabel();
        nota11 = new javax.swing.JLabel();
        nota22 = new javax.swing.JLabel();
        freq2 = new javax.swing.JLabel();
        tfNota3 = new javax.swing.JTextField();
        tfNota4 = new javax.swing.JTextField();
        freq1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        resultado2 = new javax.swing.JLabel();
        button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nota1");

        jLabel2.setText("Nota2");

        jLabel3.setText("Frequência:");

        tfNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNota1ActionPerformed(evt);
            }
        });

        tfNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNota2ActionPerformed(evt);
            }
        });

        freq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freqActionPerformed(evt);
            }
        });

        nota11.setText("Nota1");

        nota22.setText("Nota2");

        freq2.setText("Frequência:");

        tfNota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNota3ActionPerformed(evt);
            }
        });

        tfNota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNota4ActionPerformed(evt);
            }
        });

        freq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freq1ActionPerformed(evt);
            }
        });

        button.setText("verificar");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nota11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(freq))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nota22))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(freq1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel4)
                                        .addGap(10, 10, 10)
                                        .addComponent(resultado2))
                                    .addComponent(freq2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(button)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(freq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultado))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(freq2)
                    .addComponent(nota22)
                    .addComponent(nota11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(freq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(resultado2))
                .addGap(35, 35, 35)
                .addComponent(button)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNota1ActionPerformed
        
    }//GEN-LAST:event_tfNota1ActionPerformed

    private void tfNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNota2ActionPerformed
        
    }//GEN-LAST:event_tfNota2ActionPerformed

    private void freqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freqActionPerformed
        
    }//GEN-LAST:event_freqActionPerformed

    private void tfNota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNota3ActionPerformed
        
    }//GEN-LAST:event_tfNota3ActionPerformed

    private void tfNota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNota4ActionPerformed
       
    }//GEN-LAST:event_tfNota4ActionPerformed

    private void freq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freq1ActionPerformed
       
    }//GEN-LAST:event_freq1ActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        boletim1.verificarSituacao(Double.valueOf(tfNota1.getText()), 
                Double.valueOf(tfNota2.getText()), 
                Double.valueOf(freq.getText()));
        
        boletim2.verificarSituacao(Double.valueOf(tfNota3.getText()), 
                Double.valueOf(tfNota4.getText()), 
                Double.valueOf(freq1.getText()));
        
        //resultado.setText(boletim1.getSituacao());
        //resultado.setForeground(Color.decode(boletim1.getCor()));
        
        //resultado2.setText(boletim2.getSituacao());
        //resultado2.setForeground(Color.decode(boletim2.getCor()));
        
        this.atualizarLayout(resultado, boletim1);
        this.atualizarLayout(resultado, boletim1);
    }//GEN-LAST:event_buttonActionPerformed
    
    private void atualizarLayout(JLabel lbresultadoQualquer, Boletim boletimQualquer){
        lbresultadoQualquer.setText(boletimQualquer.getSituacao());
        lbresultadoQualquer.setForeground(Color.decode(boletimQualquer.getCor()));
    }
            
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JTextField freq;
    private javax.swing.JTextField freq1;
    private javax.swing.JLabel freq2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nota11;
    private javax.swing.JLabel nota22;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel resultado2;
    private javax.swing.JTextField tfNota1;
    private javax.swing.JTextField tfNota2;
    private javax.swing.JTextField tfNota3;
    private javax.swing.JTextField tfNota4;
    // End of variables declaration//GEN-END:variables
}
