/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 59. Faça um algoritmo que leia duas matrizes de tamanho 3 x 3. Em seguida, compare os
 * valores das duas matrizes, e mostre quais números são iguais nas duas matrizes. Isto é,
 * caso o elemento 5 exista em na matriz A e na matriz B, o programa deverá dizer que ele
 * existe em ambas as matrizes informando também as coordenadas do elemento 5 em A e
 * em B.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio59 {

    public static void main(String[] args) {

        // Variaveis
        Scanner input = new Scanner(System.in);
        int A[][] = new int[3][3];
        int B[][] = new int[A.length][A.length];

        // Entrada Matiz A
        for (int i = 0; i < A.length; i++) {
            System.out.printf("A[%d]", i);
            for (int j = 0; j < A.length; j++) {
                if (j == 0) {
                    System.out.printf("[%d]: ", j);
                } else {
                    System.out.printf("    [%d]: ", j);
                }
                A[i][j] = input.nextInt();
            }
        }

        // Entrada Matiz B
        for (int i = 0; i < A.length; i++) {
            System.out.printf("B[%d]", i);
            for (int j = 0; j < A.length; j++) {
                if (j == 0) {
                    System.out.printf("[%d]: ", j);

                } else {
                    System.out.printf("    [%d]: ", j);
                }

                B[i][j] = input.nextInt();
            }
        }

        // Processamento
        System.out.printf("\n");
        for (int i = 0;
                i < A.length;
                i++) {
            for (int j = 0; j < A.length; j++) {
                for (int k = 0; k < A.length; k++) {
                    for (int l = 0; l < A.length; l++) {

                        // Saida
                        if (A[i][j] == B[k][l]) {
                            System.out.printf("A[%d][%d] e B[%d][%d] =  %d \n", i, j, k, l, A[i][j]);
                        }
                    }
                }
            }
        }
    }
}
