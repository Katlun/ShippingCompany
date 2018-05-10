package br.com.entidade;

public class Tipo {
	
	private int id;
	private String descricao;
	private double pesoMax;
	private double litros_km;
	
	public Tipo() {
	
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPesoMax() {
		return pesoMax;
	}
	
	public void setPesoMax(double pesoMax) {
		this.pesoMax = pesoMax;
	}

	public double getLitros_km() {
		return litros_km;
	}

	public void setLitros_km(double litros_km) {
		this.litros_km = litros_km;
	}
	
}
