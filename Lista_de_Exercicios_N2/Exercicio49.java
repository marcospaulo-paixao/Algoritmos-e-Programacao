/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 *
 * 49. Faça um programa que leia um código numérico inteiros e um vetor de 10 posições de
 * números reais. Se o código for zero, termine o programa. Se for 1, mostre o vetor na
 * ordem direta. Se for 2, mostre o vetor na ordem inversa.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio49 {

    public static void main(String[] args) {

        // Variaveis
        Scanner input = new Scanner(System.in);
        int[] vetor10 = new int[10];
        int num;
        int codigo;
        boolean sair = false;

        // Entrada: Numero Vetor
        for (int i = 0; i < 10; i++) {
            System.out.printf("Posição %d:\nNúmero: ", i);
            vetor10[i] = num = input.nextInt();
        }

        // Entrada: Codigo 
        do {
            System.out.printf("\n[0] Sair - [1] Ordem Direta - [2] Ordem Inversa\n");
            System.out.printf("Digite o Codigo:");
            codigo = input.nextInt();

            // Processamento
            switch (codigo) {
                case 0:
                    sair = true;
                    break;
                case 1:

                    // Saida
                    System.out.printf("\nvetor[] = {");
                    for (int i = 0; i < 10; i++) {
                        if (i == 9) {
                            System.out.printf(" %d}\n", vetor10[i]);
                        } else {
                            System.out.printf(" %d,", vetor10[i]);
                        }
                        sair = true;
                    }
                    break;
                case 2:

                    // Saida
                    System.out.printf("\nvetor[] = {");
                    for (int i = 9; i >= 0; i--) {
                        if (i == 0) {
                            System.out.printf(" %d}\n", vetor10[i]);
                        } else {
                            System.out.printf(" %d,", vetor10[i]);
                        }
                    }
                    sair = true;
                    break;
                default:

                    // Saida: Codigo invalido
                    System.out.printf("Codigo inválido!\n");
            }
        } while (!sair);

    }
}
