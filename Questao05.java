/*Raissa Rodrigues - Sistemas de informação
5. Faça um programa com uma função chamada somaImposto. A função possui dois parâmetros formais: 
taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem 
e custo, que é o custo de um item antes do imposto. A função “altera” o valor de custo para incluir o imposto sobre vendas. */

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do custo: ");
        double custo = scanner.nextDouble();

        System.out.println("Digite a taxa de imposto: ");
        double taxaImposto = scanner.nextDouble();

        somaImposto(custo, taxaImposto);
        scanner.close();
    }

    public static double somaImposto( double custo, double taxaImposto){
        taxaImposto = custo * (taxaImposto/100);
        custo = custo + taxaImposto;
        System.out.println("Imposto: " + taxaImposto);
        System.out.println("O valor do custo com imposto é: " + custo);
        return custo;
        
    }
}
