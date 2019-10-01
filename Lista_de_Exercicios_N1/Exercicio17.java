package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorDolar, cotacaoDolar, valorReais;

        System.out.println("Informe o valor em Dolar:");
        valorDolar = entrada.nextDouble();
        System.out.println("Informe a catação:");
        cotacaoDolar = entrada.nextDouble();
        valorReais = valorDolar * cotacaoDolar;

        System.out.printf("Valor em Reais: R$ %.2f\n", valorReais);
    }
}
