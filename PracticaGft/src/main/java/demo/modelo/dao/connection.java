/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.modelo.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.sql.Connection;
import demo.dataBase.dataBase;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class connection {

    public connection() {
    }
    
    
     public Connection getConnection() throws ClassNotFoundException,
            IOException, IllegalAccessException, InstantiationException {
        Connection con = null;

        try {     
            String c = "jdbc:mysql://localhost:3306/demo";
            con = DriverManager.getConnection(c,"root","root");           
        } catch (SQLException e) {            
            System.out.print(e);
        }
        return con;
    }
    
}
