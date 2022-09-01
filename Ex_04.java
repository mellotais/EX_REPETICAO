
package code;

import java.util.Scanner;


public class Ex_04 {
  public static void main(String[] args) {
    final double CRESCIMENTOA = 0.03;
    final double CRESCIMENTOB = 0.015;

    int cidadeA = 80000;
    int cidadeB = 200000;
    int contAnos = 0;

    while (cidadeA < cidadeB) {
      cidadeA += cidadeA * CRESCIMENTOA;
      cidadeB += cidadeB * CRESCIMENTOB;
      contAnos++;
    }

    System.out.printf("\nA cidade A ultrapassará o número de habitantes da cidade B em %d anos.\n", contAnos);
  }
}
