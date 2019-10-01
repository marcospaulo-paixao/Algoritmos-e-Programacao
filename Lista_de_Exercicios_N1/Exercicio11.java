package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio11 {

    public static void main(String[] args) {
        double raio = 0, volume, area, pi = Math.PI;
        Scanner entrada = new Scanner(System.in);

        // (v = 4/3.P.R3), e a área (a = P.R2).  
        System.out.println("Informe o raio da esfera: ");
        raio = entrada.nextDouble();

        // Calculo Area
        area = pi * (Math.pow(raio, 2));

        // Calculo volume
        volume = 4 * pi * Math.pow(raio, 3) / 3;

        System.out.printf("O volume é: %.2f", volume);

    }
}
