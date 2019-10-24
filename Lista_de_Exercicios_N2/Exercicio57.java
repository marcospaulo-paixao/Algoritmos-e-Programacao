/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 57. Escrever um algoritmo que lê uma matriz M(5,5)e cria 2 vetores SL(5)e SC(5) que
 * contenham, respectivamente, as somas das linhas e das colunas de M. Escrever a matriz
 * e os vetores criados.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio57 {

    public static void main(String[] args) {

        // Variaveis
        Scanner input = new Scanner(System.in);
        int M[][] = new int[5][5];
        int SC[] = new int[5];
        int SL[] = new int[5];

        // Entrada Matriz
        for (int i = 0; i < M.length; i++) {

            for (int j = 0; j < M.length; j++) {
                System.out.printf("c%d l%d: ", i, j);
                M[i][j] = input.nextInt();

            }
            System.out.printf("\n");
        }

        // Processamento Sl
        System.out.printf("\n");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {

                SL[i] += M[j][i];
            }
        }
        
        // Processamento Sc
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {

                SC[i] += M[i][j];
            }
        }
        // Saida
        for (int i = 0; i < M.length; i++) {
            System.out.printf("SC[%d] = %03d | ", i, SC[i]);
            System.out.printf("SL[%d] = %03d ", i, SL[i]);

            System.out.printf("\n");

        }
    }

}
