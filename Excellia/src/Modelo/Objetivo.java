package Modelo;
import java.util.*;
public class Objetivo {
    private int idObjetivo;
    private String descripcion;
    private ArrayList<AlineamientoObjetivo>listaAlineamientoObjetivo;

    public Objetivo(){this.listaAlineamientoObjetivo=new ArrayList<AlineamientoObjetivo>();}
    
    public Objetivo(int idObjetivo, String descripcion){
        this.idObjetivo=idObjetivo;
        this.descripcion=descripcion;
        this.listaAlineamientoObjetivo=new ArrayList<AlineamientoObjetivo>();
    }
   
    public int getIdObjetivo() {
        return idObjetivo;
    }

    public void setIdObjetivo(int idObjetivo) {
        this.idObjetivo = idObjetivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<AlineamientoObjetivo> getListaAlineamientoObjetivo() {
        return listaAlineamientoObjetivo;
    }

    public void setListaAlineamientoObjetivo(ArrayList<AlineamientoObjetivo> listaAlineamientoObjetivo) {
        this.listaAlineamientoObjetivo = listaAlineamientoObjetivo;
    }  
}
