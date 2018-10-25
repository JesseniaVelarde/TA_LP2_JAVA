package Modelo;
import java.util.*;
public class Proyecto {
    private int idProyecto;
    private String nombre;
    private TipoFaseProyecto etapa;
    private float presupuesto;
    private int codigoGestorProyecto;
    private Date fechaInicio;
    private Date fechaFinEstimada;
    private Date fechaRealFin;
    private ArrayList<DetalleEntrega>listaDetalleEntrega;
    private JefeProyecto jefeProyecto;
    private ArrayList<Operario> listaOperario;
    private Eru eru;
    private ArrayList<SolicitudRetiro>listaSolicitudRetiro;
    
    public Proyecto(){
        this.listaDetalleEntrega=new ArrayList<DetalleEntrega>();
        this.listaOperario=new ArrayList<Operario>();
        this.listaSolicitudRetiro=new ArrayList<SolicitudRetiro>();
        this.eru=new Eru();
    }
    
    public Proyecto(int idProyecto, String nombre, TipoFaseProyecto etapa,
            float presupuesto, int codigoGestorProyecto, Date fechaInicio,
            Date fechaFinEstimada, Date fechaRealFin){
        this.idProyecto=idProyecto;
        this.etapa=etapa;
        this.presupuesto=presupuesto;
        this.codigoGestorProyecto=codigoGestorProyecto;
        this.fechaInicio=fechaInicio;
        this.fechaFinEstimada=fechaFinEstimada;
        this.fechaRealFin=fechaRealFin;
        this.jefeProyecto=new JefeProyecto();
        this.listaDetalleEntrega=new ArrayList<DetalleEntrega>();
        this.listaOperario=new ArrayList<Operario>();
        this.eru=new Eru();        
        this.listaSolicitudRetiro=new ArrayList<SolicitudRetiro>();
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoFaseProyecto getEtapa() {
        return etapa;
    }

    public void setEtapa(TipoFaseProyecto etapa) {
        this.etapa = etapa;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCodigoGestorProyecto() {
        return codigoGestorProyecto;
    }

    public void setCodigoGestorProyecto(int codigoGestorProyecto) {
        this.codigoGestorProyecto = codigoGestorProyecto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    public void setFechaFinEstimada(Date fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }

    public Date getFechaRealFin() {
        return fechaRealFin;
    }

    public void setFechaRealFin(Date fechaRealFin) {
        this.fechaRealFin = fechaRealFin;
    }
    
    public ArrayList<DetalleEntrega> getListaDetalleEntrega() {
        return listaDetalleEntrega;
    }

    public void setListaDetalleEntrega(ArrayList<DetalleEntrega> listaDetalleEntrega) {
        this.listaDetalleEntrega = listaDetalleEntrega;
    }

    public JefeProyecto getJefeProyecto() {
        return jefeProyecto;
    }

    public void setJefeProyecto(JefeProyecto jefeProyecto) {
        this.jefeProyecto = jefeProyecto;
    }

    public ArrayList<Operario> getListaOperario() {
        return listaOperario;
    }

    public void setListaOperario(ArrayList<Operario> listaOperario) {
        this.listaOperario = listaOperario;
    }

    public Eru getEru() {
        return eru;
    }

    public void setEru(Eru eru) {
        this.eru = eru;
    }

    public ArrayList<SolicitudRetiro> getListaSolicitudRetiro() {
        return listaSolicitudRetiro;
    }

    public void setListaSolicitudRetiro(ArrayList<SolicitudRetiro> listaSolicitudRetiro) {
        this.listaSolicitudRetiro = listaSolicitudRetiro;
    }    
    public void setNombreJefe(String nombreJefe){
        JefeProyecto e = new JefeProyecto();
        e.setNombre(nombreJefe);
        this.jefeProyecto = e;
    }    
    public String getNombreJefe(){
        return jefeProyecto.getNombre();
    }
    
    public int getEstado(){
        return eru.getEstado();
    }
    public void setTipoFase(String fase){
        if(fase.equals("ANALISIS"))this.etapa = TipoFaseProyecto.ANALISIS;
        if(fase.equals("COMPLETADO"))this.etapa = TipoFaseProyecto.COMPLETADO;
        if(fase.equals("DESARROLLO"))this.etapa = TipoFaseProyecto.DESARROLLO;
        if(fase.equals("PLANEACION"))this.etapa = TipoFaseProyecto.PLANEACION;
        if(fase.equals("POSTPRODUCCION"))this.etapa = TipoFaseProyecto.POSTPRODUCCION;
        if(fase.equals("PREPARACION"))this.etapa = TipoFaseProyecto.PREPARACION;
        if(fase.equals("PRUEBAS"))this.etapa = TipoFaseProyecto.PRUEBAS;
    }
}
