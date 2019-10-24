/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 *
 * 46. Escreva um programa que armazene os 100 primeiros números ímpares em um vetor, e
 * os 200 primeiros números ímpares em outro vetor. Imprima os dois vetores em seguida.
 */
package Lista_de_Exercicios_N2;

public class Exercicio46 {

    public static void main(String[] args) {
        // Variaveis
        int[] v100I = new int[100];
        int[] v200I = new int[200];
        int j = 0;

        // Processamento: 100 primeiros números ímpares
        for (int i = 0; i < 200; i++) {
            if (!(i % 2 == 0)) {
                v100I[j] = i;
            } else {
                j--;
            }
            j++;
        }
        j = 0;

        // Processamento:  200 primeiros números ímpares
        for (int i = 0; i < 400; i++) {
            if (!(i % 2 == 0)) {
                v200I[j] = i;
            } else {
                j--;
            }
            j++;
        }

        // Saida: 100 primeiros números ímpares
        int g = 10;
        System.out.printf("Os 100 primeiros números ímpares são:\n");
        for (int i = 0; i < v100I.length; i++) {

            if (i ==g) {
                System.out.printf("\n");
                g+= 10;
            }
            System.out.printf("%03d ", v100I[i]);
        }
        System.out.printf("\n\n");
        
        g=10;
        // Saida: 200 primeiros números ímpares
        System.out.printf("Os 200 primeiros números ímpares são:\n");
        for (int i = 0; i < v200I.length; i++) {
            if (i == g) {
                System.out.printf("\n");
                g += 10;
                
            }
            System.out.printf("%03d ", v200I[i]);
        }
        System.out.printf("\n");
    }
}
