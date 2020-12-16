package br.edu.infnet.appAluguelEmbarcacoes.model.negocio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Locacao {

	private LocalDateTime data;
	private boolean web;
	private Cliente solicitante;
	
	public Locacao() {
		this.data = LocalDateTime.now();
		this.web = Boolean.TRUE;
	}
	
	@Override
	public String toString() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s;%s;%s", 
				this.getData().format(formatter), 
				this.isWeb(), 
				this.solicitante.toString()
			);
	}

	public LocalDateTime getData() {
		return data;
	}
	public boolean isWeb() {
		return web;
	}
	public void setWeb(boolean web) {
		this.web = web;
	}
	public Cliente getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Cliente solicitante) {
		this.solicitante = solicitante;
	}
}