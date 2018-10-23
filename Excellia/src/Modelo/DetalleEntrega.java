package Modelo;
import java.util.*;
public class DetalleEntrega {
    private int idDetalle;
    private Date fechaEntrega;
    private boolean evaluacion;
    private Date fechaEvaluacion;
    private Entregable entregable;
    private Proyecto proyecto;
    private Cliente cliente;

    public DetalleEntrega(){
    }
    
    public DetalleEntrega(int idDetalle, Date fechaEntrega, boolean evaluacion,
            Date fechaEvaluacion){
        this.idDetalle=idDetalle;
        this.fechaEntrega=fechaEntrega;
        this.evaluacion=evaluacion;
        this.fechaEvaluacion=fechaEvaluacion;
        this.entregable=new Entregable();
        this.proyecto=new Proyecto();
        this.cliente=new Cliente();
    }
    
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public boolean isEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(boolean evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Date getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(Date fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public Entregable getEntregable() {
        return entregable;
    }

    public void setEntregable(Entregable entregable) {
        this.entregable = entregable;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }        
}
