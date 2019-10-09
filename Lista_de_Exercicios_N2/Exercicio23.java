/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 23. Faça um programa que imprima os números pares e ímpares de 1 até N, onde N deverá
 * ser informado pelo usuário.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int N;
        int cont;
        boolean sair = false;
        
        // Valida: N
        do {
            
            // Entrada: N
            System.out.printf("Informe um Numero: ");
            N = input.nextInt();
            
            // Saida: N invalido menor que 0
            if (N < 1) {
                System.out.printf("Erro: Numero Inválido!\n");
            } else {
                sair = true;
            }
        } while (!sair);
        
        // Saida: Numeros Pares entre 1 e N
        System.out.printf("\nPares de 1 a %d\n", N);
        for (cont = 1; cont <= N; cont++) {
            if (cont % 2 == 0) {
                System.out.printf("%d\n", cont);

            }
        }
        
        // Saida: Numeros Ímpares entre 1 e N
        System.out.printf("\nÍmpares de 1 a %d\n", N);

        for (cont = 1; cont <= N; cont++) {
            if (!(cont % 2 == 0)) {
                System.out.printf("%d\n", cont);

            }
        }

    }

}
