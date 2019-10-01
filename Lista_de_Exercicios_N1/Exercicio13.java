package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio13 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        float salarioMinimo, salarioUsuario, quantidadeSalario;
        salarioMinimo = 998;

        System.out.println("Infome o valor do seu salario:");
        salarioUsuario = entrada.nextFloat();

        quantidadeSalario = salarioUsuario / salarioMinimo;
        System.out.printf("Você recebe %.2f salario(s) minimo(s).\n", quantidadeSalario);

    }
}
