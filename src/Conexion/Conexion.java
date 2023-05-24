
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private String url ="jdbc:mysql://127.0.0.1:3306/proyectofinal";
    private String usuario = "root";
    private String contraseña = "jM20221578075";
    
    public Connection conectar(){
        
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error conexion" + e);
        }
        return conexion;
    }

}