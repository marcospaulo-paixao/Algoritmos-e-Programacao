/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 *
 * 8. Escrever um programa que calcule todos os números inteiros divisíveis por um certo
 * valor indicado pelo usuário, e compreendidos em um intervalo também especificado
 * pelo usuário. O usuário deve entrar com um primeiro valor correspondente ao divisor e
 * após ele vai fornecer o valor inicial do intervalo, seguido do valor final deste intervalo.
 * Usar o comando While. Exemplo: Valor do divisor: 3; Inicio do Intervalo: 17; Fim do
 * Intervalo: 29; Saída-> Números divisíveis por 3 no intervalo de 17 a 29: 18, 21, 24, 27.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        // Variaveis
        Scanner entrada = new Scanner(System.in);
        int divisor, inicial, fim;
        String divisiveis = "";

        // Entrada
        System.out.printf("Informe o divisor:");
        divisor = entrada.nextInt();

        System.out.printf("Informe o número inicial:");
        inicial = entrada.nextInt();
        int iniAux = inicial;

        System.out.printf("Informe o número final:");
        fim = entrada.nextInt();

        // Processamento
        while (inicial <= fim) {
            if (inicial % divisor == 0) {
                divisiveis += Integer.toString(inicial) + ", ";
            }
            inicial++;
        }
        
        // Saida
        divisiveis = divisiveis.substring(0, divisiveis.length() - 2);
        System.out.println("Números divisíveis por " + divisor + " no intervalo de " + iniAux + " a " + fim + ": " + divisiveis + ".");
    }

}
