package ADO04;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ls = System.getProperty("line.separator");
		
		System.out.println("Encontre a solução da expressão abaixo, ");
		System.out.println("e em seguida, insira a alternativa ");
		System.out.println("correspondente à solução encontrada!" + ls);
		System.out.println("[3(6+3)^2]/[(3!)+(3!)-(3!!)]" + ls);
		
		System.out.println("<a> 9");
		System.out.println("<b> 81");
		System.out.println("<c> 45/2");
		System.out.println("<d> 45/236");
		System.out.print("<e> 27" + ls + ls + "Resposta: ");
		
		switch(in.next().toLowerCase()) {
		case "a":
		case "e":
		case "c":
		case "d":
			System.out.print(ls + "Resposta incorreta");
			break;
			
		case "b":
			System.out.print(ls + "Resposta correta");
			break;
			
		default:
			System.out.print(ls + "Você inseriu um valor inválido!");
		}
		
		in.close();
	}
}
