/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 15. Leia um número indeterminado de números e conte a quantidade de números pares e
 * números ímpares. Caso o usuário digite um número inválido (negativo) deve-se exibir
 * uma mensagem e repetir a leitura. O sistema deverá ser encerrado quando for digitado o
 * número 0 (zero).
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int numero;
        int qntNumeros = 0;
        int par = 0;
        int impar = 0;
        boolean sair = false;
        do {
            qntNumeros++;
            System.out.printf("Informe o %dº número:", qntNumeros);
            numero = input.nextInt();
            if (numero < 0) {
                qntNumeros--;
                System.out.printf("O número digitado é inválido!!!\n");
            } else if (numero == 0) {
                qntNumeros--;
                sair = true;
            } else {
                if (numero % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }

        } while (!sair);

        System.out.printf("\nA quantidade de números digitados: %d\n", qntNumeros);
        System.out.printf("A quantidade de números Par . . .: %d\n", par);
        System.out.printf("A quantidade de números Impar . .: %d\n", impar);

    }
}
