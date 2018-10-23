package Modelo;
import java.util.*;
public class Entregable {
    private int idEntregable;
    private String descripcion;
    private boolean esFinal;
    private ArrayList<DetalleEntrega>listaDetalleEntrega;

    public Entregable(){this.listaDetalleEntrega=new ArrayList<DetalleEntrega>();}
    
    public Entregable(int idEntregable, String descripcion, boolean esFinal){
        this.idEntregable=idEntregable;
        this.descripcion=descripcion;
        this.esFinal=esFinal;
        this.listaDetalleEntrega=new ArrayList<DetalleEntrega>();
    }
    
    public int getIdEntregable() {
        return idEntregable;
    }

    public void setIdEntregable(int idEntregable) {
        this.idEntregable = idEntregable;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEsFinal() {
        return esFinal;
    }

    public void setEsFinal(boolean esFinal) {
        this.esFinal = esFinal;
    }

    public ArrayList<DetalleEntrega> getListaDetalleEntrega() {
        return listaDetalleEntrega;
    }

    public void setListaDetalleEntrega(ArrayList<DetalleEntrega> listaDetalleEntrega) {
        this.listaDetalleEntrega = listaDetalleEntrega;
    }        
}
