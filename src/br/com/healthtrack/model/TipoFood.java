package br.com.healthtrack.model;

public class TipoFood {
	
	private int codigoAlimento;
	private String descricaoAlimento;
	
	
	public TipoFood() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TipoFood(int codigoAlimento, String descricaoAlimento) {
		super();
		this.codigoAlimento = codigoAlimento;
		this.descricaoAlimento = descricaoAlimento;
	}


	public int getCodigoAlimento() {
		return codigoAlimento;
	}


	public void setCodigoAlimento(int codigoAlimento) {
		this.codigoAlimento = codigoAlimento;
	}


	public String getDescricaoAlimento() {
		return descricaoAlimento;
	}


	public void setDescricaoAlimento(String descricaoAlimento) {
		this.descricaoAlimento = descricaoAlimento;
	}
	
	
	
}
