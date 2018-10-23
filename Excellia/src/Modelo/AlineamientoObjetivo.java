package Modelo;
import java.util.*;
public class AlineamientoObjetivo {
    private boolean estadoProyecto;
    private TipoEstadoMeta estadoMeta;
    private String formaMedir;
    private Date fechaPlazo;
    private Objetivo objetivo;
    private Eru eru;

    public AlineamientoObjetivo(){

    }
    
    public AlineamientoObjetivo(boolean estadoProyecto,
            TipoEstadoMeta estadometa, String formaMedir, Date fechaPlazo){
        this.estadoMeta=estadometa;
        this.estadoProyecto=estadoProyecto;
        this.formaMedir=formaMedir;
        this.fechaPlazo=fechaPlazo;
        this.objetivo=new Objetivo();
        this.eru=new Eru();        
    }
    
    public boolean isEstadoProyecto() {
        return estadoProyecto;
    }

    public void setEstadoProyecto(boolean estadoProyecto) {
        this.estadoProyecto = estadoProyecto;
    }

    public TipoEstadoMeta getEstadoMeta() {
        return estadoMeta;
    }

    public void setEstadoMeta(TipoEstadoMeta estadoMeta) {
        this.estadoMeta = estadoMeta;
    }

    public String getFormaMedir() {
        return formaMedir;
    }

    public void setFormaMedir(String formaMedir) {
        this.formaMedir = formaMedir;
    }

    public Date getFechaPlazo() {
        return fechaPlazo;
    }

    public void setFechaPlazo(Date fechaPlazo) {
        this.fechaPlazo = fechaPlazo;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public Eru getEru() {
        return eru;
    }

    public void setEru(Eru eru) {
        this.eru = eru;
    }    
}
