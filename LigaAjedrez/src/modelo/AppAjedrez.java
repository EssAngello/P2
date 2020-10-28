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
import modelo.Club;
/**
 *
 * @author juan2
 */
public class AppAjedrez {
    protected ArrayList<Torneo> torneos = new ArrayList<Torneo>();
    protected ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    protected ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    protected ArrayList<Club> clubes = new ArrayList<Club>();
    Jugador j1 = new Jugador("Maricel","123456","Maricel","Olaru","123456789","X9356742C","senior");
    private Jugador datos_jugador;
    public AppAjedrez(){
        //Añadimos jugadores por la fuerza para comprobar//
        jugadores.add(j1);
        datos_jugador = null;
    }
    
    public ArrayList<Club> consultarClubes(){
        ArrayList<Club> listaClubes = new ArrayList(clubes);
        
        return listaClubes;
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
    
    public Jugador identificarJugadorGerente(String u, String p){
        for(Jugador aux : jugadores){
            if(aux.identificarse(u, p) == true){
                datos_jugador = aux;
            }
        }
        return datos_jugador;
    }
    public void registrarse(String user, String passwd,String nombre,String apellido,String telefono,String DNI,String categoria){
        boolean comprobar = false;

        for(Jugador aux2 : jugadores){
            if(comprobar == false){
                comprobar =aux2.comprobarExistencia(user, passwd, DNI);
            }
        }
        if(comprobar == false){
            Jugador aux = new Jugador (user, passwd, nombre, apellido, telefono, DNI, categoria);
            jugadores.add(aux);
        }
    }
}
