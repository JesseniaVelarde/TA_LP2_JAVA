package Modelo;
import java.util.*;
public class SolicitudRetiro {
    private int idSolicitud;
    private String descripcion;
    private Date fechaSolicitud;
    private TipoEstadoSolicitud estado;
    private Proyecto proyecto;
    private JefeProyecto jefeProyecto;
    private Operario operario;

    public SolicitudRetiro(){
    }
    
    public SolicitudRetiro(int idSolicitud, String descripcion,
            Date fechaSolicitud, TipoEstadoSolicitud estado){
        this.descripcion=descripcion;
        this.estado=estado;
        this.fechaSolicitud=fechaSolicitud;
        this.proyecto=new Proyecto();
        this.jefeProyecto=new JefeProyecto();
        this.operario=new Operario();
    }
    
    public int getIdSolicitud() {
        return idSolicitud;
    }
    
    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public TipoEstadoSolicitud getEstado() {
        return estado;
    }

    public void setEstado(TipoEstadoSolicitud estado) {
        this.estado = estado;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public JefeProyecto getJefeProyecto() {
        return jefeProyecto;
    }

    public void setJefeProyecto(JefeProyecto jefeProyecto) {
        this.jefeProyecto = jefeProyecto;
    }

    public Operario getOperario() {
        return operario;
    }

    public void setOperario(Operario operario) {
        this.operario = operario;
    }        
}
