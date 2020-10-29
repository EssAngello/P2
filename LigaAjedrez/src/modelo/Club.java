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
    protected ArrayList<Entrenamiento> entrenamientos = new ArrayList<Entrenamiento>();
    protected ArrayList<Jugador> jugadoresClub = new ArrayList<Jugador>();
    
    private Entrenador entrenador = null;
    private Gerente gerente = null;
    private String nombreClub;
    private String federacion;
    
    public Club(String nombre, String federacion, Entrenador e, Gerente g){
        this.nombreClub = nombre;
        this.entrenador=e;
        this.gerente=g;
        this.federacion=federacion;
        entrenador.setClubTrabaja(this);
    }
    
    public void inscribirseClub(Jugador jugador){
        jugadoresClub.add(jugador);
    }
    public boolean darseBaja(Jugador jugador){
        boolean res = false; 
        for(Jugador aux : jugadoresClub){
            if (!res)
                res =jugadoresClub.remove(jugador);
        }
        return res;           
    }
    
    public String getNombreGerente()
    {
        return this.gerente.getNombre();
    }
    
    public String getApellidoGerente()
    {
        return this.gerente.getApellido();
    }
    
    public String getTlfGerente()
    {
        return this.gerente.getTelefono();
    }
    
    public String getDNIGerente()
    {
        return this.gerente.getDNI();
    }
    
    public String getNombreEntrenador()
    {
        return this.entrenador.getNombre();
    }
    
    public String getApellidoEntrenador()
    {
        return this.entrenador.getApellido();
    }
    
    public String getTlfEntrenador()
    {
        return this.entrenador.getTelefono();
    }
    
    public String getDNIEntrenador()
    {
        return this.entrenador.getDNI();
    }
    
    public ArrayList<String> getNombreClubesEntrenador()
    {
        ArrayList<String> nombresclubes = new ArrayList<String>();
        for(Club c:entrenador.getClubes())
        {
            nombresclubes.add(c.getNombre());
        }
        return nombresclubes;
    }
    
    public String getNombre()
    {
        return this.nombreClub;
    }
    
    public String getNombreFederacion()
    {
        return this.federacion;
    }
    
    public ArrayList<Entrenamiento> getEntrenamientos()
    {
        return this.entrenamientos;
    }
    
    public void setDefaultEntrenamientos(){
        Entrenamiento entrenamiento1 = new Entrenamiento(this,2020,10,31,9,0,0);
        Entrenamiento entrenamiento2 = new Entrenamiento(this,2020,10,31,11,0,0);
        Entrenamiento entrenamiento3 = new Entrenamiento(this,2020,10,31,11,0,0);
        entrenamientos.add(entrenamiento1);
        entrenamientos.add(entrenamiento2);
        entrenamientos.add(entrenamiento3);
    }
    
}
