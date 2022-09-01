

package code;

import java.util.Scanner;

public class Ex_15 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    double resultado = 0;
    int multiplica   = 38;
    int divide       = 1;

    System.out.println("\nResultado da série: (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1 * 2)/37");
    for (int i = 0; i < 37; i++) {
      resultado += (double)((multiplica - 1) * multiplica) / divide;
      multiplica--;
      divide++;
    }
    System.out.printf("\nResultado: %.3f", resultado);
  }
}