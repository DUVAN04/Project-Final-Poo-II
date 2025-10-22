/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cun.edu.co.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author thor
 */
public class Postgress_database {
    private static final String URL = "jdbc:postgresql://localhost:5432/mi_app_db";
    private static final String USUARIO_DB = "postgres";
    private static final String CONTRASENA_DB = "kali"; 
    
    public Connection conectar() {
        Connection conn = null;
        try {
            // 1. Intentar la conexión
            conn = DriverManager.getConnection(URL, USUARIO_DB, CONTRASENA_DB);
            
            // 2. Si tiene éxito, informa en la consola
            System.out.println("¡Conexión a PostgreSQL exitosa!");

        } catch (SQLException e) {
            // 3. Si falla, imprime el error
            System.err.println("Error al conectar con la base de datos:");
            e.printStackTrace();
        }
        return conn;
    }
    
}
