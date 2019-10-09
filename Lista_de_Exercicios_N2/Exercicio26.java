/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 26. Faça um programa que receba duas notas de cada um dos 5 alunos de uma turma,
 * calcule e imprima a média aritmética de cada aluno e imprima uma mensagem
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        float nota1 = 0;
        float nota2 = 0;
        double media;
        int cont;
        boolean sair = false;
        for (cont = 1; cont <= 5; cont++) {

            // Valída: nota1
            while (!sair) {

                // Entrada nota1 
                System.out.printf("Informe a nota 1 do %dº Aluno: ", cont);
                nota1 = input.nextFloat();

                // Saida: Nota1 menor que 0
                if (nota1 < 0) {
                    System.out.printf("Erro: Nota inválida!\n\n");

                } else {
                    sair = true;
                }
            }

            // Zerando variavel sair
            sair = false;

            // Valída: nota2
            while (!sair) {

                // Entrada nota2
                System.out.printf("Informe a nota 2 do %dº Aluno: ", cont);
                nota2 = input.nextFloat();

                // Saida: Nota2 menor que 0
                if (nota2 < 0) {
                    System.out.printf("Erro: Nota inválida!\n\n");
                } else {
                    sair = true;
                }
            }

            // Zerando variavel sair
            sair = false;

            // Calculando Média aritmética
            media = (nota1 + nota2) / 2;

            // Saida
            System.out.printf("\nA media do %dº Aluno é %.2f\n\n", cont, media);
        }

    }

}
