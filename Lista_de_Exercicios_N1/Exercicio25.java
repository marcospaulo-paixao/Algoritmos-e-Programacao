package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis/
public class Exercicio25 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Informe um numero Inteiro:");
        numero = entrada.nextInt();

        if (numero < 0) {

            System.out.println("NUMERO NEGATIVO");

        } else if (numero > 0) {

            System.out.println("NUMERO POSITIVO");
        } else {
            System.out.println("NULO");
        }
    }
}
