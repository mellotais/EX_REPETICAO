
package code;

import java.util.Scanner;


public class Ex_17 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    float num = 0;

    System.out.println("\nNumero Primeo\n");
    System.out.print("Informe número inteiro: ");
    num = imput.nextFloat();
    while (num != (int)num)
      num = imput.nextFloat();

    System.out.println("\nResutaldo");
    if ((num % 2 != 0 && num % 3 != 0 && num != 0)
      || (num == 2 || num == 3))
      System.out.printf("%d é primo", (int)num);
    else
      System.out.printf("%d não é primo", (int)num);
  }
}

