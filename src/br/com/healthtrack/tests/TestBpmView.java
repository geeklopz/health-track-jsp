package br.com.healthtrack.tests;

import java.util.List;

import br.com.healthtrack.dao.BpmDAO;
import br.com.healthtrack.model.Bpm;

public class TestBpmView {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Testando Bpm...");
		
		System.out.println("Inserindo Valores...");
		
		BpmDAO bpmDAO = new BpmDAO();
		
		// Insert
		
		bpmDAO.insert();
		

		
		// GetAll
		
		List<Bpm> listaBpms = bpmDAO.getAll();
		
		
		// For na Unha
		
//		for( int i = 0; i < listaPesos.size(); i++ ) {
//			
//			Peso p = listaPesos.get(i);
//			
//			System.out.println(p.getId_Peso() + " => " + p.getPeso() + " (" + p.getData() + ")");
//			
//		}
		
		// Outra Forma de Loop
		
		for(Bpm p : listaBpms) {
			System.out.println(p.getCodigoBpm() + " : " + p.getCodigoUsuario() + " => " + p.getNumeroBpm() + " (" + p.getDataBpm() + ")");
		}
		
		
		
		
	}
	
}
