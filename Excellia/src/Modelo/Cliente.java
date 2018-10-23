package Modelo;
import java.util.*;
public class Cliente extends Persona{
    private int idCliente;
    private String nomEmpresa;
    private Empresa empresa;
    private ArrayList<Eru> listaEru;
    private ArrayList<DetalleEntrega>listaDetalleEntrega;

    public Cliente(){
        this.listaEru=new ArrayList<Eru>();
        this.listaDetalleEntrega=new ArrayList<DetalleEntrega>();
    }  
    
    public Cliente(int idCliente, String nomEmpresa){
        this.idCliente=idCliente;
        this.nomEmpresa=nomEmpresa;
        this.empresa=new Empresa();
        this.listaEru=new ArrayList<Eru>();
        this.listaDetalleEntrega=new ArrayList<DetalleEntrega>();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Eru> getListaEru() {
        return listaEru;
    }

    public void setListaEru(ArrayList<Eru> listaEru) {
        this.listaEru = listaEru;
    }
    
    public ArrayList<DetalleEntrega> getListaDetalleEntrega() {
        return listaDetalleEntrega;
    }

    public void setListaDetalleEntrega(ArrayList<DetalleEntrega> listaDetalleEntrega) {
        this.listaDetalleEntrega = listaDetalleEntrega;
    }   
}
