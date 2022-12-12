/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_produto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class ConnectionFactory {
    
    private Connection connection = null;
//    private Statement statement = null;
    

    public Connection conectar() {
    	
    	String url = "jdbc:postgresql://localhost:5437/JyuwlBCY";
    	Properties props = new Properties();
    	props.setProperty("user", "JyuwlBCY");
    	props.setProperty("password", "0WIGdPU@0?^D&Q");
    	props.setProperty("ssl", "false");
    	props.setProperty("currentSchema", "projetoproduto");
        try {
        	Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, props);
//            this.statement = this.connection.createStatement();
            
            return this.connection;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro de conexão:" + e.getMessage());
            return null;
        }
       
    }

    public boolean estaConectado() {

        if (this.connection != null) {
            return true;
        } else {
            return false;
        }
    }

    public void desconectar() {
        try {
            this.connection.close();
            System.out.println("Desconectado do Banco de Dados!");
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
    
}
