package ADO02;
import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Me diga um nome?");
		
		String nome = entrada.next();
		
		System.out.println("Esse nome possui " + nome.length() + " caracteres.");

		entrada.close();
	}
}
