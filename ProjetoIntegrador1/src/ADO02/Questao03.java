package ADO02;
import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número de 1 até 10: ");
		
		int num = entrada.nextInt();
		int mult = num;
		
		System.out.println("Tabuada do número " + num + ":");
		
		for (int i = 0; i <= 10; i++) {
			mult = num * i;

			System.out.println(num + " x " + i + " = " + mult);
		}

		entrada.close();
	}
}
