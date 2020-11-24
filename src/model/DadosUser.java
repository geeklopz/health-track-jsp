package model;

import java.util.Date;

public class DadosUser {
	
	private int codigoUsuario;
	private Date dataNascimento;
	private String numeroPeso;
	private String numeroAltura;
	private String descricaoGenero;
	private String tipoSangue;
	private String numeroMeta;
	private String descricaoInfos;
	private String numeroPontos;
	
	public DadosUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DadosUser(int codigoUsuario, Date dataNascimento, String numeroPeso, String numeroAltura,
			String descricaoGenero, String tipoSangue, String numeroMeta, String descricaoInfos, String numeroPontos) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.dataNascimento = dataNascimento;
		this.numeroPeso = numeroPeso;
		this.numeroAltura = numeroAltura;
		this.descricaoGenero = descricaoGenero;
		this.tipoSangue = tipoSangue;
		this.numeroMeta = numeroMeta;
		this.descricaoInfos = descricaoInfos;
		this.numeroPontos = numeroPontos;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNumeroPeso() {
		return numeroPeso;
	}

	public void setNumeroPeso(String numeroPeso) {
		this.numeroPeso = numeroPeso;
	}

	public String getNumeroAltura() {
		return numeroAltura;
	}

	public void setNumeroAltura(String numeroAltura) {
		this.numeroAltura = numeroAltura;
	}

	public String getDescricaoGenero() {
		return descricaoGenero;
	}

	public void setDescricaoGenero(String descricaoGenero) {
		this.descricaoGenero = descricaoGenero;
	}

	public String getTipoSangue() {
		return tipoSangue;
	}

	public void setTipoSangue(String tipoSangue) {
		this.tipoSangue = tipoSangue;
	}

	public String getNumeroMeta() {
		return numeroMeta;
	}

	public void setNumeroMeta(String numeroMeta) {
		this.numeroMeta = numeroMeta;
	}

	public String getDescricaoInfos() {
		return descricaoInfos;
	}

	public void setDescricaoInfos(String descricaoInfos) {
		this.descricaoInfos = descricaoInfos;
	}

	public String getNumeroPontos() {
		return numeroPontos;
	}

	public void setNumeroPontos(String numeroPontos) {
		this.numeroPontos = numeroPontos;
	}
	
	
}
