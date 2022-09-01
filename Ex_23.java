

package code;

import java.util.Scanner;

public class Ex_23 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int turmas  = 0;
    int aluno   = 0;
    float media = 0;

    System.out.println("\nMédia de alunos por turma\n");
    System.out.print("Informe quantidade de turmas: ");
    turmas = (int)imput.nextFloat();

    System.out.println("Informe quantidade de alunos pro turma: ");
    for (int i = 0; i < turmas; i++) {
      System.out.printf("Turma %d: ", (i + 1));
      aluno = (int)imput.nextDouble();
      while (aluno < 0 || aluno > 40)
        aluno = (int)imput.nextDouble();
      media += aluno;
    }

    media /= turmas;

    System.out.println("\nResultado");
      System.out.printf("Média %.2f", media);
  }
}
