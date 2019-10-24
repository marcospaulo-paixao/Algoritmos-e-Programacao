/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 43. Faça um programa que preencha um vetor com 10 números inteiros. Calcule e mostre os
 * números superiores a 50 e suas respectivas posições. O programa deverá mostrar uma
 * mensagem se não existir nenhum número nessa condição.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio43 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int[] vetorMaior = new int[10];
        int[] vetorMenor = new int[10];
        int elemento;
        
        // Entrada: Elementos maiores e menores 
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um numero para a posição %d: ", i + 1);
            elemento = input.nextInt();

            // Condição: Se elemento for maior que 50
            if (elemento > 50) {
                vetorMaior[i] = elemento;

                // Condição: Se elemento for menor que 50
            } else if (elemento < 50) {
                vetorMenor[i] = elemento;

            }
        }

        // Processamento
        System.out.printf("\nAs posições com números maiores que 50:\n");

        for (int i = 0; i < 10; i++) {

            if (vetorMaior[i] != 0) {

                // Saida: Posições com números maiores que 50
                System.out.printf("Posição: %d, Numero: %d\n", i + 1, vetorMaior[i]);
            }
        }
        System.out.printf("\nAs posições com números menores que 50:\n");
        for (int i = 0; i < 10; i++) {
            if (vetorMenor[i] != 0) {

                // Saida: Posições com números menores que 50
                System.out.printf("Posição: %d, Numero: %d\n", i + 1, vetorMenor[i]);
            }

        }
    }
}
