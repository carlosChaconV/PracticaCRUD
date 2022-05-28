<%-- 
    Document   : index
    Created on : May 26, 2022, 10:42:00 PM
    Author     : Carlos
--%>

<%@page import="java.sql.Connection"%>
<%@page import="demo.dataBase.dataBase"%>
<%@page import="demo.modelo.listEmp"%>
<%@page import="demo.modelo.employee"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">       
        <title>JSP Page</title>
        <link href="css/css.css" rel="stylesheet" type="text/css"/> 
    </head>

    <div class="container">
        <h1>Employee List</h1>
        <table class="rwd-table">
            <tbody>
                
            <input type="text" id="field1" data-charset="\d" value="fil" placeholder="Search" />
            <button type="button" id="filt">Filter</button>
            <button type="button" id="ref">Refresh</button>
                
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>

                <%
                    listEmp lista = new listEmp();
                    ArrayList<employee> LC = lista.getFiltEmployees();
                    if (LC != null) {
                        for (employee emp : LC) {
                %>
                <tr>
                    <td data-th="name">
                        <%= emp.getFirstName()%>
                    </td>
                    <td data-th="email">
                        <%= emp.getEmail()%>
                    </td>
                    <td data-th="Invoice Number">
                        <button type="button" onclick="Update()"><img src="images/pencil.png" alt="" width="23" height="23"/></button>                        
                    </td>
                    <td data-th="Invoice Date">
                        <button type="button" onclick="Delete()" > <img src="images/trashcan.png" alt="" width="23" height="23"/></button>
                    </td>
                </tr>

                <% }
                    }%>

            </tbody>
        </table>


    </div>

    <table id="buttons">
        <tr>
            <th><button type="button" id="add">AddEmployee</button></th>
        </tr>
        <tr>
            <th><button type="button" id="delete">Delete All</button></th>
        </tr>

    </table>
                    
</html>
