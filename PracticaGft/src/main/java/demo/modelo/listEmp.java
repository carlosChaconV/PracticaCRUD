/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.modelo;

/**
 *
 * @author Carlos
 */
//import SACA.modelo.dao.servicioListar;
import demo.modelo.dao.listEmployee;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;

/**
 *
 * @author pc
 */
@XmlRootElement(name = "list-employee")
public class listEmp implements Serializable {

     ArrayList<employee> registros = new ArrayList<employee>();

    public listEmp() {
    }

    public ArrayList<employee> getEmployees() {
        try {
            
            registros = serv.listEmployee();
        } catch (Exception e) {
            registros = null;
        }
        return registros;
    }
    
     public ArrayList<employee> getFiltEmployees() {
        try {
            
            registros = serv.listEmployee();
        } catch (Exception e) {
            registros = null;
        }
        return registros;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public String toString() {
//        return toJSON().toString(4);
//    }

//    public JSONObject toJSON() {
//
//        try {
//            JSONArray a = new JSONArray();
//            emp.forEach((employee p) -> {
//                a.put(p.toString());
//            });
//            JSONObject r = new JSONObject();
//            r.put("list-employee", a);
//            return r;
//        } catch (JSONException e) {
//            System.out.print(e);
//        }
//        return null;
//    }

    listEmployee serv = new listEmployee();

}
