/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 17. Faça um programa que Leia o Nome e duas notas de uma pessoa e ao final, o programa
 * deve calcular a média aritmética entre as duas notas. O programa deve ser capaz de
 * validar se a nota informada é válida (0.0 ≤ nota ≥ 10), caso contrário o sistema deve
 * informar ao usuário o erro e pedir para ler novamente. Usar um laço Do-While na
 * leitura das notas, e gerar uma saída conforme o exemplo.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        String resposta;
        String nome;
        char result;
        float nota1, nota2 = 0, media;
        boolean sair = false;

        // Entrada Nome e Nota 1
        System.out.printf("Informe seu nome:");
        nome = input.nextLine();

        while (!sair) {
            do {
                System.out.printf("%s, informe a nota 1:", nome);
                nota1 = input.nextFloat();
                if (nota1 < 0.0 || nota1 > 10) {
                    System.out.printf("\nErro: Nota inválida! ");

                } else {
                    // Entrada Nota 2
                    do {
                        System.out.printf("%s, informe a nota 2:", nome);
                        nota2 = input.nextFloat();
                        if (nota2 < 0.0 || nota2 > 10) {
                            System.out.printf("\nErro: Nota inválida! ");

                        }
                    } while (nota2 < 0.0 || nota2 > 10);

                }
                // Processamento
            } while (nota1 < 0.0 || nota1 > 10);

            media = (nota1 + nota2) / 2;

            // Saida
            System.out.printf("O aluno %s tem uma media: . . %.2f\n\n", nome, media);

            //Entrada (Menu Continuar s/n)
            do {
                System.out.printf("Continuar (sim/nao) ?");
                resposta = input.next();
                // Processamento (Menu Continuar s/n)
                if (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("nao")) {

                    System.out.printf("Erro: Resposta incorreta!");
                }

            } while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("nao"));

            // Saida (Menu Continuar s/n)
            if (resposta.equalsIgnoreCase("sim")) {
                sair = false;
            } else if (resposta.equalsIgnoreCase("nao")) {
                sair = true;
            }
        }

    }

}
