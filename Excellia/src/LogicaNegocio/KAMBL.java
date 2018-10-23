/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.KAMDA;
import javax.swing.JTable;

/**
 *
 * @author alulab14
 */
public class KAMBL {
    KAMDA k = new KAMDA();
    public void tablaEruPendientes(JTable tabla){
        k.tablaEruPendientes(tabla);
    }
    
    public void tablaEruEstimadas(JTable tabla){
        k.tablaEruEstimadas(tabla);
    }
    
    public void aprobarEruKAM(String id){
        k.aprobarEruKAM(id);
    }
    
    public void desaprobarEruKAM(String id){
        k.desaprobarEruKAM(id);
    }
    
    public void aprobarEstimacion(String id){
        k.aprobarEstimacion(id);
    }
    
    public void desaprobarEstimacion(String id){
        k.desaprobarEstimacion(id);
    }
}
