package Modelo;
import java.util.*;
public class SolicitudCambio {
    private int idSolicitud;
    private String descripcion;
    private Date fechaSolicitud;
    private boolean aprobada;
    private boolean seAgregaRequerimiento;
    private Estimacion estimacion;
    private Requerimiento requerimiento;
    private KAM kam;
    private Cliente cliente;

    public SolicitudCambio(){
    }
    
    public SolicitudCambio(int idSolicitud, String descripcion, Date fechaSolicitud,
            boolean aprobada, boolean seAgregaRequerimiento){
        this.idSolicitud=idSolicitud;
        this.descripcion=descripcion;
        this.fechaSolicitud=fechaSolicitud;
        this.aprobada=aprobada;
        this.seAgregaRequerimiento=seAgregaRequerimiento;
        this.estimacion=new Estimacion();
        this.requerimiento=new Requerimiento();
        this.kam=new KAM();
        this.cliente = new Cliente();        
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

    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }

    public boolean isSeAgregaRequerimiento() {
        return seAgregaRequerimiento;
    }

    public void setSeAgregaRequerimiento(boolean seAgregaRequerimiento) {
        this.seAgregaRequerimiento = seAgregaRequerimiento;
    }

    public Estimacion getEstimacion() {
        return estimacion;
    }

    public void setEstimacion(Estimacion estimacion) {
        this.estimacion = estimacion;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
