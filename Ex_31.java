

package code;

import utils.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_31 {
  public static void main(String[] args) {
    Pessoa pes;
    Scanner imput = new Scanner(System.in);

    List<Pessoa> pessoa = new ArrayList<>();
    float maiorAltura = 0;
    float menorAltura = 0;
    float mediaAltura = 0;

    System.out.println("\nTurma e suas alturas\n");
    while (true) {
      pes = new Pessoa();
      System.out.print("Nome: ");
      while (!pes.setNome(imput.nextLine())) {}
      if ("sair".equalsIgnoreCase(pes.getNome()) || "fim".equalsIgnoreCase(pes.getNome()))
        break;
      System.out.print("Altura (centimetros): ");
      while (!pes.setAltura(imput.nextFloat())) {}
      imput.nextLine();

      if (pessoa.size() == 0) {
        maiorAltura = menorAltura = pes.getAltura();
      } else {
        if (maiorAltura < pes.getAltura())
          maiorAltura = pes.getAltura();
        if (menorAltura > pes.getAltura())
          menorAltura = pes.getAltura();
      }
      mediaAltura += pes.getAltura();
      pessoa.add(pes);
    }
    mediaAltura /= pessoa.size();


    System.out.printf("\nMaior Altura: %.1f cm", maiorAltura);
    System.out.printf("\nMenor Altura: %.1f cm", menorAltura);
    System.out.printf("\nMédia Altura: %.1f cm", mediaAltura);
    System.out.print("\nEstudante(s) mais alto(s)");
    for (Pessoa p: pessoa)
      if (p.getAltura() >= maiorAltura)
        System.out.println(p.toString());
    System.out.print("\nEstudante(s) mais baixo(s)");
    for (Pessoa p: pessoa)
      if (p.getAltura() <= menorAltura)
        System.out.println(p.toString());
  }
}