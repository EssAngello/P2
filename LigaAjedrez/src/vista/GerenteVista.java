/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Jugador;

/**
 *
 * @author aange
 */
public class GerenteVista extends javax.swing.JFrame {

    //Maricel
    private NominaGerente nomina;
    private IRPFGerente irpf;
    private ClubVista club;
    private TorneoVista t;
    private Jugador jugador;
    /**
     * Creates new form Gerente
     */
    public GerenteVista(Jugador j) {
        initComponents();
        this.jugador = j;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InscribirseClubGerente = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jli_clubes1 = new javax.swing.JList<>();
        jbt_volverInscribirse1 = new javax.swing.JButton();
        jbt_inscribirse1 = new javax.swing.JButton();
        jlb_tituloInscribirseClubGerente1 = new javax.swing.JLabel();
        HistorialClubesGerente = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        jli_historialClubes1 = new javax.swing.JList<>();
        jbt_volverHistorial1 = new javax.swing.JButton();
        jlb_tituloHistorialClubes1 = new javax.swing.JLabel();
        DatosPersonales = new javax.swing.JFrame();
        jlb_tituloInfoGerente1 = new javax.swing.JLabel();
        jlb_infoGerenteNombre1 = new javax.swing.JLabel();
        jlb_infoGerenteApellido1 = new javax.swing.JLabel();
        jlb_infoGerenteTelefono1 = new javax.swing.JLabel();
        jlb_infoGerenteDNI1 = new javax.swing.JLabel();
        jlb_infoGerenteDatosDNI1 = new javax.swing.JLabel();
        jlb_infoGerenteDatosTelefono1 = new javax.swing.JLabel();
        jlb_infoGerenteDatosApellido1 = new javax.swing.JLabel();
        jlb_infoGerenteDatosNombre1 = new javax.swing.JLabel();
        jbt_ok = new javax.swing.JButton();
        jbt_inscribirseClub = new javax.swing.JButton();
        jbt_historialClubes = new javax.swing.JButton();
        jbt_torneos = new javax.swing.JButton();
        jbt_IRPF = new javax.swing.JButton();
        jbt_Nominas = new javax.swing.JButton();
        jlb_tituloGerente = new javax.swing.JLabel();
        jbt_datosPersonales = new javax.swing.JButton();
        jbt_sedeDelClub = new javax.swing.JButton();
        jbt_salir = new javax.swing.JButton();

        jli_clubes1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jli_clubes1);

        jbt_volverInscribirse1.setText("volver");
        jbt_volverInscribirse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volverInscribirse1ActionPerformed(evt);
            }
        });

        jbt_inscribirse1.setText("inscribirse");
        jbt_inscribirse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_inscribirse1ActionPerformed(evt);
            }
        });

        jlb_tituloInscribirseClubGerente1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloInscribirseClubGerente1.setText("Inscribirse club");

        javax.swing.GroupLayout InscribirseClubGerenteLayout = new javax.swing.GroupLayout(InscribirseClubGerente.getContentPane());
        InscribirseClubGerente.getContentPane().setLayout(InscribirseClubGerenteLayout);
        InscribirseClubGerenteLayout.setHorizontalGroup(
            InscribirseClubGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscribirseClubGerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbt_volverInscribirse1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_inscribirse1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InscribirseClubGerenteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InscribirseClubGerenteLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jlb_tituloInscribirseClubGerente1)
                .addGap(97, 97, 97))
        );
        InscribirseClubGerenteLayout.setVerticalGroup(
            InscribirseClubGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscribirseClubGerenteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlb_tituloInscribirseClubGerente1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(InscribirseClubGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_inscribirse1)
                    .addComponent(jbt_volverInscribirse1))
                .addContainerGap())
        );

        jli_historialClubes1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jli_historialClubes1);

        jbt_volverHistorial1.setText("volver");
        jbt_volverHistorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volverHistorial1ActionPerformed(evt);
            }
        });

        jlb_tituloHistorialClubes1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloHistorialClubes1.setText("Historial Clubes");

        javax.swing.GroupLayout HistorialClubesGerenteLayout = new javax.swing.GroupLayout(HistorialClubesGerente.getContentPane());
        HistorialClubesGerente.getContentPane().setLayout(HistorialClubesGerenteLayout);
        HistorialClubesGerenteLayout.setHorizontalGroup(
            HistorialClubesGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistorialClubesGerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbt_volverHistorial1)
                .addContainerGap(327, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistorialClubesGerenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HistorialClubesGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistorialClubesGerenteLayout.createSequentialGroup()
                        .addComponent(jlb_tituloHistorialClubes1)
                        .addGap(25, 25, 25)))
                .addGap(80, 80, 80))
        );
        HistorialClubesGerenteLayout.setVerticalGroup(
            HistorialClubesGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistorialClubesGerenteLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jlb_tituloHistorialClubes1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbt_volverHistorial1)
                .addContainerGap())
        );

        jlb_tituloInfoGerente1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloInfoGerente1.setText("Informacion del Gerente");

        jlb_infoGerenteNombre1.setText("nombre:");

        jlb_infoGerenteApellido1.setText("apellido:");

        jlb_infoGerenteTelefono1.setText("telefono:");

        jlb_infoGerenteDNI1.setText("DNI/NIE:");

        jlb_infoGerenteDatosDNI1.setText("DNI del gerente");

        jlb_infoGerenteDatosTelefono1.setText("telefono del gerente");

        jlb_infoGerenteDatosApellido1.setText("apellido del gerente");

        jlb_infoGerenteDatosNombre1.setText("nombre del gerente");

        jbt_ok.setText("OK");
        jbt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosPersonalesLayout = new javax.swing.GroupLayout(DatosPersonales.getContentPane());
        DatosPersonales.getContentPane().setLayout(DatosPersonalesLayout);
        DatosPersonalesLayout.setHorizontalGroup(
            DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbt_ok)
                    .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DatosPersonalesLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(jlb_tituloInfoGerente1))
                        .addGroup(DatosPersonalesLayout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlb_infoGerenteNombre1)
                                .addComponent(jlb_infoGerenteApellido1)
                                .addComponent(jlb_infoGerenteTelefono1)
                                .addComponent(jlb_infoGerenteDNI1))
                            .addGap(65, 65, 65)
                            .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlb_infoGerenteDatosNombre1)
                                .addComponent(jlb_infoGerenteDatosApellido1)
                                .addComponent(jlb_infoGerenteDatosDNI1)
                                .addComponent(jlb_infoGerenteDatosTelefono1)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        DatosPersonalesLayout.setVerticalGroup(
            DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlb_tituloInfoGerente1)
                .addGap(31, 31, 31)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteNombre1)
                    .addComponent(jlb_infoGerenteDatosNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteApellido1)
                    .addComponent(jlb_infoGerenteDatosApellido1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteTelefono1)
                    .addComponent(jlb_infoGerenteDatosTelefono1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteDNI1)
                    .addComponent(jlb_infoGerenteDatosDNI1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jbt_ok)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbt_inscribirseClub.setText("Inscribirse Club");
        jbt_inscribirseClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_inscribirseClubActionPerformed(evt);
            }
        });

        jbt_historialClubes.setText("Historial clubes");
        jbt_historialClubes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_historialClubesActionPerformed(evt);
            }
        });

        jbt_torneos.setText("Torneos");
        jbt_torneos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_torneosActionPerformed(evt);
            }
        });

        jbt_IRPF.setText("IRPF");
        jbt_IRPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_IRPFActionPerformed(evt);
            }
        });

        jbt_Nominas.setText("Nominas");
        jbt_Nominas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_NominasActionPerformed(evt);
            }
        });

        jlb_tituloGerente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloGerente.setText("GERENTE");

        jbt_datosPersonales.setText("Datos Personales");
        jbt_datosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_datosPersonalesActionPerformed(evt);
            }
        });

        jbt_sedeDelClub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_sedeDelClub.setText("Sede del Club");
        jbt_sedeDelClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_sedeDelClubActionPerformed(evt);
            }
        });

        jbt_salir.setText("salir");
        jbt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jlb_tituloGerente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbt_inscribirseClub, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jbt_IRPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbt_datosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbt_torneos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbt_historialClubes, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jbt_Nominas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(13, 13, 13))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jbt_sedeDelClub, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_salir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jlb_tituloGerente)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_inscribirseClub)
                    .addComponent(jbt_historialClubes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_torneos)
                    .addComponent(jbt_datosPersonales))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_IRPF)
                    .addComponent(jbt_Nominas))
                .addGap(18, 18, 18)
                .addComponent(jbt_sedeDelClub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jbt_salir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_inscribirseClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_inscribirseClubActionPerformed
        // Maricel
        this.setVisible(false);
        InscribirseClubGerente.setVisible(true);
        InscribirseClubGerente.setSize(400,400);
    }//GEN-LAST:event_jbt_inscribirseClubActionPerformed

    private void jbt_torneosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_torneosActionPerformed
        // Maricel
        t = new TorneoVista(1,jugador);
        t.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbt_torneosActionPerformed

    private void jbt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_salirActionPerformed
        // Maricel
        System.exit(0);
    }//GEN-LAST:event_jbt_salirActionPerformed

    private void jbt_historialClubesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_historialClubesActionPerformed
        // Maricel
        this.setVisible(false);
        HistorialClubesGerente.setVisible(true);
        HistorialClubesGerente.setSize(400,400);
    }//GEN-LAST:event_jbt_historialClubesActionPerformed

    private void jbt_NominasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_NominasActionPerformed
        // Maricel
        nomina = new NominaGerente(jugador);
        nomina.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbt_NominasActionPerformed

    private void jbt_volverInscribirse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volverInscribirse1ActionPerformed
        // Maricel
        InscribirseClubGerente.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_volverInscribirse1ActionPerformed

    private void jbt_inscribirse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_inscribirse1ActionPerformed
        // Maricel
        InscribirseClubGerente.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_inscribirse1ActionPerformed

    private void jbt_volverHistorial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volverHistorial1ActionPerformed
        //Maricel
        HistorialClubesGerente.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_volverHistorial1ActionPerformed

    private void jbt_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_okActionPerformed
        // Maricel
        DatosPersonales.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_okActionPerformed

    private void jbt_datosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_datosPersonalesActionPerformed
        // Maricel
        this.setVisible(false);
        DatosPersonales.setVisible(true);
        DatosPersonales.setSize(400,400);
    }//GEN-LAST:event_jbt_datosPersonalesActionPerformed

    private void jbt_IRPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_IRPFActionPerformed
        // Maricel
        irpf = new IRPFGerente(jugador);
        irpf.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbt_IRPFActionPerformed

    private void jbt_sedeDelClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_sedeDelClubActionPerformed
        // Maricel
        club = new ClubVista(1,jugador);
        club.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbt_sedeDelClubActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame DatosPersonales;
    private javax.swing.JFrame HistorialClubesGerente;
    private javax.swing.JFrame InscribirseClubGerente;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbt_IRPF;
    private javax.swing.JButton jbt_Nominas;
    private javax.swing.JButton jbt_datosPersonales;
    private javax.swing.JButton jbt_historialClubes;
    private javax.swing.JButton jbt_inscribirse1;
    private javax.swing.JButton jbt_inscribirseClub;
    private javax.swing.JButton jbt_ok;
    private javax.swing.JButton jbt_salir;
    private javax.swing.JButton jbt_sedeDelClub;
    private javax.swing.JButton jbt_torneos;
    private javax.swing.JButton jbt_volverHistorial1;
    private javax.swing.JButton jbt_volverInscribirse1;
    private javax.swing.JLabel jlb_infoGerenteApellido1;
    private javax.swing.JLabel jlb_infoGerenteDNI1;
    private javax.swing.JLabel jlb_infoGerenteDatosApellido1;
    private javax.swing.JLabel jlb_infoGerenteDatosDNI1;
    private javax.swing.JLabel jlb_infoGerenteDatosNombre1;
    private javax.swing.JLabel jlb_infoGerenteDatosTelefono1;
    private javax.swing.JLabel jlb_infoGerenteNombre1;
    private javax.swing.JLabel jlb_infoGerenteTelefono1;
    private javax.swing.JLabel jlb_tituloGerente;
    private javax.swing.JLabel jlb_tituloHistorialClubes1;
    private javax.swing.JLabel jlb_tituloInfoGerente1;
    private javax.swing.JLabel jlb_tituloInscribirseClubGerente1;
    private javax.swing.JList<String> jli_clubes1;
    private javax.swing.JList<String> jli_historialClubes1;
    // End of variables declaration//GEN-END:variables
}