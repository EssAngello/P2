/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aange
 */
public class JugadorFacade {
    private Jugador j;
    
    public JugadorFacade(Jugador j)
    {
        this.j = j;
    }

    public Jugador ObtenerJugador()
    {
        return this.j;
    }
    
    public Club comprobarClub()
    {
        return this.j.comprobarClub();
    }
    
    /*-------------------------GET DATOS RESPONSABLE EN JUGADOR VISTA--------------------------------*/
    
    public ArrayList ObtenerDatosResponsable()
    {
        ArrayList<String> DatosResponsable = new ArrayList<String>();
        DatosResponsable.add(this.j.getRes_nom());
        DatosResponsable.add(this.j.getRes_apell());
        DatosResponsable.add(this.j.getRes_DNI());
        
        return DatosResponsable;
    }
    
    /*
    public String getRes_nom() {
        return this.j.getRes_nom();
    }
    
    public String getRes_apell() {
        return this.j.getRes_apell();
    }
  
    public String getRes_DNI() {
        return this.j.getRes_DNI();
    }
    */
    /*-------------------------------------------------------------*/
    
    /*-------------------------GET DATOS JUGADOR EN JUGADOR VISTA--------------------------------*/
    
    
    public ArrayList ObtenerDatosJugador()
    {
        ArrayList<String> DatosJugador = new ArrayList<String>();
        DatosJugador.add(this.j.getNombre());
        DatosJugador.add(this.j.getApellido());
        DatosJugador.add(this.j.getDNI());
        DatosJugador.add(this.j.getTelefono());
        DatosJugador.add(this.j.getCategoria());
        
        return DatosJugador;
    }
    
    /*
    public String getNombre() {
        return this.j.getNombre();
    }
    
    public String getApellido() {
        return this.j.getApellido();
    }
    
    public String getDNI()
    {
        return this.j.getDNI();
    }
    
    public String getTelefono()
    {
        return this.j.getTelefono();
    }
    
    public String getCategoria() {
        return this.j.getCategoria();
    }
    */
    /*-------------------------------------------------------------*/
    
    
    /*-------------------------GET DATOS ENTRENADOR EN CLUB VISTA--------------------------------*/    
    
    public ArrayList ObtenerDatosEntrenador()
    {
        ArrayList<String> DatosEntrenador = new ArrayList<String>();
        DatosEntrenador.add(this.j.getNombreEntrenador());
        DatosEntrenador.add(this.j.getApellidoEntrenador());
        DatosEntrenador.add(this.j.getDNIEntrenador());
        DatosEntrenador.add(this.j.getTelefonoEntrenador());
        
        return DatosEntrenador;
    }
    
    /*
    public String getNombreEntrenador()
    {
        return this.j.getNombreEntrenador();
    }
    
     public String getApellidoEntrenador()
    {
        return this.j.getApellidoEntrenador();
    }
    
    public String getDNIEntrenador()
    {
        return this.j.getDNIEntrenador();
    }
     
    public String getTelefonoEntrenador()
    {
        return this.j.getTelefonoEntrenador();
    }
    */
    /*-------------------------------------------------------------*/
    
    /*-------------------------GET DATOS GERENTE EN CLUB VISTA--------------------------------*/    
    public ArrayList ObtenerDatosGerente()
    {
        ArrayList<String> DatosGerente = new ArrayList<String>();
        DatosGerente.add(this.j.getNombreGerente());
        DatosGerente.add(this.j.getApellidoGerente());
        DatosGerente.add(this.j.getDNIGerente());
        DatosGerente.add(this.j.getTelefonoGerente());
        
        return DatosGerente;
    }
    
    /*
    public String getNombreGerente()
    {
        return this.j.getNombreGerente();
    }
    
    public String getApellidoGerente()
    {
        return this.j.getNombreGerente();
    }
    
    public String getTelefonoGerente()
    {
        return this.j.getTelefonoGerente();
    }
    
    public String getDNIGerente()
    {
        return this.j.getDNIGerente();
    }
    */
    /*-------------------------------------------------------------*/
     
    public void InscribirseClub(Club c)
    {
        this.j.InscribirseClub(c);
    }

    public ArrayList<Partida> getHistorialPartidas(){
        return this.j.getHistorialPartidas();
    }
    
    public ArrayList<Club> getHistorialClubes(){
        return this.j.getHistorialClubes();
    }
    
    public String getNombreClub()
    {
        return this.j.getNombreClub();
    }
 
    public String getNombreFederacion()
    {
        return this.j.getNombreFederacion();
    }
       
    public ArrayList getEntrenamientosClub()
    {
        return this.j.getEntrenamientosClub();
    }
    
    public ArrayList getNombresClubesEntrenador()
    {
        return this.j.getNombresClubesEntrenador();
    }
    public void apuntarseEntrenamiento(Object o)
    {
        this.j.apuntarseEntrenamiento(o);
    }

}
