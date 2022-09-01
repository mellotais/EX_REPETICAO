
package code;

import java.util.Scanner;


public class Ex_16 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int tam      = 0;
    double num[];
    double menor = 0;
    double maior = 0;
    double soma  = 0;

    System.out.println("Mario e Menor");
    System.out.print("Informe quantidade de números: ");
    tam = (int)imput.nextFloat();
    num = new double[tam];

    System.out.println("Informe números..");
    for (int i = 0; i < tam; i++) {
      System.out.printf("Número %d: ", (i + 1));
      num[i] = imput.nextDouble();

      soma += num[i];
      if (i == 0) {
        maior = menor = num[i];
      } else {
        if (maior < num[i])
          maior = num[i];
        if (menor > num[i])
          menor = num[i];
      }
    }

    System.out.println("\nResultado:");
    System.out.printf("Maior: %.2f", maior);
    System.out.printf("\nMenor: %.2f", menor);
    System.out.printf("\nSoma: %.2f", soma);
  }
}
