import java.util.Scanner;

public class Cnh {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    System.out.println("Qual a sua idade? ");
    int idade = read.nextInt();
    read.close();

    if (idade >= 18) {
      System.out.println("Você tem permissão para dirigir");
    } else {
      System.out.println("Você não tem permissão para dirigir");
    }
  }
}