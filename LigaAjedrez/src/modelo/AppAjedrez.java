/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

import modelo.Torneo;
import modelo.Jugador;
import modelo.Gerente;
/**
 *
 * @author juan2
 */
public class AppAjedrez {
    protected ArrayList<Torneo> torneos = new ArrayList<Torneo>();
    protected ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    protected ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    Jugador j1 = new Jugador("Maricel","123456","Maricel","Olaru","123456789","X9356742C","senior");
    public AppAjedrez(){
        //Añadimos jugadores por la fuerza para comprobar//
        jugadores.add(j1);
    }
    
    public ArrayList<Torneo> consultarTorneosDisponibles(){
        ArrayList<Torneo> torneosDisponibles = new ArrayList(torneos);
        /* Esto lo usaremos si hay alguna condicion para que los torneos esten libres
        for(Torneo torneo:torneos){
            if(){
                torneosDisponibles = 
            }
        }
        */
        return torneosDisponibles;
    }
    
    public boolean identificarJugadorGerente(String u, String p){
        boolean respuesta = false;
        for(Jugador aux : jugadores){
            if(respuesta == false)
                respuesta = aux.identificarse(u, p);
        }
        return respuesta;
    }
    public void registrarse(String user, String passwd,String nombre,String apellido,String telefono,String DNI,String categoria){
        boolean comprobar = false;

        for(Jugador aux2 : jugadores){
            if(comprobar == false){
                comprobar =aux2.comprobarExistencia(user, passwd, DNI);
            }
        }
        if(comprobar == false){
            System.out.print("Registrado");
            Jugador aux = new Jugador (user, passwd, nombre, apellido, telefono, DNI, categoria);
            jugadores.add(aux);
        }
    }
}
