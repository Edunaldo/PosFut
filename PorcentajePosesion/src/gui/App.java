package gui;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edunaldo
 */
public class App extends javax.swing.JFrame {

    private Hilo tiempo;
    private int conGoles1;
    private int conGoles2;

    public App() {
        initComponents();
        btnComenzarPartido.setEnabled(false);
        btnEquipo1.setEnabled(false);
        btnEquipo2.setEnabled(false);
        conGoles1 = 0;
        conGoles2 = 0;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEquipo1 = new javax.swing.JButton();
        btnEquipo2 = new javax.swing.JButton();
        lblPorcentajeEquipo1 = new javax.swing.JLabel();
        lblPorcentajeEquipo2 = new javax.swing.JLabel();
        lblTiempoPartido = new javax.swing.JLabel();
        btnComenzarPartido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ckbEquipo1 = new javax.swing.JCheckBox();
        chkEquipo2 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        lblGolesEqui1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblGolesEqui2 = new javax.swing.JLabel();
        btnGolEqui1 = new javax.swing.JButton();
        btnGolEqui2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnEquipo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEquipo1.setText("SANTA AMELIA F.C");
        btnEquipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipo1ActionPerformed(evt);
            }
        });

        btnEquipo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEquipo2.setText("REAL MADRID F.C");
        btnEquipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipo2ActionPerformed(evt);
            }
        });

        lblPorcentajeEquipo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPorcentajeEquipo1.setText("0");

        lblPorcentajeEquipo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPorcentajeEquipo2.setText("0");

        lblTiempoPartido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTiempoPartido.setText("00:00");
        lblTiempoPartido.setToolTipText("");
        lblTiempoPartido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnComenzarPartido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnComenzarPartido.setText("COMENZAR PARTIDO");
        btnComenzarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarPartidoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("%");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("%");

        ckbEquipo1.setText("Partida");
        ckbEquipo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ckbEquipo1MouseClicked(evt);
            }
        });

        chkEquipo2.setText("Partida");
        chkEquipo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkEquipo2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("RESULTADO");

        lblGolesEqui1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblGolesEqui1.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("-");

        lblGolesEqui2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblGolesEqui2.setText("0");

        btnGolEqui1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGolEqui1.setText("GOOOL!");
        btnGolEqui1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGolEqui1ActionPerformed(evt);
            }
        });

        btnGolEqui2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGolEqui2.setText("GOOOL!");
        btnGolEqui2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGolEqui2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(ckbEquipo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkEquipo2)
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnEquipo1)
                .addGap(59, 59, 59)
                .addComponent(lblTiempoPartido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnEquipo2)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGolEqui1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPorcentajeEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblGolesEqui1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGolesEqui2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPorcentajeEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnComenzarPartido)
                                .addGap(32, 32, 32)
                                .addComponent(btnGolEqui2)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(258, 258, 258))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbEquipo1)
                    .addComponent(chkEquipo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPorcentajeEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPorcentajeEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblGolesEqui1)
                    .addComponent(jLabel5)
                    .addComponent(lblGolesEqui2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnComenzarPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGolEqui2))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnGolEqui1)
                        .addGap(39, 39, 39))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEquipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipo1ActionPerformed
        tiempo.cambiarEquipo1();
        btnEquipo1.setEnabled(false);
        btnEquipo2.setEnabled(true);
        btnGolEqui2.setEnabled(false);
        btnGolEqui1.setEnabled(true);
    }//GEN-LAST:event_btnEquipo1ActionPerformed

    private void btnEquipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipo2ActionPerformed
        tiempo.cambiarEquipo2();
        btnEquipo2.setEnabled(false);
        btnEquipo1.setEnabled(true);
        btnGolEqui2.setEnabled(true);
        btnGolEqui1.setEnabled(false);
    }//GEN-LAST:event_btnEquipo2ActionPerformed

    private void btnComenzarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarPartidoActionPerformed
        tiempo = new Hilo();
        tiempo.start();
        chkEquipo2.setEnabled(false);
        ckbEquipo1.setEnabled(false);
        if (ckbEquipo1.isSelected()) {
            btnEquipo1.setEnabled(false);
            btnEquipo2.setEnabled(true);
            btnGolEqui2.setEnabled(false);
        } else if (chkEquipo2.isSelected()) {
            btnEquipo2.setEnabled(false);
            btnEquipo1.setEnabled(true);
            btnGolEqui1.setEnabled(false);
        }

        btnComenzarPartido.setEnabled(false);
    }//GEN-LAST:event_btnComenzarPartidoActionPerformed

    private void ckbEquipo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbEquipo1MouseClicked
        chkEquipo2.setSelected(false);
        btnComenzarPartido.setEnabled(true);
    }//GEN-LAST:event_ckbEquipo1MouseClicked

    private void chkEquipo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkEquipo2MouseClicked
        ckbEquipo1.setSelected(false);
        btnComenzarPartido.setEnabled(true);
    }//GEN-LAST:event_chkEquipo2MouseClicked

    private void btnGolEqui1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGolEqui1ActionPerformed
        conGoles1++;
        lblGolesEqui1.setText(Integer.toString(conGoles1));
    }//GEN-LAST:event_btnGolEqui1ActionPerformed

    private void btnGolEqui2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGolEqui2ActionPerformed
        conGoles2++;
        lblGolesEqui2.setText(Integer.toString(conGoles2));
    }//GEN-LAST:event_btnGolEqui2ActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzarPartido;
    private javax.swing.JButton btnEquipo1;
    private javax.swing.JButton btnEquipo2;
    private javax.swing.JButton btnGolEqui1;
    private javax.swing.JButton btnGolEqui2;
    private javax.swing.JCheckBox chkEquipo2;
    private javax.swing.JCheckBox ckbEquipo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGolesEqui1;
    private javax.swing.JLabel lblGolesEqui2;
    private javax.swing.JLabel lblPorcentajeEquipo1;
    private javax.swing.JLabel lblPorcentajeEquipo2;
    private javax.swing.JLabel lblTiempoPartido;
    // End of variables declaration//GEN-END:variables

    private class Hilo extends Thread {

        private int segEquipo1 = 0;
        private int segEquipo2 = 0;
        private boolean equiposeleccionado1;
        private boolean equiposeleccionado2;

        public Hilo() {
            equiposeleccionado1 = false;
            equiposeleccionado2 = false;
        }

        @Override
        public void run() {
            int seg2 = 0;

            if (ckbEquipo1.isSelected()) {
                cambiarEquipo1();
            } else if (chkEquipo2.isSelected()) {
                cambiarEquipo2();
            }

            for (int min = 0; min <= 90; min++) {
                if (min != 90) {
                    for (int seg = 0; seg < 60; seg++) {
                        seg2++;

                        try {
                            String minuto = (min <= 9 ? "0" + min : Integer.toString(min));
                            String segundos = (seg <= 9 ? "0" + seg : Integer.toString(seg));
                            lblTiempoPartido.setText(minuto + ":" + segundos);
                            if (equiposeleccionado1) {
                                aumentarSegEquipo1();
                                int porcentajePosesion = (segEquipo1 * 100) / seg2;
                                lblPorcentajeEquipo1.setText(Integer.toString(porcentajePosesion));
                                int porcentajePosecionEqui2 = (segEquipo2 * 100) / seg2;
                                lblPorcentajeEquipo2.setText(Integer.toString(porcentajePosecionEqui2));
                            } else if (equiposeleccionado2) {
                                aumentarSegEquipo2();
                                int porcentajePosesion = (segEquipo2 * 100) / seg2;
                                lblPorcentajeEquipo2.setText(Integer.toString(porcentajePosesion));
                                int porcentajePosecionEqui1 = (segEquipo1 * 100) / seg2;
                                lblPorcentajeEquipo1.setText(Integer.toString(porcentajePosecionEqui1));
                            }

                            Thread.sleep(50);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    lblTiempoPartido.setText("90:00");
                }

            }
        }

        public void aumentarSegEquipo1() {
            segEquipo1++;
            System.out.println("equipo 1:" + segEquipo1);
        }

        public void aumentarSegEquipo2() {
            segEquipo2++;
            System.out.println("equipo 2:" + segEquipo2);
        }

        public void cambiarEquipo1() {
            equiposeleccionado2 = false;
            equiposeleccionado1 = true;
        }

        public void cambiarEquipo2() {
            equiposeleccionado1 = false;
            equiposeleccionado2 = true;

        }

    }
}
