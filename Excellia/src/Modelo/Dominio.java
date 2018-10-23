package Modelo;
import java.util.*;
public class Dominio {
    private Empresa empresa;
    private int idDominio;
    private String denominacion;
    private ArrayList<Trabajador> listaTrabajador;
    
    public Dominio(){
        this.listaTrabajador=new ArrayList<Trabajador>();
    }
    
    public Dominio(int idDominio, String denominacion){
        this.idDominio=idDominio;
        this.denominacion=denominacion;
        this.listaTrabajador=new ArrayList<Trabajador>();
        this.empresa=new Empresa();
    }
    
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getIdDominio() {
        return idDominio;
    }

    public void setIdDominio(int idDominio) {
        this.idDominio = idDominio;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public ArrayList<Trabajador> getListaTrabajador() {
        return listaTrabajador;
    }

    public void setListaTrabajador(ArrayList<Trabajador> listaTrabajador) {
        this.listaTrabajador = listaTrabajador;
    }
    
    
}
