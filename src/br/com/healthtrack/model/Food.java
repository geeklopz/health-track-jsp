package br.com.healthtrack.model;

import java.util.Date;

public class Food {
	
	private int codigoAlimento;
	private int quantidadeCaloriaTotal;
	private int codigoUsuario;
	private int codigoTipoAlimento;
	private Date dataAlimento;
	
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Food(int codigoAlimento, int quantidadeCaloriaTotal, int codigoUsuario, int codigoTipoAlimento,
			Date dataAlimento) {
		super();
		this.codigoAlimento = codigoAlimento;
		this.quantidadeCaloriaTotal = quantidadeCaloriaTotal;
		this.codigoUsuario = codigoUsuario;
		this.codigoTipoAlimento = codigoTipoAlimento;
		this.dataAlimento = dataAlimento;
	}


	public int getCodigoAlimento() {
		return codigoAlimento;
	}


	public void setCodigoAlimento(int codigoAlimento) {
		this.codigoAlimento = codigoAlimento;
	}


	public int getQuantidadeCaloriaTotal() {
		return quantidadeCaloriaTotal;
	}


	public void setQuantidadeCaloriaTotal(int quantidadeCaloriaTotal) {
		this.quantidadeCaloriaTotal = quantidadeCaloriaTotal;
	}


	public int getCodigoUsuario() {
		return codigoUsuario;
	}


	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}


	public int getCodigoTipoAlimento() {
		return codigoTipoAlimento;
	}


	public void setCodigoTipoAlimento(int codigoTipoAlimento) {
		this.codigoTipoAlimento = codigoTipoAlimento;
	}


	public Date getDataAlimento() {
		return dataAlimento;
	}


	public void setDataAlimento(Date dataAlimento) {
		this.dataAlimento = dataAlimento;
	}
	
	

	
	
	
}
