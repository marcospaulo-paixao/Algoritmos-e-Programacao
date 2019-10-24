/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 41. Faça um programa que tabule a seguinte função:
 *
 *          f(x,y)=(x²+3x+y²)/(xy-5y-3x+15)
 *
 * para x = 1, 4, 9, 16, ..., 100 (descubra o padrão)
 * e y = 0, 1, 2, ... 5 para cada valor de x.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio41 {

    public static void main(String[] args) {

        // Variaveis
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        double f = (Math.pow(x, 2) + (3 * x) + Math.pow(y, 2)) / ((x * y) - (5 * y) - (3 * x) + 15);

        System.out.printf("%.2f\n", f);
        

    }
}
