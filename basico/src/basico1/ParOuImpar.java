package basico1;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			int numero;
			System.out.print("Digite um número: ");
			numero = input.nextInt();
			if (numero  == 0) {
				System.out.printf("%d é Zero",numero);
			} else if (numero % 2 != 0) {
				System.out.printf("%d é Impar", numero);
			} else if (numero % 2 == 0){
				System.out.printf("%d é Par", numero);
			}
		}
	}

}
