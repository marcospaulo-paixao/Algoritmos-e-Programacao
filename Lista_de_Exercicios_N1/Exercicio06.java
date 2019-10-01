package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio06 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, salario, quantidadeSalario;
        salarioMinimo = 998;
        System.out.println("Infome o seu salario: ");
        salario = entrada.nextDouble();

        quantidadeSalario = salario / salarioMinimo;

        System.out.printf("%.2f \n", quantidadeSalario);

    }
}
