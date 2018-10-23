package Modelo;
import java.util.*;
public class Persona {
    private String dni;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private char sexo;
    private Date fechaNac;
    private String correo;
    private String telefono;
    private CuentaUsuario cuentaUsuario;

    public Persona(){}
    
    public Persona(String dni, String nombre, String apellidoPaterno,
            String apellidoMaterno, char sexo, Date fechaNac, String correo,
            String telefono){
        this.dni=dni;
        this.nombre=nombre;
        this.apellidoMaterno=apellidoMaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.sexo=sexo;
        this.correo=correo;
        this.telefono=telefono;
        this.cuentaUsuario=new CuentaUsuario();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public CuentaUsuario getCuentaUsuario() {
        return cuentaUsuario;
    }

    public void setCuentaUsuario(CuentaUsuario cuentaUsuario) {
        this.cuentaUsuario = cuentaUsuario;
    }
}
