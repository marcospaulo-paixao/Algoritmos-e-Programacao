/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 16. Escreva um programa que receba vários números inteiros, calcule e mostre: a) a soma
 * dos números digitados; b) a quantidade de números digitados; c) a média dos números
 * digitados; d) o maior número digitado; e) o menor número digitado; f) a média dos
 * números pares; g) a percentagem dos números ímpares entre todos os números
 * digitados. Finalize a entrada de dados com a digitação do número 0.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int numeros;
        int menor = 2147483647;
        int maior = -2147483648;
        int qntPar = 0;
        int qntImpar = 0;
        int somaPar = 0;
        double qntNumeros = 0.0;
        double porcImpar;
        double mediaPar, media;
        double soma = 0;
        boolean sair = false;

        // Entrada
        do {
            qntNumeros++;
            System.out.printf("Informe o %.0fº número: ", qntNumeros);
            numeros = input.nextInt();

            // Processamento
            if (numeros == 0) {
                qntNumeros--;
                sair = true;
            } else {
                soma += numeros;

                if (numeros < menor) {
                    menor = numeros;
                }
                if (numeros > maior) {
                    maior = numeros;
                }
                if (numeros % 2 == 0) {
                    qntPar++;
                    somaPar += numeros;
                } else {
                    qntImpar++;
                }
            }
        } while (!sair);

        // Saida
        media = soma / qntNumeros;
        mediaPar = somaPar / qntPar;
        porcImpar = ((qntImpar / qntNumeros) * 100);
        System.out.printf("\nSoma dos números digitados: %.0f\n", soma);
        System.out.printf("Quantidade de números digitados: %.0f\n", qntNumeros);
        System.out.printf("Média dos números digitados: %.2f\n", media);
        System.out.printf("Maior número digitado %d\n", maior);
        System.out.printf("Menor número digitado: %d\n", menor);
        System.out.printf("Média dos números pares: %.2f\n", mediaPar);
        System.out.printf("Percentagem dos números ímpares entre todos os números digitados: %.1f%%\n", porcImpar);
    }
}
