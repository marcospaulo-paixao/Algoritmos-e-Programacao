package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.println("Informe a Temperatura em fahrenheit: ");

        fahrenheit = entrada.nextFloat();

        celsius = (5.0 * (fahrenheit - 32.0) / 9.0);
        System.out.printf("A temperatura em Celsius = %.2f\n", celsius);

    }

}
