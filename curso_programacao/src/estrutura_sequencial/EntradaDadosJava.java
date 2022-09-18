package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosJava {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double w;
		char z;
		
		System.out.print("Digite um caracter: ");
		z = sc.next().charAt(0);
		System.out.println("Você digitou: " + z);
//		
//		System.out.print("Digite um numero: ");
//		y = sc.nextInt();
//		
//		System.out.println("Você digitou: " + x);
//		System.out.println("Você digitou: " + y);
		
		System.out.print("Digite um double: ");
		w = sc.nextDouble();
		System.out.printf("Você digitou: %.2f %n", w);
		
		sc.close();
	}

}
