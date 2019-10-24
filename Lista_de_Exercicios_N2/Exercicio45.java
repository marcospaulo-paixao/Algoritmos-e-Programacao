/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 *
 * 45. Escreva um programa que receba quinze números inteiros e armazene em um vetor a
 * raiz quadrada de cada número. Caso o valor digitado seja menor do que zero, o número
 * -1 deve ser atribuído ao elemento do vetor. Após isso, imprima todos os valores
 * armazenados.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        double[] vetorRaizQ = new double[15];
        int numeros;

        // Entrada
        for (int i = 0; i < vetorRaizQ.length; i++) {
            System.out.printf("Informe o %dº número:", i + 1);
            numeros = input.nextInt();
            
            // Processamento
            if (numeros < 0) {
                vetorRaizQ[i] = -1;
            } else {
                vetorRaizQ[i] = Math.sqrt(numeros);
            }
        }

        // Saida
        System.out.printf("\nv(√) = {");
        for (int i = 0; i < vetorRaizQ.length; i++) {
            if (i == 14) {
                System.out.printf("%.1f}\n", vetorRaizQ[i]);

            } else {
                System.out.printf("%.1f, ", vetorRaizQ[i]);
            }
        }

    }
}
