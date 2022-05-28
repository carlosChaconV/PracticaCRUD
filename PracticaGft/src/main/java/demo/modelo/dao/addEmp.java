/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.modelo.dao;

import static demo.dataBase.dataBase.getConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class addEmp extends connection{
    
     public void addEmployee(String name, String email) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        try (Connection cnx = getConnection(); PreparedStatement stm = cnx.prepareStatement
        ("INSERT INTO [dbo].[user] ([name],[correo]) VALUES (?,?);");) {
            stm.clearParameters();
            stm.setString(1, name);
            stm.setString(2, email);
            try {
                int val = stm.executeUpdate();
            } catch (SQLException ex) {
                System.err.printf("Excepción: '%s'%n", ex.getMessage());
            }
        } catch (IOException
                | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
    }
    
}
