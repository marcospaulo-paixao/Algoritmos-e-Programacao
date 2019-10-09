/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 2. Escreva um programa que receba a idade de várias pessoas (para teste utilize 10
 * pessoas). Calcule e imprima: a quantidade de pessoas com até 18 anos; quantidade de
 * pessoas entre 18 e 65 anos; quantidade de pessoas com mais de 65 anos.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        // Variaveis
        Scanner entrada = new Scanner(System.in);
        String txt1 = "Informe a sua idade:";
        String txt2 = "A idade Informada é Inválida!";
        String txt3 = "pessoas tem até 18 anos.";
        String txt4 = "pessoas tem idade entre 18 e 65 anos.";
        String txt5 = "pessoas tem idade acima de 65 anos.";
        int qntPessoa18 = 0;
        int qntPessoa18e65 = 0;
        int qntPessoa65 = 0;
        int cont = 1;
        int idade;

        // Entrada
        while (cont != 10) {

            System.out.printf("%s\n", txt1);
            idade = entrada.nextInt();

            // Processamento
            while (idade <= 0) {
                System.out.printf("%s\n%s\n", txt2, txt1);
            }
            if (idade <= 18) {
                qntPessoa18++;
            } else if (idade > 18 && idade < 65) {
                qntPessoa18e65++;
            } else if (idade > 65) {
                qntPessoa65++;
            }
            cont++;
        }
        // Saida
        System.out.printf("%d %s\n", qntPessoa18, txt3);
        System.out.printf("%d %s\n", qntPessoa18e65, txt4);
        System.out.printf("%d %s\n", qntPessoa65, txt5);
    }
}
