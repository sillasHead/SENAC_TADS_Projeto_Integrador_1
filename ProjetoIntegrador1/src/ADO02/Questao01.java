package ADO02;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira três números");

		double n1 = entrada.nextDouble();
		double n2 = entrada.nextDouble();
		double n3 = entrada.nextDouble();

		double mult = n1 * n2 * n3;

		System.out.println("O produto desses números resulta em: " + mult);

		entrada.close();
	}
}
