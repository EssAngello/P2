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
public class Torneo extends javax.swing.JFrame {
    //Este entero me dice si viene del gerente o jugador
    private int origen;
    private Gerente g;
    private Jugador j;
    /**
     * Creates new form Torneo
     */
    public Torneo(int i) {
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

        InscribirseTorneo = new javax.swing.JFrame();
        jlb_tituloInscribirseTorneo1 = new javax.swing.JLabel();
        jlb_torneosDisponibles1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jli_torneos1 = new javax.swing.JList<>();
        jbt_volverInscribirse1 = new javax.swing.JButton();
        jbt_inscribirse1 = new javax.swing.JButton();
        ConfirmacionInscribirseTorneo = new javax.swing.JFrame();
        jlb_texto1 = new javax.swing.JLabel();
        jbt_ok1 = new javax.swing.JButton();
        HistorialPartidas = new javax.swing.JFrame();
        jlb_tituloHistorialPartidos1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jli_historiaPartidos1 = new javax.swing.JList<>();
        jbt_volverHistorial1 = new javax.swing.JButton();
        jbt_masDetalleHistorial1 = new javax.swing.JButton();
        DetallesHistorialPartidas = new javax.swing.JFrame();
        jlb_tituloDetallesPartida1 = new javax.swing.JLabel();
        jlb_rival1 = new javax.swing.JLabel();
        jlb_ganador1 = new javax.swing.JLabel();
        jlb_fecha1 = new javax.swing.JLabel();
        jlb_tiempo1 = new javax.swing.JLabel();
        jlb_rivalRespuesta1 = new javax.swing.JLabel();
        jlb_ganadorlRespuesta1 = new javax.swing.JLabel();
        jlb_fechaRespuesta1 = new javax.swing.JLabel();
        jlb_tiempoRespuesta1 = new javax.swing.JLabel();
        jbt_okDetalles1 = new javax.swing.JButton();
        ResultadosPartida = new javax.swing.JFrame();
        jlb_tituloResultadoPartido1 = new javax.swing.JLabel();
        jlb_jugador3 = new javax.swing.JLabel();
        jlb_jugador4 = new javax.swing.JLabel();
        jlb_ganadorResultado1 = new javax.swing.JLabel();
        jlb_tiempoResultado1 = new javax.swing.JLabel();
        jlb_torneo1 = new javax.swing.JLabel();
        jbt_volverResultadoPartido1 = new javax.swing.JButton();
        jComboBoxTorneo1 = new javax.swing.JComboBox<>();
        jtf_tiempo1 = new javax.swing.JTextField();
        jtf_ganador1 = new javax.swing.JTextField();
        jtf_jugador3 = new javax.swing.JTextField();
        jtf_jugador4 = new javax.swing.JTextField();
        jbt_okResultadoPartido1 = new javax.swing.JButton();
        jlb_tituloTorneo = new javax.swing.JLabel();
        jbt_inscribirseTorneo = new javax.swing.JButton();
        jbt_historialPartidas = new javax.swing.JButton();
        jbt_resultadosPartida = new javax.swing.JButton();
        jbt_volverTorneo = new javax.swing.JButton();

        jlb_tituloInscribirseTorneo1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloInscribirseTorneo1.setText("Inscribirse Torneo");

        jlb_torneosDisponibles1.setText("Torneos disponibles:");

        jli_torneos1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jli_torneos1);

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

        javax.swing.GroupLayout InscribirseTorneoLayout = new javax.swing.GroupLayout(InscribirseTorneo.getContentPane());
        InscribirseTorneo.getContentPane().setLayout(InscribirseTorneoLayout);
        InscribirseTorneoLayout.setHorizontalGroup(
            InscribirseTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscribirseTorneoLayout.createSequentialGroup()
                .addGroup(InscribirseTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InscribirseTorneoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbt_volverInscribirse1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbt_inscribirse1))
                    .addGroup(InscribirseTorneoLayout.createSequentialGroup()
                        .addGroup(InscribirseTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InscribirseTorneoLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jlb_torneosDisponibles1))
                            .addGroup(InscribirseTorneoLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InscribirseTorneoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlb_tituloInscribirseTorneo1)
                .addGap(121, 121, 121))
        );
        InscribirseTorneoLayout.setVerticalGroup(
            InscribirseTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscribirseTorneoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlb_tituloInscribirseTorneo1)
                .addGap(18, 18, 18)
                .addComponent(jlb_torneosDisponibles1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InscribirseTorneoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InscribirseTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_inscribirse1)
                    .addComponent(jbt_volverInscribirse1))
                .addContainerGap())
        );

        jlb_texto1.setText("Has sido inscrito correctamente al torneo");

        jbt_ok1.setText("ok");
        jbt_ok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_ok1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConfirmacionInscribirseTorneoLayout = new javax.swing.GroupLayout(ConfirmacionInscribirseTorneo.getContentPane());
        ConfirmacionInscribirseTorneo.getContentPane().setLayout(ConfirmacionInscribirseTorneoLayout);
        ConfirmacionInscribirseTorneoLayout.setHorizontalGroup(
            ConfirmacionInscribirseTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmacionInscribirseTorneoLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(ConfirmacionInscribirseTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmacionInscribirseTorneoLayout.createSequentialGroup()
                        .addComponent(jbt_ok1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmacionInscribirseTorneoLayout.createSequentialGroup()
                        .addComponent(jlb_texto1)
                        .addGap(60, 60, 60))))
        );
        ConfirmacionInscribirseTorneoLayout.setVerticalGroup(
            ConfirmacionInscribirseTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmacionInscribirseTorneoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jlb_texto1)
                .addGap(81, 81, 81)
                .addComponent(jbt_ok1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlb_tituloHistorialPartidos1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloHistorialPartidos1.setText("Historial Partidos");

        jli_historiaPartidos1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jli_historiaPartidos1);

        jbt_volverHistorial1.setText("volver");
        jbt_volverHistorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volverHistorial1ActionPerformed(evt);
            }
        });

        jbt_masDetalleHistorial1.setText("mas detalles");
        jbt_masDetalleHistorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_masDetalleHistorial1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HistorialPartidasLayout = new javax.swing.GroupLayout(HistorialPartidas.getContentPane());
        HistorialPartidas.getContentPane().setLayout(HistorialPartidasLayout);
        HistorialPartidasLayout.setHorizontalGroup(
            HistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistorialPartidasLayout.createSequentialGroup()
                .addGroup(HistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HistorialPartidasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbt_volverHistorial1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbt_masDetalleHistorial1))
                    .addGroup(HistorialPartidasLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(HistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_tituloHistorialPartidos1)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        HistorialPartidasLayout.setVerticalGroup(
            HistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistorialPartidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_tituloHistorialPartidos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(HistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_volverHistorial1)
                    .addComponent(jbt_masDetalleHistorial1))
                .addContainerGap())
        );

        jlb_tituloDetallesPartida1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloDetallesPartida1.setText("detalles partida");

        jlb_rival1.setText("rival");

        jlb_ganador1.setText("ganador");

        jlb_fecha1.setText("fecha");

        jlb_tiempo1.setText("tiempo");

        jlb_rivalRespuesta1.setText("jLabel12");

        jlb_ganadorlRespuesta1.setText("jLabel13");

        jlb_fechaRespuesta1.setText("jLabel14");

        jlb_tiempoRespuesta1.setText("jLabel15");

        jbt_okDetalles1.setText("ok");
        jbt_okDetalles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_okDetalles1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DetallesHistorialPartidasLayout = new javax.swing.GroupLayout(DetallesHistorialPartidas.getContentPane());
        DetallesHistorialPartidas.getContentPane().setLayout(DetallesHistorialPartidasLayout);
        DetallesHistorialPartidasLayout.setHorizontalGroup(
            DetallesHistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetallesHistorialPartidasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbt_okDetalles1)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetallesHistorialPartidasLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jlb_tituloDetallesPartida1)
                .addGap(69, 69, 69))
            .addGroup(DetallesHistorialPartidasLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(DetallesHistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetallesHistorialPartidasLayout.createSequentialGroup()
                        .addComponent(jlb_ganador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlb_ganadorlRespuesta1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetallesHistorialPartidasLayout.createSequentialGroup()
                        .addComponent(jlb_rival1)
                        .addGap(77, 77, 77)
                        .addComponent(jlb_rivalRespuesta1))
                    .addGroup(DetallesHistorialPartidasLayout.createSequentialGroup()
                        .addGroup(DetallesHistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_fecha1)
                            .addComponent(jlb_tiempo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(DetallesHistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_fechaRespuesta1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlb_tiempoRespuesta1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DetallesHistorialPartidasLayout.setVerticalGroup(
            DetallesHistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetallesHistorialPartidasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlb_tituloDetallesPartida1)
                .addGap(18, 18, 18)
                .addGroup(DetallesHistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_rival1)
                    .addComponent(jlb_rivalRespuesta1))
                .addGap(18, 18, 18)
                .addGroup(DetallesHistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_ganador1)
                    .addComponent(jlb_ganadorlRespuesta1))
                .addGap(18, 18, 18)
                .addGroup(DetallesHistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_fecha1)
                    .addComponent(jlb_fechaRespuesta1))
                .addGap(18, 18, 18)
                .addGroup(DetallesHistorialPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_tiempo1)
                    .addComponent(jlb_tiempoRespuesta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jbt_okDetalles1)
                .addContainerGap())
        );

        jlb_tituloResultadoPartido1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jlb_tituloResultadoPartido1.setText("RESULTADO PARTIDO");

        jlb_jugador3.setText("Jugador 1");

        jlb_jugador4.setText("Juagador 2");

        jlb_ganadorResultado1.setText("Ganador");

        jlb_tiempoResultado1.setText("Tiempo");

        jlb_torneo1.setText("Torneo");

        jbt_volverResultadoPartido1.setText("volver");
        jbt_volverResultadoPartido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volverResultadoPartido1ActionPerformed(evt);
            }
        });

        jComboBoxTorneo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTorneo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTorneo1ActionPerformed(evt);
            }
        });

        jtf_tiempo1.setText("DD/MM/YY");
        jtf_tiempo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tiempo1ActionPerformed(evt);
            }
        });

        jtf_ganador1.setText("Introduce Nombre y Apellido");

        jtf_jugador3.setText("Introduce Nombre y Apellido");

        jtf_jugador4.setText("Introduce Nombre y Apellido");
        jtf_jugador4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_jugador4ActionPerformed(evt);
            }
        });

        jbt_okResultadoPartido1.setText("ok");
        jbt_okResultadoPartido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_okResultadoPartido1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResultadosPartidaLayout = new javax.swing.GroupLayout(ResultadosPartida.getContentPane());
        ResultadosPartida.getContentPane().setLayout(ResultadosPartidaLayout);
        ResultadosPartidaLayout.setHorizontalGroup(
            ResultadosPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadosPartidaLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(ResultadosPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ResultadosPartidaLayout.createSequentialGroup()
                        .addComponent(jlb_jugador4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf_jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResultadosPartidaLayout.createSequentialGroup()
                        .addComponent(jlb_jugador3)
                        .addGap(84, 84, 84)
                        .addComponent(jtf_jugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResultadosPartidaLayout.createSequentialGroup()
                        .addGroup(ResultadosPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_ganadorResultado1)
                            .addComponent(jlb_tiempoResultado1)
                            .addComponent(jlb_torneo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ResultadosPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxTorneo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_ganador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultadosPartidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlb_tituloResultadoPartido1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultadosPartidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbt_volverResultadoPartido1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_okResultadoPartido1)
                .addContainerGap())
        );
        ResultadosPartidaLayout.setVerticalGroup(
            ResultadosPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadosPartidaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlb_tituloResultadoPartido1)
                .addGap(32, 32, 32)
                .addGroup(ResultadosPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_jugador3)
                    .addComponent(jtf_jugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ResultadosPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_jugador4)
                    .addComponent(jtf_jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ResultadosPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_ganadorResultado1)
                    .addComponent(jtf_ganador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ResultadosPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_tiempoResultado1)
                    .addComponent(jtf_tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ResultadosPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_torneo1)
                    .addComponent(jComboBoxTorneo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ResultadosPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_okResultadoPartido1)
                    .addComponent(jbt_volverResultadoPartido1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlb_tituloTorneo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloTorneo.setText("Torneo");

        jbt_inscribirseTorneo.setText("Inscribirse Torneo");
        jbt_inscribirseTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_inscribirseTorneoActionPerformed(evt);
            }
        });

        jbt_historialPartidas.setText("Historial partidas");
        jbt_historialPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_historialPartidasActionPerformed(evt);
            }
        });

        jbt_resultadosPartida.setText("Resultados partida");
        jbt_resultadosPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_resultadosPartidaActionPerformed(evt);
            }
        });

        jbt_volverTorneo.setText("volver");
        jbt_volverTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volverTorneoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jlb_tituloTorneo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbt_volverTorneo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbt_inscribirseTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbt_historialPartidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbt_resultadosPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlb_tituloTorneo)
                .addGap(34, 34, 34)
                .addComponent(jbt_inscribirseTorneo)
                .addGap(18, 18, 18)
                .addComponent(jbt_historialPartidas)
                .addGap(18, 18, 18)
                .addComponent(jbt_resultadosPartida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jbt_volverTorneo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_historialPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_historialPartidasActionPerformed
        // Maricel
        this.setVisible(false);
        HistorialPartidas.setVisible(true);
        HistorialPartidas.setSize(400,400);
    }//GEN-LAST:event_jbt_historialPartidasActionPerformed

    private void jbt_volverInscribirse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volverInscribirse1ActionPerformed
       // Maricel
        InscribirseTorneo.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_volverInscribirse1ActionPerformed

    private void jbt_inscribirse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_inscribirse1ActionPerformed
        // Maricel
        InscribirseTorneo.setVisible(false);
        ConfirmacionInscribirseTorneo.setVisible(true);
        ConfirmacionInscribirseTorneo.setSize(400,400);
    }//GEN-LAST:event_jbt_inscribirse1ActionPerformed

    private void jComboBoxTorneo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTorneo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTorneo1ActionPerformed

    private void jtf_tiempo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tiempo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tiempo1ActionPerformed

    private void jtf_jugador4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_jugador4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_jugador4ActionPerformed

    private void jbt_volverTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volverTorneoActionPerformed
        // Maricel
        if(origen == 2){
            j = new Jugador();
            this.setVisible(false);
            j.setVisible(true);
            dispose();
        }
        else if(origen == 1){
            g = new Gerente();
            this.setVisible(false);
            g.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbt_volverTorneoActionPerformed

    private void jbt_inscribirseTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_inscribirseTorneoActionPerformed
        // Maricel
        this.setVisible(false);
        InscribirseTorneo.setVisible(true);
        InscribirseTorneo.setSize(400,400);
    }//GEN-LAST:event_jbt_inscribirseTorneoActionPerformed

    private void jbt_ok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_ok1ActionPerformed
        // Maricel
        ConfirmacionInscribirseTorneo.setVisible(false);
        InscribirseTorneo.setVisible(true);
    }//GEN-LAST:event_jbt_ok1ActionPerformed

    private void jbt_resultadosPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_resultadosPartidaActionPerformed
        // Maricel
        this.setVisible(false);
        ResultadosPartida.setVisible(true);
        ResultadosPartida.setSize(400,400);
    }//GEN-LAST:event_jbt_resultadosPartidaActionPerformed

    private void jbt_volverResultadoPartido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volverResultadoPartido1ActionPerformed
        // Maricel
        ResultadosPartida.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_volverResultadoPartido1ActionPerformed

    private void jbt_okResultadoPartido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_okResultadoPartido1ActionPerformed
        // Maricel
        ResultadosPartida.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_okResultadoPartido1ActionPerformed

    private void jbt_volverHistorial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volverHistorial1ActionPerformed
        // Maricel
        HistorialPartidas.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_volverHistorial1ActionPerformed

    private void jbt_masDetalleHistorial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_masDetalleHistorial1ActionPerformed
        // Maricel
        HistorialPartidas.setVisible(false);
        DetallesHistorialPartidas.setVisible(true);
        DetallesHistorialPartidas.setSize(400,400);
    }//GEN-LAST:event_jbt_masDetalleHistorial1ActionPerformed

    private void jbt_okDetalles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_okDetalles1ActionPerformed
        // Maricel
        DetallesHistorialPartidas.setVisible(false);
        HistorialPartidas.setVisible(true);
    }//GEN-LAST:event_jbt_okDetalles1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ConfirmacionInscribirseTorneo;
    private javax.swing.JFrame DetallesHistorialPartidas;
    private javax.swing.JFrame HistorialPartidas;
    private javax.swing.JFrame InscribirseTorneo;
    private javax.swing.JFrame ResultadosPartida;
    private javax.swing.JComboBox<String> jComboBoxTorneo1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbt_historialPartidas;
    private javax.swing.JButton jbt_inscribirse1;
    private javax.swing.JButton jbt_inscribirseTorneo;
    private javax.swing.JButton jbt_masDetalleHistorial1;
    private javax.swing.JButton jbt_ok1;
    private javax.swing.JButton jbt_okDetalles1;
    private javax.swing.JButton jbt_okResultadoPartido1;
    private javax.swing.JButton jbt_resultadosPartida;
    private javax.swing.JButton jbt_volverHistorial1;
    private javax.swing.JButton jbt_volverInscribirse1;
    private javax.swing.JButton jbt_volverResultadoPartido1;
    private javax.swing.JButton jbt_volverTorneo;
    private javax.swing.JLabel jlb_fecha1;
    private javax.swing.JLabel jlb_fechaRespuesta1;
    private javax.swing.JLabel jlb_ganador1;
    private javax.swing.JLabel jlb_ganadorResultado1;
    private javax.swing.JLabel jlb_ganadorlRespuesta1;
    private javax.swing.JLabel jlb_jugador3;
    private javax.swing.JLabel jlb_jugador4;
    private javax.swing.JLabel jlb_rival1;
    private javax.swing.JLabel jlb_rivalRespuesta1;
    private javax.swing.JLabel jlb_texto1;
    private javax.swing.JLabel jlb_tiempo1;
    private javax.swing.JLabel jlb_tiempoRespuesta1;
    private javax.swing.JLabel jlb_tiempoResultado1;
    private javax.swing.JLabel jlb_tituloDetallesPartida1;
    private javax.swing.JLabel jlb_tituloHistorialPartidos1;
    private javax.swing.JLabel jlb_tituloInscribirseTorneo1;
    private javax.swing.JLabel jlb_tituloResultadoPartido1;
    private javax.swing.JLabel jlb_tituloTorneo;
    private javax.swing.JLabel jlb_torneo1;
    private javax.swing.JLabel jlb_torneosDisponibles1;
    private javax.swing.JList<String> jli_historiaPartidos1;
    private javax.swing.JList<String> jli_torneos1;
    private javax.swing.JTextField jtf_ganador1;
    private javax.swing.JTextField jtf_jugador3;
    private javax.swing.JTextField jtf_jugador4;
    private javax.swing.JTextField jtf_tiempo1;
    // End of variables declaration//GEN-END:variables
}
