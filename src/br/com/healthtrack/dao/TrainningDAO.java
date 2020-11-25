package br.com.healthtrack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.model.Trainning;

import java.util.Date;

public class TrainningDAO {
	
	
	// getAll
	public List<Trainning> getAll() {
		
		List<Trainning> listaTreinos = new ArrayList<Trainning>();
		
		
		
		try {
			
		    //Registra o Driver
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		  
		    //Abre uma conexão
		    Connection conexao = DriverManager.getConnection(
		    		"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84194", "091082");
		        
		    System.out.println("Conectado!");
		        
		    PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_TREINO ORDER BY CD_TREINO");
		    
		    //stmt.setString(1, "");
		    
		    ResultSet result = stmt.executeQuery();
		    
		    //Results
		    while (result.next()) {
		    	
		    	int codigoTreino = result.getInt("CD_TREINO");
		        int codigoUsuario = result.getInt("CD_USUARIO");
		        int codigoTipotreino = result.getInt("CD_TIPO_TREINO");
		        int numeroCaloria = result.getInt("NR_CALORIA");
		        Date dataInicio = result.getDate("DT_INICIO");
		        Date dataFim = result.getDate("DT_FIM");
		        String numeroPressao = result.getString("NR_PRESSAO");
		    	
		    	//Data
		        //System.out.println(CD_ALIMENTO + "foi");
		        
				listaTreinos.add( new Trainning(codigoTreino, codigoUsuario, codigoTipotreino, numeroCaloria, dataInicio, dataFim, numeroPressao) );

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
		
		return listaTreinos;
		
	}
	
	
	
	public Trainning getById(int id) {
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
		        
		    PreparedStatement stmt = conexao.prepareStatement("INSERT INTO t_treino (CD_TREINO, CD_USUARIO, CD_TIPO_TREINO, NR_CALORIA, DT_INICIO, DT_FIM) values (sq_treino.nextval, 1, 3,3322,TO_DATE('01/03/2020', 'DD/MM/YYYY'), TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt2 = conexao.prepareStatement("INSERT INTO t_treino (CD_TREINO, CD_USUARIO, CD_TIPO_TREINO, NR_CALORIA, DT_INICIO, DT_FIM) values (sq_treino.nextval, 1, 3,3322,TO_DATE('01/03/2020', 'DD/MM/YYYY'), TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt3 = conexao.prepareStatement("INSERT INTO t_treino (CD_TREINO, CD_USUARIO, CD_TIPO_TREINO, NR_CALORIA, DT_INICIO, DT_FIM) values (sq_treino.nextval, 1, 3,3322,TO_DATE('01/03/2020', 'DD/MM/YYYY'), TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt4 = conexao.prepareStatement("INSERT INTO t_treino (CD_TREINO, CD_USUARIO, CD_TIPO_TREINO, NR_CALORIA, DT_INICIO, DT_FIM) values (sq_treino.nextval, 1, 3,3322,TO_DATE('01/03/2020', 'DD/MM/YYYY'), TO_DATE('01/03/2020', 'DD/MM/YYYY'))");
		    PreparedStatement stmt5 = conexao.prepareStatement("INSERT INTO t_treino (CD_TREINO, CD_USUARIO, CD_TIPO_TREINO, NR_CALORIA, DT_INICIO, DT_FIM) values (sq_treino.nextval, 1, 3,3322,TO_DATE('01/03/2020', 'DD/MM/YYYY'), TO_DATE('01/03/2020', 'DD/MM/YYYY'))");

		   		    
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
