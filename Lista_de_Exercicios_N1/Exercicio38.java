package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio38 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorTotalCarro;
        char sn1, sn2, sn3, sn4, sn5;
        double recAdd1 = 1750;
        double recAdd2 = 800;
        double recAdd3 = 1200;
        double recAdd4 = 2000;

        System.out.println("Valor inicial do carro:");
        double valorFabrica = entrada.nextDouble();

        System.out.println("Adicionar Ar condicionado?(S/N) ");
        sn1 = entrada.next().charAt(0);
        System.out.println("Adicionar Pintura metálica?(S/N)");
        sn2 = entrada.next().charAt(0);
        System.out.println("Adicionar Vidro Elétrico?(S/N) ");
        sn3 = entrada.next().charAt(0);
        System.out.println("Adicionar Direção Hidráulica?(S/N)");
        sn4 = entrada.next().charAt(0);

        if ((sn1 == 's' || sn1 == 'S') && (sn2 == 's' || sn2 == 'S') && (sn3 == 's' || sn3 == 'S') && (sn4 == 's' || sn4 == 'S')) {
            valorTotalCarro = valorFabrica + recAdd1 + recAdd2 + recAdd3 + recAdd4;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 'n' || sn1 == 'N') && (sn2 == 'n' || sn2 == 'N') && (sn3 == 'n' || sn3 == 'N') && (sn4 == 'n' || sn4 == 'N')) {
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorFabrica);
        } else if ((sn1 == 'n' || sn1 == 'N') && (sn2 == 's' || sn2 == 'S') && (sn3 == 's' || sn3 == 'S') && (sn4 == 's' || sn4 == 'S')) {
            valorTotalCarro = valorFabrica + recAdd2 + recAdd3 + recAdd4;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 's' || sn1 == 'S') && (sn2 == 'n' || sn2 == 'N') && (sn3 == 's' || sn3 == 'S') && (sn4 == 's' || sn4 == 'S')) {
            valorTotalCarro = valorFabrica + recAdd1 + recAdd3 + recAdd4;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 's' || sn1 == 'S') && (sn2 == 's' || sn2 == 'S') && (sn3 == 'n' || sn3 == 'N') && (sn4 == 's' || sn4 == 'S')) {
            valorTotalCarro = valorFabrica + recAdd2 + recAdd1 + recAdd4;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 's' || sn1 == 'S') && (sn2 == 's' || sn2 == 'S') && (sn3 == 's' || sn3 == 'S') && (sn4 == 'n' || sn4 == 'N')) {
            valorTotalCarro = valorFabrica + recAdd2 + recAdd3 + recAdd1;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 'n' || sn1 == 'N') && (sn2 == 'n' || sn2 == 'N') && (sn3 == 's' || sn3 == 'S') && (sn4 == 's' || sn4 == 'S')) {
            valorTotalCarro = valorFabrica + recAdd3 + recAdd4;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 'n' || sn1 == 'N') && (sn2 == 's' || sn2 == 'S') && (sn3 == 'n' || sn3 == 'N') && (sn4 == 's' || sn4 == 'S')) {
            valorTotalCarro = valorFabrica + recAdd2 + recAdd4;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 'n' || sn1 == 'N') && (sn2 == 's' || sn2 == 'S') && (sn3 == 's' || sn3 == 'S') && (sn4 == 'n' || sn4 == 'N')) {
            valorTotalCarro = valorFabrica + recAdd2 + recAdd3;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 's' || sn1 == 'S') && (sn2 == 's' || sn2 == 'S') && (sn3 == 'n' || sn3 == 'N') && (sn4 == 'n' || sn4 == 'N')) {
            valorTotalCarro = valorFabrica + recAdd1 + recAdd2;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 's' || sn1 == 'S') && (sn2 == 'n' || sn2 == 'N') && (sn3 == 's' || sn3 == 'S') && (sn4 == 'n' || sn4 == 'N')) {
            valorTotalCarro = valorFabrica + recAdd1 + recAdd3;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 's' || sn1 == 'S') && (sn2 == 'n' || sn2 == 'N') && (sn3 == 'n' || sn3 == 'N') && (sn4 == 's' || sn4 == 'S')) {
            valorTotalCarro = valorFabrica + recAdd1 + recAdd4;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 's' || sn1 == 'S') && (sn2 == 'n' || sn2 == 'N') && (sn3 == 'n' || sn3 == 'N') && (sn4 == 'n' || sn4 == 'N')) {
            valorTotalCarro = valorFabrica + recAdd1;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 'n' || sn1 == 'N') && (sn2 == 's' || sn2 == 'S') && (sn3 == 'n' || sn3 == 'N') && (sn4 == 'n' || sn4 == 'N')) {
            valorTotalCarro = valorFabrica + recAdd2;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 'n' || sn1 == 'N') && (sn2 == 'n' || sn2 == 'N') && (sn3 == 's' || sn3 == 'S') && (sn4 == 'n' || sn4 == 'N')) {
            valorTotalCarro = valorFabrica + recAdd3;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else if ((sn1 == 'n' || sn1 == 'N') && (sn2 == 'n' || sn2 == 'N') && (sn3 == 'n' || sn3 == 'N') && (sn4 == 's' || sn4 == 'S')) {
            valorTotalCarro = valorFabrica + recAdd4;
            System.out.printf("O valor total do carro é: R$ %.2f\n", valorTotalCarro);
        } else {
            System.out.println("Erro, certifique-se de que  digitou (s) ou (n).");
        }

    }
}
