/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aurel
 */
public class Gerente extends Jugador{
    
    public Gerente(String user, String passwd,String nombre,String apellido,String telefono,String DNI,String categoria){
        super( user,  passwd, nombre, apellido, telefono, DNI, categoria);
    }
}
