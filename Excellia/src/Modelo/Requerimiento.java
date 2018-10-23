package Modelo;
import java.util.*;
public class Requerimiento {
    private int idRequerimiento;
    private String descripcion;
    private Date fechaRequerimiento;
    private TipoRequerimiento tipo;
    private Eru eru;
    private Estimacion estimacion;

    public Requerimiento(){
    }
    
    public Requerimiento(int idRequerimiento, String descripcion, Date fechaRequerimiento,
            TipoRequerimiento tipo){
        this.idRequerimiento=idRequerimiento;
        this.descripcion=descripcion;
        this.fechaRequerimiento=fechaRequerimiento;
        this.tipo=tipo;
    }
    
    public int getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(int idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String dsecripcion) {
        this.descripcion = dsecripcion;
    }

    public Date getFechaRequerimiento() {
        return fechaRequerimiento;
    }

    public void setFechaRequerimiento(Date fechaRequerimiento) {
        this.fechaRequerimiento = fechaRequerimiento;
    }

    public TipoRequerimiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoRequerimiento tipo) {
        this.tipo = tipo;
    }

    public Eru getEru() {
        return eru;
    }

    public void setEru(Eru eru) {
        this.eru = eru;
    }

    public Estimacion getEstimacion() {
        return estimacion;
    }

    public void setEstimacion(Estimacion estimacion) {
        this.estimacion = estimacion;
    }      
}
