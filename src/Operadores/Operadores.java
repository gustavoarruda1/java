import java.util.Scanner;

public class Operadores {
  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    // Solicitando a operação e declarando as variáveis
    System.out.print("Digite a operação (+, -, *, /): ");
    char operador = leia.next().charAt(0);

    // Solicitando os números e declarando as variáveis
    System.out.println("Digite o primeiro número: ");
    float num1 = leia.nextFloat();

    System.out.println("Digite o segundo número: ");
    float num2 = leia.nextFloat();

    leia.close();

    float resultado;

    // Solicitando a operação e declarando as variáveis
    switch (operador) {
      case '+':
        resultado = num1 + num2;
        break;
      case '-':
        resultado = num1 - num2;
        break;
      case '*':
        resultado = num1 * num2;

        break;
      case '/':
        if (num2 == 0) {
          System.out.println("Divisão por zero não é permitida");
          return;
        }
        resultado = num1 / num2;
        break;
      default:
        System.out.println("Operador inválido.");
        return;
    }

    // Imprimindo o resultado
    System.out.println("O resultado da operação é: " + resultado);

  }

}