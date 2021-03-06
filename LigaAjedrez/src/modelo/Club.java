/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import modelo.Jugador;
/**
 *
 * @author juan2
 */
public class Club implements Serializable{
    protected ArrayList<Entrenamiento> entrenamientos = new ArrayList<Entrenamiento>();
    protected ArrayList<Jugador> jugadoresClub = new ArrayList<Jugador>();
    protected ArrayList<Gerente> gerenteClub = new ArrayList<Gerente>();
    
    private Entrenador entrenador = null;
    private Gerente gerente = null;
    private String nombreClub;
    private String federacion;
    
    public Club(String nombre, String federacion, Entrenador e, Gerente g){
        this.nombreClub = nombre;
        this.entrenador=e;
        this.gerente=g;
        this.federacion=federacion;
//        entrenador.setClubTrabaja(this);
    }
    
    public void addJugador(Jugador j){
        jugadoresClub.add(j);
    }
    
    public void inscribirseClubJugador(Jugador jugador){
        jugadoresClub.add(jugador);
    }
    
    public void inscribirseClubGerente(Gerente gerente){
        gerenteClub.add(gerente);
    }
    
    public boolean darseBaja(Jugador jugador){
        boolean res = false;
        jugador.setClub(null);
        res =jugadoresClub.remove(jugador);
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
    
    public void addEntrenamiento(Entrenamiento e)
    {
        entrenamientos.add(e);
        Collections.sort(entrenamientos);
    }
    
    public void setDefaultEntrenamientos(){
        Entrenamiento entrenamiento1 = new Entrenamiento(this,2020,10,31,9,0,0);
        Entrenamiento entrenamiento2 = new Entrenamiento(this,2020,10,31,11,0,0);
        Entrenamiento entrenamiento3 = new Entrenamiento(this,2020,10,31,11,0,0);
        entrenamientos.add(entrenamiento1);
        entrenamientos.add(entrenamiento2);
        entrenamientos.add(entrenamiento3);
        Collections.sort(entrenamientos);
    }
    
    public ArrayList getJugadores()
    {
        return this.jugadoresClub;
    }
    
    public void desmatricularTodo()
    {
        System.out.println("pollo");
        for(Jugador j: jugadoresClub)
        {
            j.desmatricularseClub();
            jugadoresClub.remove(j);
        }
        Club aux = this;
        this.entrenador.eliminarClubTrabaja(aux);
         this.gerente = null;
    }
    
    @Override
    
    public String toString()
    {
        return this.nombreClub;
    }
    
}
