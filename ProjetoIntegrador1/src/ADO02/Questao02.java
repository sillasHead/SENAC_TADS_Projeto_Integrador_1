package ADO02;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int num = entrada.nextInt();
		
		System.out.println("Os três primeiros múltiplos desse número são, respectivamente:");
		System.out.println(num*0);
		System.out.println(num*1);
		System.out.println(num*2);

		entrada.close();
	}
}
