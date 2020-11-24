package model;

import java.util.Date;

public class Peso {
	
	private int Cd_Usuario;
	private int Id_Peso;
	private String Peso;
	private Date Data;
	
	public Peso() {}
	
	public Peso(int cD_Usuario, int id_Peso, String nR_PESO, Date dT_PESO) {
		
		Cd_Usuario = cD_Usuario;
		Id_Peso = id_Peso;
		Peso = nR_PESO;
		Data = dT_PESO;
	}

	public int getId_Peso() {
		return Id_Peso;
	}
	
	public void setId_Peso(int id_Peso) {
		Id_Peso = id_Peso;
	}
	
	public String getPeso() {
		return Peso;
	}
	
	public void setPeso(String peso) {
		Peso = peso;
	}

	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	public int getCd_Usuario() {
		return Cd_Usuario;
	}

	public void setCd_Usuario(int cd_Usuario) {
		Cd_Usuario = cd_Usuario;
	}
	
	
	
}
