package Aplicação_Urna;

import java.util.Scanner;

public class Urna {

	public static void main(String[] args) {
		Scanner cp = new Scanner(System.in);

		System.out.println("****URNA****");
		System.out.println(" (50) Boulos (PSOL)");
		System.out.println(" (15) Ricardo Nunes (MDB)");
		System.out.println(" (0) Branco ou Nulo");
		System.out.println("****URNA****");

		int voto = cp.nextInt();
		int votosBoulos = 0;
		int votosNunes = 0;
		int votosBrancoNulo = 0;
		int votosTotal = 0;

		while (voto >= 0) {
			if (voto == 50) {
				votosBoulos++;
				System.out.println("Você votou no candidato Guilherme Boulos\n");
			} else if (voto == 15) {
				votosNunes++;
				System.out.println("Você votou no candidato Ricardo Nunes\n");
			} else if (voto == 0) {
				votosBrancoNulo++;
				System.out.println("Você votou Branco/Nulo");
			} else {
				System.out.println("Candidato inexistente, vote novamente");
			}

			if (voto == 50 || voto == 15 || voto == 0) {
				votosTotal++;
			}

			System.out.println("Vote novamente: ");
			System.out.println("Digite -1 para sair");
			voto = cp.nextInt();
		}

		System.out.println("****APURAÇÃO****");
		System.out.println("Total de votos: " + votosTotal + " = 100%");
		double porcBoulos = (100 * votosBoulos / votosTotal);
		System.out.println("Guilherme Boulos: " + porcBoulos + "%");
		double porcNunes = (100 * votosNunes / votosTotal);
		System.out.println("Ricardo Nunes: " + porcNunes + "%");
		double porcBrancoNulo = (100 * votosBrancoNulo / votosTotal);
		System.out.println("Brancos ou Nulos: " + porcBrancoNulo + "%");
		System.out.println("****APURAÇÃO****");

		cp.close();

	}

}
