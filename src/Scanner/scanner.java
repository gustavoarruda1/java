package Scanner;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		// Construir um objeto Scanner
		
		Scanner leia = new Scanner(System.in);
		/*
		String nome;
		int idade;
		
		System.out.println("Escreva o seu nome: ");
		nome = leia.next();
		
		System.out.println("Escreva a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("O nome é: " + nome
							+ "\nA idade é: " + idade
				);
		*/
		
		String time;
		int mundial;
		
		System.out.println("Para qual time voce torce? ");
		time = leia.next();
		
		System.out.println("Quantos mundiais ele tem? ");
		mundial = leia.nextInt();
		
		System.out.println("Seu time é: " + time
							+ "\ne tem " + mundial + "mundiais"
				);
	}
	
}
