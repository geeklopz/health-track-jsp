package br.com.healthtrack.model;

import java.util.Date;

public class Trainning {
	
	private int codigoTreino;
	private int codigoUsuario;
	private int codigoTipoTreino;
	private int numeroCaloria;
	private Date dataInicio;
	private Date dataFim;
	private String numeroPressao;
	
	
	public Trainning() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Trainning(int codigoTreino, int codigoUsuario,  int codigoTipoTreino, int numeroCaloria, Date dataInicio, Date dataFim,
			String numeroPressao) {
		super();
		this.codigoTreino = codigoTreino;
		this.setCodigoUsuario(codigoUsuario);
		this.codigoTipoTreino = codigoTipoTreino;
		this.numeroCaloria = numeroCaloria;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.numeroPressao = numeroPressao;
	}


	public int getCodigoTreino() {
		return codigoTreino;
	}


	public void setCodigoTreino(int codigoTreino) {
		this.codigoTreino = codigoTreino;
	}


	public int getCodigoTipoTreino() {
		return codigoTipoTreino;
	}


	public void setCodigoTipoTreino(int codigoTipoTreino) {
		this.codigoTipoTreino = codigoTipoTreino;
	}


	public int getNumeroCaloria() {
		return numeroCaloria;
	}


	public void setNumeroCaloria(int numeroCaloria) {
		this.numeroCaloria = numeroCaloria;
	}


	public Date getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Date getDataFim() {
		return dataFim;
	}


	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}


	public String getNumeroPressao() {
		return numeroPressao;
	}


	public void setNumeroPressao(String numeroPressao) {
		this.numeroPressao = numeroPressao;
	}


	public int getCodigoUsuario() {
		return codigoUsuario;
	}


	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	
	
	
}
