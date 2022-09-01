
package code;

import java.util.Scanner;

public class Ex_07 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;

    System.out.println("\nIntervalo sobre números\n");
    System.out.print("Informe número: ");
    num1 = imput.nextInt();
    System.out.print("Informe número: ");
    num2 = imput.nextInt();

    for (int i = num1; i < (num2 + 1); i++)
      System.out.printf("%d ", i);
  }
}
