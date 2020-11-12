/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;
import javax.swing.JOptionPane;

import modelo.Partida;
import modelo.Jugador;
/**
 *
 * @author juan2
 */
public class Torneo {
    protected ArrayList<Partida> partidasTorneo = new ArrayList<Partida>();
    protected ArrayList<Partida> partidasJugadasTorneo = new ArrayList<Partida>();
    protected ArrayList<Jugador> jugadoresTorneo = new ArrayList<Jugador>();
    String nombre = "";
    int num_jugadores;
    String categoria;
    int contador = 0;
    
    //FALTA SABER COMO SE GENERAN LAS PARTIDAS DE LOS TORNEOS
    public Torneo(String nombre, int num_jugadores, String categoria){
        this.nombre = nombre;
        this.num_jugadores = num_jugadores;
        this.categoria = categoria;
    }
    
    public void InscribirseTorneo(Jugador jugador){
        if(contador < num_jugadores)
            jugadoresTorneo.add(jugador);
        else
            JOptionPane.showMessageDialog(null, "Torneo Lleno");
    }
    
    public void introducirPartidaTorneo(Partida partida){
        partidasTorneo.add(partida);
    }
    
    public void introducirResultadosPartida(Partida partida){
        partidasJugadasTorneo.add(partida);
    }
    
    public String detallesTorneo(){
        return nombre + "|" + num_jugadores + "|" + categoria;
    }

    public boolean comprobarTorneo(String nombre)
    {
        boolean comprobar = false;
        if(nombre == this.nombre)
            comprobar = true;
        return comprobar;
    }
    
    public ArrayList<Partida> dameParidas(){
        ArrayList<Partida> partidas = new ArrayList(partidasTorneo);
        return partidas;
    }
    
    public void eliminarPartida(Partida p){
        partidasTorneo.remove(p);
    }
            
    @Override
    public String toString()
    {
        return this.nombre;
    }
}
