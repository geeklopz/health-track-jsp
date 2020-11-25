package br.com.healthtrack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.model.Dashboard;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Date;
  
  public class DashboardDAO {
  
    public static void main(String[] args) {
 
    	
      try {
        //Registra o Driver
        Class.forName("oracle.jdbc.driver.OracleDriver");
  
        //Abre uma conexão
        Connection conexao = DriverManager.getConnection(
            "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84194", "091082");
        
        System.out.println("Conectado!");
                
        //Alimento
        Statement ALIMENTO = conexao.createStatement();
        ResultSet rs = ALIMENTO.executeQuery("select sum (qt_caloria_total) from t_alimento where 1=1 and trunc(dt_alimento) = trunc(sysdate)");
        
        int quantidadeCalorias = 0;
        
        if (rs.next()) {
            quantidadeCalorias = rs.getInt(1); 
        }
        
        
        System.out.println("Calorias Alimentos: " + quantidadeCalorias);
        
        //Treino
        Statement TREINO = conexao.createStatement();
        ResultSet rsTREINO = TREINO.executeQuery("select sum (nr_caloria) from t_treino where 1=1 and trunc(sysdate) between trunc(dt_inicio) and trunc(dt_fim)");
        
        int quantidadeCaloriasTreino = 0;
        
        if (rsTREINO.next()) {
        	quantidadeCaloriasTreino = rsTREINO.getInt(1); 
        }
        
        System.out.println("Calorias Treinos: " + quantidadeCaloriasTreino);
        
        //BPM
        Statement BPM = conexao.createStatement();
        ResultSet rsBPM = BPM.executeQuery("select * from t_bpm where 1=1 and cd_bpm = (select max (cd_bpm) from t_bpm where 1=1)");
        
        int quantidadeBPM = 0;
        
        if (rsBPM.next()) {
        	quantidadeBPM = rsBPM.getInt(1);
        }
        
        System.out.println("BPM: " + quantidadeBPM);
        
        //Peso
        Statement PESO = conexao.createStatement();
        ResultSet rsPESO = PESO.executeQuery("select * from t_peso where 1=1 and cd_peso = (select max (cd_peso) from t_peso where 1=1)");
        
        String quantidadePeso = null;
        
        if (rsPESO.next()) {
        	quantidadePeso = rsPESO.getString(3);
        }
        
        System.out.println("Peso: " + quantidadePeso);
        
        //IMC
        Statement IMC = conexao.createStatement();
        ResultSet rsIMC = IMC.executeQuery("select round(tp.nr_peso/(tdu.nr_altura*tdu.nr_altura),2) from t_dados_user tdu, t_peso tp where 1=1 and tdu.cd_usuario = tp.cd_usuario and tp.cd_peso = (select max (tp2.cd_peso) from t_peso tp2 where 1=1 and tp2.cd_usuario = tdu.cd_usuario)");
        
        Double valorIMC = 0.00;
        
        if (rsIMC.next()) {
        	valorIMC = rsIMC.getDouble(1);
        }
        
        System.out.println("IMC: " + valorIMC);
        
        //listaDashboard.add( new Dashboard(quantidadeCalorias, quantidadeCaloriasTreino, quantidadeBPM, quantidadePeso, valorIMC) );
        
        //Fecha a conexão
        conexao.close();
        
      //Tratamento de erro  
      } catch (SQLException e) {
        System.err.println("Não foi possível conectar no Banco de Dados");
        e.printStackTrace();
      } catch (ClassNotFoundException e) {
        System.err.println("O Driver JDBC não foi encontrado!");
        e.printStackTrace();
      }
    }
        
    
  }
