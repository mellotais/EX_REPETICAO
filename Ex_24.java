
package code;

import java.util.Scanner;

public class Ex_24 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int quantidade = 0;
    double valor   = 0;
    double media   = 0;

    System.out.println("\nMédia de valores dos CDs\n");
    System.out.print("Informe quantidade de CDs: ");
    quantidade = (int)imput.nextFloat();

    System.out.println("Informe valor pago em cada: R$ ");
    for (int i = 0; i < quantidade; i++) {
      System.out.printf("Turma %d: ", (i + 1));
      valor = imput.nextDouble();
      while (valor < 0)
        valor = imput.nextDouble();
      media += valor;
    }

    media /= quantidade;

    System.out.println("\nResultado");
    System.out.printf("Média R$ %.2f", media);
  }
}
