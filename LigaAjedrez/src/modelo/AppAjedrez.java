/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

import modelo.Torneo;
/**
 *
 * @author juan2
 */
public class AppAjedrez {
    protected ArrayList<Torneo> torneos = new ArrayList<Torneo>();
    
    public AppAjedrez(){
        
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
}
