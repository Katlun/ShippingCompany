package br.com.entidade;

import br.com.enumeracao.ESTADO;

public class Caminhao {
	
	private int id;
	private int tipoCaminhao;
	private String codigo;
	private String marca;
	private String modelo;
	private String cor;
	private String combustivel;
	private int portas;
	private String cambio;
	private String carroceria;
	private String placa;
	private double comprimento;
	private ESTADO estado;
	private String carga;


	public Caminhao() {

	}
	
	
	
	
	//-----------------------------------------------------------------------------------------------------------
	public int getTipoCaminhao() {
		return tipoCaminhao;
	}

	public void setTipoCaminhao(int i) {
		this.tipoCaminhao = i;
	}

	public ESTADO getEstado() {
		return estado;
	}
	
	public void setEstado(ESTADO estado) {
		this.estado = estado;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public String getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}