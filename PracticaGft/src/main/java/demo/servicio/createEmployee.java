/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.servicio;

/**
 *
 * @author Carlos
 */

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;

/**
 *
 * @author Carlos
 */
@WebServlet(name = "servletListaMinutas", urlPatterns = "/servletListaMinutas")
public class createEmployee extends HttpServlet {

    
    private void processRequest(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        
        String pdfName = request.getParameter("file");
//        DbaUsuario usu = (DbaUsuario) session.getAttribute("loggin_user");


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

//    public String listaProductosJSON(String clave) {
//        if (clave != null) {
//            ArrayList<DbaMinuta> productos = servicio.listar_minutas(clave);
//
//            JSONObject r = new JSONObject();
//            try {
//                JSONArray a = new JSONArray();
//                productos.forEach((DbaMinuta p) -> {
//                    a.put(p.toString());
//                });
//                r.put("lista-minutas", a);
//            } catch (JSONException e) {
//                System.out.print(e);
//            }
//
//            return r.toString(4);
//        }
//        return "";
//   }
  //  private final servicioListar servicio = new servicioListar();
}
