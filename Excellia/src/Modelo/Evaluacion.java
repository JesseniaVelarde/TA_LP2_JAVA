package Modelo;
import java.util.*;
public class Evaluacion {
    private boolean resultado;
    private Date fecha;
    private String descripcion;
    private Eru eru;
    private Estimacion estimacion;

    public Evaluacion(){
    }
    
    public Evaluacion(boolean resultado, Date fecha, String descripcion){
        this.resultado=resultado;
        this.fecha=fecha;
        this.descripcion=descripcion;
        this.eru=new Eru();
        this.estimacion=new Estimacion();        
    }
    
    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
