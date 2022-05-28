/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.modelo.dao;

import demo.modelo.employee;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class listEmployee extends connection{

    public listEmployee() {
    }
    
    

    public ArrayList<employee> listEmployee() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        ArrayList<employee> r = new ArrayList<>();
        try ( Connection cnx = getConnection();  
              Statement stm = cnx.createStatement();  
              ResultSet rs = stm.executeQuery("SELECT [Name],[correo] FROM [dbo].[employee]")){
            while (rs.next()) {
                employee e = new employee();
                e.setFirstName(rs.getString("name"));
                e.setEmail(rs.getString("email"));
                e.setKey(rs.getInt("key"));

                r.add(e);
            }
        } catch (IOException
                | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());

        }
        return r;
    }
    
    public ArrayList<employee> listEmployee1(String name) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        ArrayList<employee> r = new ArrayList<>();
        try ( Connection cnx = getConnection();  
              Statement stm = cnx.createStatement();  
              ResultSet rs = stm.executeQuery("Select * from employee where name like " + name)){
            while (rs.next()) {
                employee e = new employee();
                e.setFirstName(rs.getString("name"));
                e.setEmail(rs.getString("email"));
                e.setKey(rs.getInt("key"));

                r.add(e);
            }
        } catch (IOException
                | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());

        }
        return r;
    }
    
    
}
