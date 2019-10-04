/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 9. Escreva um programa que mostre na tela os números inteiros de 1 a 300,
 * em ordem crescente. Em seguida imprima os números em ordem decrescente.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);

        // Entrada
        int cont = 1;
        // Processamento
        while (cont <= 300) {
            // Saida
            System.out.printf("%d\n", cont);
            cont++;
        }
        cont = cont - 1;
        System.out.printf("\n");
        while (cont > 0) {

            // Saida
            System.out.printf("%d\n", cont);
            cont--;
        }

    }
}
