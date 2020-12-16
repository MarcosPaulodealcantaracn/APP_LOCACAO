package br.edu.infnet.appAluguelEmbarcacoes.model.negocio;

public abstract class Embarcacao {

	private String descricao;
	private double valor;
	private boolean disponivel;
	
	public Embarcacao(String descricao, double valor, boolean disponivel) {
		this.descricao = descricao;
		this.valor = valor;
		this.disponivel = disponivel;
	}

public abstract double calcularValorAluguel();
	
	public String obterValorPorEmbarcacao() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.calcularValorAluguel());
		sb.append("\r");
		
		return sb.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.getValor());
		sb.append(";");
		sb.append(this.isDisponivel());
		
		return sb.toString();
	}
	
	public String getDescricao() {
		return descricao;
	}
	public double getValor() {
		return valor;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
}
