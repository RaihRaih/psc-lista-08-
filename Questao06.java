/*Raissa Rodrigues - Sistemas de infomacao
 * 6. Faça um programa que converta da notação de 24 horas para a notação de 12 horas.
 * Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros.
 * Deve haver pelo menos duas funções: uma para fazer a conversão e uma para a saída.
 * Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M.
 * Assim, a função para efetuar as conversões terá um parâmetro formal para registrar se é A.M. ou P.M.
 * Inclua um loop que permita que o usuário repita esse cálculo para novos valores de entrada todas as vezes que desejar. */

import java.util.Scanner;

public class Questao06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char continuar;

    do {
      System.out.println("Digite a hora no formato 24h: ");
      int horas = scanner.nextInt();

      System.out.println("Digite os minutos: ");
      int minutos = scanner.nextInt();

      System.out.println(converterHora(horas, minutos));
      
      System.out.println("Deseja converter outro horário? (S/N)");
      continuar = scanner.next().charAt(0);

      scanner.close();
    } while (continuar == 'S' || continuar == 's');
  }

  public static String converterHora(int horas, int minutos) {
    String periodo;
    if (horas >= 12) {
      periodo = "P.M";
      horas = horas - 12;
    } else {
      periodo = "A.M";
      if (horas == 0) {
        horas = 12;
      }
    }
    return horas + ":" + minutos + " " + periodo;
  }
}
