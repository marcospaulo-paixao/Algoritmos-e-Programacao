/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 6. Escreva um programa que calcule o fatorial de um número inteiro N fornecido pelo
 * usuário. Cuidado com valores inválidos!
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        // Variaveis
        Scanner entrada = new Scanner(System.in);
        int numero;
        int multiplicador;
        long fator = 1;

        // Entrada
        System.out.printf("Informe um número: ");
        numero = entrada.nextInt();

        //Processamento
        if (numero < 0) {
            System.out.printf("Número não pode ser fatorado!\n");
        } else {
            multiplicador = numero;
            while (multiplicador >= 1) {
                fator *= multiplicador;
                multiplicador--;
            }
            // Saida
            System.out.printf("%d! = %d\n", numero, fator);
        }
    }
}
