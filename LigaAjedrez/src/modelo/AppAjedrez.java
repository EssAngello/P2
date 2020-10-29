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
    protected ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();
    protected ArrayList<Club> clubes = new ArrayList<Club>();
    Jugador j1 = new Jugador("Maricel","123456","Maricel","Olaru","123456789","X9356742C","senior");
    Entrenador e = new Entrenador("Jose", "123456", "Jose", "Mourinho", "123456789", "X1234567L", "senior");
    Gerente g = new Gerente("Ali", "123456","Ali", "baba", "123456789", "X1234566L", "senior");
    Club club = new Club("TSM", "Federacion de Valencia", e, g);
    private Jugador datos_jugador;
    public AppAjedrez(){
        //Añadimos jugadores por la fuerza para comprobar//
        jugadores.add(j1);
        entrenadores.add(e);
        gerentes.add(g);
        clubes.add(club);
        j1.InscribirseClub(club);
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
   public void registrarse(String user, String passwd,String nombre,String apellido,String telefono,String DNI,String categoria, String res_nom, String res_apell){
        boolean comprobar = false;

        for(Jugador aux2 : jugadores){
            if(comprobar == false){
                comprobar =aux2.comprobarExistencia(user, passwd, DNI);
            }
        }
        if(comprobar == false){
            Jugador aux = new Jugador (user, passwd, nombre, apellido, telefono, DNI, categoria);
	    aux.setRes_nom(res_nom);
	    aux.setRes_apell(res_apell);
            jugadores.add(aux);
        }
    
     
   }
   
   public void eliminarJugador(Jugador j)
   {
       jugadores.remove(j);
   }
}
