package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio08 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double custoConsumidor, custoFabrica, distribuidor, imposto;

        System.out.println("Informe o valor do custo de fabrica:");
        custoFabrica = entrada.nextDouble();
        distribuidor = custoFabrica * 0.12;
        imposto = custoFabrica * 0.30;
        custoConsumidor = custoFabrica + distribuidor + imposto;

        System.out.printf("O custo do consumidor é: R$ %.2f", custoConsumidor);

    }
}
