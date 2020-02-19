package ADO13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuebraCabeca {
	static int[][] jogo = new int[3][3];
	static int jogadasValidas = 0, jogadasInvalidas = 0;
	
	
	
	static void imprimir(int[][] jogo) {
		for (int[] vetor : jogo) {
			for (int elemento : vetor) {
				if (elemento == 0) {
					System.out.print("  ");
				} else {
					System.out.print(elemento + " ");
				}
			} System.out.println();
		}
		System.out.println();
	}
	
	
	
	static void jogar(int i, int j) {
		int pI = 0, pJ = 0;
		
		for (int k = 0; k < jogo.length; k++) {
			for (int k2 = 0; k2 < jogo[k].length; k2++) {
				if (jogo[k][k2] == 0) {
					pI = k;
					pJ = k2;
				}
			}
		}
		
		if (pI == 0 && pJ == 0) {
			if (i == 0 && j == 1) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 1 && j == 0) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0; 
				jogadasValidas++; 
			} else {
				System.out.println("Movimento inválido");
				jogadasInvalidas++;
			}
		} else if (pI == 0 && pJ == 1) {
			if (i == 0 && j == 0) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 0 && j == 2) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 1 && j == 1) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else {
				System.out.println("Movimento inválido");
				jogadasInvalidas++;
			}
		} else if (pI == 0 && pJ == 2) {
			if (i == 0 && j == 1) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 1 && j == 2) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else {
				System.out.println("Movimento inválido");
				jogadasInvalidas++;
			}
		} else if (pI == 1 && pJ == 0) {
			if (i == 0 && j == 0) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 1 && j == 1) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 2 && j == 0) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else {
				System.out.println("Movimento inválido");
				jogadasInvalidas++;
			}
		} else if (pI == 1 && pJ == 1) {
			if (i == 0 && j == 1) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 1 && j == 0) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 1 && j == 2) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 2 && j == 1) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else {
				System.out.println("Movimento inválido");
				jogadasInvalidas++;
			}
		} else if (pI == 1 && pJ == 2) {
			if (i == 0 && j == 2) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 1 && j == 1) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 2 && j == 2) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else {
				System.out.println("Movimento inválido");
				jogadasInvalidas++;
			}
		} else if (pI == 2 && pJ == 0) {
			if (i == 1 && j == 0) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 2 && j == 1) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0; 
				jogadasValidas++; 
			} else {
				System.out.println("Movimento inválido");
				jogadasInvalidas++;
			}
		} else if (pI == 2 && pJ == 1) {
			if (i == 1 && j == 1) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 2 && j == 0) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 2 && j == 2) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else {
				System.out.println("Movimento inválido");
				jogadasInvalidas++;
			}
		} else if (pI == 2 && pJ == 2) {
			if (i == 1 && j == 2) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else if (i == 2 && j == 1) {
				jogo[pI][pJ] = jogo[i][j];
				jogo[i][j] = 0;  
				jogadasValidas++;
			} else {
				System.out.println("Movimento inválido");
				jogadasInvalidas++;
			}
		} else {
			System.out.println("Movimento inválido");
			jogadasInvalidas++;
		}

		System.out.println("_____________________________________________\n");
	}
	
	
	
	static boolean validar(int[][] jogo) {
		int cont = 0;
		boolean validacao = true;
		
		for (int[] vetor : jogo) {
			for (int elemento : vetor) {
				if (elemento != cont++) {
					validacao = false;
				}
			}
		}
		
		return validacao;
	}
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> preenche = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		int jogadaI, jogadaJ;
		
		for (int i = 0; i < 9; i++) {
			preenche.add(i);
		} Collections.shuffle(preenche);
		
		for (int i = 0; i < jogo.length; i++) {
			for (int j = 0; j < jogo[i].length; j++) {
				jogo[i][j] =  preenche.get(0);
				preenche.remove(0);
			}
		}
		
		System.out.println("#############################################\n"
						 + "## RESOLVA O QUEBRA CABEÇA SE FOR CAPAZ!!! ##\n"
						 + "#############################################\n");
		
		do {
			imprimir(jogo);
			
			System.out.println("Faça um movimento válido");
			
			System.out.print("i = ");
			jogadaI = in.nextInt();
			
			System.out.print("j = ");
			jogadaJ = in.nextInt();
			
			System.out.println();
			
			jogar(jogadaI, jogadaJ);
		}while(!validar(jogo));
		
		imprimir(jogo);
		System.out.println("Fim de jogo!\n"
				+ "Movimentos válidos: " + jogadasValidas + "\n"
				+ "Movimentos inválidos: " + jogadasInvalidas);
		in.close();
	}
}
