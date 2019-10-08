/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * ALUNO:.Anisberto dos Reis do Nascimento
 * Lista de Exercícios – N2
 *
 *  32. O Departamento de Trânsito do Estado de São Paulo compilou dados de acidentes de
 * tráfego no Estado no último ano. Para cada motorista envolvido num acidente, uma
 * entrada de dados foi preparada com as seguintes informações:
 * - ano de nascimento do motorista (numérico) ;
 * - sexo (1-mulher, 2-homem);
 * - código de registro (1 para São Paulo e 0 para qualquer outro registro ).
 * Preparar um programa para ler um conjunto de dados e imprimir a seguinte estatística
 * de motoristas envolvidos em acidentes:
 * a) Percentagem de motoristas com menos de 25 anos;
 * b) Percentagem de mulheres;
 * c) Percentagem de motoristas com registro fora de São Paulo.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        String sexo = "0";
        String codRegistro = "0";
        String respostaContinue;
        int anoNascimento;
        int respostaSexo;
        int respcodRegistro;
        int qntCondutor = 0;
        float somaRegForaSP = 0;
        float somaFeminino = 0;
        float somaCondutor = 0;
        boolean sair = false;

        // Processamento
        do {
            qntCondutor++;

            // Valida Ano de nascimento do Condutor do veiculo
            do {

                //Entrada Ano de Nascimento Condutor
                System.out.printf("Informe o Ano de Nascimento do Condutor: ");
                anoNascimento = input.nextInt();

                if (anoNascimento <= 0) {
                    System.out.printf("Erro: Ano invalido!\n");

                    // Decremento para desconsiderar o se a resposta é invalida
                    qntCondutor--;
                } else if (anoNascimento < 1899) {
                    System.out.printf("Erro: Ano Inferior a 1899 !\n");

                    // Decremento para desconsiderar o se a resposta é invalida
                    qntCondutor--;

                } else if (anoNascimento > 2001) {
                    System.out.printf("Erro: Condutor não tem idade suficiente!\n");

                    // Decremento para desconsiderar o se a resposta é invalida
                    qntCondutor--;

                } else if (anoNascimento > 1994 && anoNascimento <= 2001) {

                    //Incremento Condutor
                    somaCondutor++;
                    sair = true;
                } else {
                    sair = true;
                }
            } while (!sair);

            sair = false;

            // valida Sexo do Condutor
            do {

                // Entrada Sexo do Condutor
                System.out.printf("Qual o Sexo do Condutor (1 - Mulher, 2 - Homem) ?");
                respostaSexo = input.nextInt();

                if (respostaSexo < 1 || respostaSexo > 2) {
                    System.out.printf("Erro: Opção Invalida!\t");
                } else if (respostaSexo == 1) {

                    // Incremento Sexo Feminino
                    somaFeminino++;
                    sair = true;
                } else if (respostaSexo == 2) {
                    sair = true;
                }
            } while (!sair);

            sair = false;

            // Valida Codigo de Registro
            do {

                // Entrada Codigo de Registro
                System.out.printf("Informe o Código de Registro (1 - São Paulo, 0 - registro Fora de São Pulo): ");
                respcodRegistro = input.nextInt();

                if (respcodRegistro < 0 || respcodRegistro > 1) {
                    System.out.printf("Erro: Codigo de registro invalido!\n");

                } else {
                    if (respcodRegistro == 1) {
                        sair = true;
                    } else {

                        // Incremento Codigo de Registro
                        somaRegForaSP++;
                        sair = true;
                    }
                }
            } while (!sair);

            sair = false;

            // Valida Menu Continue(sim/nao)
            do {

                // Entrada Menu continue(sim/nao)
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

        } while (!sair);

        float percentCondutor25 = (somaCondutor / qntCondutor) * 100;
        float percentCondutorFeminino = (somaFeminino / qntCondutor) * 100;
        float percentRegForaSP = (somaRegForaSP / qntCondutor) * 100;

        // Saida
        System.out.printf("Percentagem de motoristas com menos de 25 anos: . . %.2f%%\n", percentCondutor25);
        System.out.printf("Percentagem de mulheres: . . %.2f%%\n", percentCondutorFeminino);
        System.out.printf("Percentagem de motoristas com registro fora de São Paulo: %.2f%%\n", percentRegForaSP);

    }
}
