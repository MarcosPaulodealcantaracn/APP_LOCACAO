package br.edu.infnet.appAluguelEmbarcacoes.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appAluguelEmbarcacoes.model.exception.ComplementoInvalidoException;

@SpringBootTest
public class LanchaTests {

	@Test
	void testaInstanciaToString() throws ComplementoInvalidoException {
		Lancha lancha = new Lancha("Viper", 1500.0, Boolean.FALSE);
		lancha.setNovo(Boolean.TRUE);
		lancha.setComplemento(" Com kit Churrasco");
		
		assertTrue("Viper;1500.0;false;true;Com Kit Churrasco".equals(lancha.toString()));
	}
	
	@Test
	void testaCalculoValor() throws ComplementoInvalidoException {
		Lancha lancha = new Lancha("Viper", 1500.0, Boolean.FALSE);
		lancha.setNovo(Boolean.TRUE);
		lancha.setComplemento("Com kit Churrasco");
		
		assertEquals(lancha.calcularValorAluguel(), 1503);
	}
	
	@Test
	void testaComplementoInvalido() {
		try {
			Lancha lancha = new Lancha("Viper", 1500.0, Boolean.FALSE);
			lancha.setNovo(Boolean.TRUE);
			lancha.setComplemento(null);
		} catch (ComplementoInvalidoException e) {
			assertEquals("Kit Churrasco não Disponivel.", e.getMessage());
		}
	}

	@Test
	void testaObterValorPorEmbarcacao() throws ComplementoInvalidoException {
		Lancha lancha = new Lancha("Viper", 1500.0, Boolean.FALSE);
		lancha.setNovo(Boolean.TRUE);
		lancha.setComplemento("Com kit Churrasco");
		
		String result = "Viper;1500.0\r";
		
		assertEquals(lancha.obterValorPorEmbarcacao(), result);
	}
}