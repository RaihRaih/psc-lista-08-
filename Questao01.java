/*Raissa Rodrigues - Sistemas de Informação
 * 1. Faça um programa para imprimir:
1
2 2
3 3 3
.....
n n n n n n ... n
para um n informado pelo usuário.
Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.
 */
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para n: ");
        int n = scanner.nextInt();

        imprimirPadrao(n);
        scanner.close();
    }

    public static void imprimirPadrao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Pula para a próxima linha após imprimir a fileira
        }
    }
}
