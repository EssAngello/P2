/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.TimeZone;


/**
 *
 * @author juan2
 */
public class DAO {
    Connection conexionBD;
    
    public DAO() {
        String bd = "jdbc:mysql://localhost/miprueba?serverTimezone=" + TimeZone.getDefault().getID();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de mysql
            // Conexión usando usuario y clave de administrador de la BD
            conexionBD = DriverManager.getConnection(bd, "root", "root");
        } catch (Exception e) { // Error en la conexión con la BD
            System.out.println("Error de conexión");
        }

    }
    
    public void cargarDatos(){
        ResultSet resultados = null;
        try {
            String con;
            Statement s = conexionBD.createStatement();
            // Consulta SQL
            con = "SELECT id_prueba FROM torneo";
            resultados = s.executeQuery(con);
            while (resultados.next()) {
            int id = resultados.getInt("id_prueba");
            System.out.print(id);
            }
        } catch (Exception e) { // Error al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
    }
    
    public void realizarBackup(){
        ResultSet resultados2 = null;
        try {
            int id = 10; // Valor a insertar
            Statement s = conexionBD.createStatement();
            // Operación SQL sobre la base de datos
            
            String con = "INSERT INTO prueba (id_prueba) VALUES ('" + id + "')";
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con);
            preparedStmt.executeUpdate();
        }
        catch(Exception e){ // Error al realizar la operación
            System.out.println("No se ha completado la operación");
        }
    }
    

}
