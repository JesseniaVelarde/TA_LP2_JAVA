/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.ClienteDA;
import Modelo.Empresa;
import Modelo.Eru;
import Modelo.Objetivo;
import Modelo.Persona;
import Modelo.Proyecto;
import Modelo.Requerimiento;
import java.util.ArrayList;
import javax.swing.JTable;

public class ClienteBL {
    ClienteDA clienteDA;
    
    public ClienteBL(){
        clienteDA=new ClienteDA();
    }
    
    public ArrayList<Objetivo> listaobjetivos() {
        return clienteDA.listaobjetivos();
    } 
    public ArrayList<Empresa> listarEmpresa() {
        return clienteDA.listarEmpresa();
    }
    public void RegistrarEru(Eru e) {
        clienteDA.RegistrarEru(e);
    }
    
    public void tabla_eru_cli_pendientes(JTable tabla,String n) {
        clienteDA.tabla_eru_cli_pendientes(tabla,n);
    }
    public void tabla_eru_cli_hecho(JTable tabla,String n) {
        clienteDA.tabla_eru_cli_hechos(tabla,n);
    }
    public void tabla_eru_busqueda(JTable tabla,String n) {
        clienteDA.tabla_eru_busqueda(tabla,n);
    }
    
    public ArrayList<String> listaTipoRequerimiento(){
        return clienteDA.listaTipoRequerimiento();
    }
    
    public ArrayList<String> listaPrioridad(){
        return clienteDA.listaPrioridad();
    }
    public ArrayList<Proyecto> listar(String idp){
        return clienteDA.listar(idp);
    }
}
