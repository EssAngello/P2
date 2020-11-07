/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aange
 */
public class Entrenador extends Jugador{
    
    protected ArrayList<Club> clubes = new ArrayList<Club>();
    
    public Entrenador(String user, String passwd,String nombre,String apellido,String telefono,String DNI,String categoria){
        super( user,  passwd, nombre, apellido, telefono, DNI, categoria);
    }
    
    public ArrayList<Club> getClubes(){
        return this.clubes;
    }
    
    public void setClubTrabaja(Club c){
        clubes.add(c);
    }
    
    public void eliminarClubTrabaja(Club c)
    {
        clubes.remove(c);
    }
    
    
}
