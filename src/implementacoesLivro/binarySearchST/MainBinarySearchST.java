package implementacoesLivro.binarySearchST;

import java.util.Scanner;

public class MainBinarySearchST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Buscas b = new Buscas();
		int op;
		while (true) {
			System.out.println("1 - Achar cada chave 10 vezes.");
			System.out.println("2 - Nao encontrar chaves aleatorias 10 vezes por posicao.");
			System.out.println("3 - Sair");
			op = Integer.parseInt(sc.nextLine());
			if (op == 3) {
				break;
			} else if (op == 1) {
				b.chaveExistente();
			} else if (op == 2) {
				b.chaveInexistente();
			} else {
				System.out.println("Opcao invalida");
			}
		}
		sc.close();
		System.out.println("End of program!");
	}
}

//	BinarySearchST<Integer, Integer> bs;
//	Random rnd = new Random();
//	StopwatchCPU timer;
//	
//	double time;
//	
//	int v = 500;	
//	ArrayList<Integer> nums;
//	ArrayList<Double> tempos = new ArrayList<>();
//	while(v <= 40500) {
//		int cont = 0;
//		nums = new ArrayList<>();
//		bs = new BinarySearchST<>();
//		for(int i = 0; i < v; i++) {
//			nums.add(i+1);
//		}
//		
//		for(int num : nums) {
//			int key = rnd.nextInt(nums.size());
//			while(bs.contains(key)) {
//				key = rnd.nextInt(nums.size());
//			}
//			bs.put(key, num);
//		}
//		
//		timer = new StopwatchCPU();
//		for(int k = 0; k < v; k++) {
//			int num = rnd.nextInt(nums.size()*2);
//			
//			while(nums.contains(num)) {
//				num = rnd.nextInt(nums.size());
//			}
//			
//			for(int j = 0; j < 10; j++) {
//				if(!bs.contains(num)) {
//					cont++;
//				}
//			
//			}
//			System.out.println(num);
//		}
//		time = timer.elapsedTime();
//		
//		tempos.add(time);
//	
//		v *= 3;
//	}
//	
//	v = 500;
//	
//	for(double t : tempos) {
//		System.out.println("Tempo medio para achar uma chave 10 vezes na tabela com " + v + " chaves: " + t);
//		v *= 3;
//	}
//}