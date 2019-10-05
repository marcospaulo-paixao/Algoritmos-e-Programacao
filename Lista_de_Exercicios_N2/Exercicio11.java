/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 11. Escreva um programa que leia uma quantidade inteira N e, em seguida, leia N valores
 * double. Calcule e informe a média dos N valores lidos.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int qntN;
        int cont = 1;
        double N, media = 0, soma = 0.0;

        // Entrada
        System.out.printf("Informe a quantidade de números que será inserido:");
        qntN = input.nextInt();

        while (cont <= qntN) {
            System.out.printf("Informe o %dº número:", cont);
            N = input.nextDouble();

            // Processamento
            cont++;
            soma += N;
        }
        if (qntN > 0) {

            media = soma / qntN;

            // Saida
            System.out.printf("\nMedia = Soma ÷ qntNumeros\n");
            System.out.printf("Media = %.0f ÷ %d = %.2f\n", soma, qntN, media);
        } else {
            System.out.printf("Media = %.0f ÷ %d = %.2f\n", soma, qntN, media);
        }
    }
}

