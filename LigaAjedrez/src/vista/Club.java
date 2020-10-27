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
    
    //Maricel
    //Este entero me dice si viene del gerente(1) o jugador(2) y el 0 no es nada
    private int origen;
    private GerenteVista g;
    private JugadorVista j;
    /**
     * Creates new form Club
     */
    public Club(int i) {
        initComponents();
        this.origen = i;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InfoGerente = new javax.swing.JFrame();
        jlb_tituloInfoGerente1 = new javax.swing.JLabel();
        jlb_infoGerenteNombre1 = new javax.swing.JLabel();
        jlb_infoGerenteApellido1 = new javax.swing.JLabel();
        jlb_infoGerenteTelefono1 = new javax.swing.JLabel();
        jlb_infoGerenteDNI1 = new javax.swing.JLabel();
        jlb_infoGerenteNomina1 = new javax.swing.JLabel();
        jlb_infoGerenteIRPF1 = new javax.swing.JLabel();
        jbt_volverInfoGerente1 = new javax.swing.JButton();
        jbt_infoGerenteIRPF1 = new javax.swing.JButton();
        jbt_infoGerenteNomina1 = new javax.swing.JButton();
        jlb_infoGerenteDatosDNI1 = new javax.swing.JLabel();
        jlb_infoGerenteDatosTelefono1 = new javax.swing.JLabel();
        jlb_infoGerenteDatosApellido1 = new javax.swing.JLabel();
        jlb_infoGerenteDatosNombre1 = new javax.swing.JLabel();
        InfoEntrenador = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlt_clubesTrabaja1 = new javax.swing.JList<>();
        jbt_volverInfoEntrenador1 = new javax.swing.JButton();
        jlb_clubesTrabaja1 = new javax.swing.JLabel();
        jlb_infoEntrenadorDNI1 = new javax.swing.JLabel();
        jlb_infoEntrenadorTelefono1 = new javax.swing.JLabel();
        jlb_infoEntrenadorApellido1 = new javax.swing.JLabel();
        jlb_infoEntrenadorNombre1 = new javax.swing.JLabel();
        jlb_tituloInfoEntrenador1 = new javax.swing.JLabel();
        jlb_infoEntrenadorDatosNombre1 = new javax.swing.JLabel();
        jlb_infoEntrenadorDatosApellido1 = new javax.swing.JLabel();
        jlb_infoEntrenadorDatosTelefono1 = new javax.swing.JLabel();
        jlb_infoEntrenadorDatosDNI1 = new javax.swing.JLabel();
        ReservarEntrenamiento = new javax.swing.JFrame();
        jlb_tituloReservarEntrenamiento1 = new javax.swing.JLabel();
        jlb_disponibilidad1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlt_listaDisponibilidad1 = new javax.swing.JList<>();
        jbt_cancelarEntrenamiento1 = new javax.swing.JButton();
        jbt_reservar1 = new javax.swing.JButton();
        NominaGerenteClub = new javax.swing.JFrame();
        jlb_tituloNominas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jli_nominas = new javax.swing.JList<>();
        jbt_atras_nomina = new javax.swing.JButton();
        IRPFGerenteClub = new javax.swing.JFrame();
        jlb_tituloIRPF = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jli_IRPF = new javax.swing.JList<>();
        jbt_ok = new javax.swing.JButton();
        jlb_tituloNombreClub = new javax.swing.JLabel();
        jbt_volver = new javax.swing.JButton();
        jbt_reservaEntrenamiento = new javax.swing.JButton();
        jlb_entrenador = new javax.swing.JLabel();
        jlb_gerente = new javax.swing.JLabel();
        jlb_federacion = new javax.swing.JLabel();
        jlb_nombreGerente = new javax.swing.JLabel();
        jlb_nombreEntrenador = new javax.swing.JLabel();
        jlb_federacionPerteneciente = new javax.swing.JLabel();
        jbt_infoGerente = new javax.swing.JButton();
        jbt_infoEntrenador = new javax.swing.JButton();

        jlb_tituloInfoGerente1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloInfoGerente1.setText("Informacion del Gerente");

        jlb_infoGerenteNombre1.setText("nombre:");

        jlb_infoGerenteApellido1.setText("apellido:");

        jlb_infoGerenteTelefono1.setText("telefono:");

        jlb_infoGerenteDNI1.setText("DNI/NIE:");

        jlb_infoGerenteNomina1.setText("nomina:");

        jlb_infoGerenteIRPF1.setText("IRPF:");

        jbt_volverInfoGerente1.setText("volver");
        jbt_volverInfoGerente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volverInfoGerente1ActionPerformed(evt);
            }
        });

        jbt_infoGerenteIRPF1.setText("documento IRPF");
        jbt_infoGerenteIRPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_infoGerenteIRPF1ActionPerformed(evt);
            }
        });

        jbt_infoGerenteNomina1.setText("documento nomina");
        jbt_infoGerenteNomina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_infoGerenteNomina1ActionPerformed(evt);
            }
        });

        jlb_infoGerenteDatosDNI1.setText("DNI del gerente");

        jlb_infoGerenteDatosTelefono1.setText("telefono del gerente");

        jlb_infoGerenteDatosApellido1.setText("apellido del gerente");

        jlb_infoGerenteDatosNombre1.setText("nombre del gerente");

        javax.swing.GroupLayout InfoGerenteLayout = new javax.swing.GroupLayout(InfoGerente.getContentPane());
        InfoGerente.getContentPane().setLayout(InfoGerenteLayout);
        InfoGerenteLayout.setHorizontalGroup(
            InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoGerenteLayout.createSequentialGroup()
                .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoGerenteLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jbt_volverInfoGerente1))
                    .addGroup(InfoGerenteLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InfoGerenteLayout.createSequentialGroup()
                                .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_infoGerenteNombre1)
                                    .addComponent(jlb_infoGerenteApellido1)
                                    .addComponent(jlb_infoGerenteTelefono1)
                                    .addComponent(jlb_infoGerenteDNI1))
                                .addGap(65, 65, 65)
                                .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_infoGerenteDatosNombre1)
                                    .addComponent(jlb_infoGerenteDatosApellido1)
                                    .addComponent(jlb_infoGerenteDatosDNI1)
                                    .addComponent(jlb_infoGerenteDatosTelefono1)))
                            .addGroup(InfoGerenteLayout.createSequentialGroup()
                                .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_infoGerenteNomina1)
                                    .addComponent(jlb_infoGerenteIRPF1))
                                .addGap(65, 65, 65)
                                .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbt_infoGerenteNomina1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbt_infoGerenteIRPF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jlb_tituloInfoGerente1))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        InfoGerenteLayout.setVerticalGroup(
            InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoGerenteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlb_tituloInfoGerente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteNombre1)
                    .addComponent(jlb_infoGerenteDatosNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteApellido1)
                    .addComponent(jlb_infoGerenteDatosApellido1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteTelefono1)
                    .addComponent(jlb_infoGerenteDatosTelefono1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteDNI1)
                    .addComponent(jlb_infoGerenteDatosDNI1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteNomina1)
                    .addComponent(jbt_infoGerenteNomina1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoGerenteIRPF1)
                    .addComponent(jbt_infoGerenteIRPF1))
                .addGap(37, 37, 37)
                .addComponent(jbt_volverInfoGerente1)
                .addContainerGap())
        );

        jlt_clubesTrabaja1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jlt_clubesTrabaja1);

        jbt_volverInfoEntrenador1.setText("volver");
        jbt_volverInfoEntrenador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volverInfoEntrenador1ActionPerformed(evt);
            }
        });

        jlb_clubesTrabaja1.setText("Clubes en los que trabaja:");

        jlb_infoEntrenadorDNI1.setText("DNI/NIE:");

        jlb_infoEntrenadorTelefono1.setText("telefono:");

        jlb_infoEntrenadorApellido1.setText("apellido:");

        jlb_infoEntrenadorNombre1.setText("nombre:");

        jlb_tituloInfoEntrenador1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloInfoEntrenador1.setText("Informacion del Entrenador");

        jlb_infoEntrenadorDatosNombre1.setText("nombre del entrenador");

        jlb_infoEntrenadorDatosApellido1.setText("apellido del entrenador");

        jlb_infoEntrenadorDatosTelefono1.setText("telefono del entrenador");

        jlb_infoEntrenadorDatosDNI1.setText("DNI del entrenador");

        javax.swing.GroupLayout InfoEntrenadorLayout = new javax.swing.GroupLayout(InfoEntrenador.getContentPane());
        InfoEntrenador.getContentPane().setLayout(InfoEntrenadorLayout);
        InfoEntrenadorLayout.setHorizontalGroup(
            InfoEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoEntrenadorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(InfoEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_tituloInfoEntrenador1)
                    .addGroup(InfoEntrenadorLayout.createSequentialGroup()
                        .addGroup(InfoEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InfoEntrenadorLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(InfoEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_infoEntrenadorNombre1)
                                    .addComponent(jlb_clubesTrabaja1)
                                    .addComponent(jlb_infoEntrenadorApellido1)
                                    .addComponent(jlb_infoEntrenadorTelefono1)
                                    .addComponent(jlb_infoEntrenadorDNI1)))
                            .addComponent(jbt_volverInfoEntrenador1))
                        .addGap(20, 20, 20)
                        .addGroup(InfoEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_infoEntrenadorDatosNombre1)
                            .addComponent(jlb_infoEntrenadorDatosApellido1)
                            .addComponent(jlb_infoEntrenadorDatosDNI1)
                            .addComponent(jlb_infoEntrenadorDatosTelefono1))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoEntrenadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        InfoEntrenadorLayout.setVerticalGroup(
            InfoEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoEntrenadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_tituloInfoEntrenador1)
                .addGap(17, 17, 17)
                .addGroup(InfoEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoEntrenadorNombre1)
                    .addComponent(jlb_infoEntrenadorDatosNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoEntrenadorApellido1)
                    .addComponent(jlb_infoEntrenadorDatosApellido1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoEntrenadorTelefono1)
                    .addComponent(jlb_infoEntrenadorDatosTelefono1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_infoEntrenadorDNI1)
                    .addComponent(jlb_infoEntrenadorDatosDNI1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlb_clubesTrabaja1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_volverInfoEntrenador1)
                .addContainerGap())
        );

        jlb_tituloReservarEntrenamiento1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloReservarEntrenamiento1.setText("Reservar Entrenamiento");

        jlb_disponibilidad1.setText("Disponibilidad:");

        jlt_listaDisponibilidad1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jlt_listaDisponibilidad1);

        jbt_cancelarEntrenamiento1.setText("cancelar");
        jbt_cancelarEntrenamiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_cancelarEntrenamiento1ActionPerformed(evt);
            }
        });

        jbt_reservar1.setText("reservar");
        jbt_reservar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_reservar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReservarEntrenamientoLayout = new javax.swing.GroupLayout(ReservarEntrenamiento.getContentPane());
        ReservarEntrenamiento.getContentPane().setLayout(ReservarEntrenamientoLayout);
        ReservarEntrenamientoLayout.setHorizontalGroup(
            ReservarEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservarEntrenamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbt_cancelarEntrenamiento1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_reservar1)
                .addContainerGap())
            .addGroup(ReservarEntrenamientoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jlb_disponibilidad1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservarEntrenamientoLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(ReservarEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservarEntrenamientoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservarEntrenamientoLayout.createSequentialGroup()
                        .addComponent(jlb_tituloReservarEntrenamiento1)
                        .addGap(115, 115, 115))))
        );
        ReservarEntrenamientoLayout.setVerticalGroup(
            ReservarEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservarEntrenamientoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlb_tituloReservarEntrenamiento1)
                .addGap(17, 17, 17)
                .addComponent(jlb_disponibilidad1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(ReservarEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_cancelarEntrenamiento1)
                    .addComponent(jbt_reservar1))
                .addContainerGap())
        );

        jlb_tituloNominas.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jlb_tituloNominas.setText("NOMINAS");

        jli_nominas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jli_nominas);

        jbt_atras_nomina.setText("ATRÁS");
        jbt_atras_nomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_atras_nominaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NominaGerenteClubLayout = new javax.swing.GroupLayout(NominaGerenteClub.getContentPane());
        NominaGerenteClub.getContentPane().setLayout(NominaGerenteClubLayout);
        NominaGerenteClubLayout.setHorizontalGroup(
            NominaGerenteClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NominaGerenteClubLayout.createSequentialGroup()
                .addGroup(NominaGerenteClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NominaGerenteClubLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NominaGerenteClubLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jlb_tituloNominas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NominaGerenteClubLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbt_atras_nomina)
                .addGap(194, 194, 194))
        );
        NominaGerenteClubLayout.setVerticalGroup(
            NominaGerenteClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NominaGerenteClubLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlb_tituloNominas)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jbt_atras_nomina)
                .addContainerGap())
        );

        jlb_tituloIRPF.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jlb_tituloIRPF.setText("IRPF");

        jli_IRPF.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jli_IRPF);

        jbt_ok.setText("OK");
        jbt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IRPFGerenteClubLayout = new javax.swing.GroupLayout(IRPFGerenteClub.getContentPane());
        IRPFGerenteClub.getContentPane().setLayout(IRPFGerenteClubLayout);
        IRPFGerenteClubLayout.setHorizontalGroup(
            IRPFGerenteClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IRPFGerenteClubLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jbt_ok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IRPFGerenteClubLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jlb_tituloIRPF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(IRPFGerenteClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(IRPFGerenteClubLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        IRPFGerenteClubLayout.setVerticalGroup(
            IRPFGerenteClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IRPFGerenteClubLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlb_tituloIRPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(jbt_ok)
                .addContainerGap())
            .addGroup(IRPFGerenteClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(IRPFGerenteClubLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlb_tituloNombreClub.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloNombreClub.setText("NOMBRE DEL CLUB");

        jbt_volver.setText("volver");
        jbt_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volverActionPerformed(evt);
            }
        });

        jbt_reservaEntrenamiento.setText("Reservar Entrenamiento");
        jbt_reservaEntrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_reservaEntrenamientoActionPerformed(evt);
            }
        });

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
        jbt_infoEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_infoEntrenadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbt_volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbt_reservaEntrenamiento)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_entrenador)
                                    .addComponent(jlb_gerente)
                                    .addComponent(jlb_federacion, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_nombreGerente)
                                    .addComponent(jlb_nombreEntrenador)
                                    .addComponent(jlb_federacionPerteneciente))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbt_infoEntrenador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbt_infoGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlb_tituloNombreClub)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlb_tituloNombreClub)
                .addGap(27, 27, 27)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_federacionPerteneciente)
                    .addComponent(jlb_federacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jbt_volver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_infoGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_infoGerenteActionPerformed
        // Maricel
        this.setVisible(false);
        InfoGerente.setVisible(true);
        InfoGerente.setSize(400,400);
    }//GEN-LAST:event_jbt_infoGerenteActionPerformed

    private void jbt_volverInfoGerente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volverInfoGerente1ActionPerformed
        //Maricel
        InfoGerente.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_volverInfoGerente1ActionPerformed

    private void jbt_volverInfoEntrenador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volverInfoEntrenador1ActionPerformed
        //Maricel
        InfoEntrenador.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_volverInfoEntrenador1ActionPerformed

    private void jbt_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volverActionPerformed
        // Maricel
        if(origen == 2){
            j = new JugadorVista();
            this.setVisible(false);
            j.setVisible(true);
            dispose();
        }
        else if(origen == 1){
            g = new GerenteVista();
            this.setVisible(false);
            g.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbt_volverActionPerformed

    private void jbt_reservaEntrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_reservaEntrenamientoActionPerformed
        // Maricel
        this.setVisible(false);
        ReservarEntrenamiento.setVisible(true);
        ReservarEntrenamiento.setSize(400,400);
    }//GEN-LAST:event_jbt_reservaEntrenamientoActionPerformed

    private void jbt_infoEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_infoEntrenadorActionPerformed
        // Maricel
        this.setVisible(false);
        InfoEntrenador.setVisible(true);
        InfoEntrenador.setSize(400,400);
    }//GEN-LAST:event_jbt_infoEntrenadorActionPerformed

    private void jbt_cancelarEntrenamiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_cancelarEntrenamiento1ActionPerformed
        // Maricel
        ReservarEntrenamiento.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_cancelarEntrenamiento1ActionPerformed

    private void jbt_reservar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_reservar1ActionPerformed
        // Maricel
        ReservarEntrenamiento.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_reservar1ActionPerformed

    private void jbt_infoGerenteNomina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_infoGerenteNomina1ActionPerformed
        // Maricel
        NominaGerenteClub.setVisible(true);
        NominaGerenteClub.setSize(400,400);
        this.setVisible(false);
    }//GEN-LAST:event_jbt_infoGerenteNomina1ActionPerformed

    private void jbt_infoGerenteIRPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_infoGerenteIRPF1ActionPerformed
        // Maricel
        IRPFGerenteClub.setVisible(true);
        IRPFGerenteClub.setSize(600,600);
        this.setVisible(false);
    }//GEN-LAST:event_jbt_infoGerenteIRPF1ActionPerformed

    private void jbt_atras_nominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_atras_nominaActionPerformed
        // Maricel
        NominaGerenteClub.setVisible(false);
        InfoGerente.setVisible(true);
    }//GEN-LAST:event_jbt_atras_nominaActionPerformed

    private void jbt_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_okActionPerformed
        // Maricel
        IRPFGerenteClub.setVisible(false);
        InfoGerente.setVisible(true);
    }//GEN-LAST:event_jbt_okActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame IRPFGerenteClub;
    private javax.swing.JFrame InfoEntrenador;
    private javax.swing.JFrame InfoGerente;
    private javax.swing.JFrame NominaGerenteClub;
    private javax.swing.JFrame ReservarEntrenamiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbt_atras_nomina;
    private javax.swing.JButton jbt_cancelarEntrenamiento1;
    private javax.swing.JButton jbt_infoEntrenador;
    private javax.swing.JButton jbt_infoGerente;
    private javax.swing.JButton jbt_infoGerenteIRPF1;
    private javax.swing.JButton jbt_infoGerenteNomina1;
    private javax.swing.JButton jbt_ok;
    private javax.swing.JButton jbt_reservaEntrenamiento;
    private javax.swing.JButton jbt_reservar1;
    private javax.swing.JButton jbt_volver;
    private javax.swing.JButton jbt_volverInfoEntrenador1;
    private javax.swing.JButton jbt_volverInfoGerente1;
    private javax.swing.JLabel jlb_clubesTrabaja1;
    private javax.swing.JLabel jlb_disponibilidad1;
    private javax.swing.JLabel jlb_entrenador;
    private javax.swing.JLabel jlb_federacion;
    private javax.swing.JLabel jlb_federacionPerteneciente;
    private javax.swing.JLabel jlb_gerente;
    private javax.swing.JLabel jlb_infoEntrenadorApellido1;
    private javax.swing.JLabel jlb_infoEntrenadorDNI1;
    private javax.swing.JLabel jlb_infoEntrenadorDatosApellido1;
    private javax.swing.JLabel jlb_infoEntrenadorDatosDNI1;
    private javax.swing.JLabel jlb_infoEntrenadorDatosNombre1;
    private javax.swing.JLabel jlb_infoEntrenadorDatosTelefono1;
    private javax.swing.JLabel jlb_infoEntrenadorNombre1;
    private javax.swing.JLabel jlb_infoEntrenadorTelefono1;
    private javax.swing.JLabel jlb_infoGerenteApellido1;
    private javax.swing.JLabel jlb_infoGerenteDNI1;
    private javax.swing.JLabel jlb_infoGerenteDatosApellido1;
    private javax.swing.JLabel jlb_infoGerenteDatosDNI1;
    private javax.swing.JLabel jlb_infoGerenteDatosNombre1;
    private javax.swing.JLabel jlb_infoGerenteDatosTelefono1;
    private javax.swing.JLabel jlb_infoGerenteIRPF1;
    private javax.swing.JLabel jlb_infoGerenteNombre1;
    private javax.swing.JLabel jlb_infoGerenteNomina1;
    private javax.swing.JLabel jlb_infoGerenteTelefono1;
    private javax.swing.JLabel jlb_nombreEntrenador;
    private javax.swing.JLabel jlb_nombreGerente;
    private javax.swing.JLabel jlb_tituloIRPF;
    private javax.swing.JLabel jlb_tituloInfoEntrenador1;
    private javax.swing.JLabel jlb_tituloInfoGerente1;
    private javax.swing.JLabel jlb_tituloNombreClub;
    private javax.swing.JLabel jlb_tituloNominas;
    private javax.swing.JLabel jlb_tituloReservarEntrenamiento1;
    private javax.swing.JList<String> jli_IRPF;
    private javax.swing.JList<String> jli_nominas;
    private javax.swing.JList<String> jlt_clubesTrabaja1;
    private javax.swing.JList<String> jlt_listaDisponibilidad1;
    // End of variables declaration//GEN-END:variables
}
