package Modelo;
import java.util.*;
public class Experto extends Trabajador{
    private ArrayList<Estimacion>listaEstimacion;

    public Experto(){
        this.listaEstimacion=new ArrayList<Estimacion>();
    }
    
    public ArrayList<Estimacion> getListaEstimacion() {
        return listaEstimacion;
    }

    public void setListaEstimacion(ArrayList<Estimacion> listaEstimacion) {
        this.listaEstimacion = listaEstimacion;
    }    
}
