
package code;

import java.util.Scanner;


public class Ex_10 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    double base  = 0;
    int expoente = 0;

    System.out.println("\nPolinômio\n");
    System.out.print("Informe base: ");
    base = imput.nextDouble();
    System.out.print("Informe expoente: ");
    expoente = imput.nextInt();

    System.out.printf("\n%.4f elevada a %d = %.4f", base, expoente, (Math.pow(base, expoente)));
  }
}
