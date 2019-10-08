/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 3. Escreva um programa que leia uma quantidade de números (para teste use 10)
 * calculando e imprimindo o maior, o menor e a média entre os números.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        // Variaveis
        Scanner entrada = new Scanner(System.in);
        String txt1 = "º Número.";
        int menor = 0;
        int maior = 0;
        int cont = 0;
        int numero;
        int aux = 0;
        double soma = 0.0;
        double media;

        // Entrada
        while (cont < 10) {

            cont++;

            System.out.printf("%d%s\n", cont, txt1);
            numero = entrada.nextInt();

            // Processamento
            if (cont == 0) {
                maior = menor = numero;
            } else if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }

            soma += (double) numero;
        }

        media = soma / 10;

        // Saida
        System.out.printf("Maior = %d\n", maior);
        System.out.printf("Menor = %d\n", menor);
        System.out.printf("Media = %.2f\n", media);
    }
}
