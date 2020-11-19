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
public class PersonaFactory {
    
    public PersonaFactory (){
    }
    public PersonaFactory CrearPersona(String tipo , String user, String passwd,String nombre,String apellido,String telefono,String DNI,String categoria){
        if(tipo == "jugador"){
            Jugador j = new Jugador(user, passwd, nombre, apellido, telefono, DNI, categoria);
            return j;
        }
        else if(tipo == "gerente"){
            Gerente g = new Gerente( user,  passwd, nombre, apellido, telefono, DNI, categoria);
            return g;
        }
        else if(tipo == "entrenador"){
            Entrenador e = new Entrenador( user,  passwd, nombre, apellido, telefono, DNI, categoria);
            return e;
        }
        else{
            return null;
        }
    }
}
