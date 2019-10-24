/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 53. Crie 2 vetores de inteiros A e B de tamanho 10 preenchidos aleatoriamente. Para tal,
 * utilize método: int sorteia (int limitInf, int limitSup) descrito abaixo que recebe porparâmetro
 * os limites inferior e superior dos valores gerados, tais limites deverão ser
 * informados pelo usuário (valide para que o limitInf seja menor que o limitSup), e
 * retorne um número neste intervalo. Em seguida crie vetores auxiliares que sejam
 * preenchidos pelos:
 * a.
 * O vetor Soma deverá ser preenchido pela soma dos elementos de A e B.
 * Ex. A{1, 5} B{3, 4} Soma {4, 9}.
 * b.
 * O vetor Intersecção deverá ser preenchido com os valores que estão em
 * A e B ao mesmo tempo. Ex. A{1, 5}, B{3, 5}, Interseccao{5}.
 * c.
 * O vetor Diferença deverá ser preenchido com valores que estão em A
 * mas não estão em B. Ex. A{1, 5}, B{3, 5}, Diferenca{1}.
 * d.
 * O vetor Intercalação deverá ser preenchido com a intercalação dos
 * vetores A e B. Ex. A {1, 5} e B {3, 4} Intercalacao {1, 3, 5, 4}.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio53 {

    public static void main(String[] args) {

        // Variaveis
        Scanner input = new Scanner(System.in);
        int vetorA[] = new int[3];
        int vetorB[] = new int[vetorA.length];
        int vetorSoma[] = new int[vetorA.length];
        int AinterB[] = new int[vetorA.length];
        int AdiferB[] = new int[vetorA.length];
        int limInferior = 0;
        int limSuperior = 0;
        boolean sair = false;

        // Entrada:
        do {
            System.out.printf("Limite inferior: . . ");
            limInferior = input.nextInt();

            System.out.printf("Limite superior: . . ");
            limSuperior = input.nextInt();

            // Valida Lim inferior menor que Lim superior
            if (limInferior > limSuperior) {
                System.out.printf("\nO limite inferior deve ser menor que o limite Superior!\n\n");
            } else {
                sair = true;
            }

        } while (!sair);

        // Processamento
        // Atribui numeros aleatorios ao vetor A
        for (int i = 0; i < vetorA.length; i++) {
            int aux = sorteia(limInferior, limSuperior);
            vetorA[i] = aux;
        }

        // Atribui numeros aleatorios ao vetor B
        for (int i = 0; i < vetorA.length; i++) {
            int aux = sorteia(limInferior, limSuperior);
            vetorB[i] = aux;
        }

        // Soma Elementos vetor A e B
        for (int i = 0; i < vetorA.length; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        // Interseccao vetor A e B caso não tenha vetor vazio []
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorA.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    AinterB[i] = vetorA[i];
                }
            }
        }

        // Diferenca entre vetor A e B
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == AinterB[i]) {

            } else {

                AdiferB[i] = vetorA[i];
            }

        }
        // Saida vetor A
        System.out.printf("\n   A   = [");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf(" %03d ", vetorA[i]);
        }
        System.out.printf("]\n");

        // Saida vetor B
        System.out.printf("   B   = [");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf(" %03d ", vetorB[i]);
        }

        // Saida soma vetor A e B
        System.out.printf("]\n");
        System.out.printf("\nSomaAB = [");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf(" %03d ", vetorSoma[i]);
        }
        System.out.printf("]\n");

        // Saida Interseccao vetor A e B
        System.out.printf(" A ∩ B = [");
        for (int i = 0; i < vetorA.length; i++) {
            if (AinterB[i] == 0) {

            } else {

                System.out.printf(" %03d ", AinterB[i]);
            }
        }

        // Saida Diferenca vetor A e B
        System.out.printf("]\n");
        System.out.printf(" A - B = [");
        for (int i = 0; i < vetorA.length; i++) {
            if (AdiferB[i] == 0) {
            } else {
                System.out.printf(" %03d ", AdiferB[i]);
            }
        }
        System.out.printf("]\n");

        // Saida Intercalacao vetor A e B
        System.out.printf("  AB   = [");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf(" %03d  %03d ", vetorA[i], vetorB[i]);
        }
        System.out.printf("]\n");

    }

    public static int sorteia(int limiteInferior, int limiteSuperior) {
        Random rd = new Random();
        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }
}
