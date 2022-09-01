
package code;

import java.util.Scanner;

public class Ex_14 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int num = 0;

    System.out.println("\nSërie numérica\n");
    System.out.print("Informe número inteiro: ");
    num = imput.nextInt();
    while (num < 0)
      num = imput.nextInt();

    System.out.println("\nResultado");
    System.out.print("S = ");
    for (int i = 0; i < num; i++) {
      System.out.printf("%d/%d + ", i, (i + 1));
      if (i == (num - 1))
        System.out.printf("%d/%d", i, (i + 1));
    }
  }
}
