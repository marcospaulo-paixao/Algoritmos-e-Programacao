package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio28 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x, y, soma, subtracao, multiplicacao, divisao, opMat, result;

        System.out.println("Informe o valor do Primeiro Numero:");
        x = entrada.nextDouble();

        System.out.println("Informe o valor do Segundo Numero:");
        y = entrada.nextDouble();

        System.out.println("Informe a Operação desejada:\n(1) Soma (2) Subtração, (3) Multiplicação e (4) Divisão. ");
        opMat = entrada.nextDouble();

        if (opMat == 1) {
            result = x + y;
            System.out.printf("%.0f + %.0f = %.0f ", x, y, result);
        } else if (opMat == 2) {
            result = x - y;
            System.out.printf("%.0f - %.0f = %.0f ", x, y, result);
        } else if (opMat == 3) {
            result = x * y;
            System.out.printf("%.0f * %.0f = %.0f ", x, y, result);
        } else if (opMat == 4) {
            if (y != 0) {
                result = x / y;
                System.out.printf("%.0f / %.0f = %.2f ", x, y, result);
            } else if (y == 0) {
                System.out.println("Divisão Impossivel!!!");
            }
        } else {
            System.out.printf("%f não é uma das opções.", opMat);
        }

    }
}
