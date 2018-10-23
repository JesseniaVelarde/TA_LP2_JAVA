/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Ronaldo
 */
public class ConexionMySql {
    Connection cnx = null;
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
    
    public Persona verificarLogIn(String user, String pwd){
        cnx = conexion();
        Persona p = new Persona();
        String query = "SELECT TT.ID_TIPO, CONCAT(P.NOMBRE,' ',P.APELLIDO_PATERNO,' ',P.APELLIDO_MATERNO) NOMBRE,P.CORREO,P.TELEFONO\n" +
"FROM TRABAJADOR T,PERSONA P,CUENTA_USUARIO CU,TIPO_TRABAJADOR TT\n" +
"WHERE T.ID_TIPO = TT.ID_TIPO AND T.ID_PERSONA = P.ID_PERSONA AND\n" +
"P.ID_CUENTA = CU.ID_CUENTA AND CU.NOMBRE_USUARIO = ? AND\n" +
"CU.CONTRASENA = ?";
        try{
            //Statement sentencia = cnx.createStatement();
            PreparedStatement ps = cnx.prepareStatement(query);
            ps.setString(1,user);
            ps.setString(2,pwd);
            //ResultSet rs = sentencia.executeQuery(query);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String dni = rs.getString(1);
                String nombre = rs.getString(2);
                String correo = rs.getString(3);
                String telefono = rs.getString(4);
                p.setDni(dni);
                p.setNombre(nombre);
                p.setCorreo(correo);
                p.setTelefono(telefono);
            }else{
                p.setDni("0");
            }      
            cnx.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }        
        return p;
    }
    
    public Persona verificarCliente(String user, String pwd){
        cnx = conexion();
        Persona p = new Persona();
        String query = "SELECT C.ID_CLIENTE,CONCAT(P.NOMBRE,' ',P.APELLIDO_PATERNO,' ',P.APELLIDO_MATERNO) NOMBRE,P.CORREO,P.TELEFONO\n" +
"FROM CLIENTE C,PERSONA P,CUENTA_USUARIO CU\n" +
"WHERE C.ID_PERSONA = P.ID_PERSONA AND CU.ID_CUENTA = P.ID_CUENTA AND\n" +
"CU.NOMBRE_USUARIO = ? AND CU.CONTRASENA = ?";
        try{
            //Statement sentencia = cnx.createStatement();
            PreparedStatement ps = cnx.prepareStatement(query);
            ps.setString(1,user);
            ps.setString(2,pwd);
            //ResultSet rs = sentencia.executeQuery(query);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String dni = rs.getString(1);
                String nombre = rs.getString(2);
                String correo = rs.getString(3);
                String telefono = rs.getString(4);
                p.setDni(dni);
                p.setNombre(nombre);
                p.setCorreo(correo);
                p.setTelefono(telefono);
            }else{
                p.setDni("0");
            }      
            cnx.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }        
        return p;
    }
    
    public int errorLogIn(String user, String pwd){
        cnx = conexion();
        int error=0;
        String query1 = "SELECT TT.ID_TIPO\n" +
"FROM TRABAJADOR T,PERSONA P,CUENTA_USUARIO CU,TIPO_TRABAJADOR TT\n" +
"WHERE T.ID_TIPO = TT.ID_TIPO AND T.ID_PERSONA = P.ID_PERSONA AND\n" +
"P.ID_CUENTA = CU.ID_CUENTA AND CU.NOMBRE_USUARIO = ?";
        String query3 = "SELECT C.ID_CLIENTE\n" +
"FROM CLIENTE C,PERSONA P,CUENTA_USUARIO CU\n" +
"WHERE C.ID_PERSONA = P.ID_PERSONA AND CU.ID_CUENTA = P.ID_CUENTA AND\n" +
"CU.NOMBRE_USUARIO = ?";
        try{
            //Statement sentencia = cnx.createStatement();
            //ResultSet rs = sentencia.executeQuery(query1);
            PreparedStatement ps1 = cnx.prepareStatement(query1);
            ps1.setString(1,user);            
            ResultSet rs1 = ps1.executeQuery();
            if(rs1.next()){                       
                error++;
            }
            if (error==0){
                PreparedStatement ps3 = cnx.prepareStatement(query3);
                ps3.setString(1,user);
                ResultSet rs3 = ps3.executeQuery();
                if(rs3.next()){
                    error++;                
                }
            }

            cnx.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }        
        return error;        
    }
}
