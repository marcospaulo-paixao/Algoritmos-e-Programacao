/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 5. Faça um programa que leia um número indeterminado de números, calcule e mostre a
 * soma dos números digitados, a quantidade de números digitados e a média dos números
 * digitados.
 *
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        double numero, soma = 0, media = 0;
        int qntNumeros = 0;
        String entrada;
        boolean sair = false;

        // Entrada
        while (!sair) {

            System.out.printf("Digite s para sair ou um Numero: ");
            entrada = input.next();

            // Processamento
            if (entrada.equalsIgnoreCase("s")) {
                sair = true;
            } else {
                qntNumeros++;
                soma += Double.parseDouble(entrada);
            }

        }
        if (qntNumeros > 0) {
            media = soma / qntNumeros;
        }
        // Saida
        System.out.println("Soma = " + soma);
        System.out.println("Quantidade = " + qntNumeros);
        System.out.println("Media = " + media);
    }
}
