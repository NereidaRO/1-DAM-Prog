/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasconexionbdd;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

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
            java.sql.Statement stmt = conexion.createStatement();
            
            
            //Objetos Statement y ResultSet para mandar consulta y tratar los datos
            /*String query = "SELECT Name_client, Name_contact, Surname_contact FROM client";
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Lista de clientes: ");
            while(rs.next()){
                System.out.println("Cliente: " + rs.getString("Name_client") + " " + rs.getString("Name_contact") + " " + rs.getString("Surname_contact"));
            }
            */
            //Inserción de datos
            /*String qInsert = "INSERT INTO client VALUES (1556, 'Cliente Prueba', 'Nereida', 'Rodriguez', '666676666', '999989999', 'Calle Prueba 1', 'Calle Prueba 2', 'Alicante', 'Comunidad Valenciana', 'Espanya', '90988', 16, 129123456.12)";
            int rowIns = stmt.executeUpdate(qInsert);
            System.out.println("Número de columnas insertadas: " + rowIns);*/
            
            //Actualización de datos
            /*String qUpdate = "update client set client.Name_client = 'Nombre actual' where client.Code_client = 1555;";
            int rowUpd = stmt.executeUpdate(qUpdate);
            System.out.println("Número de columnas actualizadas: " + rowUpd);*/
            
            //Eliminación de registros
            /*
            String qDelete = "DELETE FROM client WHERE client.Code_client = '1555';";
            int rowDel = stmt.executeUpdate(qDelete);
            System.out.println("Número de columnas eliminadas: " + rowDel);*/
            
            // Cierra la conexión
            stmt.close();
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
