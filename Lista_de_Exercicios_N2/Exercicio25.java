/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 25. Faça um programa que leia um número entre 1 e 10 (deve ser validado) e exiba a
 * tabuada deste número.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int numero;
        int cont;
        int soma = 0;
        boolean sair = false;

        // Valida: Numero
        do {

            // Entrada: Numero
            System.out.printf("Informe um numero de 1 a 10:");
            numero = input.nextInt();

            // Saida: Numero Inválido
            if (numero <= 0 || numero > 10) {
                System.out.printf("Erro: Numero inválido!\n\n");
            } else {
                sair = true;
            }
        } while (!sair);

        // Processamento
        System.out.printf("\nTabuada do numero %d\n", numero);
        for (cont = 1; cont <= 10; cont++) {

            // Saida
            // Condição: Para ajusta o alinhamento da saida
            if (cont == 10) {
                System.out.printf("%d x %d = %d\n", numero, cont, (cont * numero));

            } else {
                System.out.printf("%d x %d  = %d\n", numero, cont, (cont * numero));

            }
        }
    }

}
