/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

import java.util.Hashtable;
/**
 *
 * @author juan2
 */
public class Jugador {
    private Hashtable<String, String> ht;
    public Jugador (){
        ht = new Hashtable<String, String>();
        ht.put("Maricel", "123456");
        ht.put("Juan", "jefe");
        ht.put("Gerente", "gerente");
    }
    public boolean identificarse(String u, String p){
        boolean comprobacion = false;
        
        if(ht.get(u) == null){
            JOptionPane.showMessageDialog(null, "EL USUARIO INTRODUCIDO NO EXISTE");
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
}
