/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 14. Faça um programa que utilizando a estrutura Do-While, leia para um número
 * indeterminado de pessoas: leia a idade de cada pessoa, sendo que a leitura da idade 0
 * (zero) indica o fim dos dados e não deve ser considerada: calcule e escreva o número de
 * pessoas; calcule e escreva a idade média do grupo; calcule e escreva a menor idade e a
 * maior idade.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int idade;
        int menor = 999;
        int aux;
        int maior = 0;
        int cont = 0;
        int qntPessoas = 0;
        double media, soma = 0;
        boolean sair;

        // Entrada
        do {
            System.out.printf("Informe a sua idade:");
            idade = input.nextInt();

            // Processamento
            qntPessoas++;
            if (idade == 0) {
                sair = true;
            } else {
                if (idade < 0) {
                    System.out.printf("Erro: Idade invalida!\n");

                } else {

                    if (idade < menor) {

                        menor = idade;

                    } else if (idade > maior) {

                        maior = idade;
                    }
                }
            }

            cont++;
            soma += idade;

        } while (idade != 0);

        // Saida
        if (qntPessoas
                <= 1) {
            maior = 0;
            media = soma / qntPessoas;
            System.out.printf("\nA menor idade digitada é %d.\n", menor);
            System.out.printf("A maior idade digitada é %d.\n", maior);
            System.out.printf("A media entre as idades digitada é %.2f.\n", media);

        } else {
            media = soma / qntPessoas;
            System.out.printf("\nA menor idade digitada é %d.\n", menor);
            System.out.printf("A maior idade digitada é %d.\n", maior);
            System.out.printf("A media entre as idades digitada é %.2f.\n", media);
        }
    }
}
