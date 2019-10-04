/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 12. Faça um programa que leia dois números inteiros positivos (n1 e n2). Repita a leitura
 * até que n1 seja menor que n2, quando n2 for maior que n1, imprima os números entre
 * n1 e n2.double. Calcule e informe a média dos N valores lidos.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int n1, n2, cont = 1;
        double media, soma = 0.0, n2aux;
        boolean sair = false;

        // Entrada
        while (!sair) {
            System.out.printf("Informe o 1º numero:");
            n1 = input.nextInt();
            System.out.printf("Informe o 2º numero:");
            n2 = input.nextInt();
            
            // Processamento
            if (n1 > n2) {
                System.out.printf("O Primerio numero é maior que o Segundo numero!\n");
            } else {
                n2aux = (double) (n2);

                while (n1 <= n2aux) {
                    soma += n1;

                    n1++;
                }
                sair = true;
            }
        }
        // Saida
        media = soma / 2;
        System.out.printf("Media = %.0f ÷ 2 = %.2f\n", soma, media);

    }
}
