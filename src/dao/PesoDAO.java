package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import model.Peso;

public class PesoDAO {
	
	
	// getAll
	public List<Peso> getAll() {
		
		List<Peso> listaPesos = new ArrayList<Peso>();
		
//		listaPesos.add( new Peso(1, 65.7, "20/04/2020") );
//		listaPesos.add( new Peso(2, 45.0, "20/06/2020") );
//		listaPesos.add( new Peso(3, 56.2, "20/03/2020") );
//		listaPesos.add( new Peso(4, 80.6, "20/08/2020") );
//		listaPesos.add( new Peso(5, 63.9, "20/09/2020") );
//		listaPesos.add( new Peso(6, 35.4, "20/03/2020") );
//		listaPesos.add( new Peso(7, 67.7, "20/02/2020") );
//		listaPesos.add( new Peso(8, 60.6, "20/01/2020") );
//		listaPesos.add( new Peso(9, 95.2, "20/07/2020") );
//		listaPesos.add( new Peso(10, 55.4, "20/10/2020") );
		
		
		try {
			
		    //Registra o Driver
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		  
		    //Abre uma conexão
		    Connection conexao = DriverManager.getConnection(
		    		"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84194", "091082");
		        
		    System.out.println("Conectado!");
		        
		    PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_PESO ORDER BY CD_PESO");
		    
		    //stmt.setString(1, "");
		    
		    ResultSet result = stmt.executeQuery();
		    
		    //Results
		    while (result.next()) {
		    	
		    	int CD_PESO = result.getInt("CD_PESO");
		        int CD_USUARIO = result.getInt("CD_USUARIO");
		        String NR_PESO = result.getNString("NR_PESO");
		        Date DT_PESO = result.getDate("DT_PESO");
		    	
		    	//Data
		        //System.out.println(CD_PESO + "foi");
		        
				listaPesos.add( new Peso(CD_USUARIO, CD_PESO, NR_PESO, DT_PESO) );

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
		
		return listaPesos;
		
	}
	
	
	
	public Peso getById(int id) {
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
		        
		    PreparedStatement stmt = conexao.prepareStatement("INSERT INTO t_peso (cd_peso, cd_usuario, nr_peso, dt_peso) values (sq_peso.nextval, 1, '99,5',TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt2 = conexao.prepareStatement("INSERT INTO t_peso (cd_peso, cd_usuario, nr_peso, dt_peso) values (sq_peso.nextval, 1, '99,5',TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt3 = conexao.prepareStatement("INSERT INTO t_peso (cd_peso, cd_usuario, nr_peso, dt_peso) values (sq_peso.nextval, 1, '99,5',TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt4 = conexao.prepareStatement("INSERT INTO t_peso (cd_peso, cd_usuario, nr_peso, dt_peso) values (sq_peso.nextval, 1, '99,5',TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt5 = conexao.prepareStatement("INSERT INTO t_peso (cd_peso, cd_usuario, nr_peso, dt_peso) values (sq_peso.nextval, 1, '99,5',TO_DATE('01/03/2020', 'DD/MM/YYYY'))");

		   		    
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
