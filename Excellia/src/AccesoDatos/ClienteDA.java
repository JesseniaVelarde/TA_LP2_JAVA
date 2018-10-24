/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;
import Modelo.Dominio;
import Modelo.Empresa;
import Modelo.Eru;
import Modelo.Objetivo;
import Modelo.Proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ClienteDA {
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
    
    public void tabla_eru_cli_pendientes(JTable tabla,String p) {
        cnx=conexion();
        try{
            
            String query="SELECT PRO.NOMBRE NOMBRE_PROYECTO,PRO.FECHA_FIN_ESTIMADA,TE.DESCRIPCION ESTADO,TIP.DESCRIPCION TIPO_FASE,P.NOMBRE NOMBRE_JEFE \n" +
                        "    FROM PROYECTO PRO,ERU E,PERSONA P, TRABAJADOR T, TIPO_FASE_PROYECTO TIP, TIPO_ESTADO_SOLICITUD TE\n" +
                        "	WHERE PRO.ID_ERU = E.ID_ERU AND P.ID_PERSONA = T.ID_PERSONA AND T.ID_TIPO = 4 \n" +
                        "    AND PRO.ID_TIPO_FASE_PROYECTO = TIP.ID_TIPO_FASE_PROYECTO  AND TIP.ID_TIPO_FASE_PROYECTO!=6 AND E.ESTADO=TE.ID_TIPO_ESTADO_SOLICITUD\n"+
                        "AND PRO.ID_TRABAJADOR_JEFE = T.ID_TRABAJADOR AND E.ID_CLIENTE = ?";
           PreparedStatement ps = cnx.prepareStatement(query);
           ps.setString(1, p);
            ResultSet rs = ps.executeQuery();
           ResultSetMetaData rsmd = rs.getMetaData();
           int col = rsmd.getColumnCount();
           DefaultTableModel modelo = new DefaultTableModel();
           for(int i=1;i<=col;i++){modelo.addColumn(rsmd.getColumnLabel(i));}
           while(rs.next()){
               String fila[]=new String[col];
               for(int j=0;j<col;j++){
                   fila[j]=rs.getString(j+1);
               }
               modelo.addRow(fila);
           }
           tabla.setModel(modelo);
           rs.close();
           cnx.close();
        }catch(Exception ex){
        
        }    
    }
    
    
    public void tabla_eru_cli_hechos(JTable tabla,String n) {
        cnx=conexion();
        try{            
            String query="SELECT PRO.NOMBRE NOMBRE_PROYECTO,PRO.FECHA_FIN_ESTIMADA FECHA_FIN,TE.DESCRIPCION ESTADO,TIP.DESCRIPCION TIPO_FASE,P.NOMBRE NOMBRE_JEFE\n" +
                            "    FROM PROYECTO PRO,ERU E,PERSONA P, TRABAJADOR T, TIPO_FASE_PROYECTO TIP, TIPO_ESTADO_SOLICITUD TE\n" +
                            "	WHERE PRO.ID_ERU = E.ID_ERU AND P.ID_PERSONA = T.ID_PERSONA AND T.ID_TIPO = 4 \n" +
                            "    AND PRO.ID_TIPO_FASE_PROYECTO = TIP.ID_TIPO_FASE_PROYECTO AND TIP.ID_TIPO_FASE_PROYECTO=6 AND E.ESTADO=TE.ID_TIPO_ESTADO_SOLICITUD\n"+
                            " AND PRO.ID_TRABAJADOR_JEFE = T.ID_TRABAJADOR AND  E.ID_CLIENTE= ?";
           PreparedStatement ps;
            ps = cnx.prepareStatement(query);
            ps.setString(1, n);
            ResultSet rs = ps.executeQuery();
           ResultSetMetaData rsmd = rs.getMetaData();
           int col = rsmd.getColumnCount();
           DefaultTableModel modelo = new DefaultTableModel();
           for(int i=1;i<=col;i++){modelo.addColumn(rsmd.getColumnLabel(i));}
           while(rs.next()){
               String fila[]=new String[col];
               for(int j=0;j<col;j++){
                   fila[j]=rs.getString(j+1);
               }
               modelo.addRow(fila);
           }
           tabla.setModel(modelo);
           rs.close();
           cnx.close();
        }catch(Exception ex){
        
        }    
    }
    
    public void tabla_eru_busqueda(JTable tabla,String id) {
        cnx=conexion();
        try{            
            String query="SELECT PRO.NOMBRE NOMBRE_PROYECTO,PRO.FECHA_FIN_ESTIMADA FECHA_FIN,TE.DESCRIPCION ESTADO,TIP.DESCRIPCION TIPO_FASE,P.NOMBRE NOMBRE_JEFE\n" +
"FROM PROYECTO PRO,ERU E,PERSONA P, TRABAJADOR T, TIPO_FASE_PROYECTO TIP,TIPO_ESTADO_SOLICITUD TE\n" +
"WHERE PRO.ID_ERU = E.ID_ERU AND P.ID_PERSONA = T.ID_PERSONA AND T.ID_TIPO = 4\n" +
"AND PRO.ID_TIPO_FASE_PROYECTO = TIP.ID_TIPO_FASE_PROYECTO AND (TIP.ID_TIPO_FASE_PROYECTO=1 or TIP.ID_TIPO_FASE_PROYECTO=2) \n" +
"AND E.ESTADO=TE.ID_TIPO_ESTADO_SOLICITUD AND E.ID_CLIENTE=? AND PRO.ID_TRABAJADOR_JEFE=T.ID_TRABAJADOR; ";
            PreparedStatement ps=cnx.prepareStatement(query);
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();
           ResultSetMetaData rsmd = rs.getMetaData();
           int col = rsmd.getColumnCount();
           DefaultTableModel modelo = new DefaultTableModel();
           for(int i=1;i<=col;i++){modelo.addColumn(rsmd.getColumnLabel(i));}
           while(rs.next()){
               String fila[]=new String[col];
               for(int j=0;j<col;j++){
                   fila[j]=rs.getString(j+1);
               }
               modelo.addRow(fila);
           }
           tabla.setModel(modelo);
           rs.close();
           cnx.close();
        }catch(Exception ex){
        
        }    
    }
    
    public ArrayList<Objetivo> listaobjetivos() {
        
        cnx=conexion();
        
        ArrayList<Objetivo> Listaobj =new ArrayList<Objetivo>();
        try{
            
        
            Statement sentencia=cnx.createStatement();
            String query="SELECT * FROM OBJETIVO;";
            ResultSet rs= sentencia.executeQuery(query);
            while(rs.next()){
                int idObj=rs.getInt("ID_OBJETIVO");
                String descripcion=rs.getString("DESCRIPCION");

                Objetivo obj = new Objetivo();
                obj.setIdObjetivo(idObj);
                obj.setDescripcion(descripcion);
                Listaobj.add(obj);
            }
            cnx.close();            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return Listaobj;
    }
    
    public ArrayList<Empresa> listarEmpresa() {
      
        cnx=conexion();
        
        ArrayList<Empresa> ListaEmp =new ArrayList<Empresa>();
        try{
            Statement sentencia=cnx.createStatement();
            String query="SELECT * FROM EMPRESA;";
            ResultSet rs= sentencia.executeQuery(query);
            while(rs.next()){
                int idemp=rs.getInt("ID_EMPRESA");
                String ruc=rs.getString("RUC");
                String razon_s=rs.getString("RAZON_SOCIAL");
                String dirrc=rs.getString("DIRECCION");

                Empresa emp=new Empresa(idemp,ruc,razon_s,dirrc);
                ListaEmp.add(emp);
            }
            cnx.close();
            //return Listaobj;
        }catch(SQLException ex){
            
        }
        return ListaEmp;
    }
    
    public void RegistrarEru(Eru e) {
        
        cnx=conexion();
        try{
            /*
            int ideru =e.getIdERU();
            int idKam=e.getKam().getIdTrabajador();
            int idcli=e.getCliente().getIdCliente();
            String nomProy =e.getProyecto().getNombre();
            */
            
            int ideru =7;
            int idKam=2;
            int idcli=3;
            String nom=e.getProyecto().getNombre();
            String nomProy =nom;
            System.out.printf(nom);
            int estado=0;
                    
            Statement sentencia=cnx.createStatement();
            //String query="INSERT INTO ERU(ID_ERU,ID_KAM,ID_CLIENTE,DESCRIPCION,ESTADO,FECHA_SOLICITUD)\n" +
            //            "VALUES("+ideru+","+idKam+","+idcli+","+"'nomProy',"+"2018-10-11);";
            
            String query="INSERT INTO ERU(ID_ERU,ID_KAM,ID_CLIENTE,DESCRIPCION,FECHA_SOLICITUD,ESTADO)\n" +
                        "VALUES("+ideru+","+idKam+","+idcli+","+"'nomProy',"+"2018-10-11"+estado+");";
            int i= sentencia.executeUpdate(query);
            
            cnx.close();
        }catch(Exception ex){
            
        }
    }
}
