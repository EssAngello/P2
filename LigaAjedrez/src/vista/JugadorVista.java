/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.AppAjedrez;
import modelo.Club;
import modelo.Jugador; 
/**
 *
 * @author aurel
 */
public class JugadorVista extends javax.swing.JFrame {

    //Maricel
    private ClubVista clubVista;
    private TorneoVista t;
    private Jugador jugador;
    private Club club;
    /**
     * Creates new form Jugador
     */
    public JugadorVista(Jugador j) {
        initComponents();
        this.jugador = j;
        club = jugador.comprobarClub();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InscribirseClubJugador = new javax.swing.JFrame();
        jlb_tituloInscribirseClub1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jli_clubes1 = new javax.swing.JList<>();
        jbt_volver1 = new javax.swing.JButton();
        jbt_inscribirse1 = new javax.swing.JButton();
        HistorialClubesJugador = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        jli_historialClubes1 = new javax.swing.JList<>();
        jlb_tituloHistorial1 = new javax.swing.JLabel();
        jbt_volverHistorial1 = new javax.swing.JButton();
        Tarjeta_personal = new javax.swing.JFrame();
        jbt_titulo1 = new javax.swing.JLabel();
        jlb_nombre1 = new javax.swing.JLabel();
        jlb_apellidos1 = new javax.swing.JLabel();
        jlb_dni1 = new javax.swing.JLabel();
        jlb_telefono1 = new javax.swing.JLabel();
        jlb_categoria1 = new javax.swing.JLabel();
        jlb_elo1 = new javax.swing.JLabel();
        jlb_nombreRespuesta1 = new javax.swing.JLabel();
        jlb_apellidoRespuesta1 = new javax.swing.JLabel();
        JLB_dniRespuesta1 = new javax.swing.JLabel();
        jlb_telefonoRespuesta1 = new javax.swing.JLabel();
        jlb_categoriaRespuesta1 = new javax.swing.JLabel();
        jlb_eloRespuesta1 = new javax.swing.JLabel();
        jb_atras1 = new javax.swing.JButton();
        Responsable = new javax.swing.JFrame();
        jlb_Responsable1 = new javax.swing.JLabel();
        jlb_nombreResponsable1 = new javax.swing.JLabel();
        jlb_apellidoResponsable1 = new javax.swing.JLabel();
        jlb_apellidoJugador1 = new javax.swing.JLabel();
        jbt_okResponsable1 = new javax.swing.JButton();
        jlb_nombreJugador1 = new javax.swing.JLabel();
        jlb_JugadorInfantil1 = new javax.swing.JLabel();
        jlb_responsable_nombre = new javax.swing.JLabel();
        jlb_responsable_apellido = new javax.swing.JLabel();
        jlb_jugador_nombre = new javax.swing.JLabel();
        jlb_jugador_apellido = new javax.swing.JLabel();
        jl_titulo = new javax.swing.JLabel();
        jbt_club = new javax.swing.JButton();
        jbt_torneo = new javax.swing.JButton();
        jbt_historial_clubes = new javax.swing.JButton();
        jbt_tarjeta = new javax.swing.JButton();
        jbt_salir = new javax.swing.JButton();
        jbt_responsable = new javax.swing.JButton();
        jlb_categoriaJugador = new javax.swing.JLabel();
        jlb_tipoCategoriaJugador = new javax.swing.JLabel();
        jbt_sedeDelClub = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jlb_tituloInscribirseClub1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloInscribirseClub1.setText("Inscribirse club");

        jli_clubes1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jli_clubes1);

        jbt_volver1.setText("volver");
        jbt_volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volver1ActionPerformed(evt);
            }
        });

        jbt_inscribirse1.setText("inscribirse");
        jbt_inscribirse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_inscribirse1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InscribirseClubJugadorLayout = new javax.swing.GroupLayout(InscribirseClubJugador.getContentPane());
        InscribirseClubJugador.getContentPane().setLayout(InscribirseClubJugadorLayout);
        InscribirseClubJugadorLayout.setHorizontalGroup(
            InscribirseClubJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscribirseClubJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbt_volver1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_inscribirse1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InscribirseClubJugadorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InscribirseClubJugadorLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jlb_tituloInscribirseClub1)
                .addGap(97, 97, 97))
        );
        InscribirseClubJugadorLayout.setVerticalGroup(
            InscribirseClubJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscribirseClubJugadorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlb_tituloInscribirseClub1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(InscribirseClubJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_inscribirse1)
                    .addComponent(jbt_volver1))
                .addContainerGap())
        );

        jli_historialClubes1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jli_historialClubes1);

        jlb_tituloHistorial1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloHistorial1.setText("Historial Clubes");

        jbt_volverHistorial1.setText("volver");
        jbt_volverHistorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volverHistorial1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HistorialClubesJugadorLayout = new javax.swing.GroupLayout(HistorialClubesJugador.getContentPane());
        HistorialClubesJugador.getContentPane().setLayout(HistorialClubesJugadorLayout);
        HistorialClubesJugadorLayout.setHorizontalGroup(
            HistorialClubesJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistorialClubesJugadorLayout.createSequentialGroup()
                .addGroup(HistorialClubesJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HistorialClubesJugadorLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HistorialClubesJugadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbt_volverHistorial1)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistorialClubesJugadorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlb_tituloHistorial1)
                .addGap(76, 76, 76))
        );
        HistorialClubesJugadorLayout.setVerticalGroup(
            HistorialClubesJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistorialClubesJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_tituloHistorial1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jbt_volverHistorial1)
                .addContainerGap())
        );

        jbt_titulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbt_titulo1.setText("TARJETA PERSONAL");

        jlb_nombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_nombre1.setText("Nombre:");

        jlb_apellidos1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_apellidos1.setText("Apellidos:");

        jlb_dni1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_dni1.setText("DNI/NIE:");

        jlb_telefono1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_telefono1.setText("Telefono:");

        jlb_categoria1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_categoria1.setText("Categoria:");

        jlb_elo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_elo1.setText("Elo:");

        jlb_nombreRespuesta1.setText("jLabel1");

        jlb_apellidoRespuesta1.setText("jLabel4");

        JLB_dniRespuesta1.setText("jLabel5");

        jlb_telefonoRespuesta1.setText("jLabel6");

        jlb_categoriaRespuesta1.setText("jLabel7");

        jlb_eloRespuesta1.setText("jLabel8");

        jb_atras1.setText("Atrás");
        jb_atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_atras1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Tarjeta_personalLayout = new javax.swing.GroupLayout(Tarjeta_personal.getContentPane());
        Tarjeta_personal.getContentPane().setLayout(Tarjeta_personalLayout);
        Tarjeta_personalLayout.setHorizontalGroup(
            Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tarjeta_personalLayout.createSequentialGroup()
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tarjeta_personalLayout.createSequentialGroup()
                        .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Tarjeta_personalLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jbt_titulo1))
                            .addGroup(Tarjeta_personalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlb_elo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb_categoria1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb_telefono1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb_dni1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb_apellidos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb_nombre1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(81, 81, 81)
                                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_nombreRespuesta1)
                                    .addComponent(jlb_apellidoRespuesta1)
                                    .addComponent(JLB_dniRespuesta1)
                                    .addComponent(jlb_telefonoRespuesta1)
                                    .addComponent(jlb_categoriaRespuesta1)
                                    .addComponent(jlb_eloRespuesta1))))
                        .addGap(0, 88, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tarjeta_personalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_atras1)))
                .addContainerGap())
        );
        Tarjeta_personalLayout.setVerticalGroup(
            Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tarjeta_personalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbt_titulo1)
                .addGap(18, 18, 18)
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nombre1)
                    .addComponent(jlb_nombreRespuesta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_apellidos1)
                    .addComponent(jlb_apellidoRespuesta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_dni1)
                    .addComponent(JLB_dniRespuesta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_telefono1)
                    .addComponent(jlb_telefonoRespuesta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_categoria1)
                    .addComponent(jlb_categoriaRespuesta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_elo1)
                    .addComponent(jlb_eloRespuesta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jb_atras1)
                .addContainerGap())
        );

        jlb_Responsable1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jlb_Responsable1.setText("Responsable");

        jlb_nombreResponsable1.setText("Nombre");

        jlb_apellidoResponsable1.setText("Apellido");

        jlb_apellidoJugador1.setText("Apellido");

        jbt_okResponsable1.setText("OK");
        jbt_okResponsable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_okResponsable1ActionPerformed(evt);
            }
        });

        jlb_nombreJugador1.setText("Nombre");

        jlb_JugadorInfantil1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jlb_JugadorInfantil1.setText("Jugador Infantil");

        jlb_responsable_nombre.setText("jLabel1");

        jlb_responsable_apellido.setText("jLabel1");

        jlb_jugador_nombre.setText("jLabel1");

        jlb_jugador_apellido.setText("jLabel2");

        javax.swing.GroupLayout ResponsableLayout = new javax.swing.GroupLayout(Responsable.getContentPane());
        Responsable.getContentPane().setLayout(ResponsableLayout);
        ResponsableLayout.setHorizontalGroup(
            ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResponsableLayout.createSequentialGroup()
                .addGroup(ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResponsableLayout.createSequentialGroup()
                        .addGroup(ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResponsableLayout.createSequentialGroup()
                                .addGroup(ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ResponsableLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(jlb_nombreJugador1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlb_jugador_nombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResponsableLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jlb_JugadorInfantil1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112)))
                                .addComponent(jlb_apellidoJugador1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResponsableLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ResponsableLayout.createSequentialGroup()
                                        .addComponent(jlb_nombreResponsable1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlb_responsable_nombre)
                                        .addGap(81, 81, 81))
                                    .addGroup(ResponsableLayout.createSequentialGroup()
                                        .addComponent(jlb_Responsable1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112)))
                                .addComponent(jlb_apellidoResponsable1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_responsable_apellido)
                            .addComponent(jlb_jugador_apellido)))
                    .addGroup(ResponsableLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jbt_okResponsable1)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        ResponsableLayout.setVerticalGroup(
            ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResponsableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_Responsable1)
                .addGap(31, 31, 31)
                .addGroup(ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nombreResponsable1)
                    .addComponent(jlb_apellidoResponsable1)
                    .addComponent(jlb_responsable_nombre)
                    .addComponent(jlb_responsable_apellido))
                .addGap(56, 56, 56)
                .addComponent(jlb_JugadorInfantil1)
                .addGap(39, 39, 39)
                .addGroup(ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nombreJugador1)
                    .addComponent(jlb_apellidoJugador1)
                    .addComponent(jlb_jugador_nombre)
                    .addComponent(jlb_jugador_apellido))
                .addGap(40, 40, 40)
                .addComponent(jbt_okResponsable1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_titulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jl_titulo.setText("JUGADOR");

        jbt_club.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbt_club.setText("Inscribirse Club");
        jbt_club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_clubActionPerformed(evt);
            }
        });

        jbt_torneo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbt_torneo.setText("Torneo");
        jbt_torneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_torneoActionPerformed(evt);
            }
        });

        jbt_historial_clubes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbt_historial_clubes.setText("Historial Clubes");
        jbt_historial_clubes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_historial_clubesActionPerformed(evt);
            }
        });

        jbt_tarjeta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbt_tarjeta.setText("Tarjeta Personal");
        jbt_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tarjetaActionPerformed(evt);
            }
        });

        jbt_salir.setText("SALIR");
        jbt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_salirActionPerformed(evt);
            }
        });

        jbt_responsable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbt_responsable.setText("Responsable");
        jbt_responsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_responsableActionPerformed(evt);
            }
        });

        jlb_categoriaJugador.setText("categoria:");

        jlb_tipoCategoriaJugador.setText("tipo de categoria");

        jbt_sedeDelClub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbt_sedeDelClub.setText("Sede del Club");
        jbt_sedeDelClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_sedeDelClubActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Darse de baja club");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbt_club, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jbt_torneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbt_historial_clubes, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jbt_tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jlb_categoriaJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlb_tipoCategoriaJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbt_salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jl_titulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jbt_sedeDelClub, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbt_responsable, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_club)
                    .addComponent(jbt_historial_clubes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_torneo)
                    .addComponent(jbt_tarjeta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbt_responsable)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jbt_sedeDelClub)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_salir)
                    .addComponent(jlb_categoriaJugador)
                    .addComponent(jlb_tipoCategoriaJugador))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_responsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_responsableActionPerformed
        // Maricel
        jlb_responsable_nombre.setText(jugador.getRes_nom());
        jlb_responsable_apellido.setText(jugador.getRes_apell());
        jlb_jugador_nombre.setText(jugador.getNombre());
        jlb_jugador_apellido.setText(jugador.getApellido());
        this.setVisible(false);
        Responsable.setVisible(true);
        Responsable.setSize(400,400);
    }//GEN-LAST:event_jbt_responsableActionPerformed

    private void jbt_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tarjetaActionPerformed
        // Maricel
        jlb_nombreRespuesta1.setText(jugador.getNombre());
        jlb_apellidoRespuesta1.setText(jugador.getApellido());
        JLB_dniRespuesta1.setText(jugador.getDNI());
        jlb_telefonoRespuesta1.setText(jugador.getTelefono());
        jlb_categoriaRespuesta1.setText(jugador.getCategoria());
        //Falta el elo
        this.setVisible(false);
        Tarjeta_personal.setVisible(true);
        Tarjeta_personal.setSize(400,400);
    }//GEN-LAST:event_jbt_tarjetaActionPerformed

    private void jtf_apellidoJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_apellidoJugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_apellidoJugador1ActionPerformed

    private void jbt_torneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_torneoActionPerformed
        //Maricel
        t = new TorneoVista(2,jugador);
        t.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbt_torneoActionPerformed

    private void jbt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_salirActionPerformed
         // Maricel
        System.exit(0);
    }//GEN-LAST:event_jbt_salirActionPerformed

    private void jbt_sedeDelClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_sedeDelClubActionPerformed
        // Mricel
        clubVista = new ClubVista(2,jugador);
        clubVista.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jbt_sedeDelClubActionPerformed

    private void jb_atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_atras1ActionPerformed
        // Maricel
        Tarjeta_personal.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jb_atras1ActionPerformed

    private void jbt_historial_clubesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_historial_clubesActionPerformed
        DefaultListModel modeloListaHistorialClubes = new DefaultListModel();
        jli_historialClubes1.setModel(modeloListaHistorialClubes);
        
        listaHistorialClubes = jugador.getHistorialClubes();

        if(!listaHistorialClubes.isEmpty()){
            for(Object historialClub :listaHistorialClubes){
                modeloListaHistorialClubes.addElement(historialClub);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "No hay partidas");
        }
        this.setVisible(false);
        HistorialClubesJugador.setVisible(true);
        HistorialClubesJugador.setSize(400,400);
    }//GEN-LAST:event_jbt_historial_clubesActionPerformed

    private void jbt_volverHistorial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volverHistorial1ActionPerformed
        // Maricel
        HistorialClubesJugador.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_volverHistorial1ActionPerformed

    private void jbt_clubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_clubActionPerformed
        DefaultListModel modeloListaClubes = new DefaultListModel();
        jli_clubes1.setModel(modeloListaClubes);

        listaClubes = appAjedrez.consultarClubes();
        
        if(!listaClubes.isEmpty()){
            for(Object club:listaClubes){
                modeloListaClubes.addElement(club);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "No hay clubes disponibles");
        }
        // Maricel
        this.setVisible(false);
        InscribirseClubJugador.setVisible(true);
        InscribirseClubJugador.setSize(400,400);
    }//GEN-LAST:event_jbt_clubActionPerformed

    private void jbt_volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volver1ActionPerformed
        // Maricel
        InscribirseClubJugador.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_volver1ActionPerformed

    private void jbt_inscribirse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_inscribirse1ActionPerformed
        clubObject = (Object)jli_clubes1.getSelectedValue();
        
        if(clubObject == null){
            JOptionPane.showMessageDialog(this,"Selecciona un club");
        }
        //else{
            club = (Club)clubObject;
            club.inscribirseClub(jugador);
            jugador.InscribirseClub(club);
            InscribirseClubJugador.setVisible(false);
            this.setVisible(true);
        //}

    }//GEN-LAST:event_jbt_inscribirse1ActionPerformed

    private void jbt_okResponsable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_okResponsable1ActionPerformed
        // Maricel
        Responsable.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jbt_okResponsable1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Maricel
        int aux = JOptionPane.showConfirmDialog(this,"Seguro que quieres darte de baja del club");
        if(aux == 0)
        {
            if(club.darseBaja(jugador) == false){
                JOptionPane.showMessageDialog(this,"No estas inscrito en ningun club");
            }
            else{
                JOptionPane.showMessageDialog(this,"Te has dado de alta");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame HistorialClubesJugador;
    private javax.swing.JFrame InscribirseClubJugador;
    private javax.swing.JLabel JLB_dniRespuesta1;
    private javax.swing.JFrame Responsable;
    private javax.swing.JFrame Tarjeta_personal;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jb_atras1;
    private javax.swing.JButton jbt_club;
    private javax.swing.JButton jbt_historial_clubes;
    private javax.swing.JButton jbt_inscribirse1;
    private javax.swing.JButton jbt_okResponsable1;
    private javax.swing.JButton jbt_responsable;
    private javax.swing.JButton jbt_salir;
    private javax.swing.JButton jbt_sedeDelClub;
    private javax.swing.JButton jbt_tarjeta;
    private javax.swing.JLabel jbt_titulo1;
    private javax.swing.JButton jbt_torneo;
    private javax.swing.JButton jbt_volver1;
    private javax.swing.JButton jbt_volverHistorial1;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jlb_JugadorInfantil1;
    private javax.swing.JLabel jlb_Responsable1;
    private javax.swing.JLabel jlb_apellidoJugador1;
    private javax.swing.JLabel jlb_apellidoResponsable1;
    private javax.swing.JLabel jlb_apellidoRespuesta1;
    private javax.swing.JLabel jlb_apellidos1;
    private javax.swing.JLabel jlb_categoria1;
    private javax.swing.JLabel jlb_categoriaJugador;
    private javax.swing.JLabel jlb_categoriaRespuesta1;
    private javax.swing.JLabel jlb_dni1;
    private javax.swing.JLabel jlb_elo1;
    private javax.swing.JLabel jlb_eloRespuesta1;
    private javax.swing.JLabel jlb_jugador_apellido;
    private javax.swing.JLabel jlb_jugador_nombre;
    private javax.swing.JLabel jlb_nombre1;
    private javax.swing.JLabel jlb_nombreJugador1;
    private javax.swing.JLabel jlb_nombreResponsable1;
    private javax.swing.JLabel jlb_nombreRespuesta1;
    private javax.swing.JLabel jlb_responsable_apellido;
    private javax.swing.JLabel jlb_responsable_nombre;
    private javax.swing.JLabel jlb_telefono1;
    private javax.swing.JLabel jlb_telefonoRespuesta1;
    private javax.swing.JLabel jlb_tipoCategoriaJugador;
    private javax.swing.JLabel jlb_tituloHistorial1;
    private javax.swing.JLabel jlb_tituloInscribirseClub1;
    private javax.swing.JList<String> jli_clubes1;
    private javax.swing.JList<String> jli_historialClubes1;
    // End of variables declaration//GEN-END:variables
    private ArrayList listaClubes;
    protected AppAjedrez appAjedrez;
    protected Object clubObject;
    protected ArrayList listaHistorialClubes;
}
