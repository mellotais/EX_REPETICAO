
package code;

import java.util.Scanner;

public class Ex_25 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final double VALOR = 1.99f;

    System.out.println("\nLojas Quase Dois - Tabela de preços\n");
    for (int i = 1; i <= 50; i++)
      System.out.printf("\n%d - R$: %.2f", i, (VALOR * i));
  }
}
