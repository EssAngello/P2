/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author aurel
 */
public class Jugador extends javax.swing.JFrame {

    /**
     * Creates new form Jugador
     */
    public Jugador() {
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

        InscribirseClubJugador = new javax.swing.JPanel();
        jbt_volver = new javax.swing.JButton();
        jbt_inscribirse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jli_clubes = new javax.swing.JList<>();
        jlb_tituloInscribirseClub = new javax.swing.JLabel();
        HistorialClubesJugador = new javax.swing.JPanel();
        jbt_volverHistorial = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jli_historialClubes = new javax.swing.JList<>();
        jlb_tituloHistorial = new javax.swing.JLabel();
        Tarjeta_personal = new javax.swing.JPanel();
        jbt_titulo = new javax.swing.JLabel();
        jlb_nombre = new javax.swing.JLabel();
        jlb_apellidos = new javax.swing.JLabel();
        jlb_dni = new javax.swing.JLabel();
        jlb_telefono = new javax.swing.JLabel();
        jlb_categoria = new javax.swing.JLabel();
        jb_atras = new javax.swing.JButton();
        jlb_elo = new javax.swing.JLabel();
        jlb_nombreRespuesta = new javax.swing.JLabel();
        jlb_apellidoRespuesta = new javax.swing.JLabel();
        JLB_dniRespuesta = new javax.swing.JLabel();
        jlb_telefonoRespuesta = new javax.swing.JLabel();
        jlb_categoriaRespuesta = new javax.swing.JLabel();
        jlb_eloRespuesta = new javax.swing.JLabel();
        Responsable = new javax.swing.JPanel();
        jbt_okResponsable = new javax.swing.JButton();
        jtf_nombreJugador = new javax.swing.JTextField();
        jlb_nombreJugador = new javax.swing.JLabel();
        jlb_JugadorInfantil = new javax.swing.JLabel();
        jlb_apellidoJugador = new javax.swing.JLabel();
        jtf_apellidoJugador = new javax.swing.JTextField();
        jtf_apellidoResponsable = new javax.swing.JTextField();
        jlb_apellidoResponsable = new javax.swing.JLabel();
        jtf_nombreResponsable = new javax.swing.JTextField();
        jlb_nombreResponsable = new javax.swing.JLabel();
        jlb_Responsable = new javax.swing.JLabel();
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

        jbt_volver.setText("volver");

        jbt_inscribirse.setText("inscribirse");

        jli_clubes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jli_clubes);

        jlb_tituloInscribirseClub.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloInscribirseClub.setText("Inscribirse club");

        javax.swing.GroupLayout InscribirseClubJugadorLayout = new javax.swing.GroupLayout(InscribirseClubJugador);
        InscribirseClubJugador.setLayout(InscribirseClubJugadorLayout);
        InscribirseClubJugadorLayout.setHorizontalGroup(
            InscribirseClubJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscribirseClubJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbt_volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_inscribirse)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InscribirseClubJugadorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InscribirseClubJugadorLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jlb_tituloInscribirseClub)
                .addGap(97, 97, 97))
        );
        InscribirseClubJugadorLayout.setVerticalGroup(
            InscribirseClubJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscribirseClubJugadorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlb_tituloInscribirseClub)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(InscribirseClubJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_inscribirse)
                    .addComponent(jbt_volver))
                .addContainerGap())
        );

        jbt_volverHistorial.setText("volver");

        jli_historialClubes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jli_historialClubes);

        jlb_tituloHistorial.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlb_tituloHistorial.setText("Historial Clubes");

        javax.swing.GroupLayout HistorialClubesJugadorLayout = new javax.swing.GroupLayout(HistorialClubesJugador);
        HistorialClubesJugador.setLayout(HistorialClubesJugadorLayout);
        HistorialClubesJugadorLayout.setHorizontalGroup(
            HistorialClubesJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistorialClubesJugadorLayout.createSequentialGroup()
                .addGroup(HistorialClubesJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HistorialClubesJugadorLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HistorialClubesJugadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbt_volverHistorial)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistorialClubesJugadorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlb_tituloHistorial)
                .addGap(76, 76, 76))
        );
        HistorialClubesJugadorLayout.setVerticalGroup(
            HistorialClubesJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistorialClubesJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_tituloHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jbt_volverHistorial)
                .addContainerGap())
        );

        jbt_titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbt_titulo.setText("TARJETA PERSONAL");

        jlb_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_nombre.setText("Nombre:");

        jlb_apellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_apellidos.setText("Apellidos:");

        jlb_dni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_dni.setText("DNI/NIE:");

        jlb_telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_telefono.setText("Telefono:");

        jlb_categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_categoria.setText("Categoria:");

        jb_atras.setText("Atrás");

        jlb_elo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_elo.setText("Elo:");

        jlb_nombreRespuesta.setText("jLabel1");

        jlb_apellidoRespuesta.setText("jLabel4");

        JLB_dniRespuesta.setText("jLabel5");

        jlb_telefonoRespuesta.setText("jLabel6");

        jlb_categoriaRespuesta.setText("jLabel7");

        jlb_eloRespuesta.setText("jLabel8");

        javax.swing.GroupLayout Tarjeta_personalLayout = new javax.swing.GroupLayout(Tarjeta_personal);
        Tarjeta_personal.setLayout(Tarjeta_personalLayout);
        Tarjeta_personalLayout.setHorizontalGroup(
            Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tarjeta_personalLayout.createSequentialGroup()
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tarjeta_personalLayout.createSequentialGroup()
                        .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Tarjeta_personalLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jbt_titulo))
                            .addGroup(Tarjeta_personalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlb_elo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb_categoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb_telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb_dni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb_apellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlb_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(81, 81, 81)
                                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_nombreRespuesta)
                                    .addComponent(jlb_apellidoRespuesta)
                                    .addComponent(JLB_dniRespuesta)
                                    .addComponent(jlb_telefonoRespuesta)
                                    .addComponent(jlb_categoriaRespuesta)
                                    .addComponent(jlb_eloRespuesta))))
                        .addGap(0, 88, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tarjeta_personalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_atras)))
                .addContainerGap())
        );
        Tarjeta_personalLayout.setVerticalGroup(
            Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tarjeta_personalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbt_titulo)
                .addGap(18, 18, 18)
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nombre)
                    .addComponent(jlb_nombreRespuesta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_apellidos)
                    .addComponent(jlb_apellidoRespuesta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_dni)
                    .addComponent(JLB_dniRespuesta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_telefono)
                    .addComponent(jlb_telefonoRespuesta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_categoria)
                    .addComponent(jlb_categoriaRespuesta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Tarjeta_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_elo)
                    .addComponent(jlb_eloRespuesta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jb_atras)
                .addContainerGap())
        );

        jbt_okResponsable.setText("OK");

        jtf_nombreJugador.setText("jTextField3");

        jlb_nombreJugador.setText("Nombre");

        jlb_JugadorInfantil.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jlb_JugadorInfantil.setText("Jugador Infantil");

        jlb_apellidoJugador.setText("Apellido");

        jtf_apellidoJugador.setText("jTextField4");
        jtf_apellidoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_apellidoJugadorActionPerformed(evt);
            }
        });

        jtf_apellidoResponsable.setText("jTextField2");

        jlb_apellidoResponsable.setText("Apellido");

        jtf_nombreResponsable.setText("jTextField1");

        jlb_nombreResponsable.setText("Nombre");

        jlb_Responsable.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jlb_Responsable.setText("Responsable");

        javax.swing.GroupLayout ResponsableLayout = new javax.swing.GroupLayout(Responsable);
        Responsable.setLayout(ResponsableLayout);
        ResponsableLayout.setHorizontalGroup(
            ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResponsableLayout.createSequentialGroup()
                .addGroup(ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ResponsableLayout.createSequentialGroup()
                            .addGroup(ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ResponsableLayout.createSequentialGroup()
                                    .addGap(101, 101, 101)
                                    .addComponent(jlb_nombreJugador)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtf_nombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResponsableLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jlb_JugadorInfantil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(112, 112, 112)))
                            .addComponent(jlb_apellidoJugador)
                            .addGap(32, 32, 32)
                            .addComponent(jtf_apellidoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ResponsableLayout.createSequentialGroup()
                            .addGap(221, 221, 221)
                            .addComponent(jbt_okResponsable)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResponsableLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ResponsableLayout.createSequentialGroup()
                                .addComponent(jlb_nombreResponsable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_nombreResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addGroup(ResponsableLayout.createSequentialGroup()
                                .addComponent(jlb_Responsable, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)))
                        .addComponent(jlb_apellidoResponsable)
                        .addGap(32, 32, 32)
                        .addComponent(jtf_apellidoResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        ResponsableLayout.setVerticalGroup(
            ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResponsableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_Responsable)
                .addGap(28, 28, 28)
                .addGroup(ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nombreResponsable)
                    .addComponent(jlb_apellidoResponsable)
                    .addComponent(jtf_nombreResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_apellidoResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jlb_JugadorInfantil)
                .addGap(36, 36, 36)
                .addGroup(ResponsableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nombreJugador)
                    .addComponent(jlb_apellidoJugador)
                    .addComponent(jtf_nombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_apellidoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jbt_okResponsable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_titulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jl_titulo.setText("JUGADOR");

        jbt_club.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbt_club.setText("Inscribirse Club");

        jbt_torneo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbt_torneo.setText("Torneo");

        jbt_historial_clubes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbt_historial_clubes.setText("Historial Clubes");

        jbt_tarjeta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbt_tarjeta.setText("Tarjeta Personal");
        jbt_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_tarjetaActionPerformed(evt);
            }
        });

        jbt_salir.setText("SALIR");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbt_club, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jbt_torneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbt_historial_clubes, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jbt_tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jlb_categoriaJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlb_tipoCategoriaJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbt_salir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jl_titulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbt_responsable, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jbt_sedeDelClub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jbt_responsable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_responsableActionPerformed

    private void jbt_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_tarjetaActionPerformed

    private void jtf_apellidoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_apellidoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_apellidoJugadorActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HistorialClubesJugador;
    private javax.swing.JPanel InscribirseClubJugador;
    private javax.swing.JLabel JLB_dniRespuesta;
    private javax.swing.JPanel Responsable;
    private javax.swing.JPanel Tarjeta_personal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_atras;
    private javax.swing.JButton jbt_club;
    private javax.swing.JButton jbt_historial_clubes;
    private javax.swing.JButton jbt_inscribirse;
    private javax.swing.JButton jbt_okResponsable;
    private javax.swing.JButton jbt_responsable;
    private javax.swing.JButton jbt_salir;
    private javax.swing.JButton jbt_sedeDelClub;
    private javax.swing.JButton jbt_tarjeta;
    private javax.swing.JLabel jbt_titulo;
    private javax.swing.JButton jbt_torneo;
    private javax.swing.JButton jbt_volver;
    private javax.swing.JButton jbt_volverHistorial;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jlb_JugadorInfantil;
    private javax.swing.JLabel jlb_Responsable;
    private javax.swing.JLabel jlb_apellidoJugador;
    private javax.swing.JLabel jlb_apellidoResponsable;
    private javax.swing.JLabel jlb_apellidoRespuesta;
    private javax.swing.JLabel jlb_apellidos;
    private javax.swing.JLabel jlb_categoria;
    private javax.swing.JLabel jlb_categoriaJugador;
    private javax.swing.JLabel jlb_categoriaRespuesta;
    private javax.swing.JLabel jlb_dni;
    private javax.swing.JLabel jlb_elo;
    private javax.swing.JLabel jlb_eloRespuesta;
    private javax.swing.JLabel jlb_nombre;
    private javax.swing.JLabel jlb_nombreJugador;
    private javax.swing.JLabel jlb_nombreResponsable;
    private javax.swing.JLabel jlb_nombreRespuesta;
    private javax.swing.JLabel jlb_telefono;
    private javax.swing.JLabel jlb_telefonoRespuesta;
    private javax.swing.JLabel jlb_tipoCategoriaJugador;
    private javax.swing.JLabel jlb_tituloHistorial;
    private javax.swing.JLabel jlb_tituloInscribirseClub;
    private javax.swing.JList<String> jli_clubes;
    private javax.swing.JList<String> jli_historialClubes;
    private javax.swing.JTextField jtf_apellidoJugador;
    private javax.swing.JTextField jtf_apellidoResponsable;
    private javax.swing.JTextField jtf_nombreJugador;
    private javax.swing.JTextField jtf_nombreResponsable;
    // End of variables declaration//GEN-END:variables
}
