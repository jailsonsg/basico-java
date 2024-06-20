package basico1;

import java.util.Scanner;

public class Maior3Valores {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1 ;
		int num2 ;
		int num3 ;
		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = entrada.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.printf("%d É o maior entre todos.",num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.printf("%d É o maior entre todos.",num2);
		} else {
			System.out.printf("%d É o maior entre todos.",num3);
		}
	}
}
