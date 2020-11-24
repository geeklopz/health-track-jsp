package model;

import java.util.Date;

public class Bpm {
	
	private int codigoBpm;
	private String numeroBpm;
	private Date dataBpm;
	
	public Bpm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bpm(int codigoBpm, String numeroBpm, Date dataBpm) {
		super();
		this.codigoBpm = codigoBpm;
		this.numeroBpm = numeroBpm;
		this.dataBpm = dataBpm;
	}

	public int getCodigoBpm() {
		return codigoBpm;
	}

	public void setCodigoBpm(int codigoBpm) {
		this.codigoBpm = codigoBpm;
	}

	public String getNumeroBpm() {
		return numeroBpm;
	}

	public void setNumeroBpm(String numeroBpm) {
		this.numeroBpm = numeroBpm;
	}

	public Date getDataBpm() {
		return dataBpm;
	}

	public void setDataBpm(Date dataBpm) {
		this.dataBpm = dataBpm;
	}
	
	
	
}
