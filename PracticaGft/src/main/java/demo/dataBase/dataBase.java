package demo.dataBase;

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
//import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class dataBase {

    public dataBase() {

    }

    public static Connection getConnection() throws IOException, ClassNotFoundException {
        
        Connection con = null;
        try {     
//            try{
//                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getConstructor().newInstance();
//            }
//            catch(Exception e){
//                
//            }
            String c = "jdbc:mysql://localhost:3306/demo";
            con = DriverManager.getConnection(c,"root","root");           
        } catch (SQLException e) {            
            System.out.print(e);
        }
        return con;

    }

    public static dataBase getInstance() throws
            ClassNotFoundException,
            IOException,
            IllegalAccessException,
            InstantiationException {
        if (instancia == null) {
            instancia = new dataBase();
        }
        return instancia;
    }
    private static dataBase instancia = null;

}
