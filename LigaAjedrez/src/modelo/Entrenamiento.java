/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author aange
 */
public class Entrenamiento {
    Date fecha;
    Club club;
    
    public Entrenamiento(Club club, int dia,int mes,int anyo, int hora, int minuto, int segundo)
    {
        anyo = anyo-1900;
        mes = mes - 1;
        this.club=club;
        fecha = new Date(anyo, mes, dia, hora, minuto, segundo);
        
    }
    
}
