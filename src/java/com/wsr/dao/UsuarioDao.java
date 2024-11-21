/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wsr.dao;


import com.wsr.config.Conexion; 
import com.wsr.model.Usuario;

import java.util.ArrayList; 

import java.util.List; 

import java.sql.PreparedStatement; 

import java.sql.SQLException; 

import java.sql.ResultSet; 

/**
 *
 * @author DeveloperOak
 */
public class UsuarioDao {
    
    /**
     * Método para listar usuarios
     */
    public List<Usuario> getUsers() throws SQLException{ 

         

        List<Usuario> usuarios = new ArrayList<>(); 

        String dmlSql = "select * from usuarios";         

        PreparedStatement ps= Conexion.conectar().prepareStatement(dmlSql); 

        ResultSet rs = ps.executeQuery(); 

         

        while(rs.next()){ 

            Usuario usuario = new Usuario(); 

            usuario.setId(rs.getInt("Identificacion"));//usuario.setId(rs.getInt(1)); 

            usuario.setNombre(rs.getString("Nombre")); 

            usuario.setSexo(rs.getString("Sexo")); 

            usuario.setNacimiento(rs.getDate("Nacimiento")); 

            usuario.setRol(rs.getString("Rol")); 

            usuario.setCorreo(rs.getString("Correo")); 

            usuario.setFoto(rs.getString("Foto")); 

            usuarios.add(usuario);             

        }       

        return usuarios;         

    }     
    
    /**
     * Metodo getUserById 
     */
    public Usuario getUserById(int id) throws SQLException{ 

        Usuario usuario= new Usuario(); 

        String dmlSql = "select * from usuarios where id = ?";         

        PreparedStatement ps= Conexion.conectar().prepareStatement(dmlSql); 

        ps.setInt(1,id); 

        ResultSet rs = ps.executeQuery(); 

         

        while(rs.next()){ 

            

            usuario.setNombre(rs.getString("Nombre")); 

            usuario.setSexo(rs.getString("Sexo")); 

            usuario.setNacimiento(rs.getDate("Nacimiento")); 

            usuario.setRol(rs.getString("Rol")); 

            usuario.setCorreo(rs.getString("Correo")); 

            usuario.setFoto(rs.getString("Foto")); 

                         

        }        

        return usuario; 

         

    } 
    
    /**
     * Metodo agregar Usuario 
     */

    public int addUser(Usuario usuario) throws SQLException{ 

         

        int resultado = 0; 

         

        String dmlSql = "insert into usuarios(Identificacion, Nombre, Sexo, Nacimiento, Rol, Correo, null) values(?,?,?,?,?,?)"; 

        PreparedStatement ps= Conexion.conectar().prepareStatement(dmlSql); 

        resultado = ps.executeUpdate(); 

        return resultado; 

    } 
    
    /**
     * Método Actualizar Usuario
     */
    
    public int updateUser(Usuario usuario) throws SQLException{ 

         

        int resultado = 0; 

         

        String dmlSql = "update usuarios set(Nombre=?, Sexo=?, Nacimiento=?, Rol=?, Correo=?, foto=?) where id=?"; 

        PreparedStatement ps= Conexion.conectar().prepareStatement(dmlSql); 

        resultado = ps.executeUpdate(); 

        return resultado; 

    } 
    
    /**
     * Método delete User 
     */
    
    public int deleteUser(int id) throws SQLException{ 

        int resultado = 0; 

      //  String dmlSql = "delete from usuarios where id ="+id; 

        String dmlSql = "delete from usuarios where id =?"; 

        PreparedStatement ps= Conexion.conectar().prepareStatement(dmlSql); 

        resultado = ps.executeUpdate(); 

        return resultado; 

         

    } 
    
    
} 

    

