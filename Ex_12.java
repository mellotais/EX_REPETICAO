
package code;

import java.util.Scanner;


public class Ex_12 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int num  = 0;
    int fib  = 1;
    int aux1 = 1;
    int aux2 = 0;

    System.out.println("\nFibonacci\n");
    System.out.print("Informe número de termos para série de Fibonacci: ");
    num = imput.nextInt();
    while (num < 0)
      num = imput.nextInt();

    for (int i = 0; i < num; i++) {
      fib = aux1 + aux2;
      aux1 = aux2;
      aux2 = fib;
      System.out.printf("%d, ", fib);
    }
  }
}
