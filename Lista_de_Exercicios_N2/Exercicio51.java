/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 51. Escreva um programa que leia dois vetores – V1 e V2 – cada um com N * valores reais
 * e um terceiro vetor – Op - com N valores do tipo caracter. Seu programa
 * deve gerar um vetor – Resul como sendo o resultado das operações de V1 com V2, onde
 * o código da operação está no vetor Op nas respectivas posições.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio51 {

    public static void main(String[] args) {

        // Variaveis
        Scanner input = new Scanner(System.in);
        double V1[] = new double[10];
        double V2[] = new double[V1.length];
        char[] Op = new char[V1.length];
        String txtOPERADORES;
        char op1;
        double resul[] = new double[V1.length];
        boolean sair;

        // Entrada
        for (int i = 0; i < V1.length; i++) {
            System.out.printf("Informe um número: ");
            V1[i] = input.nextDouble();
            System.out.printf("Informe outro  número: ");
            V2[i] = input.nextDouble();

            // Caso Elemeto vetor 2 seja 0 não pode entra na divisão
            if (V2[i] == 0) {
                txtOPERADORES = "\n[+] SOMA\n[-] SUBTRAÇÃO\n[*] MULTIPLICAÇÃO\n";
            } else {
                txtOPERADORES = "\n[+] SOMA\n[-] SUBTRAÇÃO\n[*] MULTIPLICAÇÃO\n[/] DIVISÃO\n";
            }
            do {
                sair = false;
                System.out.printf(txtOPERADORES);

                Op[i] = input.next().charAt(0);
                if (V2[i] == 0) {
                    if ((Op[i] == '+') || (Op[i] == '-') || (Op[i] == '*')) {
                        sair = true;
                    } else {
                        System.out.printf("Operador inválido!\n");
                    }
                } else {
                    if ((Op[i] == '+') || (Op[i] == '-') || (Op[i] == '*') || (Op[i] == '/')) {
                        sair = true;
                    } else {
                        System.out.printf("Operador inválido!\n");
                    }
                }
            } while (!sair);

            // Operadores
            switch (Op[i]) {
                case '+':
                    resul[i] = V1[i] + V2[i];
                    break;
                case '-':
                    resul[i] = V1[i] - V2[i];
                    break;
                case '*':
                    resul[i] = V1[i] * V2[i];
                    break;
                case '/':
                    resul[i] = V1[i] / V2[i];
                    break;
            }
            System.out.printf("%.2f\n", resul[i]);
        }
        // Saida
        System.out.printf("v1[]  = { ");
        for (int i = 0; i < V1.length; i++) {
            if (i == V1.length - 1) {
                System.out.printf("%.2f", V1[i]);
            } else {
                System.out.printf("%.2f\t", V1[i]);
            }
        }
        System.out.printf(" }\n");

        // Saida
        System.out.printf("v2[]  = { ");
        for (int i = 0; i < V1.length; i++) {
            if (i == V1.length - 1) {
                System.out.printf("%.2f", V2[i]);
            } else {

                System.out.printf("%.2f\t", V2[i]);
            }
        }

        System.out.printf(" }\n");

        // Saida
        System.out.printf("Op[]  = { ");
        for (int i = 0; i < V1.length; i++) {
            if (i == V1.length - 1) {
                System.out.printf("  %s ", Op[i]);
            } else {
                System.out.printf("  %s ", Op[i]);
            }
            System.out.printf(" ");
        }
        System.out.printf(" }\n");

        // Saida
        System.out.printf("resul = { ");
        for (int i = 0; i < V1.length; i++) {
            if (i == V1.length - 1) {
                System.out.printf("%.2f", resul[i]);

            } else {
                System.out.printf("%.2f\t", resul[i]);
            }
        }
        System.out.printf(" }\n");
    }

}
