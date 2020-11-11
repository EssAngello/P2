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
    protected Date fecha;
    protected Torneo torneo;
    protected String duracion;

    public Partida(Jugador jugador, Jugador rival, Jugador ganador, Date fecha, Torneo torneo, String duracion) {
        this.jugador = jugador;
        this.rival = rival;
        this.ganador = ganador;
        this.fecha = fecha;
        this.torneo = torneo;
        this.duracion = duracion;
    }
    
           
    
    public String detallesPartida(){
        return rival + "|" + ganador + "|" + fecha + "|" + duracion;
    }
}
