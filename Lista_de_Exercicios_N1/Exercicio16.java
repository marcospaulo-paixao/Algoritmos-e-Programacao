package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio16 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double x1, x2, y1, y2, distancia;

        System.out.println("Informe o valor de X1:");
        x1 = entrada.nextDouble();
        System.out.println("Informe o valor de Y1:");
        y1 = entrada.nextDouble();
        System.out.println("Informe o valor de X2:");
        x2 = entrada.nextDouble();
        System.out.println("Informe o valor de Y2:");
        y2 = entrada.nextDouble();

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("O valor da distancia é: %f\n", distancia);
    }
}
