/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wsr.config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DeveloperOak
 */
public class Conexion {
    
    private static Connection conexion; 

    private static final String url = "jdbc:mysql://localhost:3306/basedatocitas"; 

    private static final String user = "root"; 

    private static final String password ="W1ll1@m"; 

     

    public static Connection conectar(){ 

        try{ 

            Class.forName("com.mysql.jdbc.Driver"); 

            conexion = DriverManager.getConnection(url,user,password); 

        } 

        catch(Exception e){ 

            JOptionPane.showMessageDialog(null,"Error de conexión"+ e); 

        } 

               

        return conexion; 

         

    } 
    
}
