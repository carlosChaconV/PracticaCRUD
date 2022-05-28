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
public class deleteEmployee extends connection{
    
    
    public void deleteAll() {
        try ( Connection cnx = getConnection();  PreparedStatement stm = cnx.prepareStatement("Delete From employee");) {
            stm.clearParameters();
            try {
                int val = stm.executeUpdate();
            } catch (SQLException ex) {
                System.err.printf("Excepción: '%s'%n", ex.getMessage());
            }
        } catch (IOException
                | ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
    }
    
    public void deleteOne(String name) {
        try ( Connection cnx = getConnection();  PreparedStatement stm = cnx.prepareStatement("Delete From employee where name=" + name);) {
            stm.clearParameters();
            try {
                int val = stm.executeUpdate();
            } catch (SQLException ex) {
                System.err.printf("Excepción: '%s'%n", ex.getMessage());
            }
        } catch (IOException
                | ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
    }
}
