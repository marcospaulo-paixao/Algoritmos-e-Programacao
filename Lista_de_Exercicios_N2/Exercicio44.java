/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 *
 * 44. Faça um programa que leia um vetor de inteiros, de 10 posições. A seguir, encontre o
 * menor elemento (X) e o maior elemento (Y) do vetor. Imprima uma mensagem
 * mostrando: “O menor elemento do vetor é”, X, “e sua posição dentro do vetor é: V[x].
 * Já o maior elemento é “, Y,” e está na posição V[y]”. Assuma que os elementos
 * informados no vetor são todos diferentes entre si.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int aux;
        int x = 0, y = 0;
        int posi1 = 0;
        int posi2 = 0;

        // Entrada: Elementos
        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe um número para a posição %d:", i);
            aux = input.nextInt();

            // Adicionando: Elemento na posição "i" do vetor
            vetor[i] = aux;

            if (i >= 1) {
                
                // Verificação: Se o elemento ja está contido dentro do vetor
                for (int j = 0; j < i; j++) {
                    
                    // Saida: Elemento está contido 
                    if (vetor[j] == aux) {
                        System.out.printf("\nO elemento %d ja está contido no vetor!\n\n", aux);
                        
                        // Decremento: para atribuir um elemento a posição do elemento repetido
                        i--;
                    }
                }
            }
        }
        for (int i = 0; i < 10; i++) {

            // Condição: Menor e maior
            if (i == 0) {
                x = y = vetor[i];
            } else {
                if (vetor[i] < x) {
                    x = vetor[i];
                } else if (vetor[i] > y) {
                    y = vetor[i];
                }
            }
        }

        System.out.printf("\n");

        // Saida: Maior e Menor Elemento do vetor
        for (int i = 0;
                i < 10; i++) {

            if (vetor[i] == x) {
                posi1 = i;
            }
            if (vetor[i] == y) {
                posi2 = i;

            }
        }

        // Saida: Menor Elemento 
        System.out.printf("O menor elemento do vetor é “%d”, e sua posição dentro do vetor é “%d”.\n", x, posi1);

        // Saida: Menor Elemento 
        System.out.printf("Já o maior elemento é “%d” e está na posição “%d”.\n", y, posi2);

    }
}
