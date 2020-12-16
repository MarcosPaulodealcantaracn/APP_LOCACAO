package br.edu.infnet.appAluguelEmbarcacoes.model.negocio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LocacaoTests {

	@Test
	void testaAssociacao() {
		Cliente solicitante = new Cliente("Marcos Paulo", "12345678910", "marcos.paulo@marcos.paulo.com");
		
		Locacao locacao = new Locacao();
		locacao.setSolicitante(solicitante);
		
		assertTrue(solicitante.equals(locacao.getSolicitante()));
	}
	
	@Test
	void testaInternet() {
		Cliente solicitante = new Cliente("Marcos Paulo", "12345678910", "marcos.paulo@marcos.paulo.com");
		
		Locacao locacao = new Locacao();
		locacao.setSolicitante(solicitante);

		assertTrue(locacao.isWeb());
	}
	
	@Test
	void testaBalcao() {
		Cliente solicitante = new Cliente("Marcos Paulo", "12345678910", "marcos.paulo@marcos.paulo.com");
		
		Locacao locacao = new Locacao();
		locacao.setWeb(Boolean.FALSE);
		locacao.setSolicitante(solicitante);

		assertFalse(locacao.isWeb());
	}
	
	@Test
	void testaToString() {
		Cliente solicitante = new Cliente("Marcos Paulo", "12345678910", "marcos.paulo@marcos.paulo.com");
		
		Locacao locacao = new Locacao();
		locacao.setWeb(Boolean.FALSE);
		locacao.setSolicitante(solicitante);

		DateTimeFormatter formatoHoje = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime hoje = LocalDateTime.now();
		
		String textoPedido = hoje.format(formatoHoje)+";false;Marcos Paulo;12345678910;marcos.paulo@marcos.paulo.com";

		assertTrue(textoPedido.equals(locacao.toString()));
	}
}