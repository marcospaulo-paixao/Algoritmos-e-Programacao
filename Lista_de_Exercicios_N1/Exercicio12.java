package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio12 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        float mediaPonderada, num1, num2, num3, num4, peso1 = 1, peso2 = 2, peso3 = 3, peso4 = 4;

        System.out.println("Informe o 1° numero:");
        num1 = entrada.nextFloat();
        System.out.println("Informe o 2° numero:");
        num2 = entrada.nextFloat();
        System.out.println("Informe o 3° numero:");
        num3 = entrada.nextFloat();
        System.out.println("Informe o 4° numero:");
        num4 = entrada.nextFloat();

        mediaPonderada = (peso1 * num1 + peso2 * num2 + peso3 * num3 + peso4 * num4) / (1 + 2 + 3 + 4);

        System.out.printf("A media ponderada de %.2f,%.2f,%.2f e %.2f é: %.2f\n", num1, num2, num3, num4, mediaPonderada);

    }
}
