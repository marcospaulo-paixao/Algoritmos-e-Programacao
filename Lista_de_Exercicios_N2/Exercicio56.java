/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 56. Escreva um programa que leia uma matriz de inteiros A 3x5. Gere e imprima o vetor SL
 * de tamanho 3, onde cada elemento é a soma dos elementos de uma linha da matriz A.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio56 {

    public static void main(String[] args) {

        // Variaveis
        Scanner input = new Scanner(System.in);
        int A[][] = new int[3][5];
        int SL[] = new int[3];

        // Entrada
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite um Número, A[%d][%d]: ", i, j);
                A[i][j] = input.nextInt();
            }
        }

        // Processamento
        System.out.printf("\nSL = {");
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 5; k++) {
                SL[j] += A[j][k];

            }
            // Saida
            System.out.printf(" %d ", SL[j]);
        }
        System.out.printf("}\n");
    }

}
