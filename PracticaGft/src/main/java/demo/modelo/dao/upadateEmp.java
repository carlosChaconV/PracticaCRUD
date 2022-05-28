/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.modelo.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class upadateEmp extends connection{
    
    public void updateEmp(String name, String email,String id) throws IOException, ClassNotFoundException, 
            IllegalAccessException, InstantiationException {
        try (Connection cnx = getConnection(); PreparedStatement stm = cnx.prepareStatement
        ("UPDATE [dbo].[employee] SET[name] = ?  ,[email] = ?,  WHERE [id] = ?;");) {
            stm.clearParameters();
            stm.setString(1, name);
            stm.setString(2, email);
            stm.setString(3, id);
            
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
