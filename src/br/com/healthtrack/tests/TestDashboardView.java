package br.com.healthtrack.tests;

import java.util.List;

import br.com.healthtrack.dao.BpmDAO;
import br.com.healthtrack.model.Bpm;

public class TestDashboardView {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Testando Dashboard...");
		
		System.out.println("Consultando Valores...");
		
		DashboardDAO dashboardDAO = new DashboardDAO();
		
		
		// GetAll
		
		List<Dashboard> listaDashboard = dashboardDAO.getAll();
		
		
		// For na Unha
		
//		for( int i = 0; i < listaPesos.size(); i++ ) {
//			
//			Peso p = listaPesos.get(i);
//			
//			System.out.println(p.getId_Peso() + " => " + p.getPeso() + " (" + p.getData() + ")");
//			
//		}
		
		// Outra Forma de Loop
		
		for(Bpm p : listaDashboard) {
			System.out.println(p.getCodigoBpm() + " : " + p.getCodigoUsuario() + " => " + p.getNumeroBpm() + " (" + p.getDataBpm() + ")");
		}
		
		
		
		
	}
	
}
