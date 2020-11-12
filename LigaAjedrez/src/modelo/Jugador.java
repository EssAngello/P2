/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import modelo.Partida;
import modelo.Club;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author juan2
 */
public class Jugador implements Serializable{
    //Contiene usuario y contraseña 
    Entrenamiento e;
    protected String user, passwd, nombre, apellido, telefono, DNI, categoria;
    protected String res_nom = "";
    protected String res_apell = "";
    protected String res_DNI = "";
    protected Club club = null;
    protected ArrayList<Partida> historialPartidas = new ArrayList<Partida>();
    protected ArrayList<Club> historialClubes = new ArrayList<Club>();
    
    Club club0 = new Club("inicial", "Federacion de mi Casa", null, null);
    
    public Jugador (String user, String passwd,String nombre,String apellido,String telefono,String DNI,String categoria){
       this.user = user;
       this.passwd = passwd;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.DNI = DNI;
       this.categoria = categoria;
       
       historialClubes.add(club0);
    }
    
    public boolean identificarse(String u, String p){
        boolean comprobacion = false;
        
        if(u.equals(user)){
            if(p.equals(passwd)){
                comprobacion = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "El usuario o contraseña es incorrecta");
            }
        }
        
        
        return comprobacion;
    }
    
    public boolean comprobarUser(String user){
        boolean comprobacion = false;
        
        if(this.user == user){
            comprobacion = true;
        }
        
        return comprobacion;
    }
    
     public boolean comprobarNombreApellido(String nombre, String apellido){
        boolean comprobacion = false;
        
        if(this.nombre == nombre){
            if(this.apellido == apellido){
                comprobacion = true;
            }
        }
        return comprobacion;
    }
    
    public boolean comprobarExistencia(String user, String passwd,String DNI){
        boolean comprobacion = true;
        if(this.user == user){
            JOptionPane.showMessageDialog(null, "El usuario introducido ya existe, prueba con otro");
            comprobacion = true;
        }
        else if(this.passwd == passwd){
            JOptionPane.showMessageDialog(null, "El password introducido ya existe, prueba con otro");
            comprobacion = true;
        }
        else if(this.DNI == DNI){
            JOptionPane.showMessageDialog(null, "El DNI introducido ya existe, prueba con otro");
            comprobacion = true;
        }
        else
            comprobacion = false;
        
        return comprobacion;
    }
    
    public void desmatricularseClub()
    {
        this.club=null;
    }
    
    public void añadirPartidaHistorial(Partida partida){
        historialPartidas.add(partida);
    }
    
    public ArrayList<Partida> getHistorialPartidas(){
        ArrayList<Partida> listaHistorialPartidas = new ArrayList(historialPartidas);
        return listaHistorialPartidas;
    }
    public ArrayList<Club> getHistorialClubes(){
        ArrayList<Club> listaHistorialClubes = new ArrayList(historialClubes);
        return listaHistorialClubes;
    }
    
    public void InscribirseClub(Club c)
    {
        c.inscribirseClubJugador(this);
        historialClubes.add(c);
        this.club=c;
    }
    
    public Club comprobarClub()
    {
        return club;
    }
    
    public String getUser() {
        return user;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getRes_nom() {
        return res_nom;
    }

    public String getRes_apell() {
        return res_apell;
    }

    public String getRes_DNI() {
        return res_DNI;
    }
    
    public void setRes_nom(String res_nom) {
        this.res_nom = res_nom;
    }

    public void setRes_apell(String res_apell) {
        this.res_apell = res_apell;
    }

    public void setRes_DNI(String res_DNI) {
        this.res_DNI = res_DNI;
    }
    
    public void setClub(Club club) {
        this.club = club;
    }
    

    
    public String getNombreClub()
    {
        return this.club.getNombre();
    }
    
    public String getNombreGerente()
    {
        return this.club.getNombreGerente();
    }
    
    public String getApellidoGerente()
    {
        return this.club.getApellidoGerente();
    }
    
    public String getTelefonoGerente()
    {
        return this.club.getTlfGerente();
    }
    
    public ArrayList getNombresClubesEntrenador()
    {
        return this.club.getNombreClubesEntrenador();
    }
    
    public String getDNIGerente()
    {
        return this.club.getDNIGerente();
    }
    
    public String getNombreEntrenador()
    {
        return this.club.getNombreEntrenador();
    }
    
    public String getApellidoEntrenador()
    {
        return this.club.getApellidoEntrenador();
    }
    
    public String getTelefonoEntrenador()
    {
        return this.club.getTlfEntrenador();
    }
    
    public String getDNIEntrenador()
    {
        return this.club.getDNIEntrenador();
    }
    
    public String getNombreFederacion()
    {
        return this.club.getNombreFederacion();
    }
    
    public ArrayList getEntrenamientosClub()
    {
        return this.club.getEntrenamientos();
    }
    
    public Club getClub()
    {
        return this.club;
    }
    
    public void apuntarseEntrenamiento(Object o)
    {
        Entrenamiento ent = (Entrenamiento)o;
        this.e = ent;
        ent.apuntarJugador(this);
    }
    
    
}
