import java.util.Locale;

import exercicios_fixacao.SaidaEntradaDados;

/**
 * @author danfl
 *
 */
public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		SaidaEntradaDados objetoSaidaEntradaDados = new SaidaEntradaDados();
				

		
		System.out.println("Ola mundo!");
		System.out.println("Bom dia!");
		System.out.println(y);
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		//Locale.setDefault(Locale.US);
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.println("Custou " + x);
		
		System.out.printf("RESULTADO = %.2f metros%n", x);

		System.out.printf("%s tem %d anos e ganha %.2f reais mensais. %n", nome, idade, renda);
		
		System.out.println("-----------------------\n\n\n");
		objetoSaidaEntradaDados.printInfo();
		
	}

}
