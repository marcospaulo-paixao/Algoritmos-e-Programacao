/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 58. Leia uma matriz 8x 8 e escreva o maior elemento da diagonal principal e a soma dos
 * elementos da diagonal secundaria.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio58 {

    public static void main(String[] args) {

        // Variaveis
        Scanner input = new Scanner(System.in);
        int matriz[][] = new int[8][8];
        int maior = 0;
        int soma = 0;

        // Entrada
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("M[%d]", i);
            for (int j = 0; j < matriz.length; j++) {
                if (j == 0) {
                    System.out.printf("[%d]: ", j);

                } else {
                    System.out.printf("    [%d]: ", j);
                }
                matriz[i][j] = input.nextInt();
            }
            System.out.printf("\n");
        }

        // Processamento diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            if (i == 0) {
                maior = matriz[i][i];
            } else {
                if (matriz[i][i] > maior) {
                    maior = matriz[i][i];
                }
            }
        }

        // Processamento diagonal secundaria
        for (int j = 0, i = matriz.length - 1; j < matriz.length && i >= 0; i--, j++) {
            soma += matriz[j][i];
        }

        // Saida
        System.out.printf("\n");
        System.out.printf("Maior elemento da diagonal principal:. . . . . %d\n", maior);
        System.out.printf("Soma dos elementos da diagonal secundaria: . . %d\n", soma);
    }

}
