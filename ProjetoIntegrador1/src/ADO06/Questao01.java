package ADO06;

import java.util.*;

public class Questao01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");
		int tentativa = 1;
		
		List<String> questoes = new ArrayList<String>();
		questoes.add("3 x 2^10");
		questoes.add("3 x 2^13");
		questoes.add("1 + 2^13");
		questoes.add("2^23"    );
		questoes.add("2^43"    );
		
		do {
			System.out.print(" _________________PROVA__________________"
					  + ls + "|MATEMÁTICA PARA TECNOLOGIA DA INFORMAÇÃO|"
				      + ls + " ----------------------------------------"
				      + ls  
				      + ls + "Encontre a solução para a expressão abaixo"
					  + ls + "e escolha a alternativa que apresenta a "
					  + ls + "resposta correta:"
					  + ls + " ___________"
					  + ls + "√2^20 + 2^23 = ?"
					  + ls 
					  + ls + "(a) 3 x 2^10"
					  + ls + "(b) 3 x 2^13"
					  + ls + "(c) 1 + 2^13"
					  + ls + "(d) 2^23    "
					  + ls + "(e) 2^43    "
					  + ls        
					  + ls + "Resposta: ");
			
			
			switch(in.next()) {
			case "a":
				System.out.print(ls + "Resposta correta na " + tentativa + "ª tentativa!");
				tentativa = 4;
				break;
				
			case "b":
			case "c":
			case "d":
			case "e":
				System.out.print(ls + tentativa + "ª tentativa - Resposta incorreta!" + ls);
				break;
				
			default:
				System.out.print(ls + tentativa + "ª tentativa - Resposta inválida!" + ls);
			} 
			
			if(tentativa < 3)
				System.out.print("Preste mais atenção na próxima tentativa!" + ls + ls);
			else if(tentativa == 3)
				System.out.println("Resposta incorreta nas 3 tentativas!");
			
			tentativa++;
		} while(tentativa <= 3);
		
		in.close();
	}
}
