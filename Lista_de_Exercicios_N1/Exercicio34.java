package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio34 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura, peso, imc;

        System.out.println("Informe a sua Altura:");
        altura = entrada.nextDouble();

        System.out.println("Informe o seu Peso:");
        peso = entrada.nextDouble();

        imc = peso / (Math.pow(altura, 2));

        if (imc < 18.5 && imc > 0) {
            System.out.printf("Seu IMC é %.2f  - ABAIXO DO PESO!!!\n", imc);
        } else if (imc >= 18.5 && imc < 25) {
            System.out.printf("Seu IMC é %.2f  -  PESO NORMAL!!!\n", imc);

        } else if (imc >= 25 && imc < 30) {
            System.out.printf("Seu IMC é %.2f  - ACIMA DO PESO!!!\n", imc);

        } else if (imc > 30) {
            System.out.printf("Seu IMC é %.2f  -  OBESO!!!\n", imc);
        } else {
            System.out.printf("IMC invalido!!!");
        }

    }
}
