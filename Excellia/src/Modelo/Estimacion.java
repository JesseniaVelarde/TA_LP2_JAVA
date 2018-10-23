package Modelo;
import java.util.*;
public class Estimacion {
    private int idEstimacion;
    private String descripcion;
    private Date fechaEstimacion;
    private double total;
    private Eru eru;
    private ArrayList<LineaEstimacion> listaLineaEstimacion;
    private SolicitudCambio solicitudCambio;
    private Experto experto;
    private Evaluacion evaluacion;

    public Estimacion(){
        this.listaLineaEstimacion=new ArrayList<LineaEstimacion>();
    }
    
    public Estimacion(int idEstimacion, String descripcion, Date fechaEstimacion,
            double total){
        this.eru=new Eru();
        this.evaluacion=new Evaluacion();
        this.experto=new Experto();
        this.evaluacion=new Evaluacion();
        this.solicitudCambio=new SolicitudCambio();
        this.listaLineaEstimacion=new ArrayList<LineaEstimacion>();
        this.idEstimacion=idEstimacion;
        this.descripcion=descripcion;
        this.fechaEstimacion=fechaEstimacion;
        this.total=total;
    }
    
    public int getIdEstimacion() {
        return idEstimacion;
    }

    public void setIdEstimacion(int idEstimacion) {
        this.idEstimacion = idEstimacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaEstimacion() {
        return fechaEstimacion;
    }

    public void setFechaEstimacion(Date fechaEstimacion) {
        this.fechaEstimacion = fechaEstimacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Eru getEru() {
        return eru;
    }

    public void setEru(Eru eru) {
        this.eru = eru;
    }

    public ArrayList<LineaEstimacion> getListaLineaEstimacion() {
        return listaLineaEstimacion;
    }

    public void setListaLineaEstimacion(ArrayList<LineaEstimacion> listaLineaEstimacion) {
        this.listaLineaEstimacion = listaLineaEstimacion;
    }

    public SolicitudCambio getSolicitudCambio() {
        return solicitudCambio;
    }

    public void setSolicitudCambio(SolicitudCambio solicitudCambio) {
        this.solicitudCambio = solicitudCambio;
    }

    /**
     * @return the experto
     */
    public Experto getExperto() {
        return experto;
    }

    /**
     * @param experto the experto to set
     */
    public void setExperto(Experto experto) {
        this.experto = experto;
    }

    /**
     * @return the evaluacion
     */
    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    /**
     * @param evaluacion the evaluacion to set
     */
    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }
    
    
}
