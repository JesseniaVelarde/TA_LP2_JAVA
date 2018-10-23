/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;
import AccesoDatos.ConexionMySql;
import Modelo.Persona;
import java.util.ArrayList;
/**
 *
 * @author Ronaldo
 */
public class LogInBL {
    ConexionMySql mysql = new ConexionMySql();
    
    public Persona verificarLogIn(String user, String pwd){
        return mysql.verificarLogIn(user,pwd);
    }
    
    public Persona verificarCliente(String user, String pwd){
        return mysql.verificarCliente(user,pwd);
    }
    
    public int errorLogIn(String user, String pwd){
        return mysql.errorLogIn(user, pwd);
    }
}
