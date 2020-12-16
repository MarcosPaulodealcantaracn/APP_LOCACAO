package br.edu.infnet.appAluguelEmbarcacoes.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmbarcacaoTests {

	@Test
	void testaIate() {
		Iate iate = null;
		
		iate = new Iate("Azzam",50000.0, Boolean.TRUE);
		
		assertNotNull(iate);
	}
	
	@Test
	void testaJetSki() {
		JetSki jetSki = null;
		
		jetSki = new JetSki("Garota de Aluguel", 750.0, Boolean.FALSE);
		
		assertNotNull(jetSki);
	}
	
	@Test
	void testaLancha() {
		Lancha lancha = null;
		
		lancha = new Lancha("Viper", 1500.0, Boolean.TRUE);
		
		assertNotNull(lancha);
	}
}