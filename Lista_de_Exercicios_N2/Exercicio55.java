/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 55. Escreva um programa que leia uma matriz A 4x4 e outra matriz B 4x4. Calcule e
 * imprima a matriz Soma, correspondente a A + B.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio55 {

    int A[][] = new int[2][2];
    int B[][] = new int[2][2];

    public static void main(String[] args) {

        somaMatrizes();

    }

    static void somaMatrizes() {
        
        // Variaveis
        Exercicio55 obj1 = new Exercicio55();
        Exercicio55 obj2 = new Exercicio55();
        Scanner input = new Scanner(System.in);
        int MaxLinha, MaxColuna;
        int[][] soma = new int[obj1.A.length][obj1.A.length];
        MaxColuna = MaxLinha = obj1.A.length;
        
        // Entrada
        for (int i = 0; i < MaxColuna; i++) {
            for (int j = 0; j < MaxLinha; j++) {
                System.out.printf("A[%d][%d] Número = ", i, j);
                obj1.A[i][j] = input.nextInt();
                System.out.printf("B[%d][%d] Número = ", i, j);
                obj2.B[i][j] = input.nextInt();
                
                // Saida: Soma elemento
                System.out.printf("\n");
                System.out.printf("A : [ %d [ %03d ] ]", i, obj1.A[i][j]);
                System.out.printf("  +  ", i, j);
                System.out.printf("B : [ %d [ %03d ] ]", j, obj2.B[i][j]);
                System.out.printf(" = %03d \n\n", obj1.A[i][j] + obj2.B[i][j]);
            }
        }
        
        // Processamento
        for (int i = 0; i < MaxColuna; i++) {
            for (int j = 0; j < MaxLinha; j++) {
                soma[i][j] = obj1.A[i][j] + obj2.B[i][j];
            }
        }
        
        // Saida
        for (int i = 0; i < MaxColuna; i++) {
            for (int j = 0; j < MaxLinha; j++) {
                System.out.printf("A : [ %d [ %03d ] ]", i, obj1.A[i][j]);
                System.out.printf("  +  ", i, j);
                System.out.printf("B : [ %d [ %03d ] ]", i, obj2.B[i][j]);
                System.out.printf(" = %03d \n", soma[i][j]);
            }
        }
    }

}
