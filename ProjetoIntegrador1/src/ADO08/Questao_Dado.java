package ADO08;

import java.util.Random;

public class Questao_Dado {
	public static void main(String[] args) {
		Random r = new Random();
		
		int[] faces = new int[6];
		int j = 1;
		
		for (int i = 0; i < 10000; i++)
			faces[r.nextInt(6)] += 1;
		
		System.out.println("Confira a seguir a porcentagem de vezes que cada face apareceu...");
		for (int i : faces) 
			System.out.println("face " + j++ + ": " + (double)i*100/10000 + "%");
	}
}
