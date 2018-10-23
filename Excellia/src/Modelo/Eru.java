package Modelo;
import java.util.*;
public class Eru {
    private int idERU;
    private String descripcion;
    private boolean estado;
    private Date fechaSolicitud;
    private Cliente cliente;
    private KAM kam;
    private Estimacion estimacion;
    private Evaluacion evaluacion;
    private Proyecto proyecto;
    private ArrayList<AlineamientoObjetivo> listaAlienamientoObjtivo;
    private Requerimiento requerimiento;

    public Eru(){

        this.listaAlienamientoObjtivo=new ArrayList<AlineamientoObjetivo>();

    }
    
    public Eru(int idERU, String descripcion, boolean estado, Date fechaSolicitud){
        this.idERU=idERU;
        this.descripcion=descripcion;
        this.estado=estado;
        this.fechaSolicitud=fechaSolicitud;
        this.kam=new KAM();
        this.estimacion=new Estimacion();
        this.evaluacion=new Evaluacion();
        this.proyecto=new Proyecto();
        this.listaAlienamientoObjtivo=new ArrayList<AlineamientoObjetivo>();  
        this.requerimiento=new Requerimiento();
    }

    public int getIdERU() {
        return idERU;
    }
    public void setIdERU(int idERU) {
        this.idERU = idERU;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Requerimiento getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(Requerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }

    public KAM getKam() {
        return kam;
    }

    public void setKam(KAM kam) {
        this.kam = kam;
    }

    public Estimacion getEstimacion() {
        return estimacion;
    }

    public void setEstimacion(Estimacion estimacion) {
        this.estimacion = estimacion;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public ArrayList<AlineamientoObjetivo> getListaAlienamientoObjtivo() {
        return listaAlienamientoObjtivo;
    }

    public void setListaAlienamientoObjtivo(ArrayList<AlineamientoObjetivo> listaAlienamientoObjtivo) {
        this.listaAlienamientoObjtivo = listaAlienamientoObjtivo;
    }   
}
