/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.ExpertoDA;
import javax.swing.JTable;

/**
 *
 * @author Ronaldo
 */
public class ExpertoBL {
    ExpertoDA ex = new ExpertoDA();
    public void tablaEvaluarExperto(JTable tabla){
        ex.tablaEvaluarExperto(tabla);
    }
    
    public void aprobarEruExperto(String id){
        ex.aprobarEruExperto(id);
    }
    
    public void desaprobarEruExperto(String id){
        ex.desaprobarEruExperto(id);
    }
    
    public void registrarLineaEsimacion(String totalDiasAna,
            String totalDiasPro, String totalDiasTes,
            String totalCostoAna, String totalCostoPro,
            String totalCostoTes){
        ex.registarLineaEstimacion(totalDiasAna, totalDiasPro, totalDiasTes, 
                totalCostoAna, totalCostoPro, totalCostoTes);
    }
}
