/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aurel
 */
public class Gerente extends Jugador{
    protected ArrayList<Integer>irpfs= new ArrayList<Integer>();
    protected ArrayList<Integer>nominas= new ArrayList<Integer>();
    
    public Gerente(String user, String passwd,String nombre,String apellido,String telefono,String DNI,String categoria){
        super( user,  passwd, nombre, apellido, telefono, DNI, categoria);
    }
    
}
