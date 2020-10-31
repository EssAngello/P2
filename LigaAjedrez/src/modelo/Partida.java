/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

import modelo.Jugador;
import modelo.Torneo;
/**
 *
 * @author juan2
 */
public class Partida {
    protected Jugador jugador;
    protected Jugador rival;
    protected Jugador ganador;
    protected Date tiempo;
    protected Torneo torneo;
            
    public Partida(Jugador jugador, Jugador rival){
        this.jugador = jugador;
        this.rival = rival;
    }
    
    public String detallesPartida(){
        return rival + "|" + ganador + "|" + tiempo;
    }
}
