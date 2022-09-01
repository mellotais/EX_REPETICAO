
package code;

import java.util.Scanner;


public class Ex_11 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 10;

    double num[] = new double[TAM];
    int par   = 0;
    int impar = 0;

    System.out.println("\nNúmeros pares e ímpares\n");
    System.out.println("Informe 10 números");
    for (int i = 0; i < TAM; i++) {
      System.out.print("Informe numero: ");
      num[i] = imput.nextDouble();
      if (num[i] % 2 == 0)
        par++;
      else
        impar++;
    }

    System.out.println("\nResultado\n");
    System.out.printf("%d número(s) par(es)", par);
    System.out.printf("\n%d número(s) ímpar(es)", impar);
  }
}
