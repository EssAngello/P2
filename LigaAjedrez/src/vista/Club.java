/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author juan2
 */
public class Club extends javax.swing.JFrame {

    /**
     * Creates new form Club
     */
    public Club() {
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

        InfoEntrenador = new javax.swing.JPanel();
        InfoGerente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jlb_nombreClub = new javax.swing.JLabel();
        jbt_unirse = new javax.swing.JButton();
        jbt_cancelar = new javax.swing.JButton();
        jbt_reservaEntrenamiento = new javax.swing.JButton();
        jlb_entrenador = new javax.swing.JLabel();
        jlb_gerente = new javax.swing.JLabel();
        jlb_federacion = new javax.swing.JLabel();
        jlb_nombreGerente = new javax.swing.JLabel();
        jlb_nombreEntrenador = new javax.swing.JLabel();
        jlb_federacionPerteneciente = new javax.swing.JLabel();
        jbt_infoGerente = new javax.swing.JButton();
        jbt_infoEntrenador = new javax.swing.JButton();

        javax.swing.GroupLayout InfoEntrenadorLayout = new javax.swing.GroupLayout(InfoEntrenador);
        InfoEntrenador.setLayout(InfoEntrenadorLayout);
        InfoEntrenadorLayout.setHorizontalGroup(
            InfoEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );
        InfoEntrenadorLayout.setVerticalGroup(
            InfoEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        jLabel1.setText("historial de clubes:");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout InfoGerenteLayout = new javax.swing.GroupLayout(InfoGerente);
        InfoGerente.setLayout(InfoGerenteLayout);
        InfoGerenteLayout.setHorizontalGroup(
            InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoGerenteLayout.createSequentialGroup()
                .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoGerenteLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(InfoGerenteLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        InfoGerenteLayout.setVerticalGroup(
            InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoGerenteLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlb_nombreClub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlb_nombreClub.setText("NOMBRE DEL CLUB");

        jbt_unirse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt_unirse.setText("unirse al club");

        jbt_cancelar.setText("cancelar");

        jbt_reservaEntrenamiento.setText("Reservar Entrenamiento");

        jlb_entrenador.setText("entrenador:");

        jlb_gerente.setText("gerente:");

        jlb_federacion.setText("federacion:");

        jlb_nombreGerente.setText("nombre del gerente");

        jlb_nombreEntrenador.setText("nombre del entrenador");

        jlb_federacionPerteneciente.setText("federacion a la que pertenece");

        jbt_infoGerente.setText("informacion del gerente");
        jbt_infoGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_infoGerenteActionPerformed(evt);
            }
        });

        jbt_infoEntrenador.setText("informacion del entrenador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbt_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_unirse, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbt_reservaEntrenamiento)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_entrenador)
                            .addComponent(jlb_gerente)
                            .addComponent(jlb_federacion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_nombreGerente)
                            .addComponent(jlb_nombreEntrenador)
                            .addComponent(jlb_federacionPerteneciente))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbt_infoEntrenador)
                            .addComponent(jbt_infoGerente))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlb_nombreClub)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_nombreClub)
                .addGap(41, 41, 41)
                .addComponent(jbt_reservaEntrenamiento)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_gerente)
                    .addComponent(jlb_nombreGerente)
                    .addComponent(jbt_infoGerente))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_entrenador)
                    .addComponent(jlb_nombreEntrenador)
                    .addComponent(jbt_infoEntrenador))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlb_federacion)
                            .addComponent(jlb_federacionPerteneciente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jbt_cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbt_unirse)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_infoGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_infoGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_infoGerenteActionPerformed

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
            java.util.logging.Logger.getLogger(Club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Club().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InfoEntrenador;
    private javax.swing.JPanel InfoGerente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_cancelar;
    private javax.swing.JButton jbt_infoEntrenador;
    private javax.swing.JButton jbt_infoGerente;
    private javax.swing.JButton jbt_reservaEntrenamiento;
    private javax.swing.JButton jbt_unirse;
    private javax.swing.JLabel jlb_entrenador;
    private javax.swing.JLabel jlb_federacion;
    private javax.swing.JLabel jlb_federacionPerteneciente;
    private javax.swing.JLabel jlb_gerente;
    private javax.swing.JLabel jlb_nombreClub;
    private javax.swing.JLabel jlb_nombreEntrenador;
    private javax.swing.JLabel jlb_nombreGerente;
    // End of variables declaration//GEN-END:variables
}
