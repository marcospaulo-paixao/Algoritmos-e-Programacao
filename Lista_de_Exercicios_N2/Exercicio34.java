/**
 * CURSO:.Análise e Desenvolvimento de Sistemas
 * DISCIPLINA:.Algoritmos e Programação
 * ALUNO:.Marcos Paulo Pereira da Paixão
 * ALUNO:.Anisberto dos Reis do Nascimento
 * Lista de Exercícios – N2
 *
 * 34. Uma companhia de carros usados paga aos vendedores:
 * - Salário de R$1500.00 por mês;
 * - Comissão de R$100,00 por carro vendido no caso de vendas até 10 carros por mês;
 * - Comissão de R$200,00 por carro vendido no caso de vendas acima de 10 carros por
 * mês;
 * - 1% do valor total de venda para carros no valor acima de R$ 50.000,00.
 * Todo mês é feita a entrada dos dados para cada vendedor contendo: sua matrícula, seu
 * número de carros vendidos e o valor de cada carro vendido pelo mesmo. Desenvolver
 * um programa para calcular e mostrar o salário de cada vendedor. Repetir o processo
 * para um número indeterminado de funcionários.
 */
package Lista_de_Exercicios_N2;

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String args[]) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int matricula;
        int carrosVendidos;
        int cont;
        float valorCarroVendido;
        double salario;
        double comissao;
        boolean sair = false;
        String respostaContinue;
        // Processamento
        do {

            // Zerar Variaveis ao reiniciar o Programa           
            cont = 0;
            comissao = 0;
            salario = 1500.00;

            // Valida: Matricula do Vendedor
            do {

                // Entrada: Matricula do Vendedor
                System.out.printf("Informe a Matricula do Vendedor: ");
                matricula = input.nextInt();

                // Saida: Matricula do Vendedor Invalida
                if (matricula <= 0) {
                    System.out.printf("Erro: Matricula Inválida!\n");

                }

                // Enquanto: Matricula for invalida
            } while (matricula <= 0);

            // Valida: Quantidades de Carros Vendidos 
            do {

                // Entrada: Quantidade de Carros Vendidos
                System.out.printf("Informe a quantidade de Carros vendido:");
                carrosVendidos = input.nextInt();

                // Saida: Quantidade de Carros Vendidos Invalido
                if (carrosVendidos < 0) {
                    System.out.printf("Erro: Quantidade de Carros Inválido\n");

                    // Sair: Se vendedor não vendeu nenhum carro
                } else if (carrosVendidos == 0) {
                    sair = true;

                    //Incremento: Comissão de R$100,00 por carro vendido no caso de vendas até 10 carros por mês
                } else if (carrosVendidos < 10 && carrosVendidos > 0) {
                    comissao = 100.00 * carrosVendidos;
                    sair = true;

                    //Incremento: Comissão de R$200,00 por carro vendido no caso de vendas acima de 10 carros por mês
                } else if (carrosVendidos > 10) {
                    comissao = 200.00 * carrosVendidos;
                    sair = true;
                }
                // Enquanto: sair não for falso
            } while (!sair);

            //Nota: Zerando a variavel sair para usar novamente
            sair = false;

            // Valida: Valor de cada carro vendido
            while (!sair) {

                // Entrada: Valor de Cada Carro vendido
                do {

                    // Contador: Validar a Quantidade de carro
                    cont++;

                    // Enquanto: cont não for igual a Qunatidade de carros Vendidos
                    if (cont == carrosVendidos) {
                        sair = true;
                    }

                    // Sair: Se o vendedor não vendeu nenhum carro
                    if (carrosVendidos == 0) {
                        sair = true;

                        // Entrada: Valor de cada carro vendido
                    } else {

                        System.out.printf("Informe o valor do %dº Carro; ", cont);
                        valorCarroVendido = input.nextFloat();

                        //Incremento: 1% do valor total de venda para carros no valor acima de R$ 50.000,00.
                        if (valorCarroVendido >= 50000) {

                            comissao += (valorCarroVendido * 0.01);

                        }

                        // Saida: Valor de cada carro vendido inválido (valor<=0)
                        if (valorCarroVendido <= 0) {
                            System.out.printf("Erro: Valido Inválido!\n");

                        }
                    }

                } while (!sair);
            }

            //Processamento: Salario Total
            salario += comissao;

            // Saida: Numero da Matricula do Vendedor
            System.out.printf("\nMatricula do Vendedor: . . %d\n", matricula);

            //Saida: Salario Total
            System.out.printf("Salario: . . . . . . . . . R$ %.2f\n\n", salario);

            sair = false;

            // Valida: Menu Continue(sim/nao)
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
            System.out.printf("\n");

            // Valida a resposta do Menu Continue se sim o programa continua se nao o programa finalizar
            sair = !respostaContinue.equalsIgnoreCase("sim");

        } while (!sair);

    }

}
