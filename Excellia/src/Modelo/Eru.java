package Modelo;
import java.util.*;
public class Eru {
    private int idERU;
    private String descripcion;
    private int estado;
    private Date fechaSolicitud;
    private Cliente cliente;
    private KAM kam;
    private Estimacion estimacion;
    private Evaluacion evaluacion;
    private Proyecto proyecto;
    private ArrayList<AlineamientoObjetivo> listaAlienamientoObjtivo;
    private ArrayList<Requerimiento> listaRequerimiento;
    private Objetivo obj;
    
    public Objetivo getObj() {
        return obj;
    }

    public void setObj(Objetivo obj) {
        this.obj = obj;
    }
    
    public Eru(){

        this.listaAlienamientoObjtivo=new ArrayList<AlineamientoObjetivo>();

    }
    
    public Eru(int idERU, String descripcion, int estado, Date fechaSolicitud){
        this.idERU=idERU;
        this.descripcion=descripcion;
        this.estado=estado;
        this.fechaSolicitud=fechaSolicitud;
        this.kam=new KAM();
        this.estimacion=new Estimacion();
        this.evaluacion=new Evaluacion();
        this.proyecto=new Proyecto();
        this.listaAlienamientoObjtivo=new ArrayList<AlineamientoObjetivo>();  
        this.listaRequerimiento=new ArrayList<Requerimiento>();
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
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
    
    public ArrayList<Requerimiento> getListaRequerimiento() {
        return listaRequerimiento;
    }

    public void setListaRequerimiento(ArrayList<Requerimiento> listaRequerimiento) {
        this.listaRequerimiento = listaRequerimiento;
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
    public void setEstadoString(String estado){        
        if(estado.equals("APROBADO")){
            this.estado = 0;
        }else if(estado.equals("DESAPROBADA")){
            this.estado = 1;
        }else{
            this.estado = 2;
        }
    }    
    public void setObjString(String objetivo){
        Objetivo obje = new Objetivo();
        if(objetivo.equals("Reducción de costos cuantificado")){
            obje.setIdObjetivo(1);
            obje.setDescripcion(objetivo);
        }
        if(objetivo.equals("Incremento de ventas")){
            obje.setIdObjetivo(2);
            obje.setDescripcion(objetivo);
        }
        if(objetivo.equals("Automatización de procesos")){
            obje.setIdObjetivo(3);
            obje.setDescripcion(objetivo);
        }
        if(objetivo.equals("Transformación de la compañia a través de nuevos sistemas")){
            obje.setIdObjetivo(4);
            obje.setDescripcion(objetivo);
        }
        if(objetivo.equals("Normativo")){
            obje.setIdObjetivo(5);
            obje.setDescripcion(objetivo);
        }
        this.obj = obje;
    }
}
