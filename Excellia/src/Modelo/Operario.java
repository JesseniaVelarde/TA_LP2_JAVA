package Modelo;
import java.util.*;
public class Operario extends Trabajador{
    private TipoCargo cargo;
    private ArrayList<Proyecto>listaProyecto;
    private ArrayList<SolicitudRetiro>listaSolicitudRetiro;

    public Operario(){
        this.listaProyecto=new ArrayList<Proyecto>();
        this.listaSolicitudRetiro=new ArrayList<SolicitudRetiro>();
    }
    
    public Operario(TipoCargo cargo){
        this.cargo=cargo;
        this.listaProyecto=new ArrayList<Proyecto>();
        this.listaSolicitudRetiro=new ArrayList<SolicitudRetiro>();
    }

    public TipoCargo getCargo() {
        return cargo;
    }

    public void setCargo(TipoCargo cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Proyecto> getListaProyecto() {
        return listaProyecto;
    }
    
    public void setListaProyecto(ArrayList<Proyecto> listaProyecto) {
        this.listaProyecto = listaProyecto;
    }   
    
    public ArrayList<SolicitudRetiro> getListaSolicitudRetiro() {
        return listaSolicitudRetiro;
    }
    
    public void setListaSolicitudRetiro(ArrayList<SolicitudRetiro> listaSolicitudRetiro) {
        this.listaSolicitudRetiro = listaSolicitudRetiro;
    }   
}
