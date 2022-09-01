

package code;

import java.util.Scanner;

public class Ex_18 {
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
    else {
      System.out.printf("%d não é primo", (int) num);
      System.out.print("\n É apenas divisível por: ");
      for (int i = 1; i <= num; i++)
        if (num % i == 0) {
          if (i != num)
            System.out.printf("%d, ", i);
          else
            System.out.printf("%d", i);
        }
    }
  }
}