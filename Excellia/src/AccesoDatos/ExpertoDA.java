/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ronaldo
 */
public class ExpertoDA {
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
    
    public void tablaEvaluarExperto(JTable tabla){
        cnx = conexion();
        String sql;
        try{            
            Statement st = cnx.createStatement();            
            sql = "SELECT ERU.ID_ERU NUMERO_DE_ERU,CONCAT(P.NOMBRE,' ',P.APELLIDO_PATERNO,' ',P.APELLIDO_MATERNO) NOMBRE_DE_CLIENTE, E.RAZON_SOCIAL, ERU.DESCRIPCION, ERU.FECHA_SOLICITUD, ERU.ESTADO,\n" +
"ERU.EVALUACION_EXPERTO EVALUACION\n" +
"FROM ERU, CLIENTE C, PERSONA P, EMPRESA E\n" +
"WHERE (ERU.EVALUACION_EXPERTO = 2 AND ERU.EVALUACION_KAM = 0) AND ERU.ID_CLIENTE = C.ID_CLIENTE AND C.ID_PERSONA = P.ID_PERSONA AND C.ID_EMPRESA = E.ID_EMPRESA;";
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int col = rsmd.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for(int i=1;i<=col;i++){modelo.addColumn(rsmd.getColumnLabel(i));}
            while(rs.next()){
                String fila[]=new String[col];
                for(int j=0;j<col;j++){
                    String x = rs.getString(j+1);
                    if(j==6){
                        fila[j] = "Evaluar Eru";
                    }else if(j==5){
                        fila[j] = "Pendiente";
                    }else{fila[j]=x;}                    
                }
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
            rs.close();
            cnx.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }          
    }
        
    public void aprobarEruExperto(String id){
        cnx = conexion();
        String sql;
        try{
            sql = "UPDATE ERU\n" +
                   "SET EVALUACION_EXPERTO = 0\n" +
                   "WHERE ID_ERU = ?";            
            PreparedStatement ps1 = cnx.prepareStatement(sql);
            ps1.setString(1,id);            
            ps1.executeUpdate();
            cnx.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void desaprobarEruExperto(String id){
        cnx = conexion();
        String sql;
        try{
            sql = "UPDATE ERU\n" +
                   "SET EVALUACION_KAM = 1,"
                    + "ESTADO = 1\n" +
                   "WHERE ID_ERU = ?";            
            PreparedStatement ps1 = cnx.prepareStatement(sql);
            ps1.setString(1,id);            
            ps1.executeUpdate();
            cnx.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void registarLineaEstimacion(String totalDiasAna, String totalDiasPro,
            String totalDiasTes,String totalCostoAna,String totalCostoPro,
            String totalCostoTes){
        cnx = conexion();
        String sql;
        try{
            sql="INSERT INTO LINEA_ESTIMACION(ESTIMACION_ID_ESTIMACION,SUBTOTAL_DIAS_AD,SUBTOTAL_DIAS_P,\n" +
"SUBTOTAL_DIAS_T,SUBTOTAL_COSTO_AD,SUBTOTAL_COSTO_P,SUBTOTAL_COSTO_T) VALUES(1,?,?,?,?,?,?)";
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1,totalDiasAna);
            ps.setString(2,totalDiasPro);
            ps.setString(3,totalDiasTes);
            ps.setString(4,totalCostoAna);
            ps.setString(5,totalCostoPro);
            ps.setString(6,totalCostoTes);
            ps.executeUpdate();
            cnx.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
