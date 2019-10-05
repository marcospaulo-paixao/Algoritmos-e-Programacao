/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 10. Escreva um programa que receba vários números inteiros informados pelo usuário
 * enquanto os mesmos forem positivos. Imprimir quantos números foram digitados.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int qntNumeros = 0;
        int numero;
        boolean sair = false;

        // Entrada
        while (!sair) {
            System.out.printf("Informe um número inteiro positivo: ");
            numero = input.nextInt();

            // Processamento
            qntNumeros++;
            if (numero < 0) {
                sair = true;

            } else {
                System.out.printf("%d\n", numero);
            }

        }
        // Saida
        System.out.printf("Foram digitados %d números.\n", qntNumeros);

    }
}
