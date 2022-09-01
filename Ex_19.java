

package code;

import java.util.Scanner;

public class Ex_19 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    float num = 0;

    System.out.println("\nNúmero Primo\n");
    System.out.print("Informe número inteiro: ");
    num = imput.nextFloat();
    while (num != (int)num)
      num = imput.nextFloat();

    System.out.println("\nResutaldo");
    for (int i = 1; i <= num; i++)
      if ((i % 2 != 0 && i % 3 != 0 && i != 0)
          || (i == 2 || i == 3)) {
        System.out.printf("%d  ", i);
      }
  }
}
