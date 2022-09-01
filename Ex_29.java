
package code;

import java.util.Scanner;

public class Ex_29 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int base                = 0;
    int multiplicadorInicio = 0;
    int multiplicadorFim    = 0;

    System.out.println("\nTabuada\n");
    System.out.print("Informe base: ");
    base = (int)imput.nextFloat();
    System.out.print("Informe início: ");
    multiplicadorInicio = (int)imput.nextFloat();
    System.out.print("Informe fim: ");
    multiplicadorFim = (int)imput.nextFloat();

    for (int i = multiplicadorInicio; i <= multiplicadorFim; i++)
      System.out.printf("\n%d x %d = %d", base, i, (base * i));
  }
}