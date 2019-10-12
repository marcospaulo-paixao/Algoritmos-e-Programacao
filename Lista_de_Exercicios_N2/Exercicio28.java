/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 28. Num frigorífico existem 5 bois. Cada boi traz em seu pescoço um cartão contendo seu
 * número de identificação e seu peso. Faça um programa que escreva o número e o peso
 * do boi mais gordo e do boi mais magro. Assuma que os dados são válidos.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int numIdentificacaoboi = 0, identificacaoMaior = 0, identificacaoMenor = 0;
        float maior = 0, menor = 0;
        float pesoBoi;
        int cont;
        boolean sair = false;

        // Entrada: Numero de Identificação
        for (cont = 1; cont <= 5; cont++) {

            do {
                System.out.printf("Digite o numero de Identificação do %dº boi:", cont);
                numIdentificacaoboi = input.nextInt();

                // Saida: Numero de Identficação inválido
                if (numIdentificacaoboi <= 0) {
                    System.out.printf("Erro: Numero de Identificação inválido!\n\n");
                } else {
                    sair = true;
                }
            } while (!sair);

            sair = false;

            // Entrada: Peso do boi 
            do {
                System.out.printf("Digite o peso do Boi - %d: ", numIdentificacaoboi);
                pesoBoi = input.nextFloat();

                // Saida: Peso do boi invalido
                if (pesoBoi < 0) {
                    System.out.printf("Erro: Peso do Boi Invalido.\n(Peso mínino boi: 150.27kg)\n\n");

                } else {

                    // Processamento
                    // Condição para Designar Maior e Menor
                    if (cont == 1) {
                        maior = menor = pesoBoi;
                    }
                    if (pesoBoi > maior) {
                        maior = pesoBoi;
                        identificacaoMaior = numIdentificacaoboi;
                    } else if (pesoBoi < menor) {
                        menor = pesoBoi;
                        identificacaoMenor = numIdentificacaoboi;

                    }
                    sair = true;
                }

            } while (!sair);

        }

        // saida
        System.out.printf("\n\nO boi com  maior peso é o BOI - %d pesando %.1f kg\n", identificacaoMaior, maior);
        System.out.printf("O boi com  maior peso é o BOI - %d pesando %.1f kg\n", identificacaoMenor, menor);
    }

}
