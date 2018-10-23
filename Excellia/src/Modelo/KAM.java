package Modelo;
import java.util.*;
public class KAM extends Trabajador{
    private ArrayList<Eru> listaERU;
    private ArrayList<SolicitudCambio> listaSolicitudCambio;
    
    public KAM(){
        this.listaERU=new ArrayList<Eru>();
        this.listaSolicitudCambio=new ArrayList<SolicitudCambio>();
    }

    public ArrayList<Eru> getListaERU() {
        return listaERU;
    }

    public void setListaERU(ArrayList<Eru> listaERU) {
        this.listaERU = listaERU;
    }

    public ArrayList<SolicitudCambio> getListaSolicitudCambio() {
        return listaSolicitudCambio;
    }

    public void setListaSolicitudCambio(ArrayList<SolicitudCambio> listaSolicitudCambio) {
        this.listaSolicitudCambio = listaSolicitudCambio;
    }  
}
