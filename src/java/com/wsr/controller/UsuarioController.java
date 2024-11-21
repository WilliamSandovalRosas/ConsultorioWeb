/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.wsr.controller;

import com.sun.istack.logging.Logger;
import com.wsr.dao.UsuarioDao;
import com.wsr.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DeveloperOak
 */
@WebServlet(name = "UsuarioController", urlPatterns = {"/UsuarioController"})
public class UsuarioController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try { 

            //processRequest(request, response) 

            int id = 0; 

            UsuarioDao usuarioDao= new UsuarioDao(); 

            Usuario usuario = null; 

            String peticion = request.getParameter("peticion"); 

            List<Usuario> usuarios = null; 

            switch (peticion){ 

                case "listar": 

                    usuarios=usuarioDao.getUsers(); 

                    request.setAttribute("Usuarios",usuarios); 

                    request.getRequestDispatcher("index.jsp").forward(request, response); 

                    break; 

                case "listarById": 

                    usuarioDao.getUserById(id); 

                    break; 

                case "updateUser": 

                    usuarioDao.updateUser(usuario); 

                    break; 

                case "addUser": 

                    usuarioDao.addUser(usuario); 

                    break; 

                case "deleteUser": 

                    usuarioDao.deleteUser(id); 

                    break; 

                     

            } 

        } catch (SQLException ex) { 

            JOptionPane.showMessageDialog(null, ex);

        } 
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
