/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

import modelo.Partida;
import modelo.Jugador;
/**
 *
 * @author juan2
 */
public class Torneo {
    protected ArrayList<Partida> partidasTorneo = new ArrayList<Partida>();
    protected ArrayList<Jugador> jugadoresTorneo = new ArrayList<Jugador>();
    
    
    //FALTA SABER COMO SE GENERAN LAS PARTIDAS DE LOS TORNEOS
    public Torneo(){
        
    }
    
    public void InscribirseTorneo(Jugador jugador){
        jugadoresTorneo.add(jugador);
    }
}
