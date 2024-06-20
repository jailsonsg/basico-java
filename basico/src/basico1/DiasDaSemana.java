package basico1;

import java.util.Scanner;


public class DiasDaSemana {
	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
		String dia1 = "domingo";
		String dia2 = "segunda";
		String dia3 = "terca";
		String dia4 = "quarta";
		String dia5 = "quinta";
		String dia6 = "sexta";
		String dia7 = "sabado";
		int numero ;
		
		System.out.print("Digite um número: ");
		numero = input.nextInt();
		
		if (numero == 1) {
			System.out.println(dia1);
		} else if (numero == 2) {
			System.out.println(dia2);
		}else if (numero == 3) {
			System.out.println(dia3);
		}else if (numero == 4) {
			System.out.println(dia4);
		}else if (numero == 5) {
			System.out.println(dia5);
		}else if (numero == 6) {
			System.out.println(dia6);
		}else if (numero == 7) {
			System.out.println(dia7);
		}
	}
}
