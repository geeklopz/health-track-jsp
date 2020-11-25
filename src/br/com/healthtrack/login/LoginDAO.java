//package br.com.healthtrack.login;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import br.com.healthtrack.login.LoginBean;
//
//public class LoginDAO {
//
//    public boolean validate(LoginBean LoginBean) throws ClassNotFoundException {
//    	
//        boolean status = false;
//
//	    //Registra o Driver
//	    Class.forName("oracle.jdbc.driver.OracleDriver");
//	  
//	    //Abre uma conexão
//	   try (Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84194", "091082");
//        
//			PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_USUARIO WHERE username = ? and password = ?")) {
//        	
//            stmt.setNString(1, loginBean.getUsername());
//            stmt.setNString(2, loginBean.getPassword());
//
//            System.out.println(stmt);
//            ResultSet rs = stmt.executeQuery();
//            status = rs.next();
//
//        } catch (SQLException e) {
//            // process sql exception
//            printSQLException(e);
//        }
//        return status;
//    }
//
//    private void printSQLException(SQLException ex) {
//        for (Throwable e: ex) {
//            if (e instanceof SQLException) {
//                e.printStackTrace(System.err);
//                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
//                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
//                System.err.println("Message: " + e.getMessage());
//                Throwable t = ex.getCause();
//                while (t != null) {
//                    System.out.println("Cause: " + t);
//                    t = t.getCause();
//                }
//            }
//        }
//    }
//}