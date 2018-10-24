/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Dominio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public class DominioDA {
    Connection cnx=null;
    //ConexionMySql mysql;
    public Connection conexion(){
        String url = "jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g1";
        String user = "inf282g1";
        String pwd = "Lwalx0";        
        try{            
            //Registrar el Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Establecer Conxión
            cnx = DriverManager.getConnection(url,user,pwd);
        }catch (Exception ex){ 
            System.out.println(ex.getMessage());
        }
        return cnx;
    }  
    
    public ArrayList<Dominio>listaDominios(){
        cnx=conexion();
        ArrayList<Dominio>dominio = new ArrayList<Dominio>();
        try{
            Statement sentencia=cnx.createStatement();
            String query="SELECT * FROM DOMINIO";
            ResultSet rs= sentencia.executeQuery(query);
            while(rs.next()){
                int idObj=rs.getInt("ID_DOMINIO");
                String denominacion=rs.getString("DENOMINACION");
                /*System.out.println(denominacion);
                System.out.println(idObj);*/
                Dominio dom=new Dominio(idObj,denominacion);
                //dom.setIdDominio(idObj);
                //dom.setDenominacion(denominacion);
                dominio.add(dom);
            }
            cnx.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return dominio;
    }
}
