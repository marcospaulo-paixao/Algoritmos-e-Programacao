package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B, aux;

        System.out.println("Informe o valor de A:");
        A = entrada.nextInt();
        System.out.println("Informe o valor de B:");
        B = entrada.nextInt();

        aux = B;

        B = A;

        A = aux;

        System.out.println("A = " + A);
        System.out.println("B = " + B);

    }
}
