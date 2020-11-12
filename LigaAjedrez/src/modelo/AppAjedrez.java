/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

import modelo.Torneo;
import modelo.Jugador;
import modelo.Gerente;
import modelo.Club;
/**
 *
 * @author juan2
 */
public class AppAjedrez {
    protected ArrayList<Torneo> torneos = new ArrayList<Torneo>();
    protected ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    protected ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    protected ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();
    protected ArrayList<Club> clubes = new ArrayList<Club>();
    protected ArrayList<Administrador> admin = new ArrayList<Administrador>();
    
    Administrador admi = new Administrador ("root","root");
    
    Jugador j1 = new Jugador("Maricel","123456","Maricel","Olaru","123456789","X9356742C","senior");
    Entrenador e = new Entrenador("Jose", "123456", "Jose", "Mourinho", "123456789", "X1234567L", "senior");
    Gerente g = new Gerente("Ali", "123456","Ali", "baba", "123456789", "X1234566L", "senior");
    Club club1 = new Club("TSM", "Federacion de Valencia", e, g);
    Club club2 = new Club("FAZE", "Federacion de Madrid", null, null);
    Torneo torneo1 = new Torneo("Torneo calabacin", 3, "senior");
    //Ficheros
    String ficheroJugadores = "jugadores.txt";
    String gerentesJugadores = "gerentes.txt";
    public AppAjedrez(){
        //Añadimos jugadores por la fuerza para comprobar/
        admin.add(admi);
        jugadores.add(j1);
        entrenadores.add(e);
        gerentes.add(g);
        clubes.add(club1);
        j1.InscribirseClub(club1);
        club1.setDefaultEntrenamientos();
        //Hay pasarle el fichero y el tipo jugador = 0 gerente = 1
        ficheroJugador(ficheroJugadores, 0);
        ficheroJugador(gerentesJugadores, 1);
        
        clubes.add(club2);
        torneos.add(torneo1);
    }
    
    public void crearClub(String nombre, String federacion)
    {
        Club club = new Club(nombre, federacion, null, null);
        clubes.add(club);
    }
    
    public void eliminarClub(Object c)
    {
        Club cc = (Club) c;
        //cc.desmatricularTodo();
        clubes.remove(cc);
    }
    
    public void crearTorneo(Torneo t){
        torneos.add(t);
    }
    
    public void eliminarTorneo(Torneo t){
        for(Torneo torneo:torneos){
            if(torneo == t){
                torneos.remove(t);
            }
        }
    }
    
      public ArrayList<Torneo> consultarTorneos(){
        ArrayList<Torneo> listaTorneos = new ArrayList(torneos);

        return listaTorneos;
    }
    
    public ArrayList consultarClubes(){
        ArrayList<Club> listaClubes = new ArrayList(clubes);
        
        return listaClubes;
    }
    
    public Jugador buscarJugadorUser(String user){
        Jugador jugador_aux = null;
        
        for(Jugador jugador : jugadores){
            if(jugador.comprobarUser(user) == true){
                jugador_aux = jugador;
            }
        }  
        
        return jugador_aux;
    }

    public Jugador buscarJugador(String nombre, String apellido){
        Jugador jugador_aux = null;
        
        for(Jugador jugador : jugadores){
            if(jugador.comprobarNombreApellido(nombre, apellido) == true){
                jugador_aux = jugador;
            }
        }  
        
        return jugador_aux;
    }
    
    public Gerente buscarGerente(String nombre, String apellido){
        Gerente gerente_aux = null;
        
        for(Gerente gerente : gerentes){
            if(gerente.comprobarNombreApellido(nombre, apellido) == true){
                gerente_aux = gerente;
            }
        }  
        
        return gerente_aux;
    }
    
    public Entrenador buscarEntrenador(String nombre, String apellido){
        Entrenador entrenador_aux = null;
        
        for(Entrenador entrenador : entrenadores){
            if(entrenador.comprobarNombreApellido(nombre, apellido) == true){
                entrenador_aux = entrenador;
            }
        }  
        
        return entrenador_aux;
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
    
    public ArrayList getEntrenamientosClub(Object c)
    {
        Club club = (Club) c;
        return club.getEntrenamientos();
    }
    
    public ArrayList getJugadoresClub(Object c)
    {
        Club club = (Club) c;
        return club.getJugadores();
    }
    
    public void ReservarEntreamiento(Object e, Object j)
    {
        Entrenamiento ee = (Entrenamiento)e;
        Jugador jj=(Jugador)j;
        ee.apuntarJugador(jj);
    }
    
    public ArrayList<Jugador> consultarJugadoresExistentes(){
        ArrayList<Jugador> jugadoresExistentes = new ArrayList(jugadores);
        return jugadoresExistentes;
    }
    
    public ArrayList<Gerente> consultarGerentesExistentes(){
        ArrayList<Gerente> gerentesExistentes = new ArrayList(gerentes);
        return gerentesExistentes;
    }
    
    public ArrayList<Entrenador> consultarEntrenadoresExistentes(){
        ArrayList<Entrenador> entrenadoresExistentes = new ArrayList(entrenadores);
        return entrenadoresExistentes;
    }
    
    public Jugador identificarJugador(String u, String p){ 
        Jugador datos_jugador = null;      
        for(Jugador aux : jugadores){
            if(aux.identificarse(u, p) == true){
                datos_jugador = aux;
            }
        }   
        return datos_jugador;
    }
    
    
    public Gerente identificarGerente(String u, String p){ 
        Gerente datos_gerente = null;
        for(Gerente aux2 : gerentes){
            if(aux2.identificarse(u, p) == true){
                datos_gerente = aux2;
            }
        }
        return datos_gerente;
    }
    
    public boolean identificarAdmin(String u, String p){
        boolean comprobar = false;
        for(Administrador aux3 : admin){
            if(aux3.identificarse(u, p) == true){
                comprobar = true;
            }
        }
        return comprobar;
    }
    
    public Torneo dameTorneo(String nombre){
        Torneo aux = null;
        for(Torneo t : torneos){
            if(t.comprobarTorneo(nombre))
                aux = t;
        }
        return aux;
    }
    
   //Tipo registrar jugador = 1, gerente = 2, entrenador = 3 
   public void registrarse(int tipo, String user, String passwd,String nombre,String apellido,String telefono,String DNI,String categoria, String res_nom, String res_apell,String responsable_DNI){
        boolean comprobar = false;
        if(tipo == 1){
            for(Jugador aux2 : jugadores){
                if(comprobar == false){
                    comprobar =aux2.comprobarExistencia(user, passwd, DNI);
                }
            }
            if(comprobar == false){
                Jugador aux = new Jugador (user, passwd, nombre, apellido, telefono, DNI, categoria);
                aux.setRes_nom(res_nom);
                aux.setRes_apell(res_apell);
                aux.setRes_DNI(responsable_DNI);
                jugadores.add(aux);
            }
        }
        else if(tipo == 2){
            for(Gerente aux3 : gerentes){
                if(comprobar == false){
                    comprobar =aux3.comprobarExistencia(user, passwd, DNI);
                }
            }
            if(comprobar == false){
                Gerente aux = new Gerente (user, passwd, nombre, apellido, telefono, DNI, categoria);
                aux.setRes_nom(res_nom);
                aux.setRes_apell(res_apell);
                aux.setRes_DNI(responsable_DNI);
                gerentes.add(aux);
            }
        }
        else if(tipo == 3){
            for(Entrenador aux4 : entrenadores){
                if(comprobar == false){
                    comprobar =aux4.comprobarExistencia(user, passwd, DNI);
                }
            }
            if(comprobar == false){
                Entrenador aux = new Entrenador (user, passwd, nombre, apellido, telefono, DNI, categoria);
                aux.setRes_nom(res_nom);
                aux.setRes_apell(res_apell);
                aux.setRes_DNI(responsable_DNI);
                entrenadores.add(aux);
            }
        }
   }
  
   public void eliminarJugador(Jugador j)
   {
       jugadores.remove(j);
   }
   
    public void eliminarGerente(Gerente g)
   {
       gerentes.remove(g);
   }
    
     public void eliminarEntrenador(Entrenador e)
   {
       entrenadores.remove(e);
   }
   
   public void ficheroJugador(String fichero, int tipo){
       String nombreFichero = "./src/modelo/";
       BufferedReader br = null;
       nombreFichero = nombreFichero + fichero;
        try {
           //Crear un objeto BufferedReader al que se le pasa 
           //   un objeto FileReader con el nombre del fichero
           br = new BufferedReader(new FileReader(nombreFichero));
           //Leer la primera línea, guardando en un String
           String texto = br.readLine();
           //Repetir mientras no se llegue al final del fichero
           while(texto != null)
           {
               //Hacer lo que sea con la línea leída
               String[] parts =texto.split(",");
               String part1 = parts[0]; 
               String part2 = parts[1];
               String part3 = parts[2]; 
               String part4 = parts[3];
               String part5 = parts[4]; 
               String part6 = parts[5];
               String part7 = parts[6];
               if(tipo == 0){
                   //OTRA FORMA PASRLE TODO EL ARRAY AL CONSTRUCTOR Y QUE LA CLASE ASIGNE TODA LA INFORMACION
                   // ASI PUEDES ANYADIR TAMBIEN LOS OTROS ATRIBUTOS, CREAR OTRO CONSTRUCTOR
                Jugador j1 = new Jugador(part1,part2,part3,part4,part5,part6,part7);
                jugadores.add(j1);
               }
               else if (tipo == 1){
                Gerente g = new Gerente(part1,part2,part3,part4,part5,part6,part7);
                gerentes.add(g);
               }
               //Leer la siguiente línea
               texto = br.readLine();
           }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
   }
}
