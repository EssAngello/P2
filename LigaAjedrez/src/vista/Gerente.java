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
public class Gerente extends javax.swing.JFrame {

    //Maricel
    private NominaGerente nomina;
    /**
     * Creates new form Gerente
     */
    public Gerente() {
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

        InscribirseClubGerente = new javax.swing.JPanel();
        jlb_tituloInscribirseClubGerente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jli_clubes = new javax.swing.JList<>();
        jbt_inscribirse = new javax.swing.JButton();
        jbt_volverInscribirse = new javax.swing.JButton();
        HistorialClubesGerente = new javax.swing.JPanel();
        jlb_tituloHistorialClubes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jli_historialClubes = new javax.swing.JList<>();
        jbt_volverHistorial = new javax.swing.JButton();
        DatosPersonales = new javax.swing.JPanel();
        jlb_tituloInfoGerente = new javax.swing.JLabel();
        jlb_infoGerenteNombre = new javax.swing.JLabel();
        jlb_infoGerenteApellido = new javax.swing.JLabel();
        jlb_infoGerenteTelefono = new javax.swing.JLabel();
        jlb_infoGerenteDNI = new javax.swing.JLabel();
        jlb_infoGerenteDatosDNI = new javax.swing.JLabel();
        jlb_infoGerenteDatosTelefono = new javax.swing.JLabel();
        jlb_infoGerenteDatosApellido = new javax.swing.JLabel();
        jlb_infoGerenteDatosNombre = new javax.swing.JLabel();
        jbt_inscribirseClub = new javax.swing.JButton();
        jbt_historialClubes = new javax.swing.JButton();
        jbt_torneos = new javax.swing.JButton();
        jbt_IRPF = new javax.swing.JButton();
        jbt_Nominas = new javax.swing.JButton();
        jlb_tituloGerente = new javax.swing.JLabel();
        jbt_datosPersonales = new javax.swing.JButton();
        jbt_sedeDelClub = new javax.swing.JButton();
        jbt_salir = new javax.swing.JButton();

        jlb_tituloInscribirseClubGerente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloInscribirseClubGerente.setText("Inscribirse club");

        jli_clubes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jli_clubes);

        jbt_inscribirse.setText("inscribirse");

        jbt_volverInscribirse.setText("volver");
        jbt_volverInscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volverInscribirseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InscribirseClubGerenteLayout = new javax.swing.GroupLayout(InscribirseClubGerente);
        InscribirseClubGerente.setLayout(InscribirseClubGerenteLayout);
        InscribirseClubGerenteLayout.setHorizontalGroup(
            InscribirseClubGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscribirseClubGerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbt_volverInscribirse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_inscribirse)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InscribirseClubGerenteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InscribirseClubGerenteLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jlb_tituloInscribirseClubGerente)
                .addGap(97, 97, 97))
        );
        InscribirseClubGerenteLayout.setVerticalGroup(
            InscribirseClubGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscribirseClubGerenteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlb_tituloInscribirseClubGerente)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(InscribirseClubGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_inscribirse)
                    .addComponent(jbt_volverInscribirse))
                .addContainerGap())
        );

        jlb_tituloHistorialClubes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloHistorialClubes.setText("Historial Clubes");

        jli_historialClubes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jli_historialClubes);

        jbt_volverHistorial.setText("volver");

        javax.swing.GroupLayout HistorialClubesGerenteLayout = new javax.swing.GroupLayout(HistorialClubesGerente);
        HistorialClubesGerente.setLayout(HistorialClubesGerenteLayout);
        HistorialClubesGerenteLayout.setHorizontalGroup(
            HistorialClubesGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistorialClubesGerenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlb_tituloHistorialClubes)
                .addGap(80, 80, 80))
            .addGroup(HistorialClubesGerenteLayout.createSequentialGroup()
                .addGroup(HistorialClubesGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HistorialClubesGerenteLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HistorialClubesGerenteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbt_volverHistorial)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        HistorialClubesGerenteLayout.setVerticalGroup(
            HistorialClubesGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistorialClubesGerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_tituloHistorialClubes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jbt_volverHistorial)
                .addContainerGap())
        );

        jlb_tituloInfoGerente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloInfoGerente.setText("Informacion del Gerente");

        jlb_infoGerenteNombre.setText("nombre:");

        jlb_infoGerenteApellido.setText("apellido:");

        jlb_infoGerenteTelefono.setText("telefono:");

        jlb_infoGerenteDNI.setText("DNI/NIE:");

        jlb_infoGerenteDatosDNI.setText("DNI del gerente");

        jlb_infoGerenteDatosTelefono.setText("telefono del gerente");

        jlb_infoGerenteDatosApellido.setText("apellido del gerente");

        jlb_infoGerenteDatosNombre.setText("nombre del gerente");

        javax.swing.GroupLayout DatosPersonalesLayout = new javax.swing.GroupLayout(DatosPersonales);
        DatosPersonales.setLayout(DatosPersonalesLayout);
        DatosPersonalesLayout.setHorizontalGroup(
            DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jlb_tituloInfoGerente))
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_infoGerenteNombre)
                            .addComponent(jlb_infoGerenteApellido)
                            .addComponent(jlb_infoGerenteTelefono)
                            .addComponent(jlb_infoGerenteDNI))
                        .addGap(65, 65, 65)
                        .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_infoGerenteDatosNombre)
                            .addComponent(jlb_infoGerenteDatosApellido)
                            .addComponent(jlb_infoGerenteDatosDNI)
                            .addComponent(jlb_infoGerenteDatosTelefono))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        DatosPersonalesLayout.setVerticalGroup(
            DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlb_tituloInfoGerente)
                .addGap(31, 31, 31)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteNombre)
                    .addComponent(jlb_infoGerenteDatosNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteApellido)
                    .addComponent(jlb_infoGerenteDatosApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteTelefono)
                    .addComponent(jlb_infoGerenteDatosTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteDNI)
                    .addComponent(jlb_infoGerenteDatosDNI))
                .addContainerGap(79, Short.MAX_VALUE))
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

        jbt_Nominas.setText("Nominas");
        jbt_Nominas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_NominasActionPerformed(evt);
            }
        });

        jlb_tituloGerente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloGerente.setText("GERENTE");

        jbt_datosPersonales.setText("Datos Personales");

        jbt_sedeDelClub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_sedeDelClub.setText("Sede del Club");

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
        System.out.println("SE HA PULSADO");
        this.setVisible(false);
        InscribirseClubGerente.setVisible(true);
        InscribirseClubGerente.setSize(600, 600);
        System.out.println("SE HA TERMINADO"); 
    }//GEN-LAST:event_jbt_inscribirseClubActionPerformed

    private void jbt_torneosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_torneosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_torneosActionPerformed

    private void jbt_volverInscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volverInscribirseActionPerformed
        // TODO add your handling code here:
        //InscribirseClubGerente.setVisible(false);
        //this.setVisible(true);
    }//GEN-LAST:event_jbt_volverInscribirseActionPerformed

    private void jbt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_salirActionPerformed
        // Maricel
        System.exit(0);
    }//GEN-LAST:event_jbt_salirActionPerformed

    private void jbt_historialClubesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_historialClubesActionPerformed
        // Maricel
        
        HistorialClubesGerente.setVisible(true);
    }//GEN-LAST:event_jbt_historialClubesActionPerformed

    private void jbt_NominasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_NominasActionPerformed
        // Maricel
        nomina = new NominaGerente();
        nomina.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbt_NominasActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosPersonales;
    private javax.swing.JPanel HistorialClubesGerente;
    private javax.swing.JPanel InscribirseClubGerente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbt_IRPF;
    private javax.swing.JButton jbt_Nominas;
    private javax.swing.JButton jbt_datosPersonales;
    private javax.swing.JButton jbt_historialClubes;
    private javax.swing.JButton jbt_inscribirse;
    private javax.swing.JButton jbt_inscribirseClub;
    private javax.swing.JButton jbt_salir;
    private javax.swing.JButton jbt_sedeDelClub;
    private javax.swing.JButton jbt_torneos;
    private javax.swing.JButton jbt_volverHistorial;
    private javax.swing.JButton jbt_volverInscribirse;
    private javax.swing.JLabel jlb_infoGerenteApellido;
    private javax.swing.JLabel jlb_infoGerenteDNI;
    private javax.swing.JLabel jlb_infoGerenteDatosApellido;
    private javax.swing.JLabel jlb_infoGerenteDatosDNI;
    private javax.swing.JLabel jlb_infoGerenteDatosNombre;
    private javax.swing.JLabel jlb_infoGerenteDatosTelefono;
    private javax.swing.JLabel jlb_infoGerenteNombre;
    private javax.swing.JLabel jlb_infoGerenteTelefono;
    private javax.swing.JLabel jlb_tituloGerente;
    private javax.swing.JLabel jlb_tituloHistorialClubes;
    private javax.swing.JLabel jlb_tituloInfoGerente;
    private javax.swing.JLabel jlb_tituloInscribirseClubGerente;
    private javax.swing.JList<String> jli_clubes;
    private javax.swing.JList<String> jli_historialClubes;
    // End of variables declaration//GEN-END:variables
}
