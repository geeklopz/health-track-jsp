package model;

public class Food {
	
	private int codigoAlimento;
	private String quantidadeCaloriaTotal;
	private int codigoUsuario;
	private int codigoTipoAlimento;
	
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Food(int codigoAlimento, String quantidadeCaloriaTotal, int codigoUsuario, int codigoTipoAlimento) {
		super();
		this.codigoAlimento = codigoAlimento;
		this.quantidadeCaloriaTotal = quantidadeCaloriaTotal;
		this.codigoUsuario = codigoUsuario;
		this.codigoTipoAlimento = codigoTipoAlimento;
	}


	public int getCodigoAlimento() {
		return codigoAlimento;
	}


	public void setCodigoAlimento(int codigoAlimento) {
		this.codigoAlimento = codigoAlimento;
	}


	public String getQuantidadeCaloriaTotal() {
		return quantidadeCaloriaTotal;
	}


	public void setQuantidadeCaloriaTotal(String quantidadeCaloriaTotal) {
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
	
	
	
}
