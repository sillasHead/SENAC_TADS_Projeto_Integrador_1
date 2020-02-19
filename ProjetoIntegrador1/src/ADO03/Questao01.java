package ADO03;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		System.out.print("Insira o valor da compra: R$");
		
		Scanner input = new Scanner(System.in);
		double value = input.nextDouble();
		
	    double discount, discountedValue;
		
		if (value >= 300) {
			
			discount = value * 0.2;
			discountedValue = value - discount;
			
			System.out.println("Valor do seu desconto: R$" + String.format("%.2f", discount));
			System.out.println("Valor da compra após o desconto: R$" + String.format("%.2f", discountedValue));
			
		}else {
		
			discount = value * 0.15;
			discountedValue = value - discount;
			
			System.out.println("Valor do seu desconto: R$" + String.format("%.2f", discount));
			System.out.println("Valor da compra após o desconto: R$" + String.format("%.2f", discountedValue));
		
		}

		input.close();
	}
}