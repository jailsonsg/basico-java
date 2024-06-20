package basico1;

import java.util.Scanner;

public class EstruturaInput {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			String nome;
			int idade;
			System.out.print("Digite o seu nome: ");
			nome = input.nextLine();
			System.out.print("Digite a sua idade: ");
			idade = input.nextInt();
			
			System.out.printf("Nome: %s Idade: %d" ,nome,idade);
		}
	}
}
