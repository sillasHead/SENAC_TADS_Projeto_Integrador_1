package ADO05;

import java.util.*;

public class Questao01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome, ls = System.getProperty("line.separator");
		int inst, contador = 0, jogada;
		Random r = new Random();
		boolean jogadorVenceu = false;
        
		do {
			System.out.print("Escolha uma das seguintes opções:" 
                        + ls 
			            + ls + "1 - Instruções" 
			            + ls + "2 - Jogar" 
			            + ls + "3 - Créditos" 
			            + ls + "4 - Sair" 
						+ ls   
			            + ls + "Opção: ");
                               
			inst = in.nextInt();
        
			switch (inst) {
			case 1:
				System.out.println(ls + "________________________INSTRUÇÕES________________________" 
								 + ls
						         + ls + "Chegue até o 20!" 
						         + ls
						         + ls + "O objetivo do jogo é chegar até o número 20. Primeiramente "
						         + ls + "um jogador é escolhido randomicamente,  após escolhe entre  "
						         + ls + "1 e 2 para começar.  O seu adversário deve somar 1 ou 2 ao "
						         + ls + "número que foi escolhido anteriormente, e assim sucessiva-"
						         + ls + "mente até um dos jogadores chegar ao número 20." 
						         + ls + "__________________________________________________________" + ls);
				break;
				
			case 2:
				System.out.print(ls + "___________________________PLAY___________________________" 
								 + ls
								 + ls + "Digite o seu nome: ");
				nome = in.next();
				
				if(r.nextInt(200)%2 == 0){
					System.out.println(ls + "\"" + nome + "\" foi escolhido para iniciar!");
					
					
					do {
						System.out.print("Comece com 1 ou 2" 
								   + ls
								   + ls + nome + ": ");
						jogada = in.nextInt();
						
						if(jogada > 2 || jogada < 1)
							System.out.println(ls + "jogada inválida!");
						
					} while(jogada > 2 || jogada < 1);
					contador = jogada;
					System.out.println("Contador: " + contador+ ls);
					
				} else {
					System.out.println(ls + "\"cpu\" foi escolhido para iniciar!" + ls);
				}
				
				while(contador < 20) {
					if(contador%3 == 0) { 
						contador += 2;
						System.out.println("cpu: 2");
					} else { 
						contador += 1;
						System.out.println("cpu: 1");						
					}
					
					System.out.println("Contador: " + contador + ls);
					
					if(contador != 20) {						
						System.out.print(nome + ": ");
						jogada = in.nextInt();
						
						while(jogada > 2 || jogada < 1) {
							System.out.print("Jogada inválida"
							           + ls + nome + ": ");
							jogada = in.nextInt();
						}
						contador += jogada;
						
						System.out.println("Contador: " + contador + ls);
						
						if(contador >= 20)
							jogadorVenceu = true;
					}
				}
				
				if(jogadorVenceu) {
					System.out.println("Você venceu!!! :D"
								+ ls + "__________________________________________________________" + ls);
				} else {
					System.out.println("Você perdeu!!! D:"
				                + ls + "__________________________________________________________" + ls);
				}
				break;
				
			case 3:
				System.out.println(ls + "_________________________CRÉDITOS_________________________" 
					             + ls
			                     + ls + "Jogo produzido por Sillas Cavalcante" 
			                     + ls  
			                     + ls + "Parceria com Professor Márcio"
			                     + ls + "__________________________________________________________" + ls);
				break;
        
			}
		} while (inst != 4);
        
		System.out.print(ls + "Fim! :D");
		
		in.close();
	}
}
