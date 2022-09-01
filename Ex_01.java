

package code;

import java.util.Scanner;

public class Ex_01 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    float nota = -1;

    System.out.println("\nInforme NOTA\n");
    while (nota < 0 || nota > 10) {
      System.out.print("Informe nota (0 até 10): ");
      nota = imput.nextFloat();
      if (nota < 0 || nota > 10)
        nota = imput.nextFloat();
    }

    System.out.println("\nNOTAex");
    System.out.printf("Nota é: %.1f\n", nota);
  }
}
