package Modelo;
import java.util.*;
public class JefeProyecto extends Trabajador{
    private ArrayList<Proyecto>listaProyecto;
    private ArrayList<SolicitudRetiro>listaSolicitudRetiro;

    public JefeProyecto(){
        this.listaProyecto=new ArrayList<Proyecto>();
        this.listaSolicitudRetiro=new ArrayList<SolicitudRetiro>();
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
