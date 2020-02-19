package ADO04;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira um valor: ");
		switch(in.nextInt()) {
		case 1:
			System.out.print("Domingo");
			break;
			
		case 2:
			System.out.print("Segunda-Feira");
			break;
			
		case 3:
			System.out.print("Terça-Feira");
			break;
			
		case 4:
			System.out.print("Quarta-Feira");
			break;
			
		case 5:
			System.out.print("Quinta-Feira");
			break;
			
		case 6:
			System.out.print("Sexta-Feira");
			break;
			
		case 7:
			System.out.print("Sábado");
			break;
			
		default:
			System.out.print("Valor inválido!");			
		}

		in.close();
	}
}
