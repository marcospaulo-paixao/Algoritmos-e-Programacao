/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 *
 * 47. Faça um programa que leia dois vetores de 10 elementos inteiros cada um e mostre o
 * vetor resultante da intercalação desses dois vetores.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio47 {

    public static void main(String[] args) {
        
        // Variaveis
        Scanner input = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int numero;

        // Entrada: Vetor 1
        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe um número para a posição %d do vetor 1:", i);
            numero = input.nextInt();
            vetor1[i] = numero;

        }

        // Entrada: Vetor 2
        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe um número para a posição %d do vetor 2:", i);
            numero = input.nextInt();
            vetor2[i] = numero;

        }

        // Saida: Vetor 1 e Vetor 2
        System.out.printf("\nv1[]v2[]= {");
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                System.out.printf("%d, %d}\n", vetor1[i], vetor2[i]);

            } else {
                System.out.printf("%d, %d, ", vetor1[i], vetor2[i]);

            }
        }
    }
}
