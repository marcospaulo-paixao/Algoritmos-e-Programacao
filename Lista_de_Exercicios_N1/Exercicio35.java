package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio35 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\t     <<<Cardápio>>>\n(1): Pizza, (2): Picanha e (3): Peixe Frito");
        System.out.println("Informe o codigo do seu pedido:");

        int codPedido = entrada.nextInt();

        if (codPedido == 1) {

            System.out.printf("Opção %d : Pizza, pedido realizado com sucesso\n", codPedido);

        } else if (codPedido == 2) {

            System.out.printf("Opção %d : Picanha, pedido realizado com sucesso\n", codPedido);

        } else if (codPedido == 3) {

            System.out.printf("Opção %d :Pizza, pedido realizado com sucesso\n", codPedido);

        } else {
            System.out.println("Codigo do Pedido Invalido");

        }
    }
}
