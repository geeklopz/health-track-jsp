package br.com.healthtrack.model;

public class TipoTrainning {
	
	private int codigoTipoTreino;
	private String descricaoTreino;
	
	
	public TipoTrainning() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TipoTrainning(int codigoTipoTreino, String descricaoTreino) {
		super();
		this.codigoTipoTreino = codigoTipoTreino;
		this.descricaoTreino = descricaoTreino;
	}


	public int getCodigoTipoTreino() {
		return codigoTipoTreino;
	}


	public void setCodigoTipoTreino(int codigoTipoTreino) {
		this.codigoTipoTreino = codigoTipoTreino;
	}


	public String getDescricaoTreino() {
		return descricaoTreino;
	}


	public void setDescricaoTreino(String descricaoTreino) {
		this.descricaoTreino = descricaoTreino;
	}
	
	
	
	
}
