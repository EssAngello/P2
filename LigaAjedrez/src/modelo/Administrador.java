/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Hashtable;
import javax.swing.JOptionPane;

/**
 *
 * @author juan2
 */
public class Administrador {
    private Hashtable<String, String> ht;
    String user,pasw;
    //private AppAjedrez app;
    
    public Administrador (String user, String pasw){
        this.user = user;
        this.pasw = pasw;
    }

    public String getUser() {
        return user;
    }

    public String getPasw() {
        return pasw;
    }
    
    public boolean identificarse(String u, String p){
        boolean comprobacion = false;
        
        if(u.equals(user)){
            if(p.equals(pasw)){
                comprobacion = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "El usuario o contraseña es incorrecta");
            }
        }
        return comprobacion;
    }
    
    /*public void crearClub(String nombre, String federeacion)
    {
        app.crearClub(nombre, federeacion);
    }*/
    
    /*public void eliminarClub(Club c)
    {
        app.eliminarClub(c);
    }*/
    
  /*  public void craerJugador(String user, String passwd, String nombre, String apellido, String telefono, String dni, String categoria)
    {
        //app.registrarse(user, passwd, nombre, apellido, telefono, dni, categoria, dni, apellido);
    }  
    
    public void eliminarJugador(Jugador j)
    {
        app.eliminarJugador(j);
    }
*/
}
