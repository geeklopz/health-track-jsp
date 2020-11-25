package br.com.healthtrack.model;


public class Dashboard {
	

	private int quantidadeCalorias;
	private int quantidadeCaloriasTreino;
	private int quantidadeBPM;
	private String quantidadePeso;
	private Double valorIMC;
	
	public Dashboard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dashboard(int quantidadeCalorias, int quantidadeCaloriasTreino, int quantidadeBPM, String quantidadePeso,
			Double valorIMC) {
		super();
		this.quantidadeCalorias = quantidadeCalorias;
		this.quantidadeCaloriasTreino = quantidadeCaloriasTreino;
		this.quantidadeBPM = quantidadeBPM;
		this.quantidadePeso = quantidadePeso;
		this.valorIMC = valorIMC;
	}

	public int getQuantidadeCalorias() {
		return quantidadeCalorias;
	}

	public void setQuantidadeCalorias(int quantidadeCalorias) {
		this.quantidadeCalorias = quantidadeCalorias;
	}

	public int getQuantidadeCaloriasTreino() {
		return quantidadeCaloriasTreino;
	}

	public void setQuantidadeCaloriasTreino(int quantidadeCaloriasTreino) {
		this.quantidadeCaloriasTreino = quantidadeCaloriasTreino;
	}

	public int getQuantidadeBPM() {
		return quantidadeBPM;
	}

	public void setQuantidadeBPM(int quantidadeBPM) {
		this.quantidadeBPM = quantidadeBPM;
	}

	public String getQuantidadePeso() {
		return quantidadePeso;
	}

	public void setQuantidadePeso(String quantidadePeso) {
		this.quantidadePeso = quantidadePeso;
	}

	public Double getValorIMC() {
		return valorIMC;
	}

	public void setValorIMC(Double valorIMC) {
		this.valorIMC = valorIMC;
	}
	
	
	
	
	

	
	
}
