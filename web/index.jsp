<%-- 
    Document   : index
    Created on : 20/11/2024, 5:13:04 p. m.
    Author     : DeveloperOak
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Gestión Usuarios</h1>
        
        <table>
            <thead>
                <th>Identificación</th>
                <th>Nombre</th>
                <th>Género</th>
                <th>Nacimiento</th>
                <th>Rol</th>
                <th>Correo</th>
                <th>Foto</th>
                <th>Acciones</th>
            </thead>
            
            <tbody>
                <tr>
                    <c:forEach var="usuario" items="${Usuarios}">
                        <td>{usuario.Identificacion}</td>
                        <td>{usuario.Nombre}</td>
                        <td>{usuario.Genero}</td>
                        <td>{usuario.Nacimiento}</td>
                        <td>{usuario.Rol}</td>
                        <td>{usuario.Correo}</td>
                        <td>{usuario.Foto}</td>
                        <td>
                            <button>Editar</button>
                            <button>Eliminar</button>
                        </td>
                    </c:forEach>
                </tr>
            </tbody>
            
        </table>
    </body>
</html>
