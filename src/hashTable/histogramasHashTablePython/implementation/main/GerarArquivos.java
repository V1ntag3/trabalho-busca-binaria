package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import inplementacoesLivro.hashing.SeparateChainingHashST;

public class GerarArquivos {
	public void hashTableM100() {
		SeparateChainingHashST<String, Integer> HT = new SeparateChainingHashST<>(100);
		String aux = new String();

		try {
			FileReader arq = new FileReader("arquivosTexto/taleModSemRepeticao.txt");
			BufferedReader nomeAtual = new BufferedReader(arq);
			for (int i = 0; i < 19832; i++) {
				aux = nomeAtual.readLine();
				HT.putHash100(aux, i);
			}
			nomeAtual.close();
		} catch (Exception e) {
			System.out.println("Erro ao abrir o arquivo!");
		}

		try {
			FileWriter arq = new FileWriter("arquivosTexto/taleM100_Pos-key-freq.txt");
			BufferedWriter arquivo = new BufferedWriter(arq);
			for (String key : HT.keys()) {
				arquivo.write(HT.getPos100(key) + " - " + key + " - " + HT.getQnt100(key) + "\n");
			}
			arquivo.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void hashTableM97() {
		SeparateChainingHashST<String, Integer> HT = new SeparateChainingHashST<>(97);
		String aux = new String();

		try {
			FileReader arq = new FileReader("arquivosTexto/taleModSemRepeticao.txt");
			BufferedReader nomeAtual = new BufferedReader(arq);
			for (int i = 0; i < 19832; i++) {
				aux = nomeAtual.readLine();
				HT.putHash97(aux, i);
			}
			nomeAtual.close();
		} catch (Exception e) {
			System.out.println("Erro ao abrir o arquivo!");
		}

		try {
			FileWriter arq = new FileWriter("arquivosTexto/taleM97_Pos-key-freq.txt");
			BufferedWriter arquivo = new BufferedWriter(arq);
			for (String key : HT.keys()) {
				arquivo.write(HT.getPos97(key) + " - " + key + " - " + HT.getQnt97(key) + "\n");
			}
			arquivo.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void hashTableMPot2() {
		int m = 32;

		while (m <= 512) {
			SeparateChainingHashST<String, Integer> HT = new SeparateChainingHashST<>(m);
			String aux = new String();

			try {
				FileReader arq = new FileReader("arquivosTexto/taleModSemRepeticao.txt");
				BufferedReader nomeAtual = new BufferedReader(arq);
				for (int i = 0; i < 19832; i++) {
					aux = nomeAtual.readLine();
					HT.putHash97(aux, i);
				}
				nomeAtual.close();
			} catch (Exception e) {
				System.out.println("Erro ao abrir o arquivo!");
			}

			try {
				FileWriter arq = new FileWriter("arquivosTexto/taleM" + m + "_Pos-key-freq.txt");
				BufferedWriter arquivo = new BufferedWriter(arq);
				for (String key : HT.keys()) {
					arquivo.write(HT.getPos97(key) + " - " + key + " - " + HT.getQnt97(key) + "\n");
				}
				arquivo.close();
			} catch (Exception e) {
				// TODO: handle exception
			}

			m *= 2;
		}
	}
}
