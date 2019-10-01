package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio45 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int diaDaSemana;
        double preco = 0, desconto = 0.40;
        int categoria_c = 1, categoria_l = 2, categoria;

        System.out.println("Informe o dia da semana:");
        System.out.println("Domingo\t(1)");
        System.out.println("Segunda\t(2)");
        System.out.println("Terça\t(3)");
        System.out.println("Quarta\t(4)");
        System.out.println("Quinta\t(5)");
        System.out.println("Sexta\t(6)");
        System.out.println("Sábado\t(7)");
        diaDaSemana = entrada.nextInt();

        if (diaDaSemana == 2 || diaDaSemana == 3 || diaDaSemana == 5) {
            System.out.println("Informe a categoria do DVD alugado (1): comum; (2): lançamento ");
            categoria = entrada.nextInt();

            System.out.println("Informe o preço normal do DVD alugado: ");
            preco = entrada.nextDouble();

            if (preco > 0) {
                double dvd_comum = preco; // Preço noraml
                double lancamento = (0.15 * preco) + preco; // Acrescimento de 15%
                if (categoria == categoria_c) {
                    System.out.printf("O preço final a ser pago é: %.2f\n", dvd_comum - (dvd_comum * desconto));
                } else {
                    System.out.printf("O preço final a ser pago é: %.2f\n", lancamento - (preco * desconto));
                }
            } else if (preco <= 0) {
                System.out.println("Preço Invalido!!!");

            }

        } else if (diaDaSemana == 4 || diaDaSemana == 6 || diaDaSemana == 7 || diaDaSemana == 1) {
            System.out.println("Informe a categoria do DVD alugado (1): comum; (2): lançamento ");
            categoria = entrada.nextInt();

            System.out.println("Informe o preço normal do DVD alugado: ");
            preco = entrada.nextDouble();
            if (preco > 0) {

                double dvd_comum = preco; // Preço noraml
                double lancamento = (0.15 * preco) + preco; // Acrescimento de 15%

                if (categoria == categoria_c) {
                    System.out.printf("O preço final a ser pago é: %.2f\n", dvd_comum);
                } else {
                    System.out.printf("O preço final a ser pago é: %.2f\n", lancamento);
                }
            } else if (preco <= 0) {
                System.out.println("Preço Invalido!!!");

            }
        } else {
            System.out.println("Voçê informou um dia Invalido!!!");
            System.out.println(" ");
            System.out.println("Domingo\t(1)");
            System.out.println("Segunda\t(2)");
            System.out.println("Terça\t(3)");
            System.out.println("Quarta\t(4)");
            System.out.println("Quinta\t(5)");
            System.out.println("Sexta\t(6)");
            System.out.println("Sábado\t(7)");
        }

    }
}
