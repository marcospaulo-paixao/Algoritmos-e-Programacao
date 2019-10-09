/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 20. Faça um programa para realização do login em um sistema. O algoritmo deverá receber
 * um login (cadeia de caracteres) e uma senha baseada em números inteiros. Em seguida
 * o algoritmo deverá verificar a senha digitada, caso ela esteja correta o sistema deverá
 * mostrar a seguinte mensagem: “BEM-VINDO AO SISTEMA, login”. Caso a senha
 * esteja incorreta a seguinte mensagem deverá ser apresentada: “SENHA INCORRETA,
 * TENTE NOVAMENTE”. Foi estipulado um limite de 3 tentativas para digitação da
 * senha, caso o usuário ultrapasse esse limite, o sistema deverá bloquear o acesso com a
 * seguinte mensagem: “ACESSO BLOQUEADO, PROCURE UM MODERADOR!”.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        String login;
        String confLogin;
        int senha;
        int confSenha;
        int cont = 0;
        boolean sair = false;

        // Entrada: Login
        System.out.printf("Informe o Login: ");
        login = input.next();

        // Entrada: Senha
        System.out.printf("Informe a Senha: ");
        senha = input.nextInt();

        System.out.printf("\n\n");

        // Processamento
        do {

            // Condição: Apenas 3 tentativas
            if (cont == 3) {
                System.out.printf("\nACESSO BLOQUEADO, PROCURE UM MODERADOR!\n");
                sair = true;

                // Valida: Senha
            } else {
                System.out.printf("    SISTEMA\n");

                System.out.printf("Digite a Senha: ");
                confSenha = input.nextInt();

                // Saida: Senha Incorreta
                if (confSenha != senha) {
                    System.out.printf("\nSENHA INCORRETA\n");

                    // Saida: Senha Correta
                } else {
                    System.out.printf("\nBEM-VINDO AO SISTEMA, %s\n", login);
                    sair = true;
                }
            }

            // Incremento: Contador de tentativas
            cont++;
        } while (!sair);

    }

}
