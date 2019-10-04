// CURSO:.Análise e Desenvolvimento de Sistemas
// DISCIPLINA:.Algoritmos e Programação
// ALUNO:.Marcos Paulo Pereira da Paixão
// Lista de Exercícios – N2 
//
// 4. Escreva um programa que leia o nome e a idade de vários usuários, e imprima a
// seguinte mensagem “O usuário *nome* tem *anos* anos de vida”. O programa deverá
// continuar executando enquanto o usuário informar que deseja continuar.
//
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        // Variaveis
        Scanner entrada = new Scanner(System.in);
        String txtNOME = "Informe o seu nome: ";
        String txtIDADE = "Informe a sua idade: ";
        String txtCONTINUAR = "Deseja continuar [s,n] ? ";
        String nome;
        int idade;
        boolean sair = false;
        String exit;

        // Entrada
        while (!sair) {

            System.out.printf("%s", txtNOME);
            nome = entrada.next();
            System.out.printf("%s", txtIDADE);
            idade = entrada.nextInt();

            // Saida
            System.out.printf("O usuário %s tem %d anos de vida\n\n", nome, idade);

            // Processamento
            System.out.printf("%s", txtCONTINUAR);
            exit = entrada.next();

            if (exit.equalsIgnoreCase("n")) {
                sair = true;
            }
        }

    }

}
