/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author juan2
 */
public class Jugador {
    //Contiene usuario y contraseña 
    private String user, passwd, nombre, apellido, telefono, DNI, categoria;
    
    public Jugador (String user, String passwd,String nombre,String apellido,String telefono,String DNI,String categoria){
       this.user = user;
       this.passwd = passwd;
       this.nombre = nombre;
       this.apellido = apellido;
       if(telefono.length() == 9){
            this.telefono = telefono;
       }
       else
           JOptionPane.showMessageDialog(null, "Numero de digitos incorrectos, debes poner 9");
       
       if(DNI.length() == 9){
            this.DNI = DNI;
       }
       else
           JOptionPane.showMessageDialog(null, "DNI incorrecto, debes incluir 8 digitos y 1 letra");
       this.categoria = categoria;
    }
    public boolean identificarse(String u, String p){
        boolean comprobacion = false;
        
        if(u.equals(user)){
            if(p.equals(passwd)){
                comprobacion = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "La contraseña introducida es incorrecta");
            }
        }else
        {
            System.out.print(u);
            JOptionPane.showMessageDialog(null, "El usuario introducido no existe");
        }
        
        return comprobacion;
    }
    public void comprobarValoresCorrectos(){
        
    }
}
