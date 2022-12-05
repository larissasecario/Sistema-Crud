
package DAO;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConectarBD {
    
    Connection conectar = null;
    
    public  Connection bancoDados(){
        
        try{
            String url = "jdbc:mysql:";
            conectar = DriverManager.getConnection(url);
            System.out.println("conexao feita");
        
        }catch(SQLException erro){
            System.out.println("Impossivel conectar com banco. Erro na Classe(ConectarBD) Pacote(DAO)" + erro.getMessage());
        }
    
        
    return conectar;
    }
    
    
    
}
