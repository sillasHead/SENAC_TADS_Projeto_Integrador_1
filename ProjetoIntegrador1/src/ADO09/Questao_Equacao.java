package ADO09;

import java.util.*;

public class Questao_Equacao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		int min;
		int max;
		
		do {
			System.out.println("Insira dois valores...");
			
			System.out.print("Mínimo: ");
			min = in.nextInt();
			
			System.out.print("Máximo: ");
			max = in.nextInt();
			
			if(min == 0 && max == 0)
				System.out.println("Ambos os valores não podem ser iguais a 0!!!\n");
			
			if(min > max)
				System.out.println("O valor mínimo não pode ser maior que o valor máximo!!!\n");
			
		}while((min == 0 && max == 0) || min > max);	
		
		int a = 0;
		int b = r.nextInt(max - min + 1) + min;
		
		while(a == 0)
			a = r.nextInt(max - min + 1) + min;
		
		System.out.println("\nEquaçõo");
		
		if(b >= 0)
			System.out.println(a+"x + "+b+" = 0");
		else
			System.out.println(a+"x - "+b*-1+" = 0");
		
		System.out.println("\nSolução");
		
		b *= -1;
		System.out.println(a+"x = "+b);
		
		identacao(String.valueOf(a).length());
		System.out.println("x = "+b+" / "+a);
		
		identacao(String.valueOf(a).length());
		System.out.println("x = "+(double)b/a);
		
		in.close();
	}
	
	static void identacao(int qtd) {
		for (int i = 0; i < qtd; i++) {
			System.out.print(" ");
		}
	}
}
