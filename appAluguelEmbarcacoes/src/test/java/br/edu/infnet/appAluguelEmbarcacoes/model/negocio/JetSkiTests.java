package br.edu.infnet.appAluguelEmbarcacoes.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appAluguelEmbarcacoes.model.exception.ComplementoInvalidoException;

@SpringBootTest
public class JetSkiTests {

	@Test
	void testaInstanciaToString() throws ComplementoInvalidoException {
		JetSki jetSki = new JetSki("Garota de Aluguel", 750.0, Boolean.FALSE);
		jetSki.setNovo(Boolean.TRUE);
		jetSki.setComplemento("Com colete salva vidas");
		
		assertTrue("Garota de Aluguel;750.0;false;true;Com colete salva vidas".equals(jetSki.toString()));
	}
	
	@Test
	void testaCalculoValor() throws ComplementoInvalidoException {
		JetSki jetSki = new JetSki("Garota de Aluguel", 750.0, Boolean.FALSE);
		jetSki.setNovo(Boolean.TRUE);
		jetSki.setComplemento("Com colete salva vidas");
		
		assertEquals(jetSki.calcularValorAluguel(), 753);
	}
	
	@Test
	void testaComplementoInvalido() {
		try {
			JetSki jetSki = new JetSki("Garota de Aluguel", 750.0, Boolean.FALSE);
			jetSki.setNovo(Boolean.TRUE);
			jetSki.setComplemento(null);
		} catch (ComplementoInvalidoException e) {
			assertEquals("Complemento não Disponivel.", e.getMessage());
		}
	}

	@Test
	void testaObterValorPorEmbarcacao() throws ComplementoInvalidoException {
		JetSki jetSki = new JetSki("Garota de Aluguel", 750.0, Boolean.FALSE);
		jetSki.setNovo(Boolean.TRUE);
		jetSki.setComplemento("Com colete salva vidas");
		
		String result = "Garota de Aluguel;750.00\r";
		
		assertEquals(jetSki.obterValorPorEmbarcacao(), result);
	}
}