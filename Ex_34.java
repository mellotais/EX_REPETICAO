
package code;

import java.util.Scanner;

public class Ex_34 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    double num = 0;
    int cont25 = 0;
    int cont50 = 0;
    int cont75 = 0;
    int cont100 = 0;

    System.out.print("Intervalo de números");
    while (true) {
      System.out.print("Informe número positivo (negativo para sair): ");
      num = imput.nextDouble();

      if (num >= 0 && num <= 25)
        cont25++;
      else
        if (num >= 26 && num <= 50)
          cont50++;
        else
          if (num >= 51 && num <= 75)
            cont75++;
          else
            if (num >= 76 && num <= 100)
              cont25++;
            else
              if (num < 0)
                break;
    }

    System.out.println("\nResutlado:");
    System.out.printf("Entre 0 e 25: %d", cont25);
    System.out.printf("\nEntre 25 e 50: %d", cont50);
    System.out.printf("\nEntre 51 e 75: %d", cont75);
    System.out.printf("\nEntre 76 e 100: %d", cont100);
  }
}
