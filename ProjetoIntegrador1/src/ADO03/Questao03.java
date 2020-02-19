package ADO03;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String ls = System.clearProperty("line.separator");
		
		System.out.print("Insira um ano, e eu te direi se ele é bissexto ;)" + ls + "Ano: ");
		
		int year = input.nextInt();
		
		if(year%400 == 0 || (year%4 == 0 && year%100 != 0))
			System.out.print(ls + "é bissexto! :D");
		
		else
			System.out.print(ls + "Não é bissexto! :(");

		input.close();
	}

}
