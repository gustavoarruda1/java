package Scanner;

import java.util.Scanner;

public class scanner {

    // classe nome = novo método (console.entrada)
    Scanner leia = new Scanner(System.in);
    // classe nome = novo método (console.entrada)

    String nome;
    int idade;

    System.out.println("Digite seu nome: ");
    // esse método é atribuido para string (caracteres)
    nome = leia.next();

    System.out.println("Digite sua idade: ");
    // esse método é atribuido para numeros inteiros (int)
    idade = leia.nextInt();

    System.out.println("Seu nome é " + nome + " e sua idade é " + idade);

    String time;
    int mundial;

    System.out.println("Para qual time você torce? ");
    time = leia.next();

    System.out.println("Quantos mundiais ele tem? ");
    mundial = leia.nextInt();

    System.out.println("Seu time é " + time + " e tem " + mundial + " mundiais");

    int camisa;
    float preco;

    System.out.println("Quantas camisas você comprou? ");
    camisa = leia.nextInt();

    System.out.println("Quanto você pagou por elas? ");
    preco = leia.nextFloat();

    leia.close();

    System.out.println("Você comprou " + camisa + " camisas e pagou " + preco + " por elas.");
	}
	
}
