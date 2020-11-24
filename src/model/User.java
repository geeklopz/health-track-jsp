package model;

public class User {
	
	private int codigoUsuario;
	private String descricaoNome;
	private String descricaoSobrenome;
	private String descricaoEmail;
	private String descricaoSenha;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int codigoUsuario, String descricaoNome, String descricaoSobrenome, String descricaoEmail,
			String descricaoSenha) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.descricaoNome = descricaoNome;
		this.descricaoSobrenome = descricaoSobrenome;
		this.descricaoEmail = descricaoEmail;
		this.descricaoSenha = descricaoSenha;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getDescricaoNome() {
		return descricaoNome;
	}

	public void setDescricaoNome(String descricaoNome) {
		this.descricaoNome = descricaoNome;
	}

	public String getDescricaoSobrenome() {
		return descricaoSobrenome;
	}

	public void setDescricaoSobrenome(String descricaoSobrenome) {
		this.descricaoSobrenome = descricaoSobrenome;
	}

	public String getDescricaoEmail() {
		return descricaoEmail;
	}

	public void setDescricaoEmail(String descricaoEmail) {
		this.descricaoEmail = descricaoEmail;
	}

	public String getDescricaoSenha() {
		return descricaoSenha;
	}

	public void setDescricaoSenha(String descricaoSenha) {
		this.descricaoSenha = descricaoSenha;
	}
	
	
	
}
