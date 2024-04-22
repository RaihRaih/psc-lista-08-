/*Raissa Rodrigues - Sistemas de infomacao */
import java.util.Scanner;

public class Questao02 {
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
