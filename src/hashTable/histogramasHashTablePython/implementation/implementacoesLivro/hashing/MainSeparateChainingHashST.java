package inplementacoesLivro.hashing;

import java.util.Scanner;

import main.GerarArquivos;

public class MainSeparateChainingHashST {

	public static void main(String args[]) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		GerarArquivos arq = new GerarArquivos();
		int op;

		while (true) {
			System.out.println("1 - Gerar tabela hash m = 100");
			System.out.println("2 - Gerar tabela hash m = 97");
			System.out.println("3 - Gerar tabela hash m potencia de 2");
			System.out.println("4 - Sair");
			op = Integer.parseInt(sc.nextLine());

			if (op == 4) {
				break;
			} else if (op == 1) {
				System.out.println("Tabela hash m = 100");
				arq.hashTableM100();
				System.out.println("Gerando arquivos...");
				Thread.sleep(1000);
				System.out.println("Arquivo taleM100_Pos-key-freq.txt gerado na pasta arquivosTexto");
			} else if (op == 2) {
				System.out.println("Tabela hash m = 97");
				arq.hashTableM97();
				System.out.println("Gerando arquivos...");
				Thread.sleep(1000);
				System.out.println("Arquivo taleM97_Pos-key-freq.txt gerado na pasta arquivosTexto");
			} else if (op == 3) {
				System.out.println("Tabela hash m potencia de 2");
				arq.hashTableMPot2();
				System.out.println("Gerando arquivos...");
				Thread.sleep(2000);
				System.out.println("Arquivos gerados na pasta arquivosTexto");
			} else {
				System.out.println("Opcao invalida!");
			}
		}
		sc.close();
		System.out.println("End of program!");
	}
}
