

package code;

import java.util.Scanner;


public class Ex_02 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    String nome  = "";
    String senha = "";

    System.out.println("\nUsuário e SEnha\n");
    while (nome.length() < 3) {
      System.out.print("Informe nome do usuário: ");
      nome = imput.nextLine();
      if (nome.length() < 3)
        nome = imput.nextLine();
    }
    do {
      System.out.print("Informe senha: ");
      senha = imput.nextLine();
      if (nome.equals(senha) || senha.isEmpty() || senha.length() < 8)
        System.out.println("Nome == senha ou vazia ou < 8 char, digite novamente.");
    } while (nome.equals(senha) || senha.isEmpty() || senha.length() < 8);

    System.out.println("\nUsuário e SEnha");
    System.out.printf("Usuário: %s\n", nome);
    System.out.printf("Senha: %s\n", senha);
  }
}
