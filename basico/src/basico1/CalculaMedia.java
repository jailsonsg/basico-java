package basico1;

import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double nota1;
		double nota2;
		double media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = input.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = input.nextDouble();
		media = (nota1+nota2)/2;
		System.out.printf("A média das notas digitadas é: %f",media);
		
	}
}
