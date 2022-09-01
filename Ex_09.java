
package code;

import java.util.Scanner;

public class Ex_09 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int num = 0;

    System.out.println("\nTabuada\n");
    System.out.print("Informe número: ");
    num = imput.nextInt();

    for (int i = num; i < 11; i++)
      System.out.printf("\n%d x %d = %d", num, i, (num * i));
  }
}