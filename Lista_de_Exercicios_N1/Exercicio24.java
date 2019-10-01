package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, resultado;

        System.out.println("Informe um número:");
        numero = entrada.nextInt();

        resultado = numero % 2;

        if (resultado == 0) {
            System.out.println("Par");
        }
        if (resultado != 0) {
            System.out.println("Impar");
        }

    }
}
