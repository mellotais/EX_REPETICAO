
package code;

import java.util.Scanner;

public class Ex_21 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int IDADE = 150;

    float idade = 0;
    float media = 0;
    int cont    = 1;

    System.out.println("\nMario e Menor");
    System.out.println("\nInforme -1 para sair\n");
    System.out.println("Informe números..");
    while (idade >= 0 && idade <= IDADE) {
      System.out.printf("Idade %d: ", cont);
      idade = imput.nextFloat();
      while (idade != (int)idade)
        idade = imput.nextFloat();
      if (idade >= 0 && idade <= IDADE)
        media += idade;
      cont++;
    }

    media /= cont;

    System.out.println("\nResultado:");
    if (media <= 25)
      System.out.printf("Média da turma de %.2f anos: Turma Jovem", media);
    else
      if(media > 25 & media < 60)
        System.out.printf("Média da turma de %.2f anos: Turma Adulta", media);
      else
        System.out.printf("Média da turma de %.2f anos: Turma Idosa", media);
  }
}

