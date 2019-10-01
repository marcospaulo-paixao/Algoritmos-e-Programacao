package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio14 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        float salarioTotal, quantidadeTvPlasma, quantidadeTvLCD, quantidadeTvLED, salarioMinimoAtual, comissaoTvLCD, comissaoTvLED, comissaoTvPlasma;
        comissaoTvLCD = 50;
        comissaoTvLED = 60;
        comissaoTvPlasma = 75;

        System.out.println("Informe a quantidade de Tv(s) LCD vendida(s):");
        quantidadeTvLCD = entrada.nextFloat();
        System.out.println("Informe a quantidade de Tv(s) LED vendida(s):");
        quantidadeTvLED = entrada.nextFloat();
        System.out.println("Informe a quantidade de Tv(s) Plasma vendida(s):");
        quantidadeTvPlasma = entrada.nextFloat();

        System.out.println("Infome o valor do Salário mínimo atual;");
        salarioMinimoAtual = entrada.nextFloat();

        salarioTotal = salarioMinimoAtual + (comissaoTvLCD * quantidadeTvLCD + comissaoTvLED * quantidadeTvLED + comissaoTvPlasma * quantidadeTvPlasma);
        System.out.printf("O salario Total é: R$ %.2f\n", salarioTotal);
    }
}
