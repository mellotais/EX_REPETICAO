
package code;

import java.util.Scanner;


public class Ex_13 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    float num = 0.1f;

    System.out.println("\nFATORIAL\n");
    System.out.print("Informe número inteiro: ");
    num = imput.nextFloat();
    while (num != (int)num)
      num = imput.nextFloat();

    System.out.println("\nResultado:");
    System.out.printf("FAT: %d! = %d\n", (int)num, (int)fat(num));
  }

  private static float fat(float num) {
    if (num <= 1)
      return 1;
    else
      return fat(num - 1) * num;
  }
}
