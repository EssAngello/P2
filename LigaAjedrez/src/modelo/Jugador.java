/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author juan2
 */
public class Jugador {
    //Contiene usuario y contraseña 
    private String user, passwd, nombre, apellido, telefono, DNI, categoria;
    private String res_nom = "";
    private String res_apell = "";
    private Club club;
    
    public Jugador (String user, String passwd,String nombre,String apellido,String telefono,String DNI,String categoria){
       this.user = user;
       this.passwd = passwd;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.DNI = DNI;
       this.categoria = categoria;
    }
    public boolean identificarse(String u, String p){
        boolean comprobacion = false;
        
        if(u.equals(user)){
            if(p.equals(passwd)){
                System.out.println("He entrado");
                comprobacion = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "El usuario o contraseña es incorrecta");
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

    public void setRes_nom(String res_nom) {
        this.res_nom = res_nom;
    }

    public void setRes_apell(String res_apell) {
        this.res_apell = res_apell;
    }
    
    public void InscribirseClub(Club c)
    {
        c.inscribirseClub(this);
        this.club=c;
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
    
    
    
    
}
