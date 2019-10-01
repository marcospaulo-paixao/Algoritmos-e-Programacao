package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio15 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        float x, y, Eq;

        System.out.println("Informe o valor de X:");
        x = entrada.nextFloat();

        System.out.println("Informe o valor de Y:");
        y = entrada.nextFloat();

        Eq = (float) (2 * ((Math.sqrt((3 * x) + 30) / 3) + Math.pow((y - 32), 4)));
        System.out.printf("O valor da equação é: %f\n", Eq);
    }
}
