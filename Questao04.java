/*Raissa Rodrigues - Sistemas de Informação
 * 4. Faça um programa, com uma função que necessite de um argumento. A
função retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se
seu argumento for zero ou negativo.
 */

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        float numero = scanner.nextFloat();

        char resposta = argumento(numero);
        System.out.println("O argumento é: " + resposta);
        scanner.close();
    }

    public static char argumento(float numero){
        if (numero > 0) {
            return 'P';
        }
        return 'N';
    }
}
