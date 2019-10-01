package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double areaTotalTerreno, areaConstruida, valorTotal, impostoAreaConstruida, impostoAreaNaoConstruida;

        System.out.println("Informe a área total do terreno(m²): ");
        areaTotalTerreno = entrada.nextDouble();
        System.out.println("Informe a area construida(m²): ");
        areaConstruida = entrada.nextDouble();

        impostoAreaConstruida = areaConstruida * 5;
        impostoAreaNaoConstruida = (areaTotalTerreno - areaConstruida) * 3.8;

        valorTotal = impostoAreaConstruida + impostoAreaNaoConstruida;

        System.out.println(impostoAreaConstruida);
        System.out.println(impostoAreaNaoConstruida);
        System.out.printf("O valor total a pagar é: R$ %.2f\n", valorTotal);

    }
}
