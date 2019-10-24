/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 *
 * 50. Faça um programa que leia um vetor com 10 elementos inteiros e um segundo vetor
 * com 5 números inteiros. Calcule e mostre dois vetores resultantes. O primeiro vetor
 * resultante será composto pelos números pares gerados pelo elemento do primeiro vetor
 * somado a todos elementos do segundo vetor. O segundo vetor resultante será composto
 * pelos números ímpares gerados pelo elemento do primeiro vetor somado a todos os
 * elementos do segundo vetor.
 * Primeiro vetor = [ 4 7 5 8 2 15 9 6 10 11]
 * Segundo vetor = [ 3 4 5 8 2 ]
 * Primeiro vetor resultante = [26 30 . . . ], sendo 26 = 4+3+4+5+8+2, 30 =
 * 8+3+4+5+8+2, . . .
 * Segundo vetor resultante = [29 27 . . . ], sendo 29 = 7+3+4+5+8+2, 27 =
 * 5+3+4+5+8+2, . .
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio50 {

    public static void main(String[] args) {

        // Variaveis
        Scanner input = new Scanner(System.in);
        int primeiroVetor[] = new int[10];
        int segundoVetor[] = new int[5];
        int primeiroVetorResultante[] = new int[10];
        int segundoVetorResultante[] = new int[10];
        int cont1vetor = 0;
        int cont2vetor = 0;

        // Entrada: Primeiro vetor
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um Número para a Posição %d do Primeiro vetor:", i);
            primeiroVetor[i] = input.nextInt();
        }
        System.out.printf("\n");

        // Entrada: Segundo vetor
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um Número para a Posição %d do Segundo vetor:", i);
            segundoVetor[i] = input.nextInt();
        }
        
        // Processamento: Soma vetores pares e Soma vetores impares
        for (int i = 0; i < 10; i++) {
            if (primeiroVetor[i] % 2 == 0) {
                cont1vetor++;
                for (int j = 0; j < 5; j++) {
                    primeiroVetorResultante[cont1vetor] = primeiroVetor[i] += segundoVetor[j];
                }
            } else {

                cont2vetor++;
                for (int j = 0; j < 5; j++) {
                    segundoVetorResultante[cont2vetor] = primeiroVetor[i] += segundoVetor[j];

                }
            }
        }
        
        // Saida
        System.out.printf("\nPrimeiro vetor resultante[]={ ");
        for (int i = 0; i < 10; i++) {
            if (primeiroVetorResultante[i] != 0) {

                System.out.printf("%d ", primeiroVetorResultante[i]);
            }
        }
        System.out.printf("}\n");
        System.out.printf("Segundo vetor resultante[]={ ");
        for (int i = 0; i < 10; i++) {
            if (primeiroVetorResultante[i] != 0) {

                System.out.printf("%d ", segundoVetorResultante[i]);
            }
        }
        System.out.printf("}\n");
    }
}
