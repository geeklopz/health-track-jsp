package br.com.healthtrack.tests;

import java.util.List;

import br.com.healthtrack.dao.FoodDAO;
import br.com.healthtrack.model.Food;

public class TestFoodView {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Testando Alimentos...");
		
		System.out.println("Inserindo Valores...");
		
		FoodDAO foodDAO = new FoodDAO();
		
		// Insert
		
		foodDAO.insert();
		

		
		// GetAll
		
		List<Food> listaAlimentos = foodDAO.getAll();
		
		
		// For na Unha
		
//		for( int i = 0; i < listaPesos.size(); i++ ) {
//			
//			Peso p = listaPesos.get(i);
//			
//			System.out.println(p.getId_Peso() + " => " + p.getPeso() + " (" + p.getData() + ")");
//			
//		}
		
		// Outra Forma de Loop
		
		for(Food p : listaAlimentos) {
			System.out.println(p.getCodigoAlimento() + " : " + p.getQuantidadeCaloriaTotal() + " => " + p.getCodigoUsuario() + " (" + p.getCodigoTipoAlimento() + ")");
		}
		
		
		
		
	}
	
}
