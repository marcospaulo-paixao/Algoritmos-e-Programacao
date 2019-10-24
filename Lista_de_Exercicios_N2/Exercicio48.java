/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 *
 * 48. Faça um programa que leia um primeiro vetor com dez números inteiros e um segundo
 * vetor com cinco números inteiros. Mostre uma lista dos números do primeiro vetor com
 * seus respectivos divisores armazenados no segundo vetor, bem como suas posições.
 * Ex.: Num [ 5 12 4 7 10 3 2 6 23 16 ]
 * Divis [ 3 11 5 8 2]
 * Saída:
 * Número 5:
 * Divisível por 5 na posição 2
 * Número 12:
 * Divisível por 3 na posição 0
 * Divisível por 2 na posição 4
 * Número 4:
 * Divisível por 2 na posição 4
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio48 {

    public static void main(String[] args) {

        // Variaveis
        Scanner input = new Scanner(System.in);
        int[] vetor10 = new int[10];
        int[] vetor5 = new int[5];
        int num;

        // Entrada: Vetor Números
        System.out.printf("*Vetor Número*\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Posição - %d\nDigite um número: ", i);
            vetor10[i] = num = input.nextInt();

        }

        // Entrada: Vetor Divisiveis
        System.out.printf("\n*Vetor Divisisores*\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Posição - %d\nDigite um numero: ", i);
            vetor5[i] = num = input.nextInt();
        }

        // Processamento
        System.out.printf("\n");
        for (int i = 0; i < 10; i++) {

            // Saida
            int cont = 0;
            for (int j = 0; j < 5; j++) {
                if (vetor10[i] % vetor5[j] == 0) {
                    if (cont == 0) {

                        System.out.printf("Número %d:\n", vetor10[i]);
                    }
                    System.out.printf("Divisível por %d na posição %d\n", vetor5[j], j);
                    cont++;
                }
            }
        }
    }
}
