/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 1. Faça um programa que leia dois números inteiros, o primeiro é o valor inicial de um
 * contador, e o segundo é o valor final do contador (testar se o valor inicial fornecido é
 * inferior ao valor final). Usando o comando While, escreva na tela uma contagem que
 * comece no primeiro número lido, escreva os números seguintes colocando sempre
 * apenas um número em cada nova linha da tela, e terminando a contagem quando chegar
 * ao valor final indicado.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        // Variaveis
        Scanner entrada = new Scanner(System.in);
        String txt1 = "Informe o valor inicial do contador:";
        String txt2 = "Informe o valor final do contador:";
        int cont;

        // Entrada        
        System.out.printf("%s\n", txt1);
        int contIn = entrada.nextInt();

        System.out.printf("%s\n", txt2);
        int contFin = entrada.nextInt();

        // Processamento
        if (contIn > contFin) {
            cont = contIn;
            contIn = contFin;
            contFin = cont;
        }

        while (contIn != contFin) {
            // Saida
            System.out.printf("%d\n", contIn);
            contIn++;
        }
        System.out.printf("%d\n", contIn);
    }
}
