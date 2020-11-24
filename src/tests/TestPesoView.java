package tests;

import java.util.List;

import dao.PesoDAO;
import model.Peso;

public class TestPesoView {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Testando Pesos...");
		
		System.out.println("Inserindo Valores...");
		
		PesoDAO pesoDAO = new PesoDAO();
		
		// Insert
		
		pesoDAO.insert();
		

		
		// GetAll
		
		List<Peso> listaPesos = pesoDAO.getAll();
		
		
		// For na Unha
		
//		for( int i = 0; i < listaPesos.size(); i++ ) {
//			
//			Peso p = listaPesos.get(i);
//			
//			System.out.println(p.getId_Peso() + " => " + p.getPeso() + " (" + p.getData() + ")");
//			
//		}
		
		// Outra Forma de Loop
		
		for(Peso p : listaPesos) {
			System.out.println(p.getCd_Usuario() + " : " + p.getId_Peso() + " => " + p.getPeso() + " (" + p.getData() + ")");
		}
		
		
		
		
	}
	
}
