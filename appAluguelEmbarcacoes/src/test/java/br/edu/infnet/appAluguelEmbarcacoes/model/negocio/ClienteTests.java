package br.edu.infnet.appAluguelEmbarcacoes.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteTests {
	
	@Test
	void testaInstancia() {
		Cliente s = null;
		
		s = new Cliente("Marcos Paulo", "12345678910", "marcos.paulo@marcos.paulo.com");
		
		assertNotNull(s);
	}
	
	@Test
	void testaToString() {
		Cliente s = null;
		
		s = new Cliente("Marcos Paulo", "12345678910", "marcos.paulo@marcos.paulo.com");

		assertTrue("Marcos Paulo;12345678910;marcos.paulo@marcos.paulo.com".equals(s.toString()));
	}
}