/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wsr.model;

import java.util.Date;

/**
 *
 * @author DeveloperOak
 */
public class Usuario {
    
    private int id; 

    private String nombre; 

    private String sexo; 

    private Date nacimiento; 

    private String rol; 

    private String correo; 

    private String foto; 

    public Usuario() {
    }

    public Usuario(int id, String nombre, String sexo, Date nacimiento, String rol, String correo, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.nacimiento = nacimiento;
        this.rol = rol;
        this.correo = correo;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

        
}
