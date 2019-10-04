/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 13. Solicite um número entre 1 e 5. Se a pessoa digitar um número fora deste intervalo, o
 * sistema deve escrever “Entrada Inválida” e solicitar o número novamente. Se digitar um
 * número válido, imprima “Parabéns! O número digitado foi ... “.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        float numero;
        boolean sair = false;

        // Entrada
        while (!sair) {
            System.out.printf("Informe um numero de 1 a 5: ");
            numero = input.nextFloat();

            // Processamento
            if (numero > 5 || numero < 1) {

                System.out.printf("Entrada Inválida\n");
            } else {

                // Saida
                System.out.printf("Parabéns! O número digitado foi %.2f \n", numero);
                sair = true;
            }
        }
    }
}
