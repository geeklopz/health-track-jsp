package br.com.healthtrack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.model.Bpm;

import java.util.Date;

public class BpmDAO {
	
	
	// getAll
	public List<Bpm> getAll() {
		
		List<Bpm> listaBpms = new ArrayList<Bpm>();
		
		
		try {
			
		    //Registra o Driver
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		  
		    //Abre uma conexão
		    Connection conexao = DriverManager.getConnection(
		    		"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84194", "091082");
		        
		    System.out.println("Conectado!");
		        
		    PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_BPM ORDER BY CD_BPM");
		    
		    //stmt.setString(1, "");
		    
		    ResultSet result = stmt.executeQuery();
		    
		    //Results
		    while (result.next()) {
		    	
		    	int codigoBpm = result.getInt("CD_BPM");
		        int codigoUsuario = result.getInt("CD_USUARIO");
		        String numeroBpm= result.getString("NR_BPM");
		        Date dataBpm = result.getDate("DT_BPM");
		    	
		    	//Data
		        //System.out.println(CD_PESO + "foi");
		        
				listaBpms.add( new Bpm(codigoBpm, codigoUsuario, numeroBpm, dataBpm) );

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
		
		return listaBpms;
		
	}
	
	
	
	public Bpm getById(int id) {
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
		        
		    PreparedStatement stmt = conexao.prepareStatement("INSERT INTO t_bpm (CD_BPM, cd_usuario, NR_BPM, DT_BPM) values (sq_bpm.nextval, 1, 145,TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt2 = conexao.prepareStatement("INSERT INTO t_bpm (CD_BPM, cd_usuario, NR_BPM, DT_BPM) values (sq_bpm.nextval, 1, 145,TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt3 = conexao.prepareStatement("INSERT INTO t_bpm (CD_BPM, cd_usuario, NR_BPM, DT_BPM) values (sq_bpm.nextval, 1, 145,TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt4 = conexao.prepareStatement("INSERT INTO t_bpm (CD_BPM, cd_usuario, NR_BPM, DT_BPM) values (sq_bpm.nextval, 1, 145,TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt5 = conexao.prepareStatement("INSERT INTO t_bpm (CD_BPM, cd_usuario, NR_BPM, DT_BPM) values (sq_bpm.nextval, 1, 145,TO_DATE('01/03/2020', 'DD/MM/YYYY'))");

		   		    
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
