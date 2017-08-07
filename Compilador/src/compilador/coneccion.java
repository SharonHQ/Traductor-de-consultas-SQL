/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhunior
 */
public class coneccion {
    Connection con;
    public coneccion() {
    }
    //una nueva coneccion
    public Connection getConexion(String aux){//PARA CONSULTA EN MYSQL
        
        try{
            /* Carga|Registra el driver JDBC */
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            /* Obtener la conexion */
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306"+aux,"root","1234");
        }catch(SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            JOptionPane.showMessageDialog(null,"Error: "+ ex,"Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    } 
    
    
    //cierra la conecion 
    public void desconectar(){
        con = null;
    }
    
    public Connection getC(String aux){// PARA CONSULTA EN SQL
        
        try{
            /* Carga|Registra el driver JDBC */
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            /* Obtener la conexion */
	    con = DriverManager.getConnection("jdbc:sqlserver://localhost;databasename="+aux,"sa","123");
        }catch(SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            JOptionPane.showMessageDialog(null,"Error: "+ ex,"Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    } 
    
    

    
}
