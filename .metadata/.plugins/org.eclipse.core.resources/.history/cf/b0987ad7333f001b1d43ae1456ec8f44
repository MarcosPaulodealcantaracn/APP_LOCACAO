package br.edu.infnet.appAluguelEmbarcacoes.model.leitura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.infnet.appAluguelEmbarcacoes.model.exception.ComplementoInvalidoException;
import br.edu.infnet.appAluguelEmbarcacoes.model.exception.EmbarcacaoInvalidaException;
import br.edu.infnet.appAluguelEmbarcacoes.model.negocio.Iate;
import br.edu.infnet.appAluguelEmbarcacoes.model.negocio.JetSki;
import br.edu.infnet.appAluguelEmbarcacoes.model.negocio.Lancha;

public class ArquivoTests {

public static void main(String[] args) {
		
		String dir = "C:\\Users\\Membros_Acn\\Desktop\\Graduação - Sistema da Informação\\Bloco Java\\Fundamentos do Desenvolvimento Java - Terças e Quinta\\Aulas - Fundamentos do Desenvolvimento Java\\workspace";
		String arq = "pedidos.txt";

		try {
			FileReader leitura = new FileReader(dir+arq);			
			BufferedReader in = new BufferedReader(leitura);
			
			FileWriter escrita = new FileWriter(dir+"out_"+arq);			
			BufferedWriter out = new BufferedWriter(escrita);

			String linha = in.readLine();
			
			while(linha != null) {
				
				String[] campos = linha.split(";");
				
				
				switch (campos[0].toUpperCase()) {
				case "I":
					Iate iate = new Iate(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
					iate.setMedida(Float.valueOf(campos[4]));
					iate.setMarca(campos[5]);
					
					out.write(iate.obterValorPorEmbarcacao());
					break;

				case "J":
					JetSki jetSki = new JetSki(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
					jetSki.setNovo(Boolean.valueOf(campos[4]));
					jetSki.setComplemento(campos[5]);

					out.write(jetSki.obterValorPorEmbarcacao());					
					break;

				case "L":
					Lancha lancha = new Lancha(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
					lancha.setNovo(Boolean.valueOf(campos[4]));
					lancha.setComplemento((campos[5]));

					out.write(lancha.obterValorPorEmbarcacao());
					break;
					
				default:
					break;
				}

				linha = in.readLine();
			}

			in.close();
			leitura.close();
			
			out.close();
			escrita.close();
			
			System.out.println(args.length == 1 ? args[0] : "Migrado com Sucesso!!");
		} catch (IOException | EmbarcacaoInvalidaException | ComplementoInvalidoException  e) {
			System.out.println(e.getMessage());
		}
	}
}

