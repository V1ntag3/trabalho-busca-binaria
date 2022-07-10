package implementacoesLivro.binarySearchST;

import java.util.ArrayList;
import java.util.Random;

public class Buscas {
	public void chaveExistente() {
		BinarySearchST<Integer, Integer> bs;
		Random rnd = new Random();
		StopwatchCPU timer;

		double time;

		int v = 500;
		ArrayList<Integer> nums;
		ArrayList<Integer> achados = new ArrayList<>();
		ArrayList<Double> tempos = new ArrayList<>();
		while (v <= 40500) {
			int cont = 0;
			nums = new ArrayList<>();
			bs = new BinarySearchST<>();
			for (int i = 0; i < v; i++) {
				nums.add(i + 1);
			}

			for (int num : nums) {
				int key = rnd.nextInt(nums.size());
				while (bs.contains(key)) {
					key = rnd.nextInt(nums.size());
				}
				bs.put(key, num);
			}

			timer = new StopwatchCPU();
			for (int k = 0; k < v; k++) {
				int num = rnd.nextInt(nums.size());

				while (achados.contains(num)) {
					num = rnd.nextInt(nums.size());
				}

				for (int j = 0; j < 10; j++) {
					if (bs.contains(num)) {
						cont++;
					}

				}
				if (cont == 10) {
					achados.add(num);
				}
				System.out.println(num);
			}
			time = timer.elapsedTime();

			tempos.add(time);

			v *= 3;
		}

		v = 500;

		for (double t : tempos) {
			System.out.println("Tempo medio para achar uma chave 10 vezes na tabela com " + v + " chaves: " + t);
			v *= 3;
		}
	}

	public void chaveInexistente() {
		BinarySearchST<Integer, Integer> bs;
		Random rnd = new Random();
		StopwatchCPU timer;

		double time;

		int v = 500;
		ArrayList<Integer> nums;
		ArrayList<Double> tempos = new ArrayList<>();
		while (v <= 40500) {
			int cont = 0;
			nums = new ArrayList<>();
			bs = new BinarySearchST<>();
			for (int i = 0; i < v; i++) {
				nums.add(i + 1);
			}

			for (int num : nums) {
				int key = rnd.nextInt(nums.size());
				while (bs.contains(key)) {
					key = rnd.nextInt(nums.size());
				}
				bs.put(key, num);
			}

			int num;

			timer = new StopwatchCPU();
			for (int k = 0; k < v; k++) {
				num = rnd.nextInt();

				while (nums.contains(num)) {
					num = rnd.nextInt(nums.size());
				}

				for (int j = 0; j < 10; j++) {
					if (!bs.contains(num)) {
						cont++;
					}

				}
				System.out.println(cont);
			}
			time = timer.elapsedTime();

			tempos.add(time);

			v *= 3;
		}

		v = 500;

		for (double t : tempos) {
			System.out.println(
					"Tempo medio para nao achar uma chave aleatoria 10 vezes na tabela com " + v + " chaves: " + t);
			v *= 3;
		}
	}
}
