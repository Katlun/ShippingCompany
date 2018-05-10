package br.com.entidade;

public class Viagem {
	
	private int id;
	private int idCaminhao;
	private String tipoViagem;
	private String motorista;
	private int kmInicial;
	private int kmFinal;
	private String cidade;
	private String estado;
	private double custoCombustivel;
	private int dataSaida;
	private int horaSaida;
	private int dataChegada;
	private int horaChegada;
	
	public Viagem() {
	
	}

	//-------------------------------------------------------------------------------------------------------------------------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCaminhao() {
		return idCaminhao;
	}

	public void setIdCaminhao(int idCaminhao) {
		this.idCaminhao = idCaminhao;
	}

	public String getTipoViagem() {
		return tipoViagem;
	}

	public void setTipoViagem(String tipoViagem) {
		this.tipoViagem = tipoViagem;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public int getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}

	public int getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getCustoCombustivel() {
		return custoCombustivel;
	}

	public void setCustoCombustivel(double custoCombustivel) {
		this.custoCombustivel = custoCombustivel;
	}

	public int getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(int dataSaida) {
		this.dataSaida = dataSaida;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	public int getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(int dataChegada) {
		this.dataChegada = dataChegada;
	}

	public int getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(int horaChegada) {
		this.horaChegada = horaChegada;
	}
	
}
