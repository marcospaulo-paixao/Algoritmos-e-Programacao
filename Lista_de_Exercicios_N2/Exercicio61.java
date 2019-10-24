/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 61. Faça um programa que leia dois vetores de cinco elementos numéricos (int) e crie uma
 * matriz 2x5 resultante da intercalação desses dois vetores conforme demonstrado abaixo.
 *
 * VetorA  1  2  3  4  5
 * VetorB 10  9  8  7  6
 *
 * Matriz Resultante AB
 *      1 10  2  9  3
 *      8  4  7  5  6
 *
 * Crie um método de impressão para os vetores e um método de impressão para a matriz
 * resultante em formato matricial. O programa deverá gerar a saída mostrada acima.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio61 {

    public static void main(String[] args) {

        // Variaveis
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[a.length];
        int[][] ab = new int[2][a.length];

        // Indice para controlar o vetor A
        int k = 0;

        // Indice para controlar o vetor A
        int l = 0;

        // Entrada vetor A
        for (int i = 0; i < a.length; i++) {
            System.out.printf("A[%d]: ", i);
            a[i] = input.nextInt();
        }

        // Entrada vetor B
        for (int i = 0; i < a.length; i++) {
            System.out.printf("B[%d]: ", i);

            b[i] = input.nextInt();

        }

        // Processamento Matriz Resultante AB
        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < ab[0].length; j++) {

                // Filtra linhas pares
                if (i % 2 == 0) {

                    // Filtra colunas pares
                    if (j % 2 == 0) {
                        ab[i][j] = a[k];

                        // Manipulação de indice 
                        k++;
                    } else {
                        ab[i][j] = b[l];

                        // Manipulação de indice 
                        l++;
                    }
                } else {
                    if (j % 2 == 0) {
                        ab[i][j] = b[l];
                        l++;

                    } else {
                        ab[i][j] = a[k];
                        k++;
                    }
                }
            }
        }

        // Saida Vetor A
        System.out.printf("\nA[");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(" %02d ", a[i]);
        }
        System.out.printf("]");

        // Saida Vetor B
        System.out.printf("\nB[");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(" %02d ", b[i]);
        }
        System.out.printf("]\n");

        // Saida matriz intercalação do vetor AB
        System.out.printf("\nAB\n");
        for (int i = 0; i < 2; i++) {
            System.out.printf("[");
            for (int j = 0; j < a.length; j++) {

                System.out.printf(" %02d ", ab[i][j]);
            }
            System.out.printf("]\n");
        }

    }

}
