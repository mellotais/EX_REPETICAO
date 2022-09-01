
package code;

import java.util.Scanner;

public class Ex_28 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int cont          = 0;
    float temperatura = 0;
    float menor       = 0;
    float maior       = 0;
    float media       = 0;

    System.out.println("\nMedição temperatura");
    System.out.println("\nPara sair digite 0 Kelvin em Celsius");
    while (temperatura < -273) {
      System.out.println("Informe temperatura: ");
      temperatura = imput.nextFloat();
      media += temperatura;
      if (cont == 0) {
        maior = menor = temperatura;
      } else {
        if (maior < temperatura)
          maior = temperatura;
        if (menor > temperatura)
          menor = temperatura;
      }
      cont++;
    }

    media /= cont;

    System.out.println("\nResultado sobre temperaturas:");
    System.out.printf("Maior: %.2f", maior);
    System.out.printf("\nMenor: %.2f", menor);
    System.out.printf("\nSoma: %.2f", media);
  }
}