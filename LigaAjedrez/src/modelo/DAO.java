/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.TimeZone;
import java.util.*;


/**
 *
 * @author juan2
 */
public class DAO {
    Connection conexionBD;
    protected ArrayList<Entrenamiento> entrenamientos = new ArrayList<Entrenamiento>();
    protected ArrayList<Torneo> v_torneos = new ArrayList<Torneo>();
    protected ArrayList<Jugador> v_jugadores = new ArrayList<Jugador>();
    protected ArrayList<Gerente> v_gerentes = new ArrayList<Gerente>();
    protected ArrayList<Entrenador> v_entrenadores = new ArrayList<Entrenador>();
    protected ArrayList<Club> v_clubes = new ArrayList<Club>();
    protected ArrayList<Administrador> v_administradores = new ArrayList<Administrador>();
    
    public DAO() {
        String bd = "jdbc:mysql://localhost/appajedrez?serverTimezone=" + TimeZone.getDefault().getID();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de mysql
            // Conexión usando usuario y clave de administrador de la BD
            conexionBD = DriverManager.getConnection(bd, "root", "root");
        } catch (Exception e) { // Error en la conexión con la BD
            
            System.out.println("Error de conexión" + e);
        }
        cargarDatos();
    }
    
    public void cargarDatos(){
        ResultSet jugadores,jugadores_aux,torneos,gerentes,entrenadores,clubes,clubes_aux,adminnistradores,entrenamientos, partidas;
        jugadores = torneos = gerentes = entrenadores = clubes = clubes_aux = adminnistradores = entrenamientos = partidas = null;
        try {
            String con_jug,con_jug_aux,con_tor, con_ger, con_ent, con_club, con_club_aux, con_adm, con_entre,con_par;
            Statement s = conexionBD.createStatement();
            
            // Consulta SQL
            con_jug = "SELECT * FROM jugador";
            con_jug_aux = "SELECT * FROM jugador j JOIN club c ON j.club = c.nombre";
            con_tor = "SELECT * FROM torneo";
            con_ger = "SELECT * FROM gerente";
            con_ent = "SELECT * FROM entrenador";
            con_club = "SELECT * FROM club";
            con_club_aux = "SELECT * FROM (club c JOIN gerente g ON c.gerente = g.usuario) JOIN entrenador e ON c.entrenador = e.nombre";
            con_adm = "SELECT * FROM administrador";
            con_entre = "SELECT * FROM entrenamiento";
            con_par = "SELECT * FROM partida";
            
            
            
            jugadores = s.executeQuery(con_jug);
            jugadores_aux = s.executeQuery(con_jug_aux);
            torneos = s.executeQuery(con_tor);
            gerentes = s.executeQuery(con_ger);
            entrenadores = s.executeQuery(con_ent);
            clubes = s.executeQuery(con_club);
            clubes_aux = s.executeQuery(con_club_aux);
            adminnistradores = s.executeQuery(con_adm);
            entrenamientos = s.executeQuery(con_entre);
            partidas = s.executeQuery(con_par);
            
            while(clubes_aux.next()){
                String c_nombre = clubes_aux.getString("club.nombre");
                String c_federacion = clubes_aux.getString("club.federacion");
                
                String c_g_user = clubes_aux.getString("gerente.usuario");
                String c_g_passwd = clubes_aux.getString("gerente.contraseña");
                String c_g_nombre = clubes_aux.getString("gerente.nombre");
                String c_g_apellido = clubes_aux.getString("gerente.apellido");
                String c_g_telefono = clubes_aux.getString("gerente.telefono");
                String c_g_DNI = clubes_aux.getString("gerente.DNI");
                String c_g_categoria = clubes_aux.getString("gerente.categoria");
                int c_g_irpf = clubes_aux.getInt("gerente.irpf");
                int c_g_nomina = clubes_aux.getInt("gerente.nomina");
                Gerente c_g = new Gerente(c_g_user,c_g_passwd,c_g_nombre,c_g_apellido,c_g_telefono,c_g_DNI,c_g_categoria);
                c_g.addIrpfs(c_g_irpf);
                c_g.addNominas(c_g_nomina);
                
                String c_e_user = clubes_aux.getString("entrenador.usuario");
                String c_e_passwd = clubes_aux.getString("entrenador.contraseña");
                String c_e_nombre = clubes_aux.getString("entrenador.nombre");
                String c_e_apellido = clubes_aux.getString("entrenador.apellido");
                String c_e_telefono = clubes_aux.getString("entrenador.telefono");
                String c_e_DNI = clubes_aux.getString("entrenador.DNI");
                String c_e_categoria = clubes_aux.getString("entrenador.categoria");
                
                Entrenador c_e = new Entrenador(c_e_user,c_e_passwd,c_e_nombre,c_e_apellido,c_e_telefono,c_e_DNI,c_e_categoria);
                
                
                Club c = new Club(c_nombre, c_federacion, c_e, c_g);
                v_clubes.add(c);
            }
            
            while (jugadores.next()) {
                String j_user = jugadores.getString("usuario");
                String j_passwd = jugadores.getString("contraseña");
                String j_nombre = jugadores.getString("nombre");
                String j_apellido = jugadores.getString("apellido");
                String j_telefono = jugadores.getString("telefono");
                String j_DNI = jugadores.getString("DNI");
                String j_categoria = jugadores.getString("categoria");
                String j_jugador_club = jugadores.getString("club");
                String j_responsable_DNI = jugadores.getString("responsable_DNI");
                
                Jugador j = new Jugador(j_user,j_passwd,j_nombre,j_apellido,j_telefono,j_DNI,j_categoria);
                j.setRes_DNI(j_responsable_DNI);
                v_jugadores.add(j);
                
                Club en_club_def = null;
                for(Club club_aux : v_clubes){
                    if(club_aux.getNombre().equals(j_jugador_club)){
                        en_club_def = club_aux;
                        en_club_def.addJugador(j);
                    }
                }
            }
            
            
            while(torneos.next()){
                String t_nombre = torneos.getString("nombre");
                int t_num_jugadores = torneos.getInt("num_jugadores");
                String t_categoria = torneos.getString("categoria");
                
                Torneo t = new Torneo(t_nombre, t_num_jugadores, t_categoria);
                v_torneos.add(t);
            }
            
            while(partidas.next()){
                String p_jugador = partidas.getString("jugador");
                String p_rival = partidas.getString("rival");
                String p_ganador = partidas.getString("ganador");
                //paso la fecha de SqlDate a Date
                java.sql.Date dbSqlDate = partidas.getDate("fecha");
                java.util.Date dbSqlDateConverted = new java.util.Date(dbSqlDate.getTime());
                String p_torneo = partidas.getString("torneo");
                String p_duracion = partidas.getString("duracion");

                Jugador j1, j2, j3;
                j1 = j2 = j3 = null;
                for(Jugador jugador_aux : v_jugadores){
                    if(jugador_aux.getNombre().equals(p_jugador))
                        j1 = jugador_aux;
                    else if(jugador_aux.getNombre().equals(p_rival))
                        j2 = jugador_aux;
                }
                
                if(p_jugador.equals(p_ganador))
                    j3 = j1;
                else if(p_jugador.equals(p_ganador))
                    j3 = j2;
                
                Torneo to = null;
                for(Torneo torneo_aux : v_torneos){
                    if(torneo_aux.getNombre().equals(p_torneo))
                        to = torneo_aux;
                }
                
                Partida p;
                if(to.getNombre().equals(p_torneo)){
                    p = new Partida(j1,j2,j3,dbSqlDateConverted,to,p_duracion);
                    to.introducirPartidaTorneo(p);
                }
                else
                    p = new Partida(j1,j2,j3,dbSqlDateConverted,to,p_duracion);
            }
            
            while(gerentes.next()){
                String g_user = gerentes.getString("usuario");
                String g_passwd = gerentes.getString("contraseña");
                String g_nombre = gerentes.getString("nombre");
                String g_apellido = gerentes.getString("apellido");
                String g_telefono = gerentes.getString("telefono");
                String g_DNI = gerentes.getString("DNI");
                String g_categoria = gerentes.getString("categoria");
                int g_irpf = gerentes.getInt("irpf");
                int g_nomina = gerentes.getInt("nomina");
                
                Gerente g = new Gerente(g_user,g_passwd,g_nombre,g_apellido,g_telefono,g_DNI,g_categoria);
                g.addIrpfs(g_irpf);
                g.addNominas(g_nomina);
                v_gerentes.add(g);
            }
                        
            while(entrenadores.next()){
                String e_user = entrenadores.getString("usuario");
                String e_passwd = entrenadores.getString("contraseña");
                String e_nombre = entrenadores.getString("nombre");
                String e_apellido = entrenadores.getString("apellido");
                String e_telefono = entrenadores.getString("telefono");
                String e_DNI = entrenadores.getString("DNI");
                String e_categoria = entrenadores.getString("categoria");
                
                Entrenador e = new Entrenador(e_user,e_passwd,e_nombre,e_apellido,e_telefono,e_DNI,e_categoria);
                v_entrenadores.add(e);
            }
            

            

            while(adminnistradores.next()){
                String a_user = adminnistradores.getString("usuario");
                String a_passwd = adminnistradores.getString("contraseña");
                
                Administrador a = new Administrador(a_user,a_passwd);
                v_administradores.add(a);
            }
            
            while(entrenamientos.next()){
                int en_dia = entrenamientos.getInt("dia");
                int en_mes = entrenamientos.getInt("mes");
                int en_año = entrenamientos.getInt("año");
                int en_hora = entrenamientos.getInt("hora");
                int en_minuto = entrenamientos.getInt("minuto");
                int en_segundo = entrenamientos.getInt("segundo");
                String en_club = entrenamientos.getString("club");
                
                Club en_club_def = null;
                for(Club club_aux : v_clubes){
                    if(club_aux.getNombre().equals(en_club)){
                        en_club_def = club_aux;
                        Entrenamiento en = new Entrenamiento(en_club_def,en_dia,en_mes,en_año,en_hora,en_minuto,en_segundo);
                        en_club_def.addEntrenamiento(en);
                    }
                }
            }
            
        } catch (Exception e) { // Error al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
    }
    
    public void realizarBackup(AppAjedrez app){
        try {
            String con_jug,con_tor, con_ger, con_ent, con_club, con_adm, con_entre,con_par;
            
            //tabla de jugador
            ArrayList<Jugador> lista_jugadores = new ArrayList();
            lista_jugadores = app.consultarJugadoresExistentes();
            
            for(Jugador j:lista_jugadores){
                Club j_club = j.getClub();
                String j_jugador_club = j_club.getNombre();
                
                con_jug = "INSERT INTO jugador (usuario, contraseña, nombre, apellido, telefono, DNI, categoria, club, responsable_DNI) "
                    + "VALUES ('"+j.getUser()+"','"+j.getPasswd()+"','"+j.getNombre()+"','"+j.getApellido()+"','"+j.getTelefono()+"','"+j.getDNI()
                    +"','"+j.getCategoria()+"','"+j_jugador_club+"','"+j.getRes_DNI()+"')";
                
                PreparedStatement preparedStmt = conexionBD.prepareStatement(con_jug);
                preparedStmt.executeUpdate();
            }
            
            //tabla de torneo
            ArrayList<Torneo> lista_torneos = new ArrayList();
            lista_torneos = app.consultarTorneosDisponibles();
            
            for(Torneo t:lista_torneos){
                con_tor = "INSERT INTO torneo (nombre, num_jugadores, categoria) VALUES ('"+t.getNombre()+"','"+t.getNum_jugadores()
                        +"','"+t.getCategoria()+"')";
                
                PreparedStatement preparedStmt = conexionBD.prepareStatement(con_tor);
                preparedStmt.executeUpdate();
            }
            
            //tabla de gerente
            ArrayList<Gerente> lista_gerentes = new ArrayList();
            lista_gerentes = app.consultarGerentesExistentes();
            
            for(Gerente g:lista_gerentes){
                con_ger = "INSERT INTO gerente (usuario, contraseña, nombre, apellido, telefono, DNI, categoria, irpf, nomina) VALUES ('"
                        +g.getUser()+"','"+g.getPasswd()+"','"+g.getNombre()+"','"+g.getApellido()+"','"+g.getTelefono()+"','"+g.getDNI()+"','"
                        +g.getCategoria()+"','"+g.getIrpfs()+"','"+g.getNominas()+"')";
                
                PreparedStatement preparedStmt = conexionBD.prepareStatement(con_ger);
                preparedStmt.executeUpdate();
            }
            
            //tabla de entrenador
            ArrayList<Entrenador> lista_entrenadores = new ArrayList();
            lista_entrenadores = app.consultarEntrenadoresExistentes();
            
            for(Entrenador e:lista_entrenadores){
                con_ent = "INSERT INTO entrenador (usuario, contraseña, nombre, apellido, telefono, DNI, categoria) VALUES ('"
                        +e.getUser()+"','"+e.getPasswd()+"','"+e.getNombre()+"','"+e.getApellido()+"','"+e.getTelefono()+"','"+e.getDNI()+"','"
                        +e.getCategoria()+"')";
                
                PreparedStatement preparedStmt = conexionBD.prepareStatement(con_ent);
                preparedStmt.executeUpdate();
            }
            
            //tabla de club
            ArrayList<Club> lista_clubes = new ArrayList();
            lista_clubes = app.consultarClubes();
            
            for(Club c:lista_clubes){
                con_club = "INSERT INTO club (nombre, entrenador, gerente, federacion) VALUES ('"
                        +c.getNombre()+"','"+c.getNombreEntrenador()+"','"+c.getNombreGerente()+"','"+c.getNombreFederacion()+"')";
                
                PreparedStatement preparedStmt = conexionBD.prepareStatement(con_club);
                preparedStmt.executeUpdate();
            }
            
            //tabla de administrador
            ArrayList<Administrador> lista_administradores = new ArrayList();
            lista_administradores = app.getAdmin();
            
            for(Administrador a:lista_administradores){
                con_adm = "INSERT INTO administrador (usuario, contraseña) VALUES ('"+a.getUser()+"','"+a.getPasw()+"')";
                
                PreparedStatement preparedStmt = conexionBD.prepareStatement(con_adm);
                preparedStmt.executeUpdate();
            }
            
            //tabla de entrenamiento
            ArrayList<Entrenamiento> lista_entrenamientos = new ArrayList();
            for(Club c:lista_clubes){
                lista_entrenamientos = c.getEntrenamientos();
                String entre_club = c.getNombre();
                for(Entrenamiento en:lista_entrenamientos){
                    java.util.Date en_fecha = en.getDateTime();
                    int dia = en_fecha.getDay();
                    int mes = en_fecha.getMonth();
                    int año = en_fecha.getYear();
                    int hora = en_fecha.getHours();
                    int minuto = en_fecha.getMinutes();
                    int segundo = en_fecha.getSeconds();
                    con_entre = "INSERT INTO administrador (dia, mes, año, hora, minuto, segundo, club) VALUES ('"
                        +dia+"','"+mes+"','"+año+"','"+hora+"','"+minuto+"','"+segundo+"','"+entre_club+"')";

                    PreparedStatement preparedStmt = conexionBD.prepareStatement(con_entre);
                    preparedStmt.executeUpdate();
                }
            }
            
            //tabla de partida
            ArrayList<Partida> lista_partidas = new ArrayList();
            for(Torneo t:lista_torneos){
                lista_partidas = t.dameParidas();
                String p_torneo = t.getNombre();
                for(Partida p : lista_partidas){
                    con_par = "INSERT INTO administrador (jugador, rival, ganador, fecha, torneo, duracion) VALUES ('"
                        +p.getJugador()+"','"+p.getRival()+"','"+p.getGanador()+"','"+p.getFecha()+"','"+p_torneo+"','"+p.getDuracion()+"')";
                    
                    PreparedStatement preparedStmt = conexionBD.prepareStatement(con_par);
                    preparedStmt.executeUpdate();
                }
            }
        }
        catch(Exception e){ // Error al realizar la operación
            System.out.println("No se ha completado la operación");
        }
    }

    
    /*para pasar los arrays a appAjedrez*/
    public ArrayList<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }

    public ArrayList<Torneo> getV_torneos() {
        return v_torneos;
    }

    public ArrayList<Jugador> getV_jugadores() {
        return v_jugadores;
    }

    public ArrayList<Gerente> getV_gerentes() {
        return v_gerentes;
    }

    public ArrayList<Entrenador> getV_entrenadores() {
        return v_entrenadores;
    }

    public ArrayList<Club> getV_clubes() {
        return v_clubes;
    }

    public ArrayList<Administrador> getV_administradores() {
        return v_administradores;
    }
    

    
}
