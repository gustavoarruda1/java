package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressaoLambda {

	public static void main(String[] args) {
		
/* EXPRESSÃO LAMBDA

 *	Essa expressão é uma função anônima que há no Java.
   	Esta função não tem nome e pode ser passada por argumento 
   	para métodos ou armazenada em variáveis.
   	
 *  Essa expressão surgiu na versão Java 8, e muitos
 	profissionais utilizam essa função para simplificar o código
 	que utiliza interfaces ou métodos abstratos.

 *	A sua sintaxe é simples, e apresenta:
 		( PARÂMETROS ) -> EXPRESSÃO/DECLARAÇÃO.
 
 *	Veja a seguir alguns exemplos da expressão Lambda.	
 
 *	CURIOSIDADE
 
 *	RUNNABLE = é uma interface que pode ser implementada por
 	qualquer classe capaz de definir e executar por uma THREAD.
 	A classe pode definir um método sem argumento, chamado
 	'run()'.
 
 *	THREAD = é uma forma de executar um processo paralelo a 
 	ou processo de execução.

 */
		
	System.out.println("Criando um 'Hello World' com Lambda sem parâmetro.");

//	Criando 'Hello World' com Runnable + Lambda
	Runnable r = () -> System.out.println("Hello World");
	
//	Executando o nosso objeto com o método 'run()'
	r.run(/* Método sem argumento*/);
	
	
	System.out.println("\nCriando um 'Olá' com Lambda com parâmetro.");
	
/*	INTERFACE FUNCIONAL
 
 *	Nos exemplos a seguir será utilizado as Interfaces Funcionais,
 	onde apenas um método abstrato será criado.
 
 *	OBS: As anotações não são obrigatórias.
 */
	
//	Criando uma interface 'Saudação', para instanciar um método
	@FunctionalInterface
	interface Saudacao {
		
//		Criando um método 'digaOi' com 'nome' do tipo String
		void digaOi(String name);
		
	}
	
//	Atribuindo objeto ao parâmetro da interface
	Saudacao saudacao = (name) -> System.out.println("Oi, " + name);
	
//	Adicionando o valor no parâmetro que será atribuído ao objeto
	saudacao.digaOi("Gustavo");
	
	System.out.println("\nCriando operações matemáticas com Lambda");
	
//	Criando uma interface  'OperacaoMatematica' com dois parâmetros
	@FunctionalInterface
	interface OperacaoMatematica {
		int operacao(int a, int b);
	}
	
//	Realizando as operações
	OperacaoMatematica adicao = (a, b) -> a + b;
	OperacaoMatematica subtracao = (a, b) -> a - b;
	
//	Imprimindo a soma das operações
	System.out.println("Adição: " + adicao.operacao(1900, 10));
	System.out.println("Subtração: " + subtracao.operacao(2024, 12));
	
	System.out.println("\nCriando uma lista e selecionando os nomes com Lambda: ");
	
//	Criando uma lista de nomes
	List<String> nomes = Arrays.asList("Gustavo","Memphis", "Narizinho");
	
//	Utilizando forEach com Lambda para imprimir
	nomes.forEach(nome -> System.out.println(nome));
	
	System.out.println("\nCriando coleções stream e selecionando os nomes com Lambda: ");
	
/*	CURIOSIDADE
  
 * 	A STREAM  API fornece a possibilidade de trabalhar com conjuntos
  	de elementos de maneira mais simples. A proposta é diminuir a
  	forma de implementar controle de fluxo ao lidar com collections.
  	
 * 	Podemos trabalhar com os elementos de um objeto realizando ações 
    de filtragem , mapeamento, transformação, etc.
    
 *  Uma STREAM COLLECT() realiza uma operação de redução mutável nos 
    elementos de fluxo. Isso significa que os elementos que são
    processados são acumulados em um objeto que podem sofrer alterações
    
 *  No exemplo abaixo, usamos junto como parâmetro de método 'collection()'
    o método 'toList()', que acumula os elementos em uma lista.
 */
	
//	Criando uma lista e atribuindo stream ao objeto
	List<String> filtroNomes = nomes.stream()
//									Criando filtro e adicionando a expressão Lambda
									.filter(nome -> nome.startsWith("N"))
//									Utilizando o método 'collect()' e 'toList()' como parâmetro
									.collect(Collectors.toList());
	
//	Selecionando os elementos da lista, ao qual passou pelo filtro
	System.out.println(filtroNomes);
									
	}
}
