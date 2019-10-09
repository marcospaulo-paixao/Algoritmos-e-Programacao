/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 21. Faça um programa que leia o seu nome e o imprima 100 vezes.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        String nome;

        // Entrada
        System.out.printf("Digite seu nome: ");
        nome = input.nextLine();

        // Processamento
        for (int cont = 1; cont <= 100; cont++) {

            // Saida
            System.out.printf("%s\n", nome);
        }

    }

}
