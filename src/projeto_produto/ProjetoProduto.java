/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_produto;

import java.util.Objects;

import projeto_produto.dao.ConnectionFactory;
import projeto_produto.view.Menu;

/**
 *
 * @author pedro
 */
public class ProjetoProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	ConnectionFactory cf = new ConnectionFactory();
    	
    	
    	if(Objects.isNull(cf.conectar())) {
    		return;
    	}
    	
        cf.desconectar();
    	Menu.main(args);
    }
    
}
