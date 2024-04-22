/*Raissa Rodrigues - Sistemas de infomacao */
import java.util.Scanner;

public class Questao03 {
    public static int somar(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        int c = scanner.nextInt();
        
        int soma = somar(a, b, c);

        System.out.println("Soma: " + soma);

        scanner.close();
    }
}
