package ADO11;

import java.util.Random;
import java.util.Scanner;

public class CaminhoMinado {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int random,
			tamanho,
			qtdBombas,
			posicao;
		boolean sair = false;
		
		do {
			System.out.print("Informe o tamanho do caminho: ");
			tamanho = in.nextInt();
			
			if (tamanho <= 1) {
				System.err.println("O tamanho do caminho precisa ser maior que 1!");
			}
		} while (tamanho <= 1);

		int[] caminho = new int[tamanho];
		
		do {
			System.out.print("Informe a quantidade de bombas que haverá no caminho: ");
			qtdBombas = in.nextInt();			
			
			if (qtdBombas <= 0 || qtdBombas >= tamanho) {
				System.err.println("A quantidade de bombas precisa ser maior que 0, e\n"
							     + "menor que o tamanho do caminho!\n");
			}
		} while (qtdBombas <= 0 || qtdBombas >= tamanho);
		
		for (int i = 0; i < qtdBombas; i++) {
			do {
				random = r.nextInt(caminho.length);
			} while (caminho[random] == -1);
			
			caminho[random] = -1;
		}
		
		do {
			System.out.println();
			tamanho = caminho.length - 1;
			
			for (int i = 0; i < caminho.length; i++) {
				if (caminho[i] == 0) {
					System.out.print("_ ");	
				} else if (caminho[i] == -1) {
					System.out.print("_ ");	
					tamanho--;
				} else if (caminho[i] == 1) {
					System.out.print("x ");
					tamanho--;
				}
			}
			
			System.out.print("\nEscolha uma posição: ");
			posicao = in.nextInt() - 1;
			
			if (caminho[posicao] == - 1) {
				System.out.println();
				for (int i = 0; i < caminho.length; i++) {
					if (i == posicao) {
						System.err.print("b ");
					} else if (caminho[i] == 0 || caminho[i] == -1) { 
						System.out.print("_ ");	
					} else if (caminho[i] == 1) { 
						System.out.print("x ");
					}
				}
				System.err.print("\nGame Over!");
				sair = true;
			} else if (caminho[posicao] == 0) {
				caminho[posicao] = 1;
							
				if (posicao == 0) {
					if (caminho[posicao + 1] == -1) {
						System.err.println("Cuidado: bomba próxima!");
					}
				} else if (posicao == caminho.length - 1) {
					if (caminho[posicao - 1] == -1) {
						System.err.println("Cuidado: bomba próxima!");
					}
				} else if (caminho[posicao - 1] == -1 || caminho[posicao + 1] == -1) {
					System.err.println("Cuidado: bomba próxima!");
				} 
			} else {
				System.err.println("Você já passou por esse caminho, escolha outro...");
			} 
			
			if (tamanho == 0) {
				System.out.print("\nParabéns, você ganhou o jogo!");
				sair = true;
			}
		} while (!sair);
		
		in.close();
	}
}
