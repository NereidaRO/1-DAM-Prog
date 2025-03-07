/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasconexionbdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @since 03/03/2025
 * @author Nereida Rodríguez Orenes
 * La idea en este proyecto/práctica es aprender a conectar el IDE con el DBMS (netBeans y MS SQL Server Management en este caso).
 * En el proyecto intermodular nos conectaremos a la BDD que hayamos creado.
 */
public class PruebasConexionBDD {
    public static void main(String[] args) {
        // Datos de la conexión
        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=GARDENING;;encrypt=false;trustServerCertificate=true;";
        String usuario = "sa";
        String contraseña = "k4t4kr0k3r";

        try {
            // Cargar el driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa a la base de datos.");
            
            // Cierra la conexión
            conexion.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo conectar a la base de datos.");
            e.printStackTrace();
        }
    }
    
}
