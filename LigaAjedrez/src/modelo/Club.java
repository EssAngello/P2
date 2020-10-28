/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import modelo.Jugador;
/**
 *
 * @author juan2
 */
public class Club {
    protected ArrayList<Jugador> jugadoresClub = new ArrayList<Jugador>();
    private String nombreClub;
    
    public Club(String nombre){
        this.nombreClub = nombre;
    }
    
    public void inscribirseClub(Jugador jugador){
        jugadoresClub.add(jugador);
    }
}
