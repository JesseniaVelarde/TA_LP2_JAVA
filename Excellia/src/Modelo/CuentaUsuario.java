package Modelo;
public class CuentaUsuario {
    private int idCuenta;
    private String nomUsuario;
    private String contrasena;
    private boolean bloqueado;
    private Persona persona;
    private Administrador administrador;

    public CuentaUsuario(){
    }
    
    public CuentaUsuario(int idCuenta, String nomUsuario, String contrasena,
            boolean bloqueado){
        this.idCuenta=idCuenta;
        this.nomUsuario=nomUsuario;
        this.contrasena=contrasena;
        this.bloqueado=bloqueado;
        this.persona=new Persona();
        this.administrador=new Administrador();        
    }
    
    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }  
}
