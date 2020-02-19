package ADO03;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double l1, l2, l3;
		String ls = System.getProperty("line.separator");
		
		System.out.print("Insira a seguir, um por vez, os valores de cada lado do triânggulo:"
						+ ls 
						+ ls + "a = ");
		l1 = input.nextDouble();
		
		System.out.print("b = ");
		l2 = input.nextDouble();

		System.out.print("c = ");
		l3 = input.nextDouble();
		
		if(l1 >= l2+l3 ||  l2 >= l1+l3 || l3 >= l1+l2)
			System.out.print(ls + "Os valores inseridos não formam um triângulo, pois não atendem à condição de existência do mesmo!");
			
		else if(l1 == l2 && l1 == l3)
			System.out.print(ls + "Esse triânggulo é equilátero!");
		
		else if((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l2 != l1))
			System.out.print(ls + "Esse triânggulo é isósceles!");
		
		else
			System.out.print(ls + "Esse triânggulo é escaleno!");
			
		input.close();
	}

}
