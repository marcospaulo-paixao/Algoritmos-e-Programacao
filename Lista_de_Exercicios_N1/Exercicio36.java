package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio36 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorCompra, valorVenda;

        System.out.println("Informe o valor da Compra:");
        valorCompra = entrada.nextDouble();

        if (valorCompra < 10 && valorCompra > 0) {
            valorVenda = valorCompra + (valorCompra * 0.7);
            System.out.printf("Valor da Venda: R$ %.2f\n", valorVenda);

        } else if (valorCompra >= 10 && valorCompra < 30) {
            valorVenda = valorCompra + (valorCompra * 0.5);
            System.out.printf("Valor da Venda: R$ %.2f\n", valorVenda);

        } else if (valorCompra >= 30 && valorCompra < 50) {
            valorVenda = valorCompra + (valorCompra * 0.4);
            System.out.printf("Valor da Venda: R$ %.2f\n", valorVenda);

        } else if (valorCompra >= 50) {
            valorVenda = valorCompra + (valorCompra * 0.3);
            System.out.printf("Valor da Venda: R$ %.2f\n", valorVenda);

        } else {
            System.out.println("Valor Compra invalido");
        }

    }
}
