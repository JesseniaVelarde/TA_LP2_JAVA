/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.DominioDA;
import Modelo.Dominio;
import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public class DominioBL {
        
    private DominioDA x;
    public DominioBL(){
        x = new DominioDA();
    }
    public ArrayList<Dominio> listaDominios() {
        return x.listaDominios();
    }
}
