package Modelo;
import java.util.*;
public class Empresa {
    private int idEmpresa;
    private String ruc;
    private String razonSocial;
    private String direccion;
    private ArrayList<Cliente> listaCliente;
    private ArrayList<Dominio> listaDominio;

    public Empresa(){
        this.listaCliente=new ArrayList<Cliente>();
        this.listaDominio=new ArrayList<Dominio>();
    }
    
    public Empresa(int idEmpresa, String ruc, String razonSocial,
            String direccion){
        this.idEmpresa=idEmpresa;
        this.ruc=ruc;
        this.direccion=direccion;
        this.razonSocial=razonSocial;
        this.listaCliente=new ArrayList<Cliente>();
        this.listaDominio=new ArrayList<Dominio>();
    }
    
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    } 
    
    public ArrayList<Dominio> getListaDominio() {
        return listaDominio;
    }

    public void setListaDominio(ArrayList<Dominio> listaDominio) {
        this.listaDominio = listaDominio;
    }     
}
