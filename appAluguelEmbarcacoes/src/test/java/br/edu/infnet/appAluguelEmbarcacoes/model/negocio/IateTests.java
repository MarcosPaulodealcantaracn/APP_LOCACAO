package br.edu.infnet.appAluguelEmbarcacoes.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appAluguelEmbarcacoes.model.exception.EmbarcacaoInvalidaException;

@SpringBootTest
public class IateTests {

	@Test
	void testaInstanciaToString() throws EmbarcacaoInvalidaException {
		Iate iate = new Iate("Azzam", 50000.0, Boolean.TRUE);
		iate.setMarca("SUPREMEE");
		iate.setMedida(162);
		
		assertTrue("Azzam;50000.0;true;162;SUPREMEE".equals(iate.toString()));		
	}
	
	@Test
	void testaCalculoValor() throws EmbarcacaoInvalidaException {
		Iate iate = new Iate("Azzam", 50000.0, Boolean.TRUE);
		iate.setMarca("SUPREMEE");
		iate.setMedida(162);
		
		assertEquals(iate.calcularValorAluguel(), 50326);
	}
	
	@Test
	void testaEmbarcacaoInvalida() {
		try {
			Iate iate = new Iate("Azzam", 50000.0, Boolean.TRUE);
			iate.setMarca("SUPREMEE");
			iate.setMedida(16);
		} catch (EmbarcacaoInvalidaException e) {
			assertEquals("Embarcação não disponível.", e.getMessage());
		}
	}
	
	@Test
	void testaObterValorPorEmbarcacao() throws EmbarcacaoInvalidaException {
		Iate iate = new Iate("Azzam", 50000.0, Boolean.TRUE);
		iate.setMarca("SUPREMEE");
		iate.setMedida(162);
		
		String result = "Azzam;50000.0\r";
		
		assertEquals(iate.obterValorPorEmbarcacao(), result);
	}
}