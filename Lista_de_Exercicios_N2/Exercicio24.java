/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 24. Faça um programa que leia um intervalo (num_inicial e num_final) e calcule o
 * somatório de todos os números entre o num_inicial e num_final.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int num_inicial, num_final, aux;
        int cont;
        int soma = 0;


        // Entrada: Numero Inicial
        System.out.printf("Informe o Numero Inicial:");
        num_inicial = input.nextInt();

        // Entrada: Numero Final
        System.out.printf("Informe o Numero Final:");
        num_final = input.nextInt();
        
        // Condição: Numero Inicial maior que Numero Final - Inverter valores
        if (num_inicial > num_final) {
            aux = num_final;
            num_final = num_inicial;
            num_inicial = aux;
        }
        
        // Processamento
        for (cont = num_inicial; cont <= num_final; cont++) {
            
            // Incremento: Somatório
            soma += cont;
        }
        
        // Saida
        System.out.printf("\nO somatório de todos os números entre %d e %d é %d.\n", num_inicial, num_final, soma);
    }

}
