/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aange
 */
public class Entrenamiento implements Comparable<Entrenamiento>, Serializable{
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private Date fecha;
    private Club club;
    
    private int numparticipantes=0;
    
    public Entrenamiento(Club club, int dia,int mes,int anyo, int hora, int minuto, int segundo)
    {
        anyo = anyo-1900;
        mes = mes - 1;
        this.club=club;
        fecha = new Date(anyo, mes, dia, hora, minuto, segundo);
        
    }
    
    @Override
    public String toString()
    {
        String cadena =  String.valueOf(fecha) + "numero de plazas ocupadas: " + String.valueOf(numparticipantes)+"/2";
        return cadena;
    }
    
    public void apuntarJugador(Jugador j)
    {
        jugadores.add(j);
        numparticipantes++;
        
    }
    
    public Date getDateTime()
    {
        return fecha;
    }

    @Override
    public int compareTo(Entrenamiento t) {
        return getDateTime().compareTo(t.getDateTime());
    }
    
    
    
}
