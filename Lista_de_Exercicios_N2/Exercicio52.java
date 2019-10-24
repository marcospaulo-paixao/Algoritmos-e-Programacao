/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * Lista de Exercícios – N2
 *
 * 52. Uma empresa possui ônibus com 48 lugares (24 nas janelas e 24 no corredor). Faça um
 * programa que utilize dois vetores para controlar as poltronas ocupadas no corredor e na
 * janela. Considere que zero representa poltrona desocupada e um representa poltrona
 * ocupada.
 * Janela
 * [ 0 1 0 0 . . . 1 0 0 ]
 * Corredor
 * [ 0 0 0 1 . . . 1 0 0 ]
 * Esse programa deve controlar a venda de passagens da seguinte maneira:
 * - o cliente informa se deseja poltrona no corredor ou na janela e, depois, o programa
 * deve informar quais poltronas estão disponíveis para a venda;
 * - quando não existirem poltronas livres no corredor, nas janelas ou, ainda, quando o
 * ônibus estiver completamente cheio, deve ser mostrada uma mensagem.
 *
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio52 {

    public static void main(String[] args) {

        // Rô de RodéLA
        // Variaveis
        Scanner input = new Scanner(System.in);
        int janela[] = new int[3];
        int corredor[] = new int[janela.length];
        int somaJanela;
        int somaCorredor;

        int todaspoltronasOcupadas = 0;
        int posiaux;
        int poltJanelaCorredorOcupadas;
        char opcaoCorredorJanela = '0';
        String textCorredorJanela;
        String respostaContinue = "";

        boolean sair = false;

        // Menu RODELA
        menu_roDeRodela();
        do {

            // Zerando txt Corredor Janela           
            textCorredorJanela = "";
            do {

                // Entrada Opção janela carredor
                System.out.printf("Digite onde deseja reservar sua poltrona.\n[C]-Corredor / [J]-Janela / [V]-Visualizar Poltronas: . . ");
                opcaoCorredorJanela = input.next().charAt(0);

                // Zerando poltJanelaCorredorOcupadas para que ele não seja incrementado e sim contado
                poltJanelaCorredorOcupadas = 0;

                // Processamento: Valida a opção janela corredor
                switch (opcaoCorredorJanela) {

                    // Caso C txt recebe  Corredor
                    case 'C':
                        for (int i = 0; i < janela.length; i++) {
                            if (!(corredor[i] == 0)) {
                                poltJanelaCorredorOcupadas++;
                            }
                        }
                        if (poltJanelaCorredorOcupadas == janela.length) {
                            System.out.printf("Todas as poltronas do corredor estão ocupadas!\n\n");
                            todaspoltronasOcupadas++;
                        } else {

                            // Alterando C para c fazer apenas um verificação
                            opcaoCorredorJanela = 'c';
                            textCorredorJanela += "Corredor";
                            sair = true;
                        }
                        break;
                    case 'c':
                        for (int i = 0; i < janela.length; i++) {
                            if (!(corredor[i] == 0)) {
                                poltJanelaCorredorOcupadas++;
                            }
                        }
                        if (poltJanelaCorredorOcupadas == janela.length) {
                            System.out.printf("Todas as poltronas do corredor estão ocupadas!\n\n");
                            todaspoltronasOcupadas++;
                        } else {
                            textCorredorJanela += "corredor";
                            sair = true;
                        }
                        break;

                    // Caso J txt recebe  Janela
                    case 'J':
                        for (int i = 0; i < janela.length; i++) {
                            if (!(janela[i] == 0)) {
                                poltJanelaCorredorOcupadas++;
                            }
                        }
                        if (poltJanelaCorredorOcupadas == janela.length) {
                            System.out.printf("Todas as poltronas da janela estão ocupadas!\n\n");
                            todaspoltronasOcupadas++;
                        } else {
                            // Alterando C para c fazer apenas um verificação
                            opcaoCorredorJanela = 'j';
                            textCorredorJanela += "Janela  ";
                            sair = true;
                        }
                        break;
                    case 'j':
                        for (int i = 0; i < janela.length; i++) {
                            if (!(janela[i] == 0)) {
                                poltJanelaCorredorOcupadas++;
                            }
                        }
                        if (poltJanelaCorredorOcupadas == janela.length) {
                            System.out.printf("Todas as poltronas da janela estão ocupadas!\n\n");
                            todaspoltronasOcupadas++;

                        } else {

                            textCorredorJanela += "Janela  ";
                            sair = true;
                        }

                        break;
                    case 'V':
                    case 'v':
                        textCorredorJanela = "Janela  ";

                        imprimevetor(janela, textCorredorJanela);
                        textCorredorJanela = "Corredor";
                        imprimevetor(corredor, textCorredorJanela);
                        System.out.printf("\n");
                        System.out.printf("");
                        textCorredorJanela = "";
                        break;

                    // Caso a opção janelaCorredor seja invalida
                    default:
                        System.out.printf("Opção inválida!\n");
                        break;
                }
            } while (!sair);

            // Condição de acordo com o textCorredorJanela 
            if (textCorredorJanela.equalsIgnoreCase("Corredor")) {
                imprimevetor(corredor, textCorredorJanela);

            } else if (textCorredorJanela.equalsIgnoreCase("Janela  ")) {
                imprimevetor(janela, textCorredorJanela);

            }

            // Zerando Sair
            sair = false;

            // Entrada: Numero da Poltrona escolhida
            do {
                System.out.printf("\nNúmero da Poltrona: . . ");
                posiaux = input.nextInt();
                int posicao = posiaux - 1;

                // Valida: Numero da poltrona Corredor
                if (posiaux <= 0 || posiaux > janela.length) {
                    System.out.printf("Poltrona inexistente!\n");
                } else {
                    if (opcaoCorredorJanela == 'c') {

                        if (corredor[posicao] == 1) {
                            System.out.printf("Esta poltrona está ocupada!!\n");
                        } else {
                            for (int j = 0; j < janela.length; j++) {
                                if (j == posicao) {
                                    corredor[posicao] = 1;
                                    reservaFinalizada(posiaux, textCorredorJanela);

                                    sair = true;
                                }
                            }
                        }

                    } else if (opcaoCorredorJanela == 'j') {
                        if (janela[posicao] == 1) {
                            System.out.printf("Esta poltrona está ocupado!!\n");
                        } else {
                            for (int j = 0; j < janela.length; j++) {
                                if (j == posicao) {
                                    janela[posicao] = 1;
                                    reservaFinalizada(posiaux, textCorredorJanela);
                                    sair = true;
                                }
                            }
                        }
                    }
                }

            } while (!sair);

            sair = false;

            // Continuar S N
            do {
                // Zerando variaveis para não incrementar
                somaCorredor = 0;
                somaJanela = 0;

                // Incremento de  Verificação se todas as poltronas estão escolhidas 
                for (int i = 0; i < janela.length; i++) {
                    somaJanela += janela[i];
                    somaCorredor += corredor[i];
                }

                // Caso todas as poltronas do ônibus estão ocupadas o programa finaliza
                if (somaJanela == janela.length && somaCorredor == janela.length) {
                    System.out.printf("\n\n-----------------------------------------------\n"
                            + "Todas as poltronas deste ônibus estão ocupadas.\nAgradecemos a preferência!\n\nViação RÔ DE RODÉla."
                            + "\n------------------------\n");
                    respostaContinue = "n";
                    sair = true;

                    // Se não o usuario informa se quer continuar ou sair 
                } else {
                    System.out.printf("\nDeseja reservar uma nova poltrona [S] [N] ou [V]-Visualizar Poltronas?");
                    respostaContinue = input.next();

                    if (respostaContinue.equalsIgnoreCase("s")) {
                        sair = true;
                    } else if (respostaContinue.equalsIgnoreCase("n")) {
                        sair = true;
                    } else if (respostaContinue.equalsIgnoreCase("v")) {
                        textCorredorJanela = "Janela  ";

                        imprimevetor(janela, textCorredorJanela);
                        textCorredorJanela = "Corredor";
                        imprimevetor(corredor, textCorredorJanela);
                        System.out.printf("\n");
                        System.out.printf("");
                        textCorredorJanela = "";
                        sair = false;
                    } else {
                        System.out.println("Erro: Opção invalida!\t");
                        sair = false;
                    }
                }

            } while (!sair);

            // dependendo da resposta S continua N finaliza
            sair = !respostaContinue.equalsIgnoreCase("s");
            System.out.printf("\n");

        } while (!sair);

    }

    // Menu ro de rodela
    static void menu_roDeRodela() {

        System.out.printf("┌──────────────────────────────┬────┐\n");
        System.out.printf("│ ░░░░░░░│░░░░░░│░░░░░░│░░░░░░ │░░░░│\n");
        System.out.printf("│ ░░░░░░░│░░░░░░│░░░░░░│░░░░░░ │░░░░│\n");
        System.out.printf("│                              │    │\n");
        System.out.printf("│----------Viação--------------│    │\n");
        System.out.printf("│----┌─┐-----RÔ DE RODÉla--┌─┐-│    │\n");
        System.out.printf("└────┘O└───────────────────┘O└─┴────┘\n\n");
        System.out.printf("Seja bem vindo a Viação RÔ DE RODÉla, ");

    }

    // Imprime as poltronas disponiveis
    static void imprimevetor(int[] vetor1, String txt) {
        int[] vetor2 = new int[24];
        int B = 0;
        String text1 = " ";
        System.out.printf("\n          ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = B + 1;
            System.out.printf(" %02d ", vetor2[i]);
            B++;
        }
        System.out.printf(" \n");
        System.out.printf("%s:[", txt);
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] == 1) {
                System.out.printf(" -- ");

            } else {
                System.out.printf("  %d ", vetor1[i]);

            }
        }

        System.out.printf("]\n");

    }

    // Ticket, reserva finalizada
    static void reservaFinalizada(int posicao, String janelaCorredor) {

        if (janelaCorredor.equalsIgnoreCase("Janela  ")) {
            System.out.printf("\n<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");
            System.out.printf("\n<<< Reserva finalizada com Sucesso >>>\n\n        %s  : Poltrona %d", janelaCorredor, posicao);
            System.out.printf("\n\n             Viação  RÔ DE RODÉla\n");
            System.out.printf("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>\n");
        } else {
            System.out.printf("\n<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");
            System.out.printf("\n<<< Reserva finalizada com Sucesso >>>\n\n        %s  : Poltrona %d", janelaCorredor, posicao);
            System.out.printf("\n\n             Viação  RÔ DE RODÉla\n");
            System.out.printf("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>\n");
        }

    }

}
