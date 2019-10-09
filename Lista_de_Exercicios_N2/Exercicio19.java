/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 19. Faça um programa que receba 2 notas (valide as notas, onde 0.0 ≤ nota ≤ 10) de
 * um número indeterminado de alunos. Calcule e mostre:
 * a. A média aritmética das 2 notas lidas;
 * b. Uma mensagem de acordo com as regras: Até 3 (Reprovado); Entre 3 e 7
 * (Exame); de 7 para cima (Aprovado);
 * c. O total de alunos;
 * d. Quantidade de alunos Aprovados, Reprovados e de Exame.
 * e. A Média da classe.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        String respostaContinue;
        int qntAlunos = 0;
        int qntAlunosAprovados = 0;
        int qntAlunosExame = 0;
        int qntAlunosReprovados = 0;
        double nota1;
        double nota2;
        double somaMediaAlunos = 0;
        double media;
        double mediaClasse;
        boolean sair = false;

        // Processamento
        do {
            
            // Incremento: Contador de Alunos
            qntAlunos++;

            // Entrada: Nota 1
            do {
                System.out.printf("Informe a Nota 1: ");
                nota1 = input.nextDouble();

                // Saida: Nota1 invalida
                if (nota1 < 0 || nota1 > 10) {
                    System.out.printf("Erro: Nota 1 invalida!\n\n");
                } else {
                    sair = true;
                }
            } while (!sair);

            // Zerando a variavel sair
            sair = false;

            // Entrada: Nota 2
            do {
                System.out.printf("Informe a Nota 2: ");
                nota2 = input.nextDouble();

                // Saida: Nota 2 invalida
                if (nota2 < 0 || nota2 > 10) {
                    System.out.printf("Erro: Nota 2 invalida!\n\n");
                } else {
                    sair = true;
                }
            } while (!sair);

            // Calculando Media do Aluno
            media = (nota1 + nota2) / 2;

            // Condição: Aluno Reprovado
            if (media <= 3) {
                System.out.printf("\nAluno Reprovado.\n\n");

                // Incremento: Contador de Alunos Reprovados
                qntAlunosReprovados++;
                System.out.printf("Média: %.2f\n", media);

                // Condição: Aluno em Exame
            } else if (media > 3 && media < 7) {
                System.out.printf("\nAluno em Exame.\n");

                // Incremento: Contador de Alunos em Exame
                qntAlunosExame++;
                System.out.printf("Média: %.2f\n", media);

                // Condição: Aluno Aprovado
            } else {
                System.out.printf("\nAluno Aprovado\n");

                // Incremento: Contador de Alunos Aprovados
                qntAlunosAprovados++;
                System.out.printf("Média: %.2f\n", media);

            }

            // Incremento: Soma das medias obtidas por cada Aluno
            somaMediaAlunos += media;

            // Zerando a variavel sair
            sair = false;

            // Valida Menu Continue(sim/nao)
            System.out.printf("\n");
            do {

                // Entrada: Menu continue(sim/nao)
                System.out.printf("Continuar (sim/nao) ?");
                respostaContinue = input.next();
                
                if (respostaContinue.equalsIgnoreCase("sim")) {
                    sair = true;
                } else if (respostaContinue.equalsIgnoreCase("nao")) {
                    sair = true;
                } else {
                    System.out.println("Erro: Opção invalida!\t");
                    sair = false;
                }
            } while (!sair);

            // Valida a resposta do Menu Continue se sim o programa continua se nao o programa finalizar
            sair = !respostaContinue.equalsIgnoreCase("sim");
            System.out.printf("\n");
        } while (!sair);
        
        // Calculando Media total da Classe
        mediaClasse = somaMediaAlunos / qntAlunos;
        
        // Saida
        System.out.printf("\n");
        System.out.printf("Total de alunos: %d\n", qntAlunos);
        System.out.printf("Total de alunos Aprovados: %d\n", qntAlunosAprovados);
        System.out.printf("Total de alunos Reprovados: %d\n", qntAlunosReprovados);
        System.out.printf("Total de alunos Exame: %d\n", qntAlunosExame);
        System.out.printf("Média da classe: %.2f\n", mediaClasse);

    }

}
