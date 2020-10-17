/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author aange
 */
public class Iniciar extends javax.swing.JFrame {
    
    //Maricel
    private Gerente g;
    private Jugador j;
    private Administrador a;
    /**
     * Creates new form NewJFrame
     */
    public Iniciar() {
        initComponents();
        jbtg_iniciar.add(jrb_administrador);
        jbtg_iniciar.add(jrb_gerente);
        jbtg_iniciar.add(jrb_jugador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registrarse = new javax.swing.JFrame();
        jlb_titulo1 = new javax.swing.JLabel();
        jlb_nombre1 = new javax.swing.JLabel();
        jtf_nombre1 = new javax.swing.JTextField();
        jlb_DNI1 = new javax.swing.JLabel();
        jtf_DNI1 = new javax.swing.JTextField();
        jlb_usuario1 = new javax.swing.JLabel();
        jlb_contraseña1 = new javax.swing.JLabel();
        jtf_contraseña1 = new javax.swing.JTextField();
        jtf_usuario1 = new javax.swing.JTextField();
        jlb_categoria1 = new javax.swing.JLabel();
        jrb_infantil1 = new javax.swing.JRadioButton();
        jbt_cancelar1 = new javax.swing.JToggleButton();
        jrb_junior1 = new javax.swing.JRadioButton();
        jrb_senior1 = new javax.swing.JRadioButton();
        jbt_registrarse1 = new javax.swing.JButton();
        jlb_telefono1 = new javax.swing.JLabel();
        jtf_telefono1 = new javax.swing.JTextField();
        jtf_apellido1 = new javax.swing.JTextField();
        jlb_apellido1 = new javax.swing.JLabel();
        jbtg_iniciar = new javax.swing.ButtonGroup();
        jlb_usuariIniciar = new javax.swing.JLabel();
        jlb_contraseñaIniaciar = new javax.swing.JLabel();
        jtf_nombreIniciar = new javax.swing.JTextField();
        jtf_contraseñaIniciar = new javax.swing.JTextField();
        jbt_cancelarIniciar = new javax.swing.JButton();
        jbt_okIniciar = new javax.swing.JButton();
        jbt_registrarseIniciar = new javax.swing.JButton();
        jrb_administrador = new javax.swing.JRadioButton();
        jrb_gerente = new javax.swing.JRadioButton();
        jrb_jugador = new javax.swing.JRadioButton();

        jlb_titulo1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_titulo1.setText("REGISTRARSE");
        jlb_titulo1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jlb_nombre1.setText("nombre:");

        jtf_nombre1.setText("jTextField3");

        jlb_DNI1.setText("DNI/NIE:");

        jtf_DNI1.setText("jTextField5");

        jlb_usuario1.setText("usuario:");

        jlb_contraseña1.setText("contraseña:");

        jtf_contraseña1.setText("jTextField7");

        jtf_usuario1.setText("jTextField6");

        jlb_categoria1.setText("categoria:");

        jrb_infantil1.setText("infantil");
        jrb_infantil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_infantil1ActionPerformed(evt);
            }
        });

        jbt_cancelar1.setText("cancelar");
        jbt_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_cancelar1ActionPerformed(evt);
            }
        });

        jrb_junior1.setText("junior");

        jrb_senior1.setText("senior");

        jbt_registrarse1.setText("Registrarse");

        jlb_telefono1.setText("telefono:");

        jtf_telefono1.setText("jTextField8");

        jtf_apellido1.setText("jTextField4");

        jlb_apellido1.setText("apellido:");

        javax.swing.GroupLayout RegistrarseLayout = new javax.swing.GroupLayout(Registrarse.getContentPane());
        Registrarse.getContentPane().setLayout(RegistrarseLayout);
        RegistrarseLayout.setHorizontalGroup(
            RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarseLayout.createSequentialGroup()
                .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistrarseLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_DNI1)
                            .addComponent(jlb_nombre1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_DNI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegistrarseLayout.createSequentialGroup()
                                .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_contraseña1)
                                    .addComponent(jlb_usuario1))
                                .addGap(18, 18, 18)
                                .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtf_usuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jtf_contraseña1)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistrarseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistrarseLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jrb_infantil1)
                                .addGap(18, 18, 18)
                                .addComponent(jrb_junior1)
                                .addGap(18, 18, 18)
                                .addComponent(jrb_senior1))
                            .addComponent(jlb_categoria1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistrarseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbt_cancelar1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarseLayout.createSequentialGroup()
                        .addComponent(jbt_registrarse1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarseLayout.createSequentialGroup()
                        .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_apellido1)
                            .addComponent(jlb_telefono1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
            .addGroup(RegistrarseLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jlb_titulo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegistrarseLayout.setVerticalGroup(
            RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarseLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlb_titulo1)
                .addGap(18, 18, 18)
                .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nombre1)
                    .addComponent(jlb_apellido1)
                    .addComponent(jtf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_DNI1)
                    .addComponent(jtf_DNI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_telefono1)
                    .addComponent(jtf_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_usuario1)
                    .addComponent(jtf_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_contraseña1)
                    .addComponent(jtf_contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlb_categoria1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_infantil1)
                    .addComponent(jrb_junior1)
                    .addComponent(jrb_senior1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_registrarse1)
                    .addComponent(jbt_cancelar1))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlb_usuariIniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlb_usuariIniciar.setText("Usuario");

        jlb_contraseñaIniaciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlb_contraseñaIniaciar.setText("Password");

        jtf_nombreIniciar.setText("Introduce el nombre del usuario");
        jtf_nombreIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombreIniciarActionPerformed(evt);
            }
        });

        jtf_contraseñaIniciar.setText("Introduce la contraseña");
        jtf_contraseñaIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_contraseñaIniciarActionPerformed(evt);
            }
        });

        jbt_cancelarIniciar.setText("CANCEL");
        jbt_cancelarIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_cancelarIniciarActionPerformed(evt);
            }
        });

        jbt_okIniciar.setText("OK");
        jbt_okIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_okIniciarActionPerformed(evt);
            }
        });

        jbt_registrarseIniciar.setText("Registrarse");
        jbt_registrarseIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_registrarseIniciarActionPerformed(evt);
            }
        });

        jrb_administrador.setText("ADMINISTRADOR");

        jrb_gerente.setText("GERENTE");

        jrb_jugador.setText("JUGADOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrb_administrador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrb_gerente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrb_jugador)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbt_cancelarIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jbt_okIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_usuariIniciar)
                            .addComponent(jlb_contraseñaIniaciar))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_contraseñaIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_nombreIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 157, Short.MAX_VALUE)
                                .addComponent(jbt_registrarseIniciar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbt_registrarseIniciar)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlb_usuariIniciar)
                    .addComponent(jtf_nombreIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_contraseñaIniaciar)
                    .addComponent(jtf_contraseñaIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_cancelarIniciar)
                    .addComponent(jbt_okIniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_administrador)
                    .addComponent(jrb_gerente)
                    .addComponent(jrb_jugador))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_nombreIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombreIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombreIniciarActionPerformed

    private void jtf_contraseñaIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_contraseñaIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_contraseñaIniciarActionPerformed

    private void jbt_cancelarIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_cancelarIniciarActionPerformed
        // Maricel
        System.exit(0);
    }//GEN-LAST:event_jbt_cancelarIniciarActionPerformed

    private void jbt_registrarseIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_registrarseIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_registrarseIniciarActionPerformed

    private void jbt_okIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_okIniciarActionPerformed
        // Maricel
        if(jrb_gerente.isSelected()){
            this.setVisible(false);
            g = new Gerente();
            g.setVisible(true);
            dispose();
        }
        else if(jrb_jugador.isSelected()){
            this.setVisible(false);
            j = new Jugador();
            j.setVisible(true);
            dispose();
        }
        else if (jrb_administrador.isSelected()){
            this.setVisible(false);
            a = new Administrador();
            a.setVisible(true);
            dispose();
        }
            
    }//GEN-LAST:event_jbt_okIniciarActionPerformed

    private void jrb_infantil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_infantil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_infantil1ActionPerformed

    private void jbt_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_cancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_cancelar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Registrarse;
    private javax.swing.JToggleButton jbt_cancelar1;
    private javax.swing.JButton jbt_cancelarIniciar;
    private javax.swing.JButton jbt_okIniciar;
    private javax.swing.JButton jbt_registrarse1;
    private javax.swing.JButton jbt_registrarseIniciar;
    private javax.swing.ButtonGroup jbtg_iniciar;
    private javax.swing.JLabel jlb_DNI1;
    private javax.swing.JLabel jlb_apellido1;
    private javax.swing.JLabel jlb_categoria1;
    private javax.swing.JLabel jlb_contraseña1;
    private javax.swing.JLabel jlb_contraseñaIniaciar;
    private javax.swing.JLabel jlb_nombre1;
    private javax.swing.JLabel jlb_telefono1;
    private javax.swing.JLabel jlb_titulo1;
    private javax.swing.JLabel jlb_usuariIniciar;
    private javax.swing.JLabel jlb_usuario1;
    private javax.swing.JRadioButton jrb_administrador;
    private javax.swing.JRadioButton jrb_gerente;
    private javax.swing.JRadioButton jrb_infantil1;
    private javax.swing.JRadioButton jrb_jugador;
    private javax.swing.JRadioButton jrb_junior1;
    private javax.swing.JRadioButton jrb_senior1;
    private javax.swing.JTextField jtf_DNI1;
    private javax.swing.JTextField jtf_apellido1;
    private javax.swing.JTextField jtf_contraseña1;
    private javax.swing.JTextField jtf_contraseñaIniciar;
    private javax.swing.JTextField jtf_nombre1;
    private javax.swing.JTextField jtf_nombreIniciar;
    private javax.swing.JTextField jtf_telefono1;
    private javax.swing.JTextField jtf_usuario1;
    // End of variables declaration//GEN-END:variables
}
