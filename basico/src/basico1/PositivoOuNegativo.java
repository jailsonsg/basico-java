package basico1;

import java.util.Scanner;

public class PositivoOuNegativo {
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		int numero;
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		if (numero == 0) {
			System.out.printf("%d é neutro.",numero);
		} else if (numero > 0) {
			System.out.printf("%d é positivo.",numero);
		} else if (numero < 0) {
			System.out.printf("%d é negativo",numero);
		}
	}
}
