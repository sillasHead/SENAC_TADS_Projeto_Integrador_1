package ADO07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Questao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");
		boolean resposta = false;
		
		List<String> questoes = new ArrayList<String>();
		questoes.add("3 x 2^10");
		questoes.add("3 x 2^13");
		questoes.add("1 + 2^13");
		questoes.add("2^23");
		questoes.add("2^43");
		
		System.out.print(" _________________PROVA__________________"
				  + ls + "|MATEMÁTICA PARA TECNOLOGIA DA INFORMAÇÃO|"
			      + ls + " ----------------------------------------" + ls);
		
		do {
			Collections.shuffle(questoes);			
			
			System.out.print(ls + "Encontre a solução para a expressão abaixo"
					       + ls + "e  escolha  a  alternativa  que  apresenta"
					       + ls + "a resposta correta:"
					       + ls 
					       + ls + "(2^20 + 2^23)^(1/2) = ?"
					       + ls 
					       + ls + "a) " + questoes.get(0)
					       + ls + "b) " + questoes.get(1)
					       + ls + "c) " + questoes.get(2)
					       + ls + "d) " + questoes.get(3)
					       + ls + "e) " + questoes.get(4)
					       + ls        
					       + ls + "Resposta: ");

			switch(in.next().toLowerCase()) {
			case "a":
				resposta = questoes.get(0).contains("10");
				break;
			case "b":
				resposta = questoes.get(1).contains("10");
				break;
			case "c":
				resposta = questoes.get(2).contains("10");
				break;
			case "d":
				resposta = questoes.get(3).contains("10");
				break;
			case "e":
				resposta = questoes.get(4).contains("10");
			}
			
			if(!resposta)
				System.out.println("Resposta incorreta!");
			
		} while(!resposta);
		
		System.out.println("Resposta correta!");
		
		in.close();
	}
}
