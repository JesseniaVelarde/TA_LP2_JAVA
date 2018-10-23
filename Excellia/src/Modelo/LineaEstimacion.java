package Modelo;
public class LineaEstimacion {
    private int idLinea;
    private TipoCargo rol;
    private float tiempoEstimadoPlaneacion;
    private float tiempoEstimadoAnalisis;
    private float tiempoEstimadoDesarrollo;
    private float tiempoEstimadoPruebas;
    private float tiempoEstimadoPreparacion;
    private float tiempoEstimadoPostProduccion;
    private float subTotal;
    private Estimacion estimacion;

    public LineaEstimacion(){}
    
    public LineaEstimacion(int idLinea, TipoCargo rol, float tiempoEstimadoPlaneacion,
            float tiempoEstimadoAnalisis, float tiempoEstimadoDesarrollo,
            float tiempoEstimadoPruebas, float tiempoEstimadoPreparacion,
            float tiempoEstimadoPostProduccion, float subTotal){
        this.idLinea=idLinea;
        this.rol=rol;
        this.tiempoEstimadoAnalisis=tiempoEstimadoAnalisis;
        this.tiempoEstimadoDesarrollo=tiempoEstimadoDesarrollo;
        this.tiempoEstimadoPlaneacion=tiempoEstimadoPlaneacion;
        this.tiempoEstimadoPostProduccion=tiempoEstimadoPostProduccion;
        this.tiempoEstimadoPreparacion=tiempoEstimadoPreparacion;
        this.tiempoEstimadoPruebas=tiempoEstimadoPruebas;
        this.estimacion=new Estimacion();
    }
    
    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public TipoCargo getRol() {
        return rol;
    }

    public void setRol(TipoCargo rol) {
        this.rol = rol;
    }

    public float getTiempoEstimadoPlaneacion() {
        return tiempoEstimadoPlaneacion;
    }

    public void setTiempoEstimadoPlaneacion(float tiempoEstimadoPlaneacion) {
        this.tiempoEstimadoPlaneacion = tiempoEstimadoPlaneacion;
    }

    public float getTiempoEstimadoAnalisis() {
        return tiempoEstimadoAnalisis;
    }

    public void setTiempoEstimadoAnalisis(float tiempoEstimadoAnalisis) {
        this.tiempoEstimadoAnalisis = tiempoEstimadoAnalisis;
    }

    public float getTiempoEstimadoDesarrollo() {
        return tiempoEstimadoDesarrollo;
    }

    public void setTiempoEstimadoDesarrollo(float tiempoEstimadoDesarrollo) {
        this.tiempoEstimadoDesarrollo = tiempoEstimadoDesarrollo;
    }

    public float getTiempoEstimadoPruebas() {
        return tiempoEstimadoPruebas;
    }

    public void setTiempoEstimadoPruebas(float tiempoEstimadoPruebas) {
        this.tiempoEstimadoPruebas = tiempoEstimadoPruebas;
    }

    public float getTiempoEstimadoPreparacion() {
        return tiempoEstimadoPreparacion;
    }

    public void setTiempoEstimadoPreparacion(float tiempoEstimadoPreparacion) {
        this.tiempoEstimadoPreparacion = tiempoEstimadoPreparacion;
    }

    public float getTiempoEstimadoPostProduccion() {
        return tiempoEstimadoPostProduccion;
    }

    public void setTiempoEstimadoPostProduccion(float tiempoEstimadoPostProduccion) {
        this.tiempoEstimadoPostProduccion = tiempoEstimadoPostProduccion;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public Estimacion getEstimacion() {
        return estimacion;
    }

    public void setEstimacion(Estimacion estimacion) {
        this.estimacion = estimacion;
    }
}
