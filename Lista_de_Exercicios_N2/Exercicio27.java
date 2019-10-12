/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 27. Escreva um programa que receba dois números x e y e calcule x y . Obs. Não utilize
 * nenhuma biblioteca matemática, apenas a estrutura de repetição.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int x, y, xaux;
        int cont;

        // Entrada: Valor  x
        System.out.printf("Informe o valor de X: ");
        xaux = x = input.nextInt();

        // Entrada: Valor y
        System.out.printf("Informe o valor de Y: ");
        y = input.nextInt();

        // Processamento
        for (cont = 1; cont < y; cont++) {
            xaux = (xaux * x);
        }

        // Saida
        System.out.printf("%d^%d = %d\n", x, y, xaux);

    }

}
