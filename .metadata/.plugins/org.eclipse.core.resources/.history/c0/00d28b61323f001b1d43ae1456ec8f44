package br.edu.infnet.appAluguelEmbarcacoes.model.negocio;

import br.edu.infnet.appAluguelEmbarcacoes.model.exception.ComplementoInvalidoException;

public class Lancha extends Embarcacao {

	private boolean nova;
	private String complemento;
	
	public Lancha(String descricao, double valor, boolean disponivel) {
		super(descricao, valor, disponivel);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isNova());
		sb.append(";");
		sb.append(this.getComplemento());

		return sb.toString();
	}

	@Override
	public double calcularValorAluguel() {
		return (this.getValor() + (this.isDisponivel() ? 2 : 0) + (this.isNova() ? 3 : 0));
	}

	public boolean isNova() {
		return nova;
	}
	public void setNovo(boolean novo) {
		this.nova = novo;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) throws ComplementoInvalidoException {
		
		if(complemento == null) {
			throw new ComplementoInvalidoException("Complemento inválido.");
		}
		
		this.complemento = complemento;
	}
}
