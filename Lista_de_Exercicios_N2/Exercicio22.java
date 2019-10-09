/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 22. Faça um programa que leia um número e imprima todos os números de 0 até o número
 * digitado.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int numero;
        boolean sair = false;

        do {
            // Entrada
            System.out.printf("Informe um Numero: ");
            numero = input.nextInt();
            
            // Saida: Numero Invalido menor que 0
            if (numero < 0) {
                System.out.printf("Erro: Numero Inválido!\n\n");

            } else {
                sair = true;
            }
        } while (!sair);

        // Processamento
        for (int cont = 0; cont <= numero; cont++) {

            // Saida
            System.out.printf("%d\n", cont);
        }

    }

}
