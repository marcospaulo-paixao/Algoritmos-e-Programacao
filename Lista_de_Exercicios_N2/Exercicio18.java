/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 18. Faça um programa que leia uma senha (número inteiro). Em seguida, pergunte ao
 * usuário a senha informada, caso a senha esteja errada imprima “Senha incorreta, tente
 * novamente” e leia novamente a senha. Caso o usuário digite a senha correta, imprima
 * “Senha correta! Bem-vindo ao sistema”.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int senha, confirmacaoSenha;
        boolean sair = false;
        
        // Entrada: Senha
        System.out.printf("Informe uma senha:");
        senha = input.nextInt();
        
        // Processamento
        do {
            // Valida: Senha
            System.out.printf("\n\nSenha: ");
            confirmacaoSenha = input.nextInt();
            
            // Saida: Senha não confere 
            if (confirmacaoSenha != senha) {
                System.out.printf("Senha incorreta!");
                
            // Saida: Senha correta
            } else {
                System.out.printf("Senha correta! Bem-vindo ao sistema\n");
                sair = true;
            }

        } while (!sair);

    }

}
