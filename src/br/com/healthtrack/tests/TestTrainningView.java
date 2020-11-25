package br.com.healthtrack.tests;

import java.util.List;

import br.com.healthtrack.dao.TrainningDAO;
import br.com.healthtrack.model.Trainning;


public class TestTrainningView {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Testando Trainning...");
		
		System.out.println("Inserindo Valores...");
		
		TrainningDAO trainningDAO = new TrainningDAO();
		
		// Insert
		
		trainningDAO.insert();
		

		
		// GetAll
		
		List<Trainning> listaTrainnings = trainningDAO.getAll();
		
		
		// For na Unha
		
//		for( int i = 0; i < listaPesos.size(); i++ ) {
//			
//			Peso p = listaPesos.get(i);
//			
//			System.out.println(p.getId_Peso() + " => " + p.getPeso() + " (" + p.getData() + ")");
//			
//		}
		
		// Outra Forma de Loop
		
		for(Trainning p : listaTrainnings) {
			System.out.println(p.getCodigoTreino() + " : " + p.getCodigoTipoTreino() + " => " + p.getNumeroCaloria() + " (" + p.getDataInicio() + ")" + p.getDataFim() + p.getNumeroPressao());
		}
		
		
		
		
	}
	
}
