package Modelo;
public class Trabajador extends Persona{
    private int idTrabajador;
    private Dominio dominio;

    public Trabajador(){}
    
    public Trabajador(int idTrabajador){
        this.idTrabajador=idTrabajador;
        this.dominio=new Dominio();
    }
    
    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public Dominio getDominio() {
        return dominio;
    }

    public void setDominio(Dominio dominio) {
        this.dominio = dominio;
    } 
}
