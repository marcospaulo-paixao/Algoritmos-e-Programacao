/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 7. Uma empresa de pesquisa resolveu entrevistar os torcedores do estado de Goiás para
 * saber qual a maior torcida. Faça um programa que calcule a quantidade de torcedores de
 * cada time que torce: G – Goiás, V – Vila Nova, ou O - outros. O programa deve
 * encerrar quando for digitado F - fim. Escrever ao final o total de torcedores
 * entrevistados, a quantidade de torcedores do Goiás, a quantidade do Vila Nova, a
 * quantidade total de torcedores de Outros times.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        // Variaveis
        Scanner entrada = new Scanner(System.in);
        int g = 0, v = 0, o = 0;
        String resposta;

        // Entrada
        while (true) {
            System.out.printf("\nTimes:\n"
                    + "G = Goiás\n"
                    + "V = Vila Nova\n"
                    + "O = Outros\n\n"
                    + "S = sair\n\n");
            System.out.printf("Qual time você torce? ");
            resposta = entrada.next();

            // Processamento
            if (resposta.length() == 1) {
                // Então a Resposta pode ser valida
                if (resposta.equalsIgnoreCase("g")) {
                    g++;
                } else if (resposta.equalsIgnoreCase("v")) {
                    v++;
                } else if (resposta.equalsIgnoreCase("o")) {
                    o++;
                } else if (resposta.equalsIgnoreCase("s")) {
                    break;
                } else {
                    System.out.println("\nOpção inválida\n");

                }
            } else {
                System.out.println("\nOpção inválida\n");
            }
        }

        // Saida
        System.out.printf("\nTotal de intrevistados: %d\n", (g + v + o));
        System.out.printf("Total do Goiás . . . .: %d\n", g);
        System.out.printf("Total do Vila Nova . .: %d\n", v);
        System.out.printf("Total de Outros times : %d\n", o);
    }
}
