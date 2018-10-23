package Modelo;
public class Administrador extends Trabajador{
    private int idAdmin;
    private CuentaUsuario cuentaUsuario;

    public Administrador(){}
    
    public Administrador(int idAdmin){
        this.idAdmin=idAdmin;
        this.cuentaUsuario=new CuentaUsuario();
    }
    
    public int getIdAdmin() {
        return idAdmin;
    }
    
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public CuentaUsuario getCuentaUsuario() {
        return cuentaUsuario;
    }

    public void setCuentaUsuario(CuentaUsuario cuentaUsuario) {
        this.cuentaUsuario = cuentaUsuario;
    }
}
