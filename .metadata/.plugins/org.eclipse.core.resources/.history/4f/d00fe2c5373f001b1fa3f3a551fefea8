package br.edu.infnet.appAluguelEmbarcacoes.model.negocio;

import br.edu.infnet.appAluguelEmbarcacoes.model.exception.EmbarcacaoInvalidaException;

public class Iate extends Embarcacao {

	private double medida;
	private String marca;
	
	public Iate(String descricao, double valor, boolean disponivel) {
		super(descricao, valor, disponivel);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getMedida());
		sb.append(";");
		sb.append(this.getMarca());
		
		return sb.toString();
	}

	@Override
	public double calcularValorAluguel() {
		
		return (float) (this.getValor() + (this.isDisponivel() ? 2 : 0) + this.getMedida() * 0.02f);
	}

	public double getMedida() {
		return medida;
	}
	public void setMedida(double d) throws EmbarcacaoInvalidaException {
		
		if(d <= 100) {
			throw new EmbarcacaoInvalidaException("Embarcação não disponível.");
		}
		
		this.medida = d;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
