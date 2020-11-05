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
    protected AppAjedrez app;
    private Hashtable<String, String> ht;
    public Administrador (){
        ht = new Hashtable<String, String>();
        ht.put("Root", "root");
    }
    public boolean identificarse(String u, String p){
        boolean comprobacion = false;
        
        if(ht.get(u) == null){
            JOptionPane.showMessageDialog(null, "ESTE ADMINISTRADOR NO EXISTE");
        }
        else{
            if(ht.get(u).equals(p)){
                comprobacion = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "LA CONTRASEÑA INTRODUCIDA ES INCORRECTA");
            }
        }
        return comprobacion;
    }
    
    public void craerJugador(String user, String passwd, String nombre, String apellido, String telefono, String dni, String categoria)
    {
        //app.registrarse(user, passwd, nombre, apellido, telefono, dni, categoria, dni, apellido);
    }  
    
    public void eliminarJugador(Jugador j)
    {
        app.eliminarJugador(j);
    }
}
