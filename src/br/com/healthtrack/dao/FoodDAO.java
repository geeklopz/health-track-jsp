package br.com.healthtrack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.model.Food;

import java.util.Date;

public class FoodDAO {
	
	
	// getAll
	public List<Food> getAll() {
		
		List<Food> listaAlimentos = new ArrayList<Food>();
		
		
		
		try {
			
		    //Registra o Driver
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		  
		    //Abre uma conexão
		    Connection conexao = DriverManager.getConnection(
		    		"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84194", "091082");
		        
		    System.out.println("Conectado!");
		        
		    PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_ALIMENTO ORDER BY CD_ALIMENTO");
		    
		    //stmt.setString(1, "");
		    
		    ResultSet result = stmt.executeQuery();
		    
		    //Results
		    while (result.next()) {
		    	
		    	int codigoAlimento = result.getInt("CD_ALIMENTO");
		        int codigoUsuario = result.getInt("CD_USUARIO");
		        int codigoTipoAlimento = result.getInt("CD_TIPO_ALIMENTO");
		        int quantidadeCaloriaTtl = result.getInt("QT_CALORIA_TOTAL");
		        Date dataAlimento = result.getDate("DT_ALIMENTO");
		    	
		    	//Data
		        //System.out.println(CD_ALIMENTO + "foi");
		        
				listaAlimentos.add( new Food(codigoAlimento, codigoUsuario, codigoTipoAlimento, quantidadeCaloriaTtl, dataAlimento) );

		  }
		    		    
		    //Fecha a conexão
		    conexao.close();
		    
		    
			} catch (SQLException e) {
			      System.err.println("Não foi possível conectar no Banco de Dados");
			      e.printStackTrace();
			      
			    } catch (ClassNotFoundException e) {
			      System.err.println("O Driver JDBC não foi encontrado!");
			      e.printStackTrace();
			    }
		
		return listaAlimentos;
		
	}
	
	
	
	public Food getById(int id) {
		return getAll().get(id);
	}
	
	
	
	public void insert() {
		
		// Insert Data DB
		try {
			
		    //Registra o Driver
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		  
		    //Abre uma conexão
		    Connection conexao = DriverManager.getConnection(
		    		"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84194", "091082");
		        
		    System.out.println("Conectado!");
		        
		    PreparedStatement stmt = conexao.prepareStatement("INSERT INTO t_alimento (CD_ALIMENTO, CD_USUARIO, CD_TIPO_ALIMENTO, QT_CALORIA_TOTAL, DT_ALIMENTO) values (sq_alimento.nextval, 1, 2,3000,TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt2 = conexao.prepareStatement("INSERT INTO t_alimento (CD_ALIMENTO, CD_USUARIO, CD_TIPO_ALIMENTO, QT_CALORIA_TOTAL, DT_ALIMENTO) values (sq_alimento.nextval, 1, 2,3000,TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt3 = conexao.prepareStatement("INSERT INTO t_alimento (CD_ALIMENTO, CD_USUARIO, CD_TIPO_ALIMENTO, QT_CALORIA_TOTAL, DT_ALIMENTO) values (sq_alimento.nextval, 1, 2,3000,TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt4 = conexao.prepareStatement("INSERT INTO t_alimento (CD_ALIMENTO, CD_USUARIO, CD_TIPO_ALIMENTO, QT_CALORIA_TOTAL, DT_ALIMENTO) values (sq_alimento.nextval, 1, 2,3000,TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt5 = conexao.prepareStatement("INSERT INTO t_alimento (CD_ALIMENTO, CD_USUARIO, CD_TIPO_ALIMENTO, QT_CALORIA_TOTAL, DT_ALIMENTO) values (sq_alimento.nextval, 1, 2,3000,TO_DATE('01/03/2020', 'DD/MM/YYYY'))");

		   		    
		    System.out.println("Inserido com Sucesso!");

		    stmt.executeQuery();
		    stmt2.executeQuery();
		    stmt3.executeQuery();
		    stmt4.executeQuery();
		    stmt5.executeQuery();
		    
		    //Fecha a conexão
		    conexao.close();
		    
		    
			} catch (SQLException e) {
			      System.err.println("Não foi possível conectar no Banco de Dados");
			      e.printStackTrace();
			      
			    } catch (ClassNotFoundException e) {
			      System.err.println("O Driver JDBC não foi encontrado!");
			      e.printStackTrace();
			    }
		
	}
	

}
